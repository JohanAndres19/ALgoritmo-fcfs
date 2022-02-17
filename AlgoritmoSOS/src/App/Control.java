/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import Items.Ventana_procesos;
import Items.Vista;


/**
 *
 * @author Riiuzaky
 */
public class Control extends Thread {

    public static void main(String[] args) {

        Vista vista = new Vista();
        vista.setVisible(true);
    }
}
