package EjerciciosProfundizacion;

/*Diseña un programa que muestre en pantalla una imagen como la que se observa.
Solicita el nº de filas, en la imagen 5. El número de filas coincide con el de asteriscos
por fila.

     *****
    *****
   *****
  *****
 ******/

import java.util.Scanner;

public class Ej53 {
    public static void main(String[] args) {

        int filas;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero de filas");
        filas = sc.nextInt();

        for (int i = 1; i <= filas; i++) {
            System.out.println();
           for (int j = 1; j <= filas; j++) {
               System.out.print("*");
           }

        }
    }
}
