package EjerciciosProfundizacion.EjerciciosProfundizacion;

/* Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés sin utilizar la
clase String.*/

import java.util.Scanner;

public class Ejercicio5examen {
    public static void main(String[] args) {

        int num, digito;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 0 y 9.9999 ");
        num = sc.nextInt();

        if (num < 0 || num > 9999) {
            System.out.println("El número debe estar entre 0 y 9999.");
        } else {

            while (num > 0) {
                // Obtiene el último dígito
                digito = num % 10;
                // Imprime el dígito
                System.out.print(", " + digito);
                // Elimina el último dígito
                num = num / 10;

            }

        }

    }

}
