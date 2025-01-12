package EjerciciosProfundizacion;

/*Diseña un programa que muestre en pantalla una salida como la de la imagen. El
número de filas puede variar*/

import java.util.Scanner;

public class Ej42 {
    public static void main(String[] args) {


        int num,estrellitas;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        num = sc.nextInt();

        for (int i=1; i<=num; i++){
            System.out.print(i+"-->");
            estrellitas = (int)Math.pow(2, i);
            for (int j=1; j<=estrellitas; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
