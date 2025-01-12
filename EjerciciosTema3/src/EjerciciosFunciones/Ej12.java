package EjerciciosFunciones;

/*
. Diseña una función que devuelva verdadero o falso según el número pasado como
parámetro sea primo o no. Recuerda que un número primo sólo tiene como divisores
a la unidad y a sí mismo.
 */

import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero: ");
        num = sc.nextInt();


        devuelveBoolean(num);

    }

    private static boolean devuelveBoolean(int a) {
        boolean primo=true;
        for(int i=2; i<a;i++) {
            if(a%i==0) {
                primo=false;
            }
            if(!primo) {
                break;//esta sentencia obliga a salir del bucle for.
            }
        }
        if(primo) {
            System.out.println("El número "+ a + " es primo");
        }
        else {
            System.out.println("El número "+ a+ " no es primo");
        }
        return true;
    }
}
