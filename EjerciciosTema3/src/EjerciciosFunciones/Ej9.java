package EjerciciosFunciones;

/*
Diseña una función Java que devuelva al azar un carácter del alfabeto.
 */

import java.util.Random;

public class Ej9 {
    public static void main(String[] args) {

        System.out.println("Vamos a mostrar un caracter del alfabeto al azar: "+devuelveCaracter());

    }

    private static char devuelveCaracter() {
        Random rd = new Random();
        // Generar un número aleatorio entre 0 y 25 (26 letras en el alfabeto)
        int numeroAleatorio = rd.nextInt(26);
        // Convertir ese número a un carácter del alfabeto (a-z)
        return (char) ('a' + numeroAleatorio);
    }
}
