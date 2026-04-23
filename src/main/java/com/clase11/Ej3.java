package com.clase11;

class Deportista {
    String Nombre;
    int Edad, Sexo, Peso, Deporte;
    float Estatura;

    Deportista(String Nombre, int Edad, float Estatura, int Sexo, int Peso, int Deporte){
        this.Nombre = Nombre;
        this.Edad= Edad;
        this.Estatura = Estatura;
        this.Sexo = Sexo;
        this.Peso = Peso;
        this.Deporte = Deporte; 
    }
}

public class Ej3 {
    public static void main(String[] args) {
        Deportista[] Lista = new Deportista[10];
        Lista[0] = new Deportista("Luis Felipe", 36, 1.75f, 1, 79, 2);
        Lista[1] = new Deportista("Ana María", 28, 1.68f, 2, 48, 1);
        Lista[2] = new Deportista("Carlos Ruiz", 22, 1.82f, 1, 82, 3);
        Lista[3] = new Deportista("Elena Gómez", 31, 1.60f, 2, 58, 2);
        Lista[4] = new Deportista("Santi Duque", 25, 1.90f, 1, 95, 4);
        Lista[5] = new Deportista("Lucía Fernández", 19, 1.72f, 2, 63, 1);
        Lista[6] = new Deportista("Mateo Salazar", 34, 1.78f, 1, 80, 2);
        Lista[7] = new Deportista("Valeria Ríos", 27, 1.65f, 2, 60, 3);
        Lista[8] = new Deportista("Jorge Holguín", 40, 1.70f, 1, 77, 2);
        Lista[9] = new Deportista("Paola Cortés", 23, 1.74f, 2, 68, 1);
        String[] TipoSexo = {"Hombre","Mujer"};
        String[] TipoDeporte = {"Natacion","Futbol", "Ciclismo", "Patinaje", "Otro"};
        int ProEdadFutbol;
        float MujerCiclismo;
        int PromedioEdad;
        int CantprefierenFutbol = 0;
        int EdadprefierenFutbol = 0;
        float CantMujerCiclismo = 0;
        float CantCiclismo = 0;
        int CantNatPeso = 0;
        int CantGeneral = 0;
        int EdadGeneral = 0;
        for(int i = 1; i < Lista.length; i++){
            if(TipoDeporte[Lista[i].Deporte-1] == "Futbol"){
                CantprefierenFutbol += 1;
                EdadprefierenFutbol += Lista[i].Edad;
            }
            if(TipoDeporte[Lista[i].Deporte-1] == "Ciclismo"){
                if(TipoSexo[Lista[i].Sexo-1] == "Mujer"){
                    CantMujerCiclismo += 1;
                }
                CantCiclismo += 1;
            }
            if(TipoDeporte[Lista[i].Deporte-1] == "Natacion" && Lista[i].Peso < 50){
                CantNatPeso += 1;
            }
            CantGeneral += 1;
            EdadGeneral += Lista[i].Edad;
        }
        ProEdadFutbol = EdadprefierenFutbol/CantprefierenFutbol;
        MujerCiclismo = (CantMujerCiclismo/CantCiclismo)*100;
        PromedioEdad = EdadGeneral/CantGeneral;;
        System.out.println("--- LISTADO DE LOS DEPORTISTAS --- \n");
        System.out.println("Promedio de edad de personas que prefieren el futbol = "+ProEdadFutbol+"");
        System.out.println("Porcentaje de mujeres que prefieren el ciclismo respecto a los demas = "+MujerCiclismo+"%");
        System.out.println("Cantidad de personas que pesan menos de 50 y miden mas de 1.8 metros = "+CantNatPeso+"");
        System.out.println("Promedio de edad de las personas en general "+PromedioEdad+"");
    }
}