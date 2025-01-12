package EjerciciosFunciones;

/*
Diseña un programa Java que incluya una función que devuelva true o false, según el
año pasado como parámetro sea bisiesto o no
 */

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a;

        System.out.println("Ingrese un año, comprobaremos si es bisiesto o no: ");
        a = sc.nextInt();


        System.out.println("¿El año "+a+" seria bisiesto? " +comprobacionBisisesto(a));


    }

    private static boolean comprobacionBisisesto(int c) {

        if (c % 4 == 0 || c % 100 == 0 || c % 400 == 0) { //Año es bisiestro si es divisible entre 100 y 400
            return true; //
        }
        return false;
    }
}
