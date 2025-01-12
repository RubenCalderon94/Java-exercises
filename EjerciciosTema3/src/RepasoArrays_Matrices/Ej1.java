package RepasoArrays_Matrices;

/*
Diseña una programa Java que llene mediante un bucle for un array de 10 elementos
con valores enteros al azar entre 1 y 100. El programa nos dirá si el primer elemento
del array es igual al último.
 */

import java.util.Random;

public class Ej1 {
    static  Random rd = new Random();//Declarado global
    public static void main(String[] args) {

        int [] array = new int[10]; //Declaramos el array de 10 elementos pero no esta relleno.

        System.out.println("El array de 10 elementos generado al azar es: ");
        rellenaArray(array);
        System.out.println("¿El primer elemento del array es igual al ultimo? "+ comparaElemento(array));


    }

    private static boolean comparaElemento( int [] array) {

        if (array[0] == array[9]) {
            return true;
        }

        return false;
    }

    private static void rellenaArray(int [] array) {

       //RAMDON DECLARADO GLOBAL, ESTA ARRIBA.
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(100)+1;
            System.out.println(array[i]);
        }

    }
}
