package RepasoArrays_Matrices;

/*
Diseña un programa que trabaje con una matriz como esta:
int [][] m = {{2,4,5,6,7},{4,2,2,1,1},{5,6,7,8,8,10,12}};
- muestra los valores de la matriz por filas, junto al número de columnas de cada
fila.
- muestra la suma de cada fila
- muestra el mayor de los valores de la matriz
 */

public class Ej23 {
    public static void main(String[] args) {

        int [][] m = {{2,4,5,6,7},{4,2,2,1,1},{5,6,7,8,8,10,12}};

        muestraMatriz(m);
        muestraSumaCadaFila(m);
        mayorValor(m);


    }

    public static void muestraMatriz(int [][] matriz){

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t ");
            }
            System.out.println();
        }
    }

    public static void muestraSumaCadaFila(int [][] matriz){

        int acumulador=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                acumulador = acumulador + matriz[i][j];
            }
            System.out.println("La suma de cada filas es: "+acumulador);
            acumulador=0;
        }

    }

    public static void mayorValor(int [][] matriz){
        int mayor=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j]>mayor){
                    mayor=matriz[i][j];
                }
            }
        }
        System.out.println("El mayor valor es: "+mayor);
    }

}
