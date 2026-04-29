package com.ejercicio9;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String placa;
        int tipo, horas;
        double precioHora = 0, totalBruto, impuesto, totalNeto;
        for (int i = 1; i <= 20; i++) {
            System.out.println("\n--- REGISTRO VEHÍCULO NRO: " + i + " ---");
            System.out.print("Ingrese la placa: ");
            placa = leer.next();
            System.out.print("Tipo (1:Moto, 2:Carro, 3:Camioneta): ");
            tipo = leer.nextInt();
            System.out.print("Horas en el parqueadero: ");
            horas = leer.nextInt();
            switch (tipo) {
                case 1:
                    precioHora = 2000;
                    break;
                case 2:
                    precioHora = 5000;
                    break;
                case 3:
                    precioHora = 8000;
                    break;
                default:
                    System.out.println("Categoría no válida. Se asignará 0.");
                    precioHora = 0;
            }
            totalBruto = horas * precioHora;
            impuesto = totalBruto * 0.05;
            totalNeto = totalBruto + impuesto;
            System.out.println("Placa: " + placa);
            System.out.println("Subtotal: $" + totalBruto);
            System.out.println("Impuesto (5%): $" + impuesto);
            System.out.println("Total a pagar: $" + totalNeto);
        }
    }
}