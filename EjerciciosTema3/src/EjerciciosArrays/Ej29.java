package EjerciciosArrays;

/*
 Diseña un programa Java que contenga una función que reciba como parámetro dos
matrices con el mismo número de filas y columnas y devuelva otra matriz que será la
suma de las dos anteriores. Se suman valores situados en las mismas posiciones de
ambas matrices.
 */

import java.util.Random;

public class Ej29 {
    static  Random rd = new Random();//RAMDON DECLARADO GLOBAL
    public static void main(String[] args) {
        int [][]m1 = new int[5][5];//Declaramos primera matriz de 5 filas y 5 columnas
        int [][]m2 = new int[5][5];//Declaramos segunda matriz de 5 filas y 5 columnas
        int [][]m3 = new int[5][5];

        m1= rellenaMatriz(m1,10);//Funcion rellena matriz1
        m2= rellenaMatriz(m2,10);//Funcion rellena matriz2
        m3= sumaMatrizes(m1, m2);//Funcion suma las dos matrices
        ensenarM(m1);//Imprime matriz1
        System.out.println();
        ensenarM(m2);//Imprime matriz2
        System.out.println();
        ensenarM(m3);//Imprime matriz3

    }
    private static int[][] sumaMatrizes(int[][] m1, int[][] m2) {
        int [][]m4 = new int[5][5];

        for(int i=0; i<m1.length;i++) {//filas
            for(int j=0;j<m1[i].length;j++) {//columnas
                m4[i][j]=m1[i][j] + m2[i][j];
            }
        }
        return m4;
    }
    private static int[][] rellenaMatriz(int[][] a, int r) {

        for(int i=0; i<a.length;i++) {//filas
            for(int j=0;j<a[i].length;j++) {//columna
                a[i][j]=rd.nextInt(r)+1;
            }
        }
        return a;
    }
    private static void ensenarM(int[][] a) {

        for(int i=0; i<a.length;i++) {
            for(int j=0;j<a[i].length;j++) {
                System.out.print(a[i][j]+ "\t");
            }
            System.out.println();
        }
    }


}
