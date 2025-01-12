package EjerciciosArrays;
/*
 Diseña un programa Java que llene una matriz de 5x5 de tipo entero con valores al
azar entre 1 y 10. Hecho esto el programa calculará y mostrará la suma de los valores
de las diagonales de la matriz (por separado).
 */

import java.util.Random;

public class Ej28 {
    public static void main(String[] args) {

        Random rd = new Random();
        int sumaDiagonal1=0;
        int sumaDiagonal2=0;

        int [] [] a = new int [5][5]; //Declaramos dimension de la matriz

        for (int i = 0; i < a.length; i++) {//FILAS
            for (int j = 0; j < a[i].length; j++) {//COLUMNAS
                a[i][j] = rd.nextInt(10)+1;//Rellenamos matriz al azar con valores del 1 al 10.
                System.out.print("\t "+a[i][j]);//Imprimimos matriz


                sumaDiagonal1= a[0][0]+a[1][1]+a[2][2]+a[3][3]+a[4][4];
                sumaDiagonal2= a[4][0]+a[3][1]+a[2][2]+a[1][3]+a[0][4];

            }
            System.out.println();
        }
        System.out.println("La suma de la diagonal 1 es: "+sumaDiagonal1);
        System.out.println("La suma de la diagonal 2 es: "+sumaDiagonal2);

    }
}
