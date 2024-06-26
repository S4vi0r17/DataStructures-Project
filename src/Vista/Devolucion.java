/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Datos.RegistrarP;
import Datos.Registro;
import Documentos.Libro;
import Documentos.Prestar;
import Documentos.Revista;
import Documentos.Tesis;
import Documentos.Volumen;
import javax.swing.JOptionPane;

/**
 *
 * @author nalle
 */
public class Devolucion extends javax.swing.JFrame {

    /**
     * Creates new form Devolucion
     */
    public Devolucion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DcodUsu = new javax.swing.JTextField();
        Dlibro = new javax.swing.JRadioButton();
        Dtesis = new javax.swing.JRadioButton();
        Drevista = new javax.swing.JRadioButton();
        DcodDoc = new javax.swing.JTextField();
        RegistroDev = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingrese el codigo de usuario");

        jLabel2.setText("Ingrese el tipo");

        jLabel3.setText("Ingrese el codigo del documento");

        DcodUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DcodUsuActionPerformed(evt);
            }
        });

        Dlibro.setText("Libro");
        Dlibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DlibroActionPerformed(evt);
            }
        });

        Dtesis.setText("Tesis");
        Dtesis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DtesisActionPerformed(evt);
            }
        });

        Drevista.setText("Revista");
        Drevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrevistaActionPerformed(evt);
            }
        });

        RegistroDev.setText("Registrar devolución");
        RegistroDev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroDevActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DcodUsu)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Dlibro, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Dtesis, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Drevista, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(DcodDoc, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(RegistroDev))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton2)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(DcodUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Dlibro)
                    .addComponent(Dtesis)
                    .addComponent(Drevista))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(DcodDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(RegistroDev)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DcodUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DcodUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DcodUsuActionPerformed

    private void RegistroDevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroDevActionPerformed
           int codUsu = Integer.parseInt(this.DcodUsu.getText());
    int codDoc = Integer.parseInt(this.DcodDoc.getText());
    boolean documentoEncontrado = false;

    if (Dlibro.isSelected()) {
        for (Volumen d : Registro.getListaDocumentos()) {
            if (d instanceof Libro && d.getCodigo() == codDoc) {
                Libro libro = (Libro) d;
                libro.setCantidad(libro.getCantidad() + 1);
                JOptionPane.showMessageDialog(this, "Cantidad de libros aumentada satisfactoriamente");
                documentoEncontrado = true;
                break;
            }
        }
    } else if (Dtesis.isSelected()) {
        for (Volumen d : Registro.getListaDocumentos()) {
            if (d instanceof Tesis && d.getCodigo() == codDoc) {
                Tesis tesis = (Tesis) d;
                tesis.setCantidad(tesis.getCantidad() + 1);
                JOptionPane.showMessageDialog(this, "Cantidad de tesis aumentada satisfactoriamente");
                documentoEncontrado = true;
                break;
            }
        }
    } else if (Drevista.isSelected()) {
        for (Volumen d : Registro.getListaDocumentos()) {
            if (d instanceof Revista && d.getCodigo() == codDoc) {
                Revista revista = (Revista) d;
                revista.setCantidad(revista.getCantidad() + 1);
                JOptionPane.showMessageDialog(this, "Cantidad de revistas aumentada satisfactoriamente");
                documentoEncontrado = true;
                break;
            }
        }
    }

    if (documentoEncontrado) {
        // Verificar y eliminar el registro de préstamo del usuario
        boolean prestamoEncontrado = false;
        for (Prestar P : RegistrarP.getRegistros()) {
            if (P.getCodigoU() == codUsu && P.getCodigo() == codDoc) {  // Asegúrate de que Prestar tiene un método getCodigoDoc()
                RegistrarP.eliminarPrestamo(P.getCodigo());
                prestamoEncontrado = true;
                break;
            }
        }
        if (!prestamoEncontrado) {
            JOptionPane.showMessageDialog(this, "No se encontró un préstamo con el código de usuario especificado.");
        }
    } else {
        // Si no se encuentra el documento
        JOptionPane.showMessageDialog(this, "No se encontró un documento con el código especificado.");
    }
    }//GEN-LAST:event_RegistroDevActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void DlibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DlibroActionPerformed
        if (Dlibro.isSelected()) {
            Drevista.setEnabled(false);
            Dtesis.setEnabled(false);
        } else {
            Drevista.setEnabled(true);
            Dtesis.setEnabled(true);
        }
    }//GEN-LAST:event_DlibroActionPerformed

    private void DtesisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DtesisActionPerformed
        if (Dtesis.isSelected()) {
            Drevista.setEnabled(false);
            Dlibro.setEnabled(false);
        } else {
            Drevista.setEnabled(true);
            Dlibro.setEnabled(true);
        }
    }//GEN-LAST:event_DtesisActionPerformed

    private void DrevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrevistaActionPerformed
                if (Dlibro.isSelected()) {
            Drevista.setEnabled(false);
            Dtesis.setEnabled(false);
        } else {
            Drevista.setEnabled(true);
            Dtesis.setEnabled(true);
        }
    }//GEN-LAST:event_DrevistaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Devolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Devolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Devolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Devolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Devolucion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DcodDoc;
    private javax.swing.JTextField DcodUsu;
    private javax.swing.JRadioButton Dlibro;
    private javax.swing.JRadioButton Drevista;
    private javax.swing.JRadioButton Dtesis;
    private javax.swing.JButton RegistroDev;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
