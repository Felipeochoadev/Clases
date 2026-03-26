package com.cesde;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre, facultad;
        Float valorMateria, valorBruto, papeleria, valorNeto;
        int numMateria;

        System.out.println("hola, eres un estudiante del cesde por favor ingresa tu nombre ");
        nombre = scanner.next();
        
        System.out.println("Cuantas materias escogio ");
        numMateria = scanner.nextInt();

        System.out.println("En cual facultad estudias ");
        facultad = scanner.next();
        
        if(facultad.equalsIgnoreCase("Derecho")){
            valorMateria = (float) 100000;
        } else {
            if(facultad.equalsIgnoreCase("Medicina")){
                valorMateria = (float) 120000;
            } else {
                valorMateria = (float) 80000;
            }
        }

        valorBruto = valorMateria * numMateria;
        papeleria = valorBruto * (float) 0.05;
        valorNeto = valorBruto + papeleria;

        System.out.println("\n nombre del estudiante " + nombre);
        System.out.println("\n cantidad de materias escogidas " + numMateria );
        System.out.println("\n estudia en la facultad " + facultad );
        System.out.println("\n el valor por materia es " + valorMateria );
        System.out.println("\n el valor bruto es " + valorBruto );
        System.out.println("\n la papeleria cuesta " + papeleria );
        System.out.println("\n el valor neto es " + valorNeto );
        
    }
}
