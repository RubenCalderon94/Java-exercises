package EjerciciosIniciacion;

import java.util.Scanner;

/**Diseña un programa Java que permita convertir un valor de segundos en horas y
minutos. **/


public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cantidad en segundos: ");
        int segundos = sc.nextInt();

        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundosRestantes = segundos % 60;


        System.out.println("La cantidad de segundos que has escrito " + segundos + " pasadas a horas son: " + horas +
                " Horas. " + minutos + " Minutos. y " + segundosRestantes + " Segundos.");

        sc.close();
    }
}
