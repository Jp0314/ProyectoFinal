/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;

/**
 *
 * @author julio
 */
public abstract class Cine {
    private int numSala;
    private String horario;
    private String pelicula;
    private double costo;

    public Cine(int numSala, String horario, String pelicula, double costo) {
        this.numSala = numSala;
        this.horario = horario;
        this.pelicula = pelicula;
        this.costo = costo;
    }

    public int getNumSala() {
        return numSala;
    }

    public void setNumSala(int numSala) {
        this.numSala = numSala;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    public abstract double Calcularcosto();
    
    public abstract String Showmsg();
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cine{");
        sb.append("numSala=").append(numSala);
        sb.append(", horario=").append(horario);
        sb.append(", pelicula=").append(pelicula);
        sb.append('}');
        return sb.toString();
    }
    
    

}
