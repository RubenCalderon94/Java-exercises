package EjerciciosArrays;

/*. Diseña un programa Java que solicite al usuario un número entero entre 1 y 12 y
muestre el nombre del mes correspondiente a ese número. Diseña para ello una
función que reciba un número de mes (entre 1 y 12) y devuelva el mes asociado. */

import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        //Declaramos el array
        String [] mes={"enero","febrero","marzo","abril","mayo","junio","julio","agosto",
                "septiembre","octubre","noviembre","diciembre"};
        Scanner sc = new Scanner(System.in);
        String respueta;
        int num;

        do {


            System.out.println("Ingrese un numero:");
            num = sc.nextInt();

            System.out.println("El numero corresponde al mes "+correspondeMes(num,mes));

            System.out.println("Desea repetir (S/N)");
            respueta = sc.next();

        }while(respueta.equalsIgnoreCase("S"));
        System.out.println("Programa finalizado");

    }

    private static String correspondeMes(int num, String [] mes1 ) {

        return mes1[num-1];

    }
}
