package EjerciciosProfundizacion;

import java.util.Scanner;

/**. Diseña un programa Java que solicite dos números enteros al usuario y nos diga si el
 primero es divisor del segundo. El número 2 es divisor de 16 ya que al dividir 16 entre
 2 el resto de la división es cero. Dar la opción de repetir.*/

 public class Ej16 {
    public static void main(String[] args) {

        String respuesta="";

        do{


            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el primer numero: ");
            int num1 = sc.nextInt();
            System.out.println("Ingrese el segundo numero: ");
            int num2 = sc.nextInt();

            if (num1%num2 == 0 ) {
                System.out.println("El primer numero si es divisor del segundo");

            } else {
                System.out.println("El primer numero no es divisor del segundo");
            }

            System.out.println("Desea volver a repetir (S/N)");
            respuesta = sc.next();

        }while(respuesta.toLowerCase().equals("s"));
    }
}
