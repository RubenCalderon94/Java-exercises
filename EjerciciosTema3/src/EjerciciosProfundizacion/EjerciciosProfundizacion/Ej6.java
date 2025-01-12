package EjerciciosProfundizacion;

import java.util.Scanner;

/**Diseña un programa Java que pida un número entero positivo al usuario y muestre
 cada número desde 1 hasta el número tecleado. Es decir, si el usuario teclea el 7, el
 programa imprimirá: 1, 2, 3, 4, 5, 6, 7.*/

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero positivo: ");
        int num = sc.nextInt();

        if (num >= 0  ) {
            System.out.println("El numero positivo elegido es: "+num);
        } else {
            System.out.println("Error en la entrada de datos");
        }

        for(int i=1; i<=num; i++) {
            System.out.print(i+", ");
        }

        sc.close();
    }
}
