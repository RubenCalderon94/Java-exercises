package Ej4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //CREAMOS ARRAY
        ArrayList<String> listaActores = new ArrayList<>();
        //RELLENAMOS ARRAY , SE AÑADE CON ADD
        listaActores.add("Alex");
        listaActores.add("Bob");
        listaActores.add("Jose");
        listaActores.add("Mary");
        listaActores.add("Jack");
        listaActores.add("Jane");

        //RELLENAMOS
        DvdCine cine1 = new DvdCine("Adios","Mario", "ies",
                listaActores,Genero.THRILLER,"B lalsldÇ", 120 );

        DvdCine cine2 = new DvdCine("Adios","Mario", "ies",
                listaActores,Genero.FICCION, "dñlkjfñldkjf", 180 );



        System.out.println(cine1);
        if (cine1.esThriller()){
            System.out.println("El cine1 es thriller");
        }
        else {
            System.out.println("El cine1 no es thriller");
        }
        if (cine1.mismaProductora(cine2)){
            System.out.println("El cine1 es misma productora");
        }
        else {
            System.out.println("El cine1 no es misma productora");
        }

        if (cine1.equals(cine2)){
            System.out.println("El cine1 es igual cine2");
        }
        else {
            System.out.println("El cine1 no es igual cine2");
        }

    }
}
