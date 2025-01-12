package EjerciciosProfundizacion;

import java.util.Scanner;

/**Diseña un programa Java que solicite un entero positivo e imprima los números que
 van desde ese entero hasta uno. Un número por cada línea*/

public class Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero:");
        int num = sc.nextInt();

        if (num >=0) {
            System.out.println("El numero positivo es: " + num);
        } else {
            System.out.println("Error en la entrada de datos");
        }

        for (int i=num; i >=1; i--) {
            System.out.println(i);
        }

        sc.close();
    }
}
