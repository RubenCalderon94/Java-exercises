package EjerciciosProfundizacion;

import java.util.Scanner;

/**Diseña un programa en Java que calcule la suma de los divisores de un número entero
 que pasaremos por teclado. No incluir como divisor al propio número.*/

public class Ej26 {
    public static void main(String[] args) {

        int suma=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int num = sc.nextInt();

         for (int i = 1; i <= num-1 ; i++) {
             if(num%i==0) {
                 System.out.println(i);
                 suma += i;
             }
         }
         System.out.println("La suma de los divisores del "+num+" es: "+suma);

    }
}
