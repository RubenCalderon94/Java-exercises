package EjerciciosIniciacion;

import java.util.Scanner;

/** . Diseña un programa Java que solicite dos números enteros y los imprima en pantalla
 en orden ascendente.*/

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        if (num1 < num2) {
            System.out.println("El orden ascendente es: " + num1 +","+num2 );
        } else {
            System.out.println("El orden ascendente es: " + num2 +","+num1);
        }
        sc.close();
    }
}
