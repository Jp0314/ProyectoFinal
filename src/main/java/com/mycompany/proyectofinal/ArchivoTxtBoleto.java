/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;

/**
 *
 * @author julio
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class ArchivoTxtBoleto {
    
        public void guardarEmpleado(Producto [] productos, String archivo){
        
        try {
            FileWriter fw = new FileWriter(archivo);
            
            for (Producto e : productos) {
                System.out.println(e.obtenerDetalles());
                fw.write(e.obtenerDetalles()+"\n");
                
            }
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getCause());
        }
    
    }
    
}

