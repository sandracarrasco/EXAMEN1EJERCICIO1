/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.patronbridge;

/**
 *
 * @author sady2
 */
public class App {
    public static void main(String[] args) {
        testMateria(new matematicas());
        testMateria(new lenguaje());
    }
    
    public static void testMateria(materia materia) {
        System.out.println("PRIMARIA ");
        primaria primarias = new primaria(materia);
        primarias.nombre();
        primarias.curso();
        materia.printStatus();
        
       /* System.out.println("SECUNDARIA ");
        secundaria secundarias = new secundaria(materia);
        secundarias.nombre();
        secundarias.curso();
        materia.printStatus();
       */
      
    }
    
}


