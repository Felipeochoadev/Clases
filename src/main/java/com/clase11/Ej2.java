package com.clase11;

import java.text.NumberFormat;

class Empleados {
    String Nombre;
    int Salario;
    int Horas;
    int Deducciones;
    int Bonificaciones;

    Empleados(String Nombre, int Salario, int Horas, int Deducciones, int Bonificaciones){
        this.Nombre = Nombre;
        this.Salario = Salario;
        this.Horas = Horas;
        this.Deducciones = Deducciones;
        this.Bonificaciones = Bonificaciones;
    }
}

public class Ej2 {
    public static String formatearLocal(double cantidad) {
        NumberFormat formato = NumberFormat.getCurrencyInstance();
        return formato.format(cantidad);
    }

    public static void main(String[] args) {
        Empleados[] Lista = new Empleados[10];
        Lista[0] = new Empleados("Luis Felipe", 20000, 40, 2000, 6200);
        Lista[1] = new Empleados("Maria Perez", 18000, 40, 1500, 5000);
        Lista[2] = new Empleados("Juan Cano", 22000, 45, 2500, 7000);
        Lista[3] = new Empleados("Ana Gomez", 15000, 38, 1000, 4000);
        Lista[4] = new Empleados("Carlos Ruiz", 19500, 40, 1800, 5500);
        Lista[5] = new Empleados("Elena Toro", 21000, 42, 2100, 6000);
        Lista[6] = new Empleados("Diego Sosa", 17000, 40, 1400, 4500);
        Lista[7] = new Empleados("Sonia Diaz", 25000, 48, 3000, 8500);
        Lista[8] = new Empleados("Pedro Leon", 16000, 40, 1200, 3500);
        Lista[9] = new Empleados("Marta Vila", 23000, 40, 2200, 6800);
        System.out.println("--- LISTADO DE NÓMINA ---");
        
        int SalarioBruto, SalarioNeto, Consecutivo;
        for(int i = 0; i < Lista.length ; i++){
            Consecutivo = i+1;
            SalarioBruto = Lista[i].Salario * Lista[i].Horas;
            SalarioNeto = SalarioBruto - Lista[i].Deducciones + Lista[i].Bonificaciones;
            System.out.println("Consecutivo: "+Consecutivo+" -- El trabajador "+Lista[i].Nombre+" tiene un salario bruto de "+formatearLocal(SalarioBruto)+" y un salario neto de "+formatearLocal(SalarioNeto) );
        }
    }
}