package EjerciciosFunciones;

/*
Diseña un programa Java que incluya una función que devuelva el mayor de dos
números enteros pasados como parámetro.

 */

import java.util.Scanner;

public class Ej1 {



    public static void main(String[] args) {

        int  a, b;//Declaramos las variables

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el primer numero: ");
        a=sc.nextInt();
        System.out.println("Escribe el segundo numero: ");
        b=sc.nextInt();

        System.out.println("El numero mayor es: "+numMayor(a, b));

    }


    private static int numMayor(int num1, int num2) {// Por defecto private static, int porque se trata de una funcion que
        //devuelve un numero entero, numMayor es el nombre de la variable e int a, e int b, son los parametros que
        //el usuario va a escribir y la funcion los va a utilizar.

        if (num1>num2){
            return num1;//Devuelve el numero mayor que esta guardado en la variable a.
        }
        return num2;////Devuelve el numero mayor que esta guardado en la variable b.

    }
}
