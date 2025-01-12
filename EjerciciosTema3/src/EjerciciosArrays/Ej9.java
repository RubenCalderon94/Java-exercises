package EjerciciosArrays;

/*
Diseña un programa Java que trabaje con un array de 10 elementos, como este int []
a= {1,66,15,33,2,34,65,39,15,78}.
a. El programa contendrá una función que buscará un valor en el array y
devolverá la primera posición donde fue encontrado o -1 en caso de no
encontrarlo. La función llevará dos parámetros, el elemento buscado y el array.
b. Diseña también una función que cuente las veces que aparece o se repite un
valor en el array. La función llevará dos parámetros, el elemento buscado y el
array.
 */

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {


        int[] a = {1, 66, 15, 33, 2, 34, 65, 39, 15, 78};
        int posicion, veces;
        Scanner sc = new Scanner(System.in);

        // Mostrar los elementos del array
        System.out.println("Elementos del array:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        // Solicitar al usuario el valor a buscar
        System.out.println("Ingrese un valor a buscar: ");
        int valor = sc.nextInt();

        // Buscar la posición del valor
        posicion = buscarValor(valor, a);
        if (posicion != -1) {
            System.out.println("El valor tecleado por el usuario ha sido encontrado en la posición: " + posicion);
        } else {
            System.out.println("El valor tecleado por el usuario no se encuentra en el array.");
        }

        // Contar las veces que aparece el valor
        veces = numeroVeces(valor, a);
        System.out.println("El valor tecleado por el usuario aparece " + veces + " veces en el array.");
        }

        // Método para contar las veces que aparece un valor
        private static int numeroVeces(int x, int[] b) {
        int count = 0;

            for (int i = 0; i < b.length; i++) {
               if (x == b[i]) {
                   count++;
               }
            }

            return count;
        }

        // Método para buscar la primera posición de un valor
        private static int buscarValor(int valor, int[] v) {
            for (int i = 0; i < v.length; i++) {
                if (v[i] == valor) {
                    return i+1; // Se le suma +1 para que me imrima la posicion real(En programacion se empieza desde el 0)
                }
            }
            return -1; // Si no se encuentra el valor
        }
    }


