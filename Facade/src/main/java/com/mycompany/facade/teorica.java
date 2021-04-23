
package com.mycompany.facade;

import java.util.Scanner;
public class teorica {
   
    Scanner leer= new Scanner(System.in);
    public void buscarTeorica(String nombre,String apellido){
        
        String nom = "rosio";
        String ap= "calliconde";
        
        if (nom == nombre && ap==apellido){
            
            System.out.println("Introduzca Primer Parcial");
           
            System.out.println("Introduzca Segundo Parcial");
        
            System.out.println("Introduzca Tercer Parcial");
   
           

            System.out.println("nombre :"+nombre+"---------apellido :"+apellido);
            System.out.println("Primer Parcial :30 ");
            System.out.println("Segundo Parcial:30");
            System.out.println("Tercer Parcial : 30");
            System.out.println("Nota Final : 90 ");
            
           
            
            
            
            
        }
        
        
    }
}
