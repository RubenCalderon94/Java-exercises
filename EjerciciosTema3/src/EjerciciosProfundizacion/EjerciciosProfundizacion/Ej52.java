package EjerciciosProfundizacion.EjerciciosProfundizacion;

/* Diseña un programa Java al que pasemos una cantidad de  euros (valor entero)  y
descomponga esa cantidad en el menor número de billetes y monedas posibles de las
existentes en nuestro sistema monetario*/

import java.util.Scanner;

public class Ej52 {
    public static void main(String[] args) {

        int cantidad, billetes500, billetes200, billetes100, billetes50, billetes20, billetes10, billetes5, monedas2, monedas1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de euros:");
        cantidad = sc.nextInt();


        billetes500 = cantidad / 500;
        cantidad %= 500;

        billetes200 = cantidad / 200;
        cantidad %= 200;

        billetes100 = cantidad / 100;
        cantidad %= 100;

        billetes50 = cantidad / 50;
        cantidad %= 50;

        billetes20 = cantidad / 20;
        cantidad %= 20;

        billetes10 = cantidad / 10;
        cantidad %= 10;

        billetes5 = cantidad / 5;
        cantidad %= 5;

        monedas2 = cantidad / 2;
        cantidad %= 2;

        monedas1 = cantidad / 1;
        cantidad %= 1;


        if (billetes500>0){
            System.out.println("Billetes de 500: "+billetes500);
        }
        if (billetes200>0){
            System.out.println("Billetes de 200: "+billetes200);
        }
        if (billetes100>0){
            System.out.println("Billetes de 100: "+billetes100);
        }
        if (billetes50>0){
            System.out.println("Billetes de 50: "+billetes50);
        }
        if (billetes20>0){
            System.out.println("Billetes de 20: "+billetes20);
        }
        if (billetes10>0){
            System.out.println("Billetes de 10: "+billetes10);
        }
        if (billetes5>0){
            System.out.println("Billetes de 5: "+billetes5);
        }
        if (monedas2>0){
            System.out.println("Monedas de 2: "+monedas2);
        }
        if (monedas1>0){
            System.out.println("Monedas de 1: "+monedas1);
        }
    }
}
