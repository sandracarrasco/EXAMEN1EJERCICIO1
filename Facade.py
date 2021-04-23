# -*- coding: utf-8 -*-
"""
Created on Tue Apr 20 16:20:09 2021

@author: sady2
"""
class laboratorio :
    
    
    
    
    def calificarL(nombre,apellido):
    

   
   
        
        nom = "sandra";
        ap= "calliconde";
        sum=0
        
        if nom == nombre and ap==apellido:
            
            
            
            print("Introduzca nota Laboratorios ")
            
            num = input()
            num=int(num)
            print("Introduzca Nota Examen Final ")
            
            num2 = input()
            num2=int(num2)
            sum = num + num2
            print(sum)
            
            print(nombre+apellido) 
            print("Nota Laboratorios ")
            print(num)
            
           
            print("Nota Examen Final ")
            print(num2)
            
            print("Nota Final")
            print(sum)
          

class teorica:
    
     
    def calificarT(nombre,apellido):
    

   
   
        
        nom = "sandra";
        ap= "calliconde";
        sum=0
        
        if nom == nombre and ap==apellido:
            
            
            
            print("Introduzca Parcial 1 ")
            
            num = input()
            num=int(num)
            print("Introduzca Parcial 2 ")
            
            num2 = input()
            num2=int(num2)
            print("Introduzca Parcial 3 ")
            
            num3 = input()
            num3=int(num3)
            sum = num + num2 + num3
            print(sum)
            
            print(nombre+apellido) 
            print("Primer Parcial ")
            print(num)
            
           
            print("Segundo Parcial ")
            print(num2)
            print("Segundo Parcial ")
            print(num3)
            
            print("Nota Final")
            print(sum)



class Facade:
    
    def calificar(nombre,apellido):
        laboratorio.calificarL(nombre,apellido)
        teorica.calificarT(nombre,apellido) 
        
        
        
class PrincipalCalificarM:
     Facade.calificar("sandra", "calliconde")
     
           
   

            
            
            
        
        
    
     
       
    
