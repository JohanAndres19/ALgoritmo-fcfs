/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import Items.Ventana_procesos;
import Items.Vista;
import javax.swing.JFrame;

/**
 *
 * @author Riiuzaky
 */
public class VentanaVista {
        private static JFrame vista;

    private VentanaVista() {
    }
    
    public static JFrame getInstance()
    {
        if(vista == null){
            vista = new Vista();
        }
        return vista;
    }
}
