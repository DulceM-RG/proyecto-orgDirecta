//DULCE
package modelo;
import java.io.File; //ORI
import java.io.FileNotFoundException; 
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ArchivoOrgDirecta {

    File fichero;//no
    RandomAccessFile raf;
    PrintWriter pw;
    
    //
    final int NUMCONTROL_LEN = 8;
    final int NOMBRE_LEN = 20;
    final int APELLIDOS_LEN = 20;
    final int SEMESTRE_LEN = 2;
    final int GRUPO_LEN = 1;
    final int CARRERA_LEN = 30;
    final int TAMREG = 82;

    public ArchivoOrgDirecta(){
        //metodo constructor//RAMDON
        this.raf=null; 
        this.fichero=null;
        this.pw=null;
       
    }
    
    //recibir un archivo y la referencia de ese archivo y saber si ese archivo existe 
    //verfificar si existe o no el archivo
    private boolean establecerFlujo(String nombreArchivo){
        fichero = new File(nombreArchivo);
        return fichero.exists();
    }
    
    //recibe paramentos de como recibir el texto
    //buscar una ruta hacia donde ir 
    //aula
    //se necesita para abrir el archivo
    public boolean abrirArchivoRAF(String nombreArchivo) {
        boolean existe = this.establecerFlujo(nombreArchivo);
        try {

            this.raf = new RandomAccessFile(nombreArchivo, "rw");
        } catch (FileNotFoundException ex) {
            // 
            Logger.getLogger(ArchivoOrgDirecta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    //cerRar archivo
    public boolean cerrarArchivo() {
        try {
            if (this.raf != null) {
                this.raf.close();  // Cierra el flujo y libera los recursos
                this.raf = null;   // Limpia la referencia para evitar fugas de memoria
                return true;
            }
        } catch (IOException ex) {
            Logger.getLogger(ArchivoOrgDirecta.class.getName())
                    .log(Level.SEVERE, "Error al cerrar el archivo", ex);
            return false;
        }
        return false;
    }
    
    //CREAR LINEA
  // En acceso directo no escribes líneas de texto, sino registros de longitud fija en posiciones específicas.
    //OBTENER LINEAS
   // No se lee línea por línea, sino registro por registro usando seek()
    
    //truncar espacios 
     private static String ajustar(String s, int longitud) {
        if (s.length() > longitud) {
            return s.substring(0, longitud);
        } else {
            StringBuilder sb = new StringBuilder(s);
            while (sb.length() < longitud) {
                sb.append(' ');
            }
            return sb.toString();
        }
    } 
    //clase escuela salon
     //se necesita
    public void escribirRegistro(String numControl, String nombre, String apellidos, int semestre, char grupo,
            String carrera){
       // log pos= (long)(numRegistro-1)*REGISTRO_BYTES;
       //numero de control no se pone porque ya debe de b¿venir los 8
      // final int NOMBRE_LEN=20;
      // final int APELLIDOS_LEN=20;
      // final int SEMESTRE_LEN=2;
      // final int GRUPO_LEN=1;
      // final int CARRERA_LEN=30;
     //  final int TAMREG = 81;
       
       long pos= establecerPosicionByte(numControl, TAMREG);
        try {
            raf.seek(pos);// posiciona el puntero un una posición especifica
            raf.writeByte(' ');
            raf.write(numControl.getBytes("ISO-8859-1"));
            raf.write(ajustar(nombre,NOMBRE_LEN).getBytes("ISO-8859-1"));
            raf.write(ajustar(apellidos,APELLIDOS_LEN).getBytes("ISO-8859-1"));
            String sem=String.format("%02d",semestre);
            raf.write(sem.getBytes("ISO-8859-1"));
            String gpo=String.valueOf(grupo);
            raf.write(gpo.getBytes("ISO-8859-1"));
          //  raf.write(ajustar(carrera, CARRERA_LEN).getBytes("ISO-8859-1"));

          raf.write(ajustar(carrera,CARRERA_LEN).getBytes("ISO-8859-1"));
          
            
        } catch (IOException ex) {
            Logger.getLogger(ArchivoOrgDirecta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
    public long establecerPosicionByte(String numeroControl, int TamReg){
        return ((Long.parseLong(numeroControl.substring(5)))-1)*TamReg;
    }
    
    //leer registro
  //  public 
    public String[] buscarRegistroPorControl(String numControl) {
    try {
        long pos = establecerPosicionByte(numControl, TAMREG);
        raf.seek(pos);
        
        byte[] registroBytes = new byte[TAMREG];
        raf.read(registroBytes);
        String registro = new String(registroBytes, "ISO-8859-1");
        
        // Parsear campos
        return new String[]{
            registro.substring(1, 9).trim(),
            registro.substring(9, 29).trim(),
            registro.substring(29, 49).trim(),
            registro.substring(49, 51).trim(),
            registro.substring(51, 52).trim(),
            registro.substring(52, 82).trim()
        };
        
    } catch (IOException ex) {
        Logger.getLogger(ArchivoOrgDirecta.class.getName()).log(Level.SEVERE, null, ex);
        return null;
    }
}

    // 2. Método para actualizar registro
    public void actualizarRegistro(String numControl, String nombre, String apellidos,
            int semestre, char grupo, String carrera) {
        long pos = establecerPosicionByte(numControl, TAMREG);
        escribirRegistro(numControl, nombre, apellidos, semestre, grupo, carrera);
    }

    public void eliminarRegistro(String numControl) {
    long pos = establecerPosicionByte(numControl, TAMREG);
    try {
        raf.seek(pos);
        raf.writeByte('*');  // Marcar como eliminado
    } catch (IOException ex) {
        Logger.getLogger(ArchivoOrgDirecta.class.getName()).log(Level.SEVERE, null, ex);
    }
}

    public String[][] obtenerMatrizRegistros(int numCol) {
    try {
        // 1. Calcular total de registros físicos
        long fileSize = raf.length();
        int totalRegistros = (int) (fileSize / TAMREG);
        
        // 2. Lista temporal para almacenar registros activos
        List<String[]> registrosActivos = new ArrayList<>();
        
        // 3. Guardar posición actual para restaurar después
        long currentPos = raf.getFilePointer();
        raf.seek(0);  // Ir al inicio del archivo
        
        // 4. Recorrer todos los registros físicos
        for (int i = 0; i < totalRegistros; i++) {
            // Posicionar al inicio del registro
            raf.seek(i * TAMREG);
            
            // 5. Leer el byte de estado (borrado lógico)
            byte estadoByte = raf.readByte();
            char estado = (char) estadoByte;
            
            // 6. Filtrar: solo procesar registros ACTIVOS y VÁLIDOS
            if (estado == ' ') {  // Estado ' ' = activo
                // Leer el resto del registro
                byte[] registroBytes = new byte[TAMREG - 1]; // -1 porque ya leímos el byte de estado
                int bytesRead = raf.read(registroBytes);
                
                // Verificar si se leyó correctamente
                if (bytesRead != TAMREG - 1) {
                    // Si no se pudieron leer todos los bytes, saltar registro
                    continue;
                }
                
                // Convertir a String con la codificación correcta
                String registro = new String(registroBytes, "ISO-8859-1");
                
                // 7. Parsear campos según tamaños fijos
                int pos = 0;
                String numControl = registro.substring(pos, pos + 8).trim();
                pos += 8;
                
                // Verificar si el registro está vacío
                if (numControl.isEmpty()) {
                    continue; // Saltar registros vacíos
                }
                
                String nombre = registro.substring(pos, pos + 20).trim();
                pos += 20;
                String apellidos = registro.substring(pos, pos + 20).trim();
                pos += 20;
                String semestre = registro.substring(pos, pos + 2).trim();
                pos += 2;
                String grupo = registro.substring(pos, pos + 1).trim();
                pos += 1;
                String carrera = registro.substring(pos, pos + 30).trim();
                
                // 8. Agregar a la lista de registros activos
                registrosActivos.add(new String[]{
                    numControl, nombre, apellidos, semestre, grupo, carrera
                });
            }
            // Si el estado es 0 (registro nunca escrito) o '*' (eliminado), lo ignoramos
        }
        
        // 9. Restaurar posición original
        raf.seek(currentPos);
        
        // 10. Convertir la lista a matriz 2D
        String[][] matriz = new String[registrosActivos.size()][numCol];
        return registrosActivos.toArray(matriz);
        
    } catch (IOException ex) {
        Logger.getLogger(ArchivoOrgDirecta.class.getName()).log(Level.SEVERE, null, ex);
        return new String[0][0];
    }
}
    
  

     
     public boolean validaControl(String numControl) {
        return numControl.matches("^[0-9]{8}$");
    }
     //modificaf un registro
     

   
}
