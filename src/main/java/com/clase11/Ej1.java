package com.clase11;

public class Ej1 {
    public static void main(String[] args) {
        int Cantidad, Inicial, Serie, i;
        Cantidad = 15;
        Inicial = 0;
        Serie = 4;
        //SALTO DE LINEA \n
        System.out.print("\n");
        for(i = 1; i <= Cantidad; i++){
            Inicial += Serie;
            System.out.println("Consecutivo: "+i+" -- Numero "+Inicial+"");
        }
    }
}