package EjerciciosArrays;

/*
Partiendo de la matriz del ejercicio anterior, diseña una aplicación que:
a. muestre la matriz
b. intercambie los valores de la primera y última columna de cada fila
c. muestre la matriz de nuevo
 */



public class Ej24 {
    public static void main(String[] args) {

        int intermedia=0;

        int[][] m = {{2, 4, 5, 6, 7}, {4, 2, 2, 1, 1}, {5, 6, 7, 8, 8, 10, 12}};

        System.out.println("Mostramos la matriz de forma inicial:");
        for (int i = 0; i < m.length; i++) {//FILAS
            for (int j = 0; j < m[i].length; j++) {//COLUMNAS
                System.out.print("\t"+m[i][j]);
            }
            System.out.println();
        }

        for(int i=0; i<m.length; i++) {//Intercambiamos los valores de la columna 1 con la ultima columna
            intermedia=m[i][0];//Guardamos la posicion 0 en la variable intermedia
            m[i][0]=m[i][m[i].length-1];//La pasicion 0 la pasamos a la ultima posicion
            m[i][m[i].length-1]=intermedia;//La ultima posicion la guardamos en intermedia, que es la primera
        }

        System.out.println("Mostramos la matriz de forma final:");
        for(int i=0; i<m.length; i++) {
            for(int j=0; j<m[i].length; j++) {
                System.out.print("\t"+m[i][j]);
            }
            System.out.println();
        }

    }
}
