package EjerciciosArrays;

/*
Diseña un programa Java que solicite el número de elementos de un array de
números enteros. Luego creará el array con ese número de elementos , y lo llenará
con los impares del 3 en adelante. Mostrar el array
 */

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaramos el numero entero que va a teclear el usuario
        int num;
        //Declaramos el array para poder rellenarlo
        int [] a;

        System.out.println("Dime el tamaño del array: ");
        num = sc.nextInt();
        //Se rellena el array con un numero que ha introducido el usuario
        a= new int[num];

        //Recorremos el array y va contando desde el 3 e imprime los impares
        for (int i = 0; i < a.length; i++){
            a[i] = 3+ (i*2);
        }

        //Mostramos el array
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+", ");
        }

    }
}
