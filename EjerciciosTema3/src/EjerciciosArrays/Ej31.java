package EjerciciosArrays;

/*
 Diseña un programa Java que ordene de menor a mayor los valores de un array de
números enteros.
 */

import java.util.Arrays;//CLASE QUE ORDENA DE MENOR A MAYOR
import java.util.Random;

public class Ej31 {
    public static void main(String[] args) {

        Random rd = new Random();
        int [] a= new int [10];

        for (int i=0;i<a.length;i++){
            a[i]=rd.nextInt(100)+1;

        }


        // Mostrar el array original (a)
        System.out.println("Array original:");
        System.out.println(Arrays.toString(a));//SUBCLASE PARA ORDENAR ARRAYS

        // Ordenar el array de menor a mayor (a)
        Arrays.sort(a);//SUBCLASE PARA ORDENAR ARRAYS

        // Mostrar el array ordenado (a)
        System.out.println("Array ordenado de menor a mayor:");
        System.out.println(Arrays.toString(a)); //SUBCLASE PARA ORDENAR ARRAYS

    }
}
