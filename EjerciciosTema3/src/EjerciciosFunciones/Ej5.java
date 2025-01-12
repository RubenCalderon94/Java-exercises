package EjerciciosFunciones;

/*
Diseña un programa Java que incluya una función que devuelva la media aritmética
de tres enteros pasados como parámetro. El valor devuelto debe ser double
 */

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {

        int num1,num2,num3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = sc.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        num3 = sc.nextInt();

        System.out.println("La media aritmetica de los numeros es:"+mediaAritmetica(num1, num2, num3));
    }
    private static double mediaAritmetica( int a, int b,int c ) {//Funcion para hacer la media aritmetica
        // que devuelve resultado declarado como double.
        double resultado;
        resultado=(a+b+c)/3;
        return resultado;

    }
}
