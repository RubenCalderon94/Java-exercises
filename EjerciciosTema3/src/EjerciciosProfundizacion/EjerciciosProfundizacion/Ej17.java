package EjerciciosProfundizacion;

import java.util.Scanner;

/**Utilización de acumuladores. Diseña un programa Java que pida un número entero al
 usuario y sume los valores que van desde 1 a ese número e imprima el resultado.*/

public class Ej17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero:");
        int num = sc.nextInt();

        int suma=0;
        for (int i=1; i<=num; i++){
            suma+=i; //es igual a suma= suma+i
        }
        System.out.println("La acumulacion del numero "+num+" mas 1 es "+suma);

    }
}
