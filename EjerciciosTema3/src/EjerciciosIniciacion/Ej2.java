package EjerciciosIniciacion;

import java.util.Scanner;

/**Diseña un programa Java que solicite dos números enteros y muestre un mensaje
indicando si son iguales o no. **/

public class Ej2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println( "El primer numero:" +num1+ " y el segundo numero:" +num2+ " Si son iguales");
        } else  {
            System.out.println(  "El primer numero:" +num1+ " y el segundo numero:" +num2+ " No son iguales");
        }

        sc.close();

    }
}
