package controlador;
import java.awt.Color;

import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ArchivoOrgDirecta;
import vista.VistaCRUD;
/* @author DULCE*/
public class Controlador {
    //variable de instancia
    public VistaCRUD objVista;
    ArchivoOrgDirecta objArchivo;
    DefaultTableModel modelo;  
   
    //paso de para metros con el mismo orden, tipo y numeroa
    //this.objControlador= new Controlador(this, this.objArchivo);
    public Controlador(VistaCRUD aThis, ArchivoOrgDirecta objArchivo) {
        //variables locales para darle a las variables de referencias 
        this.objVista= aThis;
        this.objArchivo=objArchivo;  
        this.modelo=null;
        // modelo = new DefaultTableModel();
         
         
    }
    
    
   public void llenarTabla() {
       this.objArchivo.abrirArchivoRAF("estudiantes.txt");
        String[] columnas = {"Num.Control", "Nombre", "Apellidos", "Semestre", "Grupo", "Carrera"};
        String[][] filas = objArchivo.obtenerMatrizRegistros(6);
        
        this.modelo = new DefaultTableModel(filas, columnas);
        this.objVista.jtblEstudiantes.setModel(modelo);
    }
    
   public void guardarRegistro(String nc, String nom, String ape, int sem, char grupo, String carrera){
        this.objArchivo= new ArchivoOrgDirecta();
        this.objArchivo.abrirArchivoRAF("estudiantes.txt");
        objArchivo.escribirRegistro(nc, nom, ape, sem, grupo, carrera);
        this.objArchivo.cerrarArchivo();
       this.llenarTabla();
    }
            
    public String[] buscarRegistro(String nc) {

        this.objArchivo.abrirArchivoRAF("estudiantes.txt");
        //return this.buscarRegistro(nc);
        return this.objArchivo.buscarRegistroPorControl(nc);
        
    }
  //color
    public void buscarSeleccionarRegistro(String nc) {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            String nControl = modelo.getValueAt(i, 0).toString();
            if (nControl.equals(nc)) {
                objVista.jtblEstudiantes.setRowSelectionInterval(i, i);
                objVista.jtblEstudiantes.setSelectionBackground(Color.BLUE);
                return;
            }
        }
        JOptionPane.showMessageDialog(objVista, "REGISTRO NO ENCONTRADO");
    }
    
    public void eliminarRegistro(String numControl) {
        this.objArchivo = new ArchivoOrgDirecta();
        this.objArchivo.abrirArchivoRAF("estudiantes.txt");

        this.objArchivo.eliminarRegistro(numControl);

        this.llenarTabla();
    }
    

    //porque va a validar el numero de control
    public boolean validaNumControl(String numControl) {
        this.objArchivo= new ArchivoOrgDirecta();
        return this.objArchivo.validaControl(numControl);
    }
}
