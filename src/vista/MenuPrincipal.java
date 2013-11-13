/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MenuPrincipal.java
 *
 * Created on 21/11/2012, 02:07:50 PM
 */

package vista;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Rosy
 */
public class MenuPrincipal extends javax.swing.JFrame {

   static private MenuPrincipal UnicaInstancia = null;

    private MenuPrincipal() { 
        initComponents();
        setLocationRelativeTo(null);
    }

    static public MenuPrincipal instancia() {

        if (UnicaInstancia == null) {
            UnicaInstancia = new MenuPrincipal();
        }

        return UnicaInstancia;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMantenerAlumno = new javax.swing.JMenuItem();
        JMantenerModulo = new javax.swing.JMenuItem();
        jMantenerEspecialidad = new javax.swing.JMenuItem();
        jMantenerProfesor = new javax.swing.JMenuItem();
        jMantenerHorario = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        JCatalogocurso = new javax.swing.JMenuItem();
        jActasNota = new javax.swing.JMenu();
        jIniciaActaNota = new javax.swing.JMenuItem();
        jActualizarNota = new javax.swing.JMenuItem();
        jImorimirNota = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        JIniciarMatricula = new javax.swing.JMenuItem();
        JAsistencia = new javax.swing.JMenu();
        jRegistrarAsistencia = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jCertificado = new javax.swing.JMenuItem();
        jVerificarEstado = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/recursos/cepro4.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu8.setText("Mantenimiento");

        jMantenerAlumno.setText("Mantener Alumno");
        jMantenerAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMantenerAlumnoActionPerformed(evt);
            }
        });
        jMenu8.add(jMantenerAlumno);

        JMantenerModulo.setText("Mantener Modulo");
        JMantenerModulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMantenerModuloActionPerformed(evt);
            }
        });
        jMenu8.add(JMantenerModulo);

        jMantenerEspecialidad.setText("Mantener Especialidad");
        jMantenerEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMantenerEspecialidadActionPerformed(evt);
            }
        });
        jMenu8.add(jMantenerEspecialidad);

        jMantenerProfesor.setText("Mantener Profesor");
        jMantenerProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMantenerProfesorActionPerformed(evt);
            }
        });
        jMenu8.add(jMantenerProfesor);

        jMantenerHorario.setText("Mantener Horario");
        jMantenerHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMantenerHorarioActionPerformed(evt);
            }
        });
        jMenu8.add(jMantenerHorario);

        jMenuBar1.add(jMenu8);

        jMenu5.setText("Curso");

        JCatalogocurso.setText("Catalogo de Curso");
        JCatalogocurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCatalogocursoActionPerformed(evt);
            }
        });
        jMenu5.add(JCatalogocurso);

        jMenuBar1.add(jMenu5);

        jActasNota.setText("Actas y Notas");

        jIniciaActaNota.setText("Elaborar Acta de Notas");
        jIniciaActaNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIniciaActaNotaActionPerformed(evt);
            }
        });
        jActasNota.add(jIniciaActaNota);

        jActualizarNota.setText("Actualizar Notas");
        jActualizarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jActualizarNotaActionPerformed(evt);
            }
        });
        jActasNota.add(jActualizarNota);

        jImorimirNota.setText("Imprimir Acta de Notas");
        jActasNota.add(jImorimirNota);

        jMenuBar1.add(jActasNota);

        jMenu1.setText("Matricula");

        JIniciarMatricula.setText("Iniciar Matricula");
        JIniciarMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JIniciarMatriculaActionPerformed(evt);
            }
        });
        jMenu1.add(JIniciarMatricula);

        jMenuBar1.add(jMenu1);

        JAsistencia.setText("Asistencia");

        jRegistrarAsistencia.setText("Reporte Asistencia");
        jRegistrarAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegistrarAsistenciaActionPerformed(evt);
            }
        });
        JAsistencia.add(jRegistrarAsistencia);

        jMenuBar1.add(JAsistencia);

        jMenu6.setText("Certificado");

        jCertificado.setText("Registrar solicitud");
        jCertificado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCertificadoActionPerformed(evt);
            }
        });
        jMenu6.add(jCertificado);

        jVerificarEstado.setText("Verificar Estado");
        jVerificarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVerificarEstadoActionPerformed(evt);
            }
        });
        jMenu6.add(jVerificarEstado);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Salir");

        jMenuItem3.setText("Salir del programa");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem3);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMantenerAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMantenerAlumnoActionPerformed
        Mantenimiento_Alumno single = Mantenimiento_Alumno.instancia();
        single.setVisible(true);        
    }//GEN-LAST:event_jMantenerAlumnoActionPerformed

    private void JMantenerModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMantenerModuloActionPerformed
        Mantenimiento_Modulos single = Mantenimiento_Modulos.instancia();
        single.setVisible(true);  
    }//GEN-LAST:event_JMantenerModuloActionPerformed

    private void jMantenerEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMantenerEspecialidadActionPerformed
        Mantenimiento_Especialidad single = Mantenimiento_Especialidad.instancia();
        single.setVisible(true);  
    }//GEN-LAST:event_jMantenerEspecialidadActionPerformed

    private void jMantenerProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMantenerProfesorActionPerformed
        Mantenimiento_Profesor single = Mantenimiento_Profesor.instancia();
        single.setVisible(true);  
    }//GEN-LAST:event_jMantenerProfesorActionPerformed

    private void JIniciarMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JIniciarMatriculaActionPerformed
        Matricula single = Matricula.instancia();
        single.setVisible(true);            
    }//GEN-LAST:event_JIniciarMatriculaActionPerformed

    private void JCatalogocursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCatalogocursoActionPerformed
       Catalogo_Cursos single = Catalogo_Cursos.instancia();
       single.setVisible(true);            
    }//GEN-LAST:event_JCatalogocursoActionPerformed

    private void jMantenerHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMantenerHorarioActionPerformed
       Mantenimiento_Horario single = Mantenimiento_Horario.instancia();
       single.setVisible(true);            
    }//GEN-LAST:event_jMantenerHorarioActionPerformed
