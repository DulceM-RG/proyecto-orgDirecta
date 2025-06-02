package vista;

import controlador.Controlador;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class FormAgregarE extends javax.swing.JFrame {
     Controlador objControlador;
   
    public FormAgregarE(Controlador objControlador) {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(244,244,244));
         this.objControlador= objControlador;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gpoBotonesGrupo = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        txtNumControl = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cboSemestre = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        rdbtnGrupoA = new javax.swing.JRadioButton();
        rdbtnGrupoB = new javax.swing.JRadioButton();
        rdbtnGrupoC = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        cboCarrera = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AGENDA DE ESTUDIANTES");
        setBackground(new java.awt.Color(244, 244, 244));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("NUMERO DE CONTROL");

        txtNumControl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNumControl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumControlKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("NOMBRE");

        txtNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("APELLIDOS");

        txtApellidos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidosKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("SEMESTRE");

        cboSemestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13" }));
        cboSemestre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cboSemestreKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setText("GRUPO");

        gpoBotonesGrupo.add(rdbtnGrupoA);
        rdbtnGrupoA.setText("A");
        rdbtnGrupoA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rdbtnGrupoAKeyPressed(evt);
            }
        });

        gpoBotonesGrupo.add(rdbtnGrupoB);
        rdbtnGrupoB.setText("B");
        rdbtnGrupoB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rdbtnGrupoBKeyPressed(evt);
            }
        });

        gpoBotonesGrupo.add(rdbtnGrupoC);
        rdbtnGrupoC.setText("C");
        rdbtnGrupoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnGrupoCActionPerformed(evt);
            }
        });
        rdbtnGrupoC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rdbtnGrupoCKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 102));
        jLabel8.setText("CARRERA");

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/expediente.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        btnGuardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnGuardarKeyPressed(evt);
            }
        });

        cboCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ing.Informatica", "Ing.en TICS", "Ing. Ciencia Datos", "Ing. en Gestión Empresarial", "Ing. Forestal", "Ing. Agronomia", "Lic. Biologia" }));
        cboCarrera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cboCarreraKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 253));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("TECNOLÓGICO DEL VALLE DE OAXACA");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 102));
        jLabel10.setText("Registar estudiantes");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pleca-ITVO.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar-contacto (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel1))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel6))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel7)))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rdbtnGrupoA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdbtnGrupoB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdbtnGrupoC)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cboSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumControl)
                            .addComponent(txtNombre)
                            .addComponent(txtApellidos))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cboCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNumControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(cboSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rdbtnGrupoA)
                    .addComponent(rdbtnGrupoB)
                    .addComponent(rdbtnGrupoC))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cboCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(17, 17, 17))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rdbtnGrupoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnGrupoCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnGrupoCActionPerformed

    private void txtNumControlKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumControlKeyPressed
        // TODO add your handling code here:
        /*if (evt.getKeyCode()== KeyEvent.VK_ENTER ){
            txtNombre.requestFocus();
        }TAMBIEN SE PUEDE ASI DICIENDO DIRECTAMENTE CUAL ES EL QUE SIGUE*/
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            evt.getComponent().transferFocus();
        }
    }//GEN-LAST:event_txtNumControlKeyPressed

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            evt.getComponent().transferFocus();
        }
    }//GEN-LAST:event_txtNombreKeyPressed

    private void txtApellidosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            evt.getComponent().transferFocus();
        }
    }//GEN-LAST:event_txtApellidosKeyPressed

    private void cboSemestreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboSemestreKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            evt.getComponent().transferFocus();
        }
    }//GEN-LAST:event_cboSemestreKeyPressed

    private void rdbtnGrupoAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rdbtnGrupoAKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            evt.getComponent().transferFocus();
        }
    }//GEN-LAST:event_rdbtnGrupoAKeyPressed

    private void cboCarreraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboCarreraKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            evt.getComponent().transferFocus();
        }
    }//GEN-LAST:event_cboCarreraKeyPressed

    private void btnGuardarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnGuardarKeyPressed
        // TODO add your handling code here:
        
        //guardar el registro de las cajas de texto 
       String numControl= this.txtNumControl.getText();
        String nombre =this.txtNombre.getText();
        String apellido = this.txtApellidos.getText();
        int semestre = Integer.parseInt(this.cboSemestre.getSelectedItem().toString());
        char grupo = ' ';
        if (rdbtnGrupoA.isSelected()) {
            grupo = 'A';
        } else if (rdbtnGrupoB.isSelected()) {
            grupo = 'B';
        } else if (rdbtnGrupoC.isSelected()) {
            grupo = 'C';
        }

        String carrera = this.cboCarrera.getSelectedItem().toString();

        if (numControl.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || grupo == ' ' || carrera.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor llena todos los campos.");
            return;
        }
        if (this.objControlador.validaNumControl(numControl)) {
          
            this.objControlador.guardarRegistro(numControl, nombre, apellido, semestre, grupo, carrera);
            JOptionPane.showMessageDialog(this, "Registro guardado con éxito");
             this.limpiarFormulario();
        } else {
            JOptionPane.showMessageDialog(this, "Numero de Control no valido");
            this.txtNumControl.requestFocus();
        }
      

        
        //quedar en blanco las casillas CÓDIGO
    }//GEN-LAST:event_btnGuardarKeyPressed

    private void rdbtnGrupoBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rdbtnGrupoBKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            evt.getComponent().transferFocus();
        }
    }//GEN-LAST:event_rdbtnGrupoBKeyPressed

    private void rdbtnGrupoCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rdbtnGrupoCKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            evt.getComponent().transferFocus();
        }
    }//GEN-LAST:event_rdbtnGrupoCKeyPressed

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        // TODO add your handling code here:
         // TODO add your handling code here:
        
        //guardar el registro de las cajas de texto 
        
        //guardar el registro de las cajas de texto 
        String numControl= this.txtNumControl.getText();
        String nombre =this.txtNombre.getText();
        String apellido = this.txtApellidos.getText();
        int semestre = Integer.parseInt(this.cboSemestre.getSelectedItem().toString());
        char grupo = ' ';
        if (rdbtnGrupoA.isSelected()) {
            grupo = 'A';
        } else if (rdbtnGrupoB.isSelected()) {
            grupo = 'B';
        } else if (rdbtnGrupoC.isSelected()) {
            grupo = 'C';
        }

        String carrera = this.cboCarrera.getSelectedItem().toString();

        if (numControl.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || grupo == ' ' || carrera.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Llenar todos los campos");
            return;
        }
        if (this.objControlador.validaNumControl(numControl)) {
          
            this.objControlador.guardarRegistro(numControl, nombre, apellido, semestre, grupo, carrera);
            JOptionPane.showMessageDialog(this, "Registro guardado con éxito");
             this.limpiarFormulario();
        } else {
            JOptionPane.showMessageDialog(this, "Control no Válido");
            this.txtNumControl.requestFocus();
        }
        System.out.println("Valor en combo: " + cboSemestre.getSelectedItem());


       
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

     private void limpiarFormulario(){
        this.txtNumControl.setText("");
        this.txtNombre.setText("");
        this.txtApellidos.setText("");
        this.cboSemestre.setSelectedIndex(0);
        
        gpoBotonesGrupo.clearSelection();
        this.cboCarrera.setSelectedIndex(0);
    }
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cboCarrera;
    private javax.swing.JComboBox<String> cboSemestre;
    private javax.swing.ButtonGroup gpoBotonesGrupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rdbtnGrupoA;
    private javax.swing.JRadioButton rdbtnGrupoB;
    private javax.swing.JRadioButton rdbtnGrupoC;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumControl;
    // End of variables declaration//GEN-END:variables
}
