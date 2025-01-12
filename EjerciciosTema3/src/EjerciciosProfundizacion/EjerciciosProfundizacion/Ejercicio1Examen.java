package EjerciciosProfundizacion.EjerciciosProfundizacion;

/* Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.*/

import java.util.Scanner;

public class Ejercicio1Examen {
    public static void main(String[] args) {


        int num;
        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Ingrese un numero: ");
            num = sc.nextInt();

            if (num != 0) {
                if (num % 2 == 0) {
                    System.out.println("El numero " + num + " es par");
                } else {
                    System.out.println("El numero " + num + " es impar");
                }
            }

        }while (num!=0);
        System.out.println("Programa finalizado");

    }

}
