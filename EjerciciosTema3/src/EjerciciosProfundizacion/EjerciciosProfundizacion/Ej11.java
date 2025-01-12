package EjerciciosProfundizacion;

import java.util.Scanner;

/**. Solicitar dos enteros al usuario y mostrar en pantalla si son pares o impares. El
 programa dará al usuario la posibilidad de repetir con otros dos números.*/

public class Ej11 {
    public static void main(String[] args) {

        String respuesta="";

        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el primer numero:");
            int num1 = sc.nextInt();

            System.out.println("Introduce el segundo numero:");
            int num2 = sc.nextInt();

            if (num1 % 2 == 0){
                System.out.println("El primer numero: "+num1+ " es par" );
            } else {
                System.out.println("El primer numero: "+num1+ " es impar");
            }


            if (num2 % 2 == 0){
                System.out.println("El segundo numero: "+num2+ " es par" );
            } else {
                System.out.println("El segundo numero: "+num2+ " es impar");
            }


            System.out.println("Desea repetir (S/N)");
            respuesta = sc.next();

        } while (respuesta.toLowerCase().equals("s"));

    }
}
