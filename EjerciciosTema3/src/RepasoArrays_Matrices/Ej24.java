package RepasoArrays_Matrices;
/*
Partiendo de la matriz del ejercicio anterior, diseña una aplicación que:
a. muestre la matriz
b. intercambie los valores de la primera y última columna de cada fila
c. muestre la matriz de nuevo
 */

public class Ej24 {
    public static void main(String[] args) {
        int [][] m = {{2,4,5,6,7},{4,2,2,1,1},{5,6,7,8,8,10,12}};
        System.out.println("Matriz orginal:");
        muestraMatriz(m);
        System.out.println();
        System.out.println("Matriz final:");
        muestraMatrizIntercambiada(m);

    }

    public static void muestraMatriz(int [][] matriz){//MUESTRA MATRIZ INICIAL

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t ");
            }
            System.out.println();
        }
    }

    public static void muestraMatrizIntercambiada (int [][] matriz){

        int intermedia;
        for(int i=0; i<matriz.length; i++) {//Intercambiamos los valores de la columna 1 con la ultima columna
            intermedia=matriz[i][0];//Guardamos la posicion 0 en la variable intermedia
            matriz[i][0]=matriz[i][matriz[i].length-1];//La pasicion 0 la pasamos a la ultima posicion
            matriz[i][matriz[i].length-1]=intermedia;//La ultima posicion la guardamos en intermedia, que es la primera
        }
        //MUESTRA MATRIZ YA INTERCAMBIADA
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t ");
            }
            System.out.println();
        }

    }
}
