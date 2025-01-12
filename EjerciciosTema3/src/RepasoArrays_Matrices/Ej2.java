package RepasoArrays_Matrices;

/*
Diseña un programa Java que cree un array de 10 elementos de tipo entero y lo rellene
con valores al azar entre 1 y 10 mediante un bucle for. Luego mostrará el array con
utilizando un bucle while
 */

import java.util.Random;

public class Ej2 {
    static Random rd = new Random();//DECLARADO GLOBAL
    public static void main(String[] args) {
        int index=0;//CONTADOR PARA COMPARAR EN EL WHILE Y SE TERMINE EL WHILE CUANDO CUMPLA LAS POSICIONES DEL
        //ARRAY

        int [] array = new int[10]; //Declaramos el array de 10 elementos pero no esta relleno.

        System.out.println("El array de 10 elementos generado al azar es: ");

        rellenaArray(array);//FUNCION QUE ME RELLENA EL ARRAY AL AZAR

        //Para mostar el array con el bucle while
        while(index<array.length){
            System.out.println("Índice " + index + ": " + array[index]);
            index++; // Incrementar el índice
        }

    }

    public static void rellenaArray(int [] array) {
       //RAMDON DECLARADO GLOBAL, ESTA ARRIBA
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(10)+1;
        }

    }
}
