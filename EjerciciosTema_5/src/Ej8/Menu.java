package Ej8;

import java.util.Scanner;

public class Menu {

    //ATRIBUTOS
    private String[] opciones;

    //CONSTRUCTOR
    public Menu(String[] opciones) {
        this.opciones = opciones;
    }

    //METODOS
    public String mostrarMenu() {
        Scanner entrada = new Scanner(System.in);
        String opcion = "";
        for (int i = 0; i < opciones.length; i++) {
            System.out.println(opciones[i]);
        }
        opcion = entrada.next();
        return opcion;
    }

}
