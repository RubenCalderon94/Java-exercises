package EjerciciosArrays;

/*
 Diseña un programa Java que llene mediante un bucle for un array de 10 elementos
enteros con valores al azar entre 1 y 100. Hecho esto, el programa pedirá al usuario
una posición de inicio y otra de fin y sumará los valores del array entre esas posiciones
(incluidas). Controlar que las posiciones sean válidas.

 */

import java.util.Random;
import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];//Declaramos el array de 10 elementos
        int num1, num2, suma;
        boolean salir = false;

        for (int i = 0; i < a.length; i++) { //Rellenamos al azar con numeros de 1 al 100
            a[i] = rand.nextInt(100)+1;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        do {
            System.out.println("Ingrese indice inicial: ");
            num1 = sc.nextInt();
            System.out.println("Ingrese indice final: ");
            num2 = sc.nextInt();
            if ((num1 >= 0 && num1 < a.length) && (num2 >= 0 && num2 < a.length) && (num2 > num1)) {
                salir = true;
            }
            else{
                System.out.println("El valor introducido no es valido, tiene que ser entre 0 y 9");
            }
        }while(!salir);

        suma = calculoSuma(a,num1,num2);//Funcion que nos calcula la suma de los dos parametros entrados por el usuario
        System.out.println("La suma de los numeros es: "+suma);
    }
    public static int calculoSuma(int[] a, int c, int d) {
        int sumaParcial=0;

        for (int i = c; i <= d; i++) {
            sumaParcial +=a[i];
        }
        return sumaParcial;
    }
}
