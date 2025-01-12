package EjerciciosArrays;

/*
 Diseña un programa que partiendo de una cantidad de dinero, la reparta en la menor
cantidad de billetes y monedas posible. Utiliza arrays en la resolución.
 */

import java.util.Scanner;

public class Ej17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int []billetes={500, 200, 100, 50, 20, 10, 5, 2, 1};
        int []cambio= new int[billetes.length];
        int n;

        System.out.println("Ingrese una cantidad: ");
        n = sc.nextInt();

        for (int i = 0; i < billetes.length; i++) {
            cambio[i] = (int)n/billetes[i];
            n-=cambio[i]*billetes[i];
        }

        for (int i = 0; i < cambio.length; i++) {
            System.out.println(cambio[i] + " de "+ billetes[i]);

        }

    }

}
