package com.ejercicio11;

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Cantidad de empleados a registrar: ");
        int n = leer.nextInt();
        String nombre, sexo, nombreMujerJoven = "";
        int edad, estadoCivil, depto;
        int menorEdad = 0; 
        boolean primeraMujer = false;
        int sumaEdadHombresSolt = 0, cantHombresSolt = 0;
        int sistemasMayoresCasados = 0;
        int mujeresVentas = 0, totalVentas = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("\n--- EMPLEADO #" + i + " ---");
            System.out.print("Nombre: "); nombre = leer.next();
            System.out.print("Edad: "); edad = leer.nextInt();
            System.out.print("Sexo (M/F): "); sexo = leer.next().toUpperCase();
            System.out.print("Estado Civil (1:Soltero, 2:Casado): "); estadoCivil = leer.nextInt();
            System.out.print("Departamento (1:Ventas, 2:Sistemas, 3:Contabilidad): "); depto = leer.nextInt();
            if (sexo.equals("F") && depto == 3) {
                if (primeraMujer == false) {
                    menorEdad = edad;
                    nombreMujerJoven = nombre;
                    primeraMujer = true;
                } else if (edad < menorEdad) {
                    menorEdad = edad;
                    nombreMujerJoven = nombre;
                }
            }
            if (sexo.equals("M") && estadoCivil == 1 && depto == 1) {
                sumaEdadHombresSolt += edad;
                cantHombresSolt++;
            }
            if (depto == 2 && edad >= 18 && estadoCivil == 2) {
                sistemasMayoresCasados++;
            }
            if (depto == 1) {
                totalVentas++;
                if (sexo.equals("F")) {
                    mujeresVentas++;
                }
            }
        }
        System.out.println("\n========= INFORME FINAL =========");
        System.out.println("a) Mujer más joven en Contabilidad: " + (primeraMujer ? nombreMujerJoven : "No se registraron"));
        if (cantHombresSolt > 0) {
            System.out.println("b) Promedio edad hombres solteros (Ventas): " + (sumaEdadHombresSolt / cantHombresSolt));
        } else {
            System.out.println("b) No hay hombres solteros en Ventas.");
        }
        System.out.println("c) Empleados en Sistemas (Mayores y Casados): " + sistemasMayoresCasados);
        if (totalVentas > 0) {
            int porcentaje = (mujeresVentas * 100) / totalVentas;
            System.out.println("d) Porcentaje de mujeres en Ventas: " + porcentaje + "%");
        } else {
            System.out.println("d) No hay personal en el departamento de Ventas.");
        }
    }
}