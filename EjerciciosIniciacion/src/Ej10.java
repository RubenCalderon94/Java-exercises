/**Diseña un programa Java que solicite un número double, lo convierta a entero y lo
 imprima.**/

import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        int b;

        System.out.println("Introduzca un número decimal");

        a = sc.nextDouble();

        b = (int)a;

        System.out.printf("Al convertirlo en entero, corta los decimales" + " el resultado es: %d", b);

    }
}
