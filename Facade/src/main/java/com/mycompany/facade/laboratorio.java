
package com.mycompany.facade;
import java.util.Scanner;
public class laboratorio {
   
   
    public void buscarLaboratorio(String nombre,String apellido){
        
        String nom = "sandra";
        String ap= "calliconde";
     
        
        
        if (nom == nombre && ap==apellido){
            
            int lab1=10;
            int lab2=8;
            int lab3=7;
            int lab4=6;
            int lab5=4;
            int lab6=3;
            int ef=25;
            int nf=0;
            nf=lab1+lab2+lab3+lab4+lab5+lab6+ef;
            
            System.out.println("Introduzca nota de laboratorios");
            System.out.println("Introduzca nota del examen final");
            
            
            System.out.println("nombre :"+nombre+"---------apellido :"+apellido);
            System.out.println("Laboratorio1 "+lab1);
            System.out.println("Laboratorio2 "+lab2);
            System.out.println("Laboratorio3 "+lab3);
            System.out.println("Laboratorio4"+lab4);
            System.out.println("Laboratorio5 "+lab5);
            System.out.println("Laboratorio6 "+lab6);
         
            System.out.println("NOTA EXAMEN FINAL "+ef);
           
            System.out.println("NOTA FINAL"+nf);
            
            
                
                
                
                
         
            
            
            
        }
        
    }
}
