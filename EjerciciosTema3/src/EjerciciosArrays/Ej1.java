package EjerciciosArrays;

/*. Diseña una programa Java que llene mediante un bucle for un array de 10 elementos
con valores enteros al azar entre 1 y 100. El programa nos dirá si el primer elemento
del array es igual al último.*/

import java.util.Random;

public class Ej1 {
    public static void main(String[] args) {
        // Declaración del array con 10 elementos
        int[] array = new int[10];

        // Crear una instancia de la clase Random
        Random rd= new Random();

        // Llenar el array con valores aleatorios entre 1 y 100
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(100) + 1; // Genera un número entre 1 y 100
        }

        // Imprimir los valores del array
        System.out.println("Elementos del array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Índice " + i + ": " + array[i]);

        }

        if(array[0] == array[array.length-1]){
            System.out.println("El primer elemento del array " +array[0]+ " y el ultimo elemento del array " +array[array.length-1]+" si son iguales");

        }else {
            System.out.println("El primer elemento del array " + array[0] + " y el ultimo elemento del array " + array[array.length - 1] + " no son iguales");
        }
    }
}
