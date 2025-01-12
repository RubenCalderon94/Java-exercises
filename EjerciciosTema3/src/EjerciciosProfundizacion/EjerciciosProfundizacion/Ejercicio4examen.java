package EjerciciosProfundizacion.EjerciciosProfundizacion;

/*) Escribir un programa que calcule el máximo común divisor de dos números. El
máximo común divisor de dos números es el número más grande que es capaz de
dividir a ambos números. El 1 siempre es, si no se encuentra otro.*/

import java.util.Scanner;

public class Ejercicio4examen {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario dos números
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        // Asegurarse de que los números sean positivos
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        // Algoritmo de Euclides para calcular el MCD
        int a = num1;
        int b = num2;

        while (b != 0) {
            int temp = b;
            b = a % b;  // El residuo de a dividido entre b
            a = temp;   // Asignamos el valor de b a a
        }

        // El MCD es el valor de a cuando b llega a 0
        System.out.println("El Máximo Común Divisor de " + num1 + " y " + num2 + " es: " + a);


    }
}

