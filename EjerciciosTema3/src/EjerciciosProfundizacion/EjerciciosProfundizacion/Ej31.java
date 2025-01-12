package EjerciciosProfundizacion.EjerciciosProfundizacion;

import java.util.Scanner;

/** Diseña un programa que solicite un año y muestre si es bisiesto o no. Se dice: un año
 es bisiesto si es divisible entre cuatro y no es divisible entre 100 ó es divisible
 entre 400. Dar la opción de repetir. */

public class Ej31 {
    public static void main(String[] args) {
        int año;
        String respuesta;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese un año: ");
            año = sc.nextInt();

            if (año%4==0){
                System.out.println("El año "+año+" si es bisiesto.");
            }else {
                System.out.println("El año "+año+" no es bisiesto.");
            }

            System.out.println("Desea repetir la operacion (S/N)");
            respuesta = sc.next();
        }while(respuesta.equalsIgnoreCase("s"));


    }
}
