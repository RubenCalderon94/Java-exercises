package EjerciciosProfundizacion.EjerciciosProfundizacion;

/* Diseña una aplicación Java que partiendo de una cadena de caracteres, muestre en
pantalla cuántas mayúsculas, minúsculas y dígitos tiene. */

import java.util.Scanner;

public class Ej57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra;
        int contadorMayusculas=0;
        int contadorMinusculas=0;
        int contadorDigitos=0;


        System.out.println("Ingrese una palabra:");
        palabra = sc.nextLine();

        for (int i = 0; i < palabra.length(); i++) {

            if (Character.isUpperCase(palabra.charAt(i))) {
                contadorMayusculas++;
            } else if  (Character.isLowerCase(palabra.charAt(i))){
                contadorMinusculas++;
            } else if (Character.isDigit(palabra.charAt(i))) {
                contadorDigitos++;

            }
        }

        System.out.println("La palabra introducida tiene:"+contadorMayusculas+" mayusculas  " +contadorMinusculas+" minusculas "+contadorDigitos+" digitos");


    }

}
