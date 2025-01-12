package EjerciciosArrays;

/*
Diseña un programa Java que contenga una función que permita buscar valores en
un array ordenado.
 */

import java.util.Arrays;

public class Ej32 {
    public static void main(String[] args) {
        // Declarar y ordenar un array de números enteros
        int[] numeros = {1, 3, 5, 7, 9, 11, 13, 15};
        System.out.println("Array ordenado:");
        System.out.println(Arrays.toString(numeros));

        // Valor a buscar
        int valorBuscado = 7;

        // Llamar a la función de búsqueda
        int resultado = buscarEnArray(numeros, valorBuscado);

        // Mostrar el resultado
        if (resultado != -1) {
            System.out.println("El valor " + valorBuscado + " se encuentra en el índice " + resultado + ".");
        } else {
            System.out.println("El valor " + valorBuscado + " no está en el array.");
        }
    }

    /**
     * Función que realiza una búsqueda binaria en un array ordenado.
     * @param array El array ordenado donde buscar.
     * @param valor El valor que se desea buscar.
     * @return El índice del valor si se encuentra, o -1 si no está.
     */
    public static int buscarEnArray(int[] array, int valor) {
        int inicio = 0;
        int fin = array.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2; // Calcular el punto medio

            if (array[medio] == valor) {
                return medio; // Valor encontrado
            } else if (array[medio] < valor) {
                inicio = medio + 1; // Buscar en la mitad derecha
            } else {
                fin = medio - 1; // Buscar en la mitad izquierda
            }
        }

        return -1; // Valor no encontrado
    }
}
