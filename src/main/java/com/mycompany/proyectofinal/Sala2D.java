/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;

/**
 *
 * @author julio
 */
public class Sala2D extends Cine{
    private int numBoletos;
    
    public Sala2D(int numBoletos, int numSala, String horario, String pelicula, double costo) {
        super(numSala, horario, pelicula, costo);
        this.numBoletos = numBoletos;
    }

    public int getNumBoletos() {
        return numBoletos;
    }

    public void setNumBoletos(int numBoletos) {
        this.numBoletos = numBoletos;
    }
  
    public double Calcularcosto() {
       
       
       return super.getCosto()+(super.getCosto()*numBoletos);
    }

    
     
    public String Showmsg() {
       return "Costo por los boletos: "+ super.getCosto();
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sala2D{");
        sb.append("numBoletos=").append(numBoletos);
        sb.append('}');
        return sb.toString();
    }

  
    


    
}