/**/
    private void jIniciaActaNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIniciaActaNotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jIniciaActaNotaActionPerformed

    private void jRegistrarAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegistrarAsistenciaActionPerformed
       Asistencia single = Asistencia.instancia();
       single.setVisible(true);                    
    }//GEN-LAST:event_jRegistrarAsistenciaActionPerformed

    private void jCertificadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCertificadoActionPerformed
       SolicitudCertificado single = SolicitudCertificado.instancia();
       single.setVisible(true);                            
    }//GEN-LAST:event_jCertificadoActionPerformed

    private void jVerificarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVerificarEstadoActionPerformed
       VerificarEstadoCertificado single = VerificarEstadoCertificado.instancia();
       single.setVisible(true);                                    
    }//GEN-LAST:event_jVerificarEstadoActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jActualizarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jActualizarNotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jActualizarNotaActionPerformed

    /**
    * @param args the command line arguments
    */
    /*
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }
*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JAsistencia;
    private javax.swing.JMenuItem JCatalogocurso;
    private javax.swing.JMenuItem JIniciarMatricula;
    private javax.swing.JMenuItem JMantenerModulo;
    private javax.swing.JMenu jActasNota;
    private javax.swing.JMenuItem jActualizarNota;
    private javax.swing.JMenuItem jCertificado;
    private javax.swing.JMenuItem jImorimirNota;
    private javax.swing.JMenuItem jIniciaActaNota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMantenerAlumno;
    private javax.swing.JMenuItem jMantenerEspecialidad;
    private javax.swing.JMenuItem jMantenerHorario;
    private javax.swing.JMenuItem jMantenerProfesor;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem jRegistrarAsistencia;
    private javax.swing.JMenuItem jVerificarEstado;
    // End of variables declaration//GEN-END:variables

}
