package EjerciciosFunciones;

/*
 Diseña un programa Java que incluya una función que devuelva la suma de los dígitos
de un número entero pasado como parámetro.
 */

import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Introduce un numero de al menos dos digitos");
        num = sc.nextInt();

        devuelveSuma(num);

    }

    private static int  devuelveSuma(int a) {

        int suma = 0;

        for (int i = 0; i <= a; i++) {
            suma += i;
            System.out.println(suma);
        }

        return suma;
    }
}
