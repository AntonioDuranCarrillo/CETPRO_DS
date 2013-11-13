/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Asistencia extends javax.swing.JFrame {

    Calendar cal = Calendar.getInstance();
    Date horas = cal.getTime();
    DateFormat formatter = DateFormat.getTimeInstance(); 
   
    static private Asistencia UnicaInstancia = null;

    private Asistencia() { 
        initComponents();        
        setLocationRelativeTo(null);
        
        horasistema.setText(formatter.format(horas));
    }

    static public Asistencia instancia() {

        if (UnicaInstancia == null) {
            UnicaInstancia = new Asistencia();
        }

        return UnicaInstancia;
    }
    private void abrirMenuPrincipal() {  
        this.setVisible(false);
        MenuPrincipal single = MenuPrincipal.instancia();
        single.setVisible(true);        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelasistencia = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtdatos = new javax.swing.JTextArea();
        jbregistrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fechasistema = new javax.swing.JLabel();
        horasistema = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Asistencia de profesores");

        panelasistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("ASISTENCIA DE PROFESORES\n"));

        jtdatos.setEditable(false);
        jtdatos.setColumns(20);
        jtdatos.setRows(5);
        jtdatos.setText("\t\t\n\t\"DATOS PERSONALES\"   \n\n\n  Nombre    :  Ricardo Daniel\n  Apellidos :  Mendoza Garcia\n  Sexo \t    :  masculino         \tEdad : 42\n  Fecha de Nacimiento : 15/07/\n  DNI :        48569522  \n\n  \n  ***********************************************\n\t\t\t\n  Distrito  : Carabayllo\n  Domicilio : Jr.Los Laureles 458\n  Ocupacion : Docente\n  Estado civil : Casado\n  Telefono : 945856630    \n  Correo Electronico : rdmg.doc@gmail.com\n\t\t\n  ***********************************************\n");
        jScrollPane1.setViewportView(jtdatos);

        jbregistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/recursos/registrar.png"))); // NOI18N
        jbregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbregistrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Hora :");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Fecha :");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/recursos/fotoprof.jpg"))); // NOI18N

        fechasistema.setText("21/11/2012");

        horasistema.setText("1:00 pm");

        javax.swing.GroupLayout panelasistenciaLayout = new javax.swing.GroupLayout(panelasistencia);
        panelasistencia.setLayout(panelasistenciaLayout);
        panelasistenciaLayout.setHorizontalGroup(
            panelasistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelasistenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelasistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelasistenciaLayout.createSequentialGroup()
                        .addGroup(panelasistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelasistenciaLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(horasistema)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(fechasistema))
                            .addGroup(panelasistenciaLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jbregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(panelasistenciaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
        );
        panelasistenciaLayout.setVerticalGroup(
            panelasistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelasistenciaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelasistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelasistenciaLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelasistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelasistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(fechasistema))
                            .addGroup(panelasistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(horasistema))))
                    .addComponent(jScrollPane1)
                    .addComponent(jSeparator1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelasistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelasistencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbregistrarActionPerformed
       String cadena = " SE REGISTRO LA ASISTENCIA CORRECTAMENTE";
        JOptionPane.showMessageDialog(null, cadena);       
    }//GEN-LAST:event_jbregistrarActionPerformed

    /**
     * @param args the command line arguments
     */
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fechasistema;
    private javax.swing.JLabel horasistema;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbregistrar;
    private javax.swing.JTextArea jtdatos;
    private javax.swing.JPanel panelasistencia;
    // End of variables declaration//GEN-END:variables
}
