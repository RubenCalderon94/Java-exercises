package EjerciciosArrays;

/*
. Diseña un programa Java que contenga una función que devuelva en un array los
números primos contenidos en una matriz de 10x10 de tipo entero. La matriz contiene
una serie de números, primos y no primos.
 */

import java.util.Random;

public class Ej30 {

    public static void main (String[]args){
        int[][] m = new int[10][10];
        Random rd = new Random();
        int nprimos;
        int[] primos;

        //rellenar la matriz con aleatorios del 1 al 100
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = rd.nextInt(99) + 1;
            }
        }
        //enseñar la matriz
        ensenaMatriz(m);
        System.out.println();
        //función que devuelve la cantidad de primos que hay en la matriz
        nprimos = numeroDePrimos(m);
        //defino el array donde voy a guardar los primos.
        primos = new int[nprimos];
        //función que se le pasa la matriz y la dimensio del array primos
        //y devuelve un array con todos los primos que hay.
        primos = caculoPrimos(m, nprimos);
        //sacar por pantalla
        ensenarArray(primos);

    }

    private static void ensenaMatriz ( int[][] m){

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }

    }

    private static void ensenarArray ( int[] primos){

        for (int i = 0; i < primos.length; i++) {
            System.out.print(primos[i] + "\t");
        }

    }

    private static int numeroDePrimos ( int[][] matriz){
        int count = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (esPrimo(matriz[i][j])) {
                    count++;
                }
            }
        }
        return count;
    }

    private static int[] caculoPrimos ( int[][] matriz, int cprimos ){
        int[] p = new int[cprimos];
        int k = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (esPrimo(matriz[i][j])) {
                    p[k++] = matriz[i][j];
                }
            }
        }

        return p;
    }


    private static boolean esPrimo ( int n){

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;


    }

}
