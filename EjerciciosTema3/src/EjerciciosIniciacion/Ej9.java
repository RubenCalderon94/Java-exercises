package EjerciciosIniciacion;

import java.util.Scanner;

/** Diseña un programa Java que pida un número comprendido entre 1 y 7 y escriba el
 día de la semana asociado al número. */

public class Ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 1 y 7 ");
        int diaSemana = sc.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es miercoles");
                break;
            case 4:
                System.out.println("Es jueves");
                break;
            case 5:
                System.out.println("Es viernes");
                break;
            case 6:
                System.out.println("Es sabado");
                break;
            case 7:
                System.out.println("Es domingo");
                break;
            default:
                System.out.println("Error en la entrada de datos");
                break;
            }
        }
    }

