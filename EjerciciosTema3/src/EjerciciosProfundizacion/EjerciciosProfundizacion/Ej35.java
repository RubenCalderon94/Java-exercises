package EjerciciosProfundizacion;

import java.util.Scanner;

/**Diseña un programa que solicite un entero y muestre en pantalla uno a uno los dígitos
 que forman ese número entero*/

public class Ej35 {
    public static void main(String[] args) {

        int num, digito;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        num = sc.nextInt();

        while (num> 0) {
            // Obtiene el último dígito
            digito = num % 10;
            // Imprime el dígito
            System.out.print(", "+digito);
            // Elimina el último dígito
            num = num / 10;

        }
    }
}
