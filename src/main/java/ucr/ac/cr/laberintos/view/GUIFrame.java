/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ucr.ac.cr.laberintos.view;

import ucr.ac.cr.laberintos.controller.ControladorPrincipal;

/**
 *
 * @author Usuario
 */
public class GUIFrame extends javax.swing.JFrame {

    /**
     * Creates new form GUIFrame
     */
    
    private ControladorPrincipal controlador; 
    
    public GUIFrame(ControladorPrincipal controlador) {
        initComponents();
        this. controlador = controlador;
        escuchar (controlador);
  
    }
    
    
    
    
    public void escuchar (ControladorPrincipal controlador){
        btnInstrucciones.addActionListener(controlador);
        btnHistoria.addActionListener(controlador);
        btnInstrucciones.addActionListener(controlador);
        btnSalir.addActionListener(controlador);
        btnJugar.addActionListener(controlador);
     }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        btnHistoria = new javax.swing.JButton();
        btnJugar = new javax.swing.JButton();
        btnInstrucciones = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        btnSalir.setText("btnSalir");
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 260, 110));

        btnHistoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonhistoria.png"))); // NOI18N
        btnHistoria.setText("btnHistoria");
        btnHistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoriaActionPerformed(evt);
            }
        });
        getContentPane().add(btnHistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 260, 90));

        btnJugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/jugarbn.png"))); // NOI18N
        btnJugar.setText("btnJagar");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        getContentPane().add(btnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 260, 90));

        btnInstrucciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonInstrucciones.png"))); // NOI18N
        btnInstrucciones.setText("btnInstrucciones");
        btnInstrucciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstruccionesActionPerformed(evt);
            }
        });
        getContentPane().add(btnInstrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 250, 110));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo7_1.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnJugarActionPerformed

    private void btnInstruccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstruccionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInstruccionesActionPerformed

    private void btnHistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHistoriaActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHistoria;
    private javax.swing.JButton btnInstrucciones;
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel fondo;
    // End of variables declaration//GEN-END:variables
}