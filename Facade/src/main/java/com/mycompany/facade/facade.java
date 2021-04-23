
package com.mycompany.facade;


public class facade {
    private laboratorio laboratorio;
    private teorica teorica;
    
    
    public facade(){
         laboratorio = new laboratorio();
         teorica = new teorica();
         
    }
    public void buscar(String nombre,String apellido){
        laboratorio.buscarLaboratorio(nombre, apellido);
        teorica.buscarTeorica(nombre, apellido);
        
    }
}
