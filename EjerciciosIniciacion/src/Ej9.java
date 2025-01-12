/**Diseña un programa que solicite un número entero al usuario y muestre el valor del
 cuadrado, cubo y el de ese número elevado a cuatro. **/

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, cuadrado, cubo, cuarta;

        System.out.println("Introduce un número:");
        a=sc.nextDouble();

        cuadrado = Math.pow(a,  2);
        cubo = Math.pow(a, 3);
        cuarta = Math.pow(a, 4);

        System.out.printf("El número: %.2f, al cuadrado es: %.2f"
                        + " al cubo es: %.2f y a la cuarta es %.2f",
                            a, cuadrado, cubo, cuarta);
        sc.close();

    }
}
