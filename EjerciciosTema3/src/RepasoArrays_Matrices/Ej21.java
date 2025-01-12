package RepasoArrays_Matrices;

/*
Diseña un programa Java que trabaje con una matriz de 3x3 como esta int [][] m =
{{4,5,6},{10,1,12},{14,2,3}} de tipo entero. El programa mostrará cada fila de la matriz
y la suma de sus valores (de cada fila)
 */

public class Ej21 {
    public static void main(String[] args) {

        int [][] m = {{4,5,6},{10,1,12},{14,2,3}};

        muestraFilaySuma(m);

    }

    public static void muestraFilaySuma(int [][] matriz) {

        int acumulador=0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print( "\t"+matriz[i][j]);
                acumulador+=matriz[i][j];//SUMA CADA LINEA

            }
            System.out.println(" \t Suma de la fila es "+acumulador);
            acumulador=0;//HAY QUE PONERLO EN 0 , SI NO ,SUMA TODO GLOBAL, NO FILA  A FILA INDEPENDIENTE
        }

    }
}
