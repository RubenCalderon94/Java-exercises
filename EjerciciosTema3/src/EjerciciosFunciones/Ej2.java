package EjerciciosFunciones;

/*
Diseña un programa Java que incluya una función que imprima los caracteres
existentes entre otros dos caracteres dados. Es decir, si pasamos las letras a y f. La
función imprimirá los valores: a, b, c, d, e, f
 */

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char a, b;

        System.out.println("Ingrese el primer caracter:");
        a = sc.next().charAt(0);//Metodo para leer el primer caracter
        System.out.println("Ingrese el segundo caracter:");
        b = sc.next().charAt(0);//Metodo para leer el primer caracter

        letras(a, b);//Nos imprime directamente el resultado de la funcion, porque hemos utilizado em metodo void



    }

    private static void letras(char c, char d) {//Funcion con dos caracteres a y b,

        if (c>d){

        } else if (c>d)

            System.out.println("Los caracteres entre " + c + " y " + d + " son:");
        for (char i = c; i <= d; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //No usamos return porque arriba hemos declarado void, y no devuelve nada. Solo va a imprimir
    }

}
