package EjerciciosProfundizacion;

import java.util.Scanner;

/**Diseña un programa Java que solicite un número real y lo divida entre 1, 2, 3… hasta
 10. Debe mostrarse cada operación que se realiza y su resultado*/

public class Ej25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero real");
        double num = sc.nextDouble();

        for (double i=1; i<=10; i++){
            System.out.println("El numero: "+num+" ,dividido del 1 al 10 es; "+(num/i));

        }

    }
}
