package EjerciciosProfundizacion;

import java.util.Scanner;

/**Diseña un programa Java que muestre una salida como la siguiente. Si el usuario
 teclea el valor 5 se muestra
 1
 22
 333
 4444
 55555*/

public class Ej36 {
    public static void main(String[] args) {

        int num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        num = sc.nextInt();

        for (int i=1; i<=num ;i++){
            for (int j=1; j<=i; j++){
            System.out.print(i);
            }
            System.out.println();
        }

    }
}
