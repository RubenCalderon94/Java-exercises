package EjerciciosArrays;

/*
 Diseña un programa Java que solicite al usuario un número entero entre 1 y 7 y
muestre el día de la semana correspondiente a ese número. Dar la opción de repetir.
 */

import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {

        //Declaramos el array
        String [] dias={"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};

        Scanner sc = new Scanner(System.in);
        int num;
        String respuesta;


        do {

            System.out.println("Ingrese un numero del 1 al 7: ");
            num=sc.nextInt();

            System.out.println("El numero corresponde al dia: "+dias[num-1]);

            System.out.println("Desea repetir (S/N)");
            respuesta=sc.next();

        }while(respuesta.equalsIgnoreCase("S"));
        System.out.println("Programa finalizado");

    }
}
