
package com.mycompany.patronbridge;


public class matematicas implements materia {
  
    private int pp = 97;
    private int sp = 70;
    private int tp = 80;

   

    @Override
    public int getPrimerParcial() {
        return pp;
    }

     @Override
    public void setPrimerParcial(int pp) {
          this.pp = pp; //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int getSegundoParcial() {
        return sp;
    }

     @Override
    public void setSegundoParcial(int sp) {
        this.sp= sp;//To change body of generated methods, choose Tools | Templates.
    }

     @Override
    public int getTercerParcial() {
        return tp;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTercerParcial(int tp) {
        this.tp= tp;//To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| MATEMATICAS");
        System.out.println("| Primer Parcial" + pp );
        System.out.println("| Segundo Parcial" + sp );
        System.out.println("| Tercer Parcial "+tp );
        System.out.println("------------------------------------\n");
    }

   

   

   
}