/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.patronbridge;




public class primaria implements estudiante {
    protected materia materia;

    public primaria() {}

    public primaria(materia materia) {
        this.materia = materia;
    }

    @Override
    public void nombre() {
        System.out.println("NOMBRE: Carlos Torrez Callisaya ");//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void curso() {
        System.out.println("CURSO: 3° A "); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ci() {
        System.out.println("CI: 9863546"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void papa() {
        System.out.println("PAPA: Armando Torrez "); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mama() {
        System.out.println("MAMA: Camila Callisaya "); //To change body of generated methods, choose Tools | Templates.
    }
   

    
    
}
