package EjerciciosIniciacion;

import java.util.Scanner;

/**Diseña un programa Java que pida un número entero y escriba en pantalla si es par
 o no. Recuerda utilizar el operador % que devuelve el resto de una división entera*/

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num1 = sc.nextInt();

        if (num1 % 2 ==0) {
            System.out.printf(num1+" es par");
        } else {
            System.out.printf(num1+" es impar");
        }
        sc.close();
    }
}
