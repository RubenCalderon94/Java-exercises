package EjerciciosProfundizacion;

import java.util.Scanner;

/**Diseña un programa Java que dibuje tantas filas de 10 asteriscos en pantalla como
 indique un entero solicitado al usuario*/

public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int num = sc.nextInt();

        for(int i=1;i<=num;i++) {
            System.out.println("**********");
        }



    }

}

