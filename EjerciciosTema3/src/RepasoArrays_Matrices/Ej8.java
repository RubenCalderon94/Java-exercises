package RepasoArrays_Matrices;

/*
Diseña un programa que llene un array de 10 elementos con valores al azar entre 1 y
1000 mediante un bucle while. Luego el programa dará al usuario la opción de obtener
la media de los valores del array y el menor de los valores del array.
Diseña una función para cada caso, ambas llevarán como argumento de entrada
el array
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ej8 {
    static Scanner sc = new Scanner(System.in);//DECLARADO GLOBAL
    static Random rd = new Random();//DECLARADO GLOBAL
    public static void main(String[] args) {

        int [] a= new int [10];
        int opcion;
        rellenaArray(a);//FUNCION QUE NOS RELLENA UN ARRAY EL AZAR CON EL BUCLE WHILE

        System.out.println("Elige opcion 1 para hacer media o opcion 2 para ver el valor menor:");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("La media es: " + calculaMedia(a));
                break;
            case 2:
                System.out.println("El menor valor es: " + encuentraMenor(a));
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    public static void rellenaArray(int [] array) {
        int countWhile=array.length;

        //RAMDON DECLARADO GLOBAL, ESTA ARRIBA
        //RELLENO DEL ARRAY CON WHILE
        while(countWhile!=0) {
            countWhile--;
            array[countWhile]=rd.nextInt(1000)+1;
        }
        System.out.println(Arrays.toString(array));//HAY QUE USAR ESTE METODO SI NO, DA ERROR AL
        //IMPRIMIR EL ARRAY CON EL BUCLE WHILE
    }

    public static int calculaMedia(int [] array) {//FUNCION PARA HACER MEDIA ARITMETICA

        int sum=0;
        for(int i=0;i<array.length;i++) {
            sum+=array[i];
        }
        return sum/array.length;
    }

    public static int encuentraMenor(int[] array) { //FUNCION PARA CALCULAR VALOR MENOR EN ARRAY
        int min=array[0];
        for(int i=1;i<array.length;i++) {
            if(array[i]<min) {
                min=array[i];
            }
        }
        return min;
    }
}
