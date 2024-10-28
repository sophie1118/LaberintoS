/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.laberintos.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.laberintos.view.GUIFrame;
import ucr.ac.cr.laberintos.view.GUIHistoria;
import ucr.ac.cr.laberintos.view.GUIInstrucciones;

/**
 *
 * @author Usuario
 */
public class ControladorPrincipal implements ActionListener{
    
    private GUIFrame guiFrame; 
    private GUIInstrucciones guiInstrucciones; 
    private GUIHistoria guiHistoria; 
    
    
    
    public ControladorPrincipal(){
     guiFrame = new GUIFrame(this); 
     guiInstrucciones = new GUIInstrucciones(this, guiFrame); 
     guiHistoria = new GUIHistoria(this, guiFrame);
     guiFrame.setVisible(true);
     mostrarMenuPrincipal();
    
    }

        public void mostrarMenuPrincipal() {
        guiFrame.setVisible(true);
        
        }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()) {
                
                case "btnJugar":      
                   
                    break; 
                    
                case "btnInstrucciones":
                            guiInstrucciones.setVisible(true);
                            guiFrame.setVisible(false);
                    break; 
                    
                    
                case "btnHistoria": 
                            guiHistoria.setVisible(true);
                            guiFrame.setVisible(false);
                break; 
                
                
                case"btnSalir" : 
                    System.exit(0);
                        break; 
                
    }
    
    }
}

