package EjerciciosProfundizacion;

/*. Diseña un programa que muestre en pantalla una salida como la de la imagen 2. El
número de filas puede variar*/

import java.util.Scanner;

public class Ej41 {
    public static void main(String[] args) {

        int num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        num = sc.nextInt();

        for (int i=1; i<=num; i++){
            System.out.print(i+"-->");
            for (int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }



    }
}
