
package com.mycompany.patronbridge;



public class secundaria implements estudiante {
    protected materia materia;

    public secundaria() {}

    public secundaria(materia materia) {
        this.materia = materia;
    }

    @Override
    public void nombre() {
        System.out.println("NOMBRE: Rosio Soto Valdez");//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void curso() {
        System.out.println("CURSO: 4° A "); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ci() {
        System.out.println("CI: 923456"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void papa() {
        System.out.println("PAPA: Ruben Soto "); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mama() {
        System.out.println("MAMA: Cecilia Valdez "); //To change body of generated methods, choose Tools | Templates.
    }
   

    
    
}
