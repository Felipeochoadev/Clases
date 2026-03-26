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
        
        if( seccion.equalsIgnoreCase("Deportes") ){
            descuento = valorBruto * 5/100;
        } else {
            if( seccion.equalsIgnoreCase("Aseo") ){
                 descuento = valorBruto * 10/100;
            } else {
                 descuento = (float) 0;
            }
        }
        iva = (valorBruto - descuento) * 10/100;
        valorNeto = valorBruto- descuento + iva;

        System.out.println("\n el producto con codigo " + codigo + " tiene un valor bruto de "+ valorBruto);
        System.out.println("\n su descuento es de " + descuento );
        System.out.println("\n tiene un iva de " + iva );
        System.out.println("\n el valor neto a pagar es " + valorNeto );
    }
}