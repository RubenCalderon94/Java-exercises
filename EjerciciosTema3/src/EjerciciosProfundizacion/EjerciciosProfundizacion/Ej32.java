package EjerciciosProfundizacion.EjerciciosProfundizacion;

import java.util.Scanner;

/** 32. Diseña un programa Java que solicite al usuario un año y un nombre de mes e imprima
 en pantalla los días que tiene el mes tecleado. Tener en cuenta los años bisiestos.
 Dar la opción de repetir. */

public class Ej32 {
    public static void main(String[] args) {

        int año;
        String mes, respuesta;


        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese un año: ");
            año = sc.nextInt();
            System.out.println("Ingrese un mes: ");
            mes = sc.next().toLowerCase();


            switch (mes){
                case "enero", "marzo","mayo", "julio", "agosto", "octubre","diciembre":
                    System.out.println("En el año "+año+" este mes "+mes+", tiene 31 dias. ");
                    break;

                case "febrero":
                    if (año%4==0){
                        System.out.println("En el año "+año+" este mes "+mes+", tiene 29 dias. ");
                    }else {
                        System.out.println("En el año "+año+" este mes "+mes+", tiene 28 dias. ");
                    }
                    break;

                case "abril", "junio", "septiembre", "noviembre":
                    System.out.println("En el año "+año+" este mes "+mes+", tiene 30 dias. ");
                    break;

                default:
                    System.out.println("Error en la entrada de datos");

            }

            System.out.println("Desea repetir la operacion (S/N)");
            respuesta = sc.next();

        }while(respuesta.equalsIgnoreCase("s"));

    }
}
