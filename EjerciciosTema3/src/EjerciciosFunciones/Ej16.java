package EjerciciosFunciones;

/*
Diseña una función que imprima en pantalla los n primeros términos de la serie de
Fibonacci. El valor de n será pasado como parámetro. La serie de Fibonacci es la
siguiente: 0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21 , 34 , 55 , 89 , 144. Como se puede ver, cada
número de la serie se obtiene sumando los dos anteriores.
 */

import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Introduce el último termino de la serie");
        n=sc.nextInt();
        imprimeFibonacci(n);
        System.out.println();


        for(int i=1;i<=n;i++) { //para la funcion recursiva
            System.out.print(fibonacci(i)+", ");
        }

    }

    private static void imprimeFibonacci(int n) {
        int n1=0, n2=1, suma=1;

        System.out.print(n1+", ");

        for(int i=1; i<n; i++) {
            System.out.print(suma+", ");
            suma =n1+n2;
            n1=n2;
            n2=suma;
        }

    }

    public static int fibonacci(int n) {//imprime el termino n de la serie fibonacci de forma recursiva
        // Casos base
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        else { // Caso recursivo
            return fibonacci(n - 1) + fibonacci(n - 2);
        }



    }
}
