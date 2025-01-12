package RepasoArrays_Matrices;

/*
Diseña un programa Java que solicite el número de elementos de un array de
números enteros. Luego creará el array con ese número de elementos , y lo llenará
con los impares del 3 en adelante. Mostrar el array
 */

import java.util.Scanner;

public class Ej6 {
    static Scanner sc = new Scanner(System.in);//DECLARAMOS EL SCANNER GLOBAL
    public static void main(String[] args) {
        int num;
        System.out.println("Introduce de cuantos elementos creamos el array");
        num = sc.nextInt();

        int[] a = new int[num];//Rellenaremos el array con el numero que desee el usuario

        creaArray(a);

    }

    public static void creaArray(int [] array) {

        int n = 3;
        for (int i = 0; i < array.length; i++){
            array[i] = 3+ (i*2);//ME IMPRIME EL ARRAY DESDE EL 3, Y SOLO ME VA MOSTRANDO LOS NUMEROS IMPARES
            System.out.println(array[i]);
        }


    }
}
