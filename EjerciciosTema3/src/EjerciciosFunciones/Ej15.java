package EjerciciosFunciones;

/*
. Diseña un programa Java que trabaje con una función que devuelva el número de
vocales (cuántas) que tiene una cadena pasada como parámetro. Para hacer este
ejercicio debes saber lo siguiente sobre las cadenas:

a. Las cadenas tienen un método (función) llamado length, que devuelve el
número de caracteres de la misma. String cadena=”hola”; int
longitud=cadena.length();
b. El primer carácter de una cadena está en la posición 0 y el último en length()-
1.
c. Puedes extraer caracteres de una cadena mediante cadena.charAt(posición).
Este método devuelve el carácter situado en la posición indicada.
d. Puedes buscar caracteres en una cadena mediante el método
indexOf(caracter). Este método devuelve la posición de la cadena donde se
encontró el carácter o -1 si no fue encontrado.
e. Para pasar una cadena a minúscula podemos usar toLowerCase() de esta
forma: String minusculas = cadena.toLowerCase();
 */

import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String palabra;

        System.out.println("Introduce una palabra: ");
        palabra = sc.nextLine();

        System.out.println("La palabra "+palabra+ " tiene "+cantidadVocales(palabra)+" vocales");

    }

    public static int cantidadVocales( String a) {

        int vocales=0;

        for (int  i = 0; i<a.length(); i++) {
            if (a.charAt(i) == 'a' || a.charAt(i) == 'e' ||
                    a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u') {
                vocales++;
            }

        }
        return vocales;
    }
}
