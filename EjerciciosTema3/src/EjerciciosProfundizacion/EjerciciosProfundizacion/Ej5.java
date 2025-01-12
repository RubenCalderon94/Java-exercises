package EjerciciosProfundizacion;

import java.util.Scanner;

/**Diseña un programa Java que pida un número entero comprendido entre 1 y 100 y
 calcule la tabla de multiplicar de ese número. Si no está comprendido entre 1 y 100
 mostrar un mensaje de error*/

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero entre 1 y 100");
        int num = sc.nextInt();

        if(num>=1 && num<=100){
            for (int i=1; i <=10; i++) {
                System.out.println(num+" X" + i + " =" + num*i);
            }
        } else {
            System.out.println("El numero entero no es valido");
        }

    }
}
