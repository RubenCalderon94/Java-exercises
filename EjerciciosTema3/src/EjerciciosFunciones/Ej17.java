package EjerciciosFunciones;

/*
 Diseña una función Java que devuelva el carácter central (String) de una cadena
pasada como parámetro. Si la longitud de la cadena es un número par devolverá dos
caracteres y si es impar sólo uno. Puedes utilizar el método subString de la clase
String.
 */

import java.util.Scanner;

public class Ej17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String c, central;

        System.out.println("Dime una palabra:");
        c=sc.nextLine();

        central=devuelCentral(c);

        System.out.println("El/los caracter/es central/es de la palabra "+
                c + " es: "+ central);

    }

    public static String devuelCentral(String s) {
        //si es par
        if(s.length()%2==0) {
            return s.substring((s.length()/2)-1, (s.length()/2)+1);//Metodo subcadena de STRING
        }else {
            //si es impar
            return s.substring((s.length()/2),(s.length()/2)+1);//Metodo subcadena de STRING
        }


    }
}
