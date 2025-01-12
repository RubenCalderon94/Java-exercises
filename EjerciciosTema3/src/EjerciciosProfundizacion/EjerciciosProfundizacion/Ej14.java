package EjerciciosProfundizacion;

import java.util.Scanner;

/**Diseña un programa que muestre en pantalla un menú con tres opciones: sumar,
 restar y salir. Programa cada opción y utiliza un bucle para que pueda repetirse el
 menú hasta que el usuario elija salir. Solicita dos números para llevar a cabo cada
 opción del menú*/

public class Ej14 {
    public static void main(String[] args) {

        boolean salir = false;

        do {

            Scanner sc = new Scanner(System.in);
            System.out.println("Seleccione una de las 3 opciones:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Salir");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Has elegido la opcion de sumar ");
                    System.out.println("Define el primer numero:");
                    int num1 = sc.nextInt();
                    System.out.println("Define el segundo numero:");
                    int num2 = sc.nextInt();
                    double resultado = num1 + num2;
                    System.out.println("El resultado es: " + resultado);
                    break;

                case 2:
                    System.out.println("Has elegido la opcion de restar ");
                    System.out.println("Define el primer numero:");
                    int num3 = sc.nextInt();
                    System.out.println("Define el segundo numero:");
                    int num4 = sc.nextInt();
                    double resultado2 = num3 - num4;
                    System.out.println("El resultado es: " + resultado2);
                    break;

                case 3:
                    salir = true;
                    System.out.println("Has elegido la opcion de salir, programa terminado.");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;


            }

        }while (!salir);

    }
}
