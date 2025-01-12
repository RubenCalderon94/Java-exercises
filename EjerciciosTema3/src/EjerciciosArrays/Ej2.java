package EjerciciosArrays;

/*Diseña un programa Java que cree un array de 10 elementos de tipo entero y lo rellene
con valores al azar entre 1 y 10 mediante un bucle for. Luego mostrará el array con
utilizando un bucle while.*/

import java.util.Random;

public class Ej2 {
    public static void main(String[] args) {

        // Inicializar el índice para el bucle while
        int index=0;

        //Clase para generar numeros al azar
        Random rd = new Random();


        //Creamos el array de 10 elementos
        int [] array= new int [10];

        //Lo rellenamos al azar con un bucle for
        for (int i = 0; i < array.length; i++) {
            array[i]=rd.nextInt(10)+1;
        }

        //Para mostar el array con el bucle while
        while(index<array.length){
            System.out.println("Índice " + index + ": " + array[index]);
            index++; // Incrementar el índice
        }
    }
}
