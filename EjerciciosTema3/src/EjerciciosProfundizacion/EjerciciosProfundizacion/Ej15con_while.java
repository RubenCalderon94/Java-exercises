package EjerciciosProfundizacion;

/**Diseña un programa que muestre en pantalla un menú con las opciones: pares,
        impares y salir. La opción pares muestra los pares entre 40 a 60, la opción impares
        muestra los impares entre 99 y 77. El menú se mostrará tras cada opción hasta que
        el usuario elija salir. Utiliza los tres tipos de bucles.*/

import java.util.Scanner;

public class Ej15con_while {
    public static void main(String[] args) {

        boolean salir = false;

        while (!salir) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Seleccione una de las 3 opciones:");
            System.out.println("1. Pares");
            System.out.println("2. Impares");
            System.out.println("3. Salir");
            int opcion = sc.nextInt();


            switch (opcion) {
                case 1:
                    System.out.println("Has selecionado la opcion pares");
                    for (int i = 40; i <=60; i+=2) {
                        System.out.println(i);
                    }
                    break;

                case 2:
                    System.out.println("Has selecionado la opcion impares");
                    for (int j = 99; j >= 77; j -= 2) {
                        System.out.println(j);
                    }
                    break;


                case 3:
                    salir = true;
                    System.out.println("Has elegido la opcion de salir, programa terminado.");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;

            }

        }


    }
}
