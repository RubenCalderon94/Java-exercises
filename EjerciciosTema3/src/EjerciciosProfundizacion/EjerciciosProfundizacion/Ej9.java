package EjerciciosProfundizacion;

import java.util.Scanner;

/**Diseña un programa Java que solicite un número al usuario y diga si es par o impar.
 El programa debe dar al usuario la posibilidad de repetir el proceso.*/

public class Ej9 {
    public static void main(String[] args) {

        String respuesta="";

        do {

            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese un numero entero:");
            int num = sc.nextInt();


            if (num % 2 == 0) {
                System.out.println("El numero entero " + num + " es par");

            } else {
                System.out.println("El numero entero " + num + " es impar");
            }

            System.out.println("Desea repetir (S/N)");
            respuesta = sc.next();

        }while(respuesta.toLowerCase().equals("s"));

        }

    }



