package EjerciciosProfundizacion.EjerciciosProfundizacion;

import java.util.Scanner;

/** Utilización de contadores. Diseña un programa Java que pida dos números y muestre
 en pantalla los números múltiplos de 3 hay entre ambos. Al final debe imprimir  cuántos
 múltiplos de 3 se han mostrado. */

public class Ej18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        int contador = 0;

        System.out.println("Multiplos de 3 entre " + num1 + " y " + num2 + " : ");

        if (num1 < num2) {
            for (int i = num1; i <num2; i++) {
                if (i % 3 == 0) {
                    System.out.println(i);
                    contador++;
                }
            }
        }else if (num2 < num1) {
            for (int i = num2; i <num1; i++) {
                if (i % 3 == 0) {
                    System.out.println(i);
                    contador++;
                }
            }

        }


        System.out.println("Total de multiplos de 3 : " + contador);


    }
}
