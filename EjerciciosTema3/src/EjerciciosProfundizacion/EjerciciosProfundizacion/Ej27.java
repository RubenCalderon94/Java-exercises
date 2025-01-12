package EjerciciosProfundizacion.EjerciciosProfundizacion;

import java.util.Scanner;

/** Diseña un programa en Java que compruebe si un número dado es perfecto o no. Se
 dice que un número es perfecto si es igual a la suma de sus divisores,
 obviamente sin incluir al propio número.Para acabar programa pulse 0.*/

public class Ej27 {
    public static void main(String[] args) {

        int suma, num;

        do{

            suma=0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese un numero");
            num = sc.nextInt();

            for (int i = 1; i <= num-1; i++) {
                if (num%i==0) {
                    suma+=i;
                }
            }

            if (num != 0) {
                if (suma == num) {
                    System.out.println("El numero " + num + " es perfecto");
                } else {
                    System.out.println("El numero " + num + " no es perfecto.");

                }
            }
        }while(num!=0);
        System.out.println("Programa finalizado");
    }
}
