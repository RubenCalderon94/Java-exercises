package EjerciciosProfundizacion;

/*0. Diseña un programa que muestre en pantalla una salida como la de la imagen 1. El
número de filas puede variar.*/

import java.util.Scanner;

public class Ej40 {
    public static void main(String[] args) {

        int num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero de filas deseado:  ");
        num = sc.nextInt();

        for (int i=1; i<=num; i++){
            System.out.print(i+"-->");
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

        }

    }

    
}
