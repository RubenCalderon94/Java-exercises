package EjerciciosProfundizacion;

/*Calculadora*/

import java.util.Scanner;

public class Calculadora {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int num;
        boolean salir = false;


        do {

            System.out.println("""
                                ***MENU***
                            1.Sumar
                            2.Restar
                            3.Dividir
                            4.Multiplicar
                            5.Salir       
                            """);


            System.out.println("Selecione una opcion del Menu:");
            num = sc.nextInt();

            switch (num) {

                case 1:
                    System.out.println("La suma de los dos numeros es:" + sumar());
                    break;

                case 2:
                    System.out.println("La resta de los dos numeros es:" + restar());
                    break;

                case 3:
                    System.out.println("La division de los dos numeros es:" + dividir());
                    break;

                case 4:
                    System.out.println("La multiplicacion de los dos numeros es:" + multiplicar());
                    break;

                case 5:
                    System.out.println("Has seleccionado Salir");
                    salir = true;
                    break;

                default:
                    System.out.println("Opcion no valida");

            }
        }while(!salir);



    }

    public static double sumar() {
        double num1, num2;
        System.out.println("Has seleccionado Sumar:");
        System.out.println("Ingrese el primer numero:");
        num1 = sc.nextDouble();
        System.out.println("Ingrese el segundo numero:");
        num2= sc.nextDouble();
        return num1 + num2;
    }

    public static double restar() {
        double num1, num2;
        System.out.println("Has seleccionado Restar:");
        System.out.println("Ingrese el primer numero:");
        num1 = sc.nextDouble();
        System.out.println("Ingrese el segundo numero:");
        num2= sc.nextDouble();
        return num1 - num2;
    }

    public static double dividir() {
        double num1, num2;
        System.out.println("Has seleccionado Dividir:");
        System.out.println("Ingrese el primer numero:");
        num1 = sc.nextDouble();
        System.out.println("Ingrese el segundo numero:");
        num2= sc.nextDouble();
        return num1 / num2;
    }

    public static double multiplicar() {
        double num1, num2;
        System.out.println("Has seleccionado Multiplicar:");
        System.out.println("Ingrese el primer numero:");
        num1 = sc.nextDouble();
        System.out.println("Ingrese el segundo numero:");
        num2= sc.nextDouble();
        return num1 * num2;
    }


}
