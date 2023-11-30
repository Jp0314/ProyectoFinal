/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;

/**
 *
 * @author julio
 */
public class Dulces extends Palomitas{
    private String snaks;

    public Dulces(String snaks, String tamaño, double precio, String tipo) {
        super(tamaño, precio, tipo);
        this.snaks = snaks;
    }

    public String getSnaks() {
        return snaks;
    }

    public void setSnaks(String snaks) {
        this.snaks = snaks;
    }

    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dulces{");
        sb.append("tipo=").append(snaks);
        sb.append('}');
        return sb.toString();
    }

    
    
    
}
