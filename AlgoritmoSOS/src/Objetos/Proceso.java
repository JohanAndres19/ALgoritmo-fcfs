/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author Riiuzaky
 */
public class Proceso {
    private String Nombre;
    private int Rafaga,T_llegada,T_final,T_comienzo,T_retorno,T_espera;

    public Proceso(String Nombre,int T_llegada,int Rafaga) {
        this.Nombre = Nombre;
        this.Rafaga = Rafaga;
        this.T_llegada = T_llegada;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getRafaga() {
        return Rafaga;
    }

    public void setRafaga(int Rafaga) {
        this.Rafaga = Rafaga;
    }

    public int getT_llegada() {
        return T_llegada;
    }

    public void setT_llegada(int T_llegada) {
        this.T_llegada = T_llegada;
    }

    public int getT_final() {
        return T_final;
    }

    public void setT_final(int T_final) {
        this.T_final = T_final;
    }

    public int getT_comienzo() {
        return T_comienzo;
    }

    public void setT_comienzo(int T_comienzo) {
        this.T_comienzo = T_comienzo;
    }

    public int getT_retorno() {
        return T_retorno;
    }

    public void setT_retorno(int T_retorno) {
        this.T_retorno = T_retorno;
    }

    public int getT_espera() {
        return T_espera;
    }

    public void setT_espera(int T_espera) {
        this.T_espera = T_espera;
    }
    
    
}
