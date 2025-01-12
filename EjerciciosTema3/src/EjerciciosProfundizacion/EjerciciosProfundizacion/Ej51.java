package EjerciciosProfundizacion.EjerciciosProfundizacion;

/*1. Diseña un programa Java que pinte en pantalla una serie de asteriscos como los que
se observan. El usuario indicará el número de filas.

                                  **
                                 ****
                               ********
                           ****************
                   ********************************
*/

import java.util.Scanner;

public class Ej51 {
    public static void main(String[] args) {

        int filas;
        int asteriscos;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero de filas:");
        filas = sc.nextInt();

        for (int i = 1; i <= filas; i++) {
            asteriscos=(int)Math.pow(2, filas);
            System.out.println("*");
        }




    }
}
