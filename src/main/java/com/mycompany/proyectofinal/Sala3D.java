/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;

/**
 *
 * @author julio
 */
public class Sala3D extends Sala2D{
    private String lentes;
    
    public Sala3D(){
        this.lentes= null;
    }
    public Sala3D(String lentes, int numBoletos, int numSala, String horario, String pelicula, double costo) {
        super(numBoletos, numSala, horario, pelicula, costo);
        this.lentes = lentes;
    }

    public String getLentes() {
        return lentes;
    }

    public void setLentes(String lentes) {
        this.lentes = lentes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sala3D{");
        sb.append("lentes=").append(lentes);
        sb.append('}');
        return sb.toString();
    }
    
    
    
   
}
