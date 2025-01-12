package EjerciciosIniciacion;

import java.util.Scanner;

/**. Diseña un programa Java que muestre un menú en pantalla. El usuario debe elegir
 una de las opciones y el programa mostrará el texto de la opción elegida. Es decir, si
 el usuario eligió la opción 1, el programa mostrará el texto “Has seleccionado Abrir”.*/


 public class Ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("*****Menu*****");
        System.out.println("1.Abrir");
        System.out.println("2.Cerrar");
        System.out.println("3.Conectar");
        System.out.println("4.Desconectar");
        System.out.println("5.Fin");

        System.out.println("***Elige una opcion del menu***");
        int opcion = sc.nextInt();


        switch (opcion) {
            case 1:
                System.out.println("Has seleccionado abrir");
                break;
            case 2:
                System.out.println("Has seleccionado cerrar");
                break;
            case 3:
                System.out.println("Has seleccionado conectar");
                break;
            case 4:
                System.out.println("Has seleccionado desconectar");
                break;
            case 5:
                System.out.println("Has seleccionado fin");
                break;
            default:
                System.out.println("Error en la entrada de datos");
                break;
            }

          sc.close();

        

        }
    }
