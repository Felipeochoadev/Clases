package com.cesde;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Instanciar la libreria de Scanner (Se usa para capturar los input)
        Scanner scanner = new Scanner(System.in);

        //Definicion de variables principales
        String codigo, seccion;
        Float valorUnitario, valorBruto, descuento, iva, valorNeto;
        int cantVendida;

        //Inicio del algoritmo, Leer variables
        System.out.println("Ingrese el Codigo del producto ");
        codigo = scanner.next();
        //next() para string
        //nextFloat() para float
        //nextInt() para int
        System.out.println("Cuantas unidades compro ");
        cantVendida = scanner.nextInt();

        System.out.println("A que precio compro cada unidad ");
        valorUnitario = scanner.nextFloat();
        
        System.out.println("Cual es la seccion donde compro ");
        seccion = scanner.next();
        
        //Impresionde variable definida
        valorBruto = valorUnitario * cantVendida;

        System.out.println("El codigo ingreso fue: " + codigo + " por un valor bruto de " +valorBruto);
        
    }
}