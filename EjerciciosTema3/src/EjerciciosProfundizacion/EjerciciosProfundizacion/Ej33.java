package EjerciciosProfundizacion;

import java.util.Scanner;

/**3. Diseña un programa Java que solicite dos caracteres (por separado) y muestre cuál
 de ellos tiene un código ASCII mayor. Dar la opción de repetir.*/

public class Ej33 {
    public static void main(String[] args) {

        char letra1, letra2;
        int codigoASCII1, codigoASCII2;
        String respuesta;



        do {

            Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca la primera letra:");
            letra1 = sc.next().charAt(0);
            System.out.println("Introduzca la segunda letra:");
            letra2 = sc.next().charAt(0);
            System.out.println("Introduce 0 para terminar programa");

            codigoASCII1 = (int) letra1;
            codigoASCII2 = (int) letra2;

            System.out.println("CodigoASCII de la letra1:'" +letra1+ "' " + codigoASCII1);
            System.out.println("CodigoASCII de la letra2:'" +letra2+ "' " + codigoASCII2);


            if (codigoASCII1>codigoASCII2){
                System.out.println("El codigoASCII: "+ codigoASCII1+" de la letra1 '"+letra1+"' es mayor");
            } else if (codigoASCII2>codigoASCII1) {
                System.out.println("El codigoASCII: " +codigoASCII2+" de la letra2 '"+letra2+"' es mayor");
            } else {
                System.out.println("El codigoASCII son iguales");
            }

            System.out.println("Desea repetir la operacion (SI/NO)");
            respuesta = sc.next();




        }while(respuesta.equalsIgnoreCase("si"));


    }
}
