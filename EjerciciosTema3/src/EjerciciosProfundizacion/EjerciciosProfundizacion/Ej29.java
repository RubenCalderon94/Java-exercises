package EjerciciosProfundizacion.EjerciciosProfundizacion;

import java.util.Scanner;

/** Diseña un programa Java que lea del teclado un carácter (char) y muestre el código
 ASCII asociado a ese carácter.  Dar la opción de repetir. */

public class Ej29 {
    public static void main(String[] args) {

        char caracter;
        String respuesta;
        int codigoASCII;
        do{

            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese un caracter:");
            caracter = sc.next().charAt(0);

            codigoASCII = (int) caracter;
            System.out.println("El código ASCII de '" + caracter + "' es: " + codigoASCII);


            System.out.println("Desea repetir la operacion (S/N)");
            respuesta = sc.next();

        }while(respuesta.equalsIgnoreCase("s"));
    }

}
