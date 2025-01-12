package EjerciciosArrays;

/*
 Diseña un programa Java que trabaje con una matriz de 3x3 como esta int [][] m =
{{4,5,6},{10,1,12},{14,2,3}} de tipo entero. El programa mostrará cada fila de la matriz
y la suma de sus valores (de cada fila).
 */

public class Ej21 {
    public static void main(String[] args) {

        int acumulador=0;

        int [][] m = {{4,5,6},{10,1,12},{14,2,3}};

        for (int i = 0; i < m.length; i++) {//FILAS
            for (int j = 0; j < m[i].length; j++) {//COLUMNAS
                    System.out.print( "\t"+m[i][j]);
                    acumulador+=m[i][j];//SUMA CADA LINEA

            }
            System.out.println(" \t Suma de la fila es "+acumulador);
            acumulador=0;//HAY QUE PONERLO DE CERO PORQUE AL SALTAR DE LINEA SIGUE SUMANDO TODO EN GENERAL,
                        //DEBE SUMAR DE LINEA EN LINEA
        }

    }

}
