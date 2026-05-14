package com.ejercicio12;
import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int NumeroEntero, Modulo, i;
        String ValidarEntero;
        ValidarEntero = "NO";
        System.out.println("Numero entero ");
        NumeroEntero = leer.nextInt();
        ValidarEntero = "SI";
        for(i = 2; i < NumeroEntero; i++){
            Modulo = NumeroEntero % i;
            if(Modulo == 0){
                ValidarEntero = "NO";
                break;
            }
        }
        if(NumeroEntero == 1) ValidarEntero = "NO";
        System.out.print("El numero entero " + NumeroEntero + " se identifica que " + ValidarEntero + " es primo. ");
    }
}