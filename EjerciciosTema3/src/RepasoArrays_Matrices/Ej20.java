package RepasoArrays_Matrices;

/*
Diseña un programa en Java que trabaje con una matriz de 4X5 de tipo double. El
programa llenará la matriz con valores reales entre 1 y 100 y al mismo tiempo mostrará
la matriz en pantalla. Luego, pedirá una fila al usuario y mostrará los valores de esa
fila y su suma.

 */

import java.util.Random;
import java.util.Scanner;

public class Ej20 {
    static Random rd = new Random();//RAMDON DECLARADO GLOBAL
    static Scanner sc = new Scanner(System.in);//ESCANNER DECLARADO GLOBAL
    public static void main(String[] args) {

        int num;
        double [][] m= new double [4][5];
        System.out.println("La matriz generedada al azar es: ");
        rellenaMatriz(m);

        System.out.println("Ingrese un numero de fila:");
        num = sc.nextInt();

        sumaValores(m,num);

    }

    public static void rellenaMatriz( double[][] m) {

        //RELLENAMOS MATRIZ AL AZAR
        for (int i = 0; i < m.length; i++) {//FILAS
            for (int j = 0; j < m[i].length; j++) {//COLUMNAS
                m[i][j] = rd.nextDouble(100)+1;
            }
        }
        //MOSTRAMOS LO QUE HAY EN LA MATRIZ
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(+m[i][j]+ "\t");
            }
            System.out.println();
        }

    }

    public static void sumaValores( double[][] m, int fila) {
        double acumulador=0;
        if (fila < 1 || fila > m.length) {//PARA VERIFICAR QUE ESTA DENTRO DEL RANGO DE FILAS
            System.out.println("Número de fila inválido. Debe estar entre 1 y " + m.length);
            return;
        }

        for (int i = 0; i < m[fila-1].length; i++) {//PARA IMPRIMIR LA FILA, QUE HA TECLEADO EL USUARIO
            System.out.print("\t"+m[fila-1][i] );
            acumulador += m[fila-1][i];//Y SUMAR SUS VALORES
        }
        System.out.println();
        System.out.println("La suma de los numeros de la fila: "+fila+", "+" es: "+acumulador);

    }
}
