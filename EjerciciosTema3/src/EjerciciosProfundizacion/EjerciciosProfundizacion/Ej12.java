package EjerciciosProfundizacion;

import java.util.Scanner;

/**2. Diseña un programa Java que calcule el IMC (índice de masa corporal) de una
 persona conocidas su altura y peso. Dar la opción de repetir*/

public class Ej12 {
    public static void main(String[] args) {


        String respuesta="";

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese tu nombre:");
            String nombre = sc.nextLine();

            System.out.println("Ingrese tu peso");
            double peso = sc.nextDouble();
            System.out.println("Ingrese tu altura");
            double altura = sc.nextDouble();

            double resultado = peso/(altura*2);
            System.out.println(nombre+" tu IMC es: "+resultado);



            System.out.print("Desea repetir de nuevo (S/N)");
            respuesta = sc.next();

        }while (respuesta.toLowerCase().equals("s"));
    }
}
