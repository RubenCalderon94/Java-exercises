package EjerciciosArrays;

/*
.Diseña un programa que trabaje con una matriz como esta:
int [][] m = {{2,4,5,6,7},{4,2,2,1,1},{5,6,7,8,8,10,12}};

-muestra los valores de la matriz por filas, junto al número de columnas de cada
fila.
-muestra la suma de cada fila
-muestra el mayor de los valores de la matriz
 */

public class Ej23 {
    public static void main(String[] args) {

        int suma = 0;
        int mayor=0;
        int[][] m = {{2, 4, 5, 6, 7}, {4, 2, 2, 1, 1}, {5, 6, 7, 8, 8, 10, 12}};

        for (int i = 0; i < m.length; i++) {//FILAS
            for (int j = 0; j < m[i].length; j++) {//COLUMNAS
                System.out.print("\t" + m[i][j]);
                if (m[i][j] > mayor) {//Buscamos el numero mayor de la matriz
                    mayor = m[i][j];//Me guarda el mayor en la variable mayor
                }
                suma += m[i][j];//Me hace la suma de cada fila
            }
            System.out.println("\t la suma de esta fila es: " + suma);
            suma = 0;
        }
        System.out.println("El numero mayor es " + mayor);

    }
}

