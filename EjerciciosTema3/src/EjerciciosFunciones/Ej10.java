package EjerciciosFunciones;

/*
 Diseña una función Java que devuelva un entero aleatorio dentro de un rango dado.
Los valores límite del rango están incluidos.
 */

import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.println("Elige un rango entre el 1 y el 100");
        System.out.println("Ingrese el primer numero entre el 1 y el  100");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero entre el 1 y el  100");
        num2 = sc.nextInt();


        devuelveRango(num1, num2);//Cuando se usa el metodo void se escribe asi, no se utiliza el metodo System,
        //Se pone asi directamente

    }

    public static void  devuelveRango(int a, int b) {
        if (a>b){

        } else if (a>b)

            System.out.println("Los numeros entre " + a + " y " + b + " son:");
        for (int  i = a; i <= b; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
}
