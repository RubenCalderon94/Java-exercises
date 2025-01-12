package EjerciciosArrays;

/*
. Diseña un programa Java que trabaje con una matriz de 5x5 de tipo entero y la rellene
con valores al azar entre 1 y 9. El programa contendrá una función que buscará un
valor en la matriz y devolverá cuántas veces aparece o se repite en la misma.
 */

import java.util.Random;
import java.util.Scanner;

public class Ej22 {


    public static void main(String[] args) {

        Random rd = new Random();
        int numero=0;

        int[][] m = new int[5][5];//Declarado array

        for (int i = 0; i < m.length; i++) {//FILAS
            for (int j = 0; j < m[i].length; j++) {//COLUMNAS
                m[i][j] = rd.nextInt(9) + 1;//Me rellena la matriz con valores al azar de 1 al 9
                System.out.print("\t" + m[i][j]);
            }
            System.out.println();
        }
        int numSecreto=5;//Declaramos el nuemero a buscar
        numero=buscaValor(numSecreto,m);//Funcion que me busca el numero secreto declarado arriba
        System.out.println("El numero secreto 5 aparece "+numero+ " veces");

    }

    public static int buscaValor(int numSecreto, int [][] p){

        int count=0;

        //Recorremos la matriz y vemos cuantas veces aparece el numero Secreto
        for (int i=0;i<p.length;i++){//FILAS
           for (int j=0;j<p[i].length;j++){//COLUMNAS
               if(p[i][j]==numSecreto){//Me busca el numero 5
                   count++;

               }
           }
        }
        return count;

    }
}
