package EjerciciosIniciacion;

/**Diseña un programa Java que solicite dos números enteros y muestre un mensaje
 indicando cuál de ellos es mayor o bien si son iguales. **/

import java.util.Scanner;


public class Ej4 {
     public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         System.out.println("Ingrese el primer numero: ");
         int num = sc.nextInt();
         System.out.println("Ingrese el segundo numero: ");
         int num2 = sc.nextInt();

         if (num == num2) {
             System.out.println("Los dos numeros son iguales");
         } else if (num > num2) {
             System.out.println("El numero:"+num+" es mayor");
         } else {
             System.out.println("El numero:"+num2+" es mayor");
         }

         sc.close();
     }
}
