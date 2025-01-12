package EjerciciosProfundizacion.EjerciciosProfundizacion;

import java.util.Scanner;

/**. Más contadores. Diseña un programa Java que solicite números  enteros al usuario y
 cuente los pares han sido tecleados. Dejará de solicitar números cuando se teclee el -9999*/

public class Ej19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int contador = 0;

        System.out.println("Ingrese números enteros. El programa contará los números pares.");
        System.out.println("Para detener el programa, ingrese -9999.");

        int num;
        do {
            System.out.print("Ingrese un número: ");
            num = sc.nextInt();

            if (num != -9999 && num % 2 == 0) {
                contador++;
            }

        } while (num != -9999);

        System.out.println("Se han ingresado " + contador+ " números pares.");

    }
}

