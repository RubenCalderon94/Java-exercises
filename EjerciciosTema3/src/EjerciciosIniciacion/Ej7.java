package EjerciciosIniciacion;

import java.util.Scanner;

/**Diseña un programa Java que pida tres números de tipo double y calcule la media
 aritmética de los mismos. Hecho esto el programa dirá si la media es superior, igual
 o inferior a 10. */

 public class Ej7 {
    public static void main(String[] args) {
        System.out.println("Ingrese 3 numeros: ");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextInt();
        double num2 = sc.nextInt();
        double num3 = sc.nextInt();

        double resultado = (num1 + num2 + num3) / 3 ;
        System.out.println("La media aritmetica es: " + resultado);

        if (resultado >= 10){
            System.out.println("El resultado:" + resultado+ " es mayor a 10");
        } else {
            System.out.println("El resultado:" + resultado + " es menor a 10");
        }
        sc.close();
    }
}
