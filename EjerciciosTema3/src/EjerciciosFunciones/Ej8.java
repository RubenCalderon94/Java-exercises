package EjerciciosFunciones;

/*
Diseña un programa en Java que trabaje con dos funciones
a. gradosCK, pasará una valor de temperatura de grados centígrados a Kelvin.
b. gradosCF, pasará una valor de temperatura de grados centígrados a Fahrenheit.
Tanto parámetros como valor devuelto serán double en ambos casos
 */

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double grados;
        System.out.println("¿Cuantos grados centigrados hay?");
        grados = sc.nextInt();

        System.out.println("Los grados centigrados "+grados+ " pasados a Kelvin es: "+devuelveKelvin(grados)+" KELVIN");
        System.out.println("Los grados centigrados "+grados+ " pasados a Fahrenheit es: "+devuelveFahrenheit(grados)+ " FAHRENHEIT");

    }

    public static double devuelveKelvin(double grados1) {

        double kelvin;
        kelvin=grados1+273.15;
        return kelvin;
    }

    public static double devuelveFahrenheit(double grados1) {

        double fahrenheit;
        fahrenheit=(grados1-32)*5/9;
        return fahrenheit;
    }
}
