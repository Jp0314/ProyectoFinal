/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;

/**
 *
 * @author julio
 */
public class Bebida extends Palomitas{
    private String sabor;

    public Bebida(String sabor, String tamaño, double precio, String tipo) {
        super(tamaño, precio, tipo);
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bebida{");
        sb.append("sabor=").append(sabor);
        sb.append('}');
        return sb.toString();
    }

   
    
   
    
}
