package EjerciciosIniciacion;

import java.util.Scanner;

/**Diseña un programa Java que solicite un número entero al usuario e indique si dicho
número es positivo o negativo.**/

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("El numero entero:" + num + " es positivo");
        } else {
            System.out.println("El numero entero:" + num + " es negativo");
        }

        sc.close();
    }
}
