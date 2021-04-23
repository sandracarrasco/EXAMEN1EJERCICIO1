# -*- coding: utf-8 -*-
"""
Created on Fri Apr 23 18:51:09 2021

@author: sady2
"""

from __future__ import annotations
from abc import ABC, abstractmethod


class Estudiante:


    def __init__(self, materia: Materia) -> None:
        self.materia = materia

    def operation(self) -> str:
        return (f"PRIMARIA: NOMBRE: Carlos Torrez Callisaya  CURSO: 4° A\n"
                f"{self.materia.operacion_materia()}")


class EstudianteSecundaria(Estudiante):
  

    def operation(self) -> str:
        return (f"SECUNDARIA : NOMBRE: Rosio Soto Valdez   CURSO: 3°A\n"
                f"{self.materia.operacion_materia()}")


class Materia(ABC):


    @abstractmethod
    def operacion_materia(self) -> str:
        pass





class Matematicas(Materia):
    def operacion_materia(self) -> str:
        return "MATEMATICAS: PRIMER PARCIAL:56  SEGUNDO PARCIAL: 78 TERCER PARCIAL:78 "


class Lenguaje(Materia):
    def operacion_materia(self) -> str:
        return "LENGUAJE: PRIMER PARCIAL:89  SEGUNDO PARCIAL: 56 TERCER PARCIAL:88"


def client_code(estudiante: Estudiante) -> None:


    print(estudiante.operation(), end="")

   


if __name__ == "__main__":
 

    materia = Matematicas()
    estudiante = Estudiante(materia)
    client_code(estudiante)

    print("\n")

    materia = Lenguaje()
    estudiante=EstudianteSecundaria(materia)
    client_code(estudiante)