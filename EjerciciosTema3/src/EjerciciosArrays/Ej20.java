package EjerciciosArrays;

/*
 Diseña un programa en Java que trabaje con una matriz de 4X5 de tipo double. El
programa llenará la matriz con valores reales entre 1 y 100 y al mismo tiempo mostrará
la matriz en pantalla. Luego, pedirá una fila al usuario y mostrará los valores de esa
fila y su suma.
 */

import java.util.Random;
import java.util.Scanner;

public class Ej20 {
    public static void main(String[] args) {

        int fila;
        int acumulador=0;
        Random rd = new Random();

        double[][] a = new double[4][5];//Creamos matriz

        for (int i = 0; i < a.length; i++) {//FILAS
            for (int j = 0; j < a[0].length; j++) {//COLUMNAS
                a[i][j] = rd.nextDouble(100) + 1;
                System.out.print("\t"+a[i][j] );
            }
            System.out.println();
        }


        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una fila de la matriz, sumaremos sus valores");
        fila=sc.nextInt();

        for (int i = 0; i < a[fila-1].length; i++) {//PARA IMPRIMIR LA FILA, QUE HA TECLEADO EL USUARIO
            System.out.print("\t"+a[fila-1][i] );
            acumulador += a[fila-1][i];
        }
        System.out.println();
        System.out.println("La suma de los numeros de la fila: "+fila+", "+" es: "+acumulador);
    }

}