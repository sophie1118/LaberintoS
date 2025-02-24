/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ucr.ac.cr.laberintos.view;

import java.awt.event.ActionListener;
import ucr.ac.cr.laberintos.controller.ControladorPrincipal;

/**
 *
 * @author Usuario
 */
public class GUIInstrucciones extends javax.swing.JFrame {

    /**
     * Creates new form GUIHistoria
     */
    
    
    private ControladorPrincipal controlador; 
    private GUIFrame guiFrame; 
    
    public GUIInstrucciones(ControladorPrincipal controlador, GUIFrame guiFrame) {
        initComponents();
        this.controlador = controlador; 
        this.guiFrame = guiFrame; 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalirInstrucciones = new javax.swing.JButton();
        btnSalir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalirInstrucciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        btnSalirInstrucciones.setText("btnSalir");
        btnSalirInstrucciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirInstruccionesActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalirInstrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 210, 60));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/instruccionesdef_1.png"))); // NOI18N
        btnSalir.setText("jLabel1");
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 450, 558));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirInstruccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirInstruccionesActionPerformed
        controlador.mostrarMenuPrincipal(); 
        setVisible(false); 
    }//GEN-LAST:event_btnSalirInstruccionesActionPerformed

    
    
    
    
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnSalir;
    private javax.swing.JButton btnSalirInstrucciones;
    // End of variables declaration//GEN-END:variables
}
