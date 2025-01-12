package EjerciciosProfundizacion;

import java.util.Scanner;

/** Diseña un programa Java que solicite al usuario un carácter y nos diga si está entre
 las mayúsculas, las minúsculas, los dígitos o en ninguno de esos grupos.*/

public class Ej34 {
    public static void main(String[] args) {

        char caracter;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un caracter: ");
        caracter = sc.next().charAt(0);

        if (caracter >= 'A' && caracter <= 'Z') {
            System.out.println("El caracter: '"+caracter+"' es una letra Mayuscula. ");
        } else if (caracter >= 'a' && caracter <= 'z') {
            System.out.println("El caracter: '"+caracter+"' es una letra minuscula. ");
        } else if (caracter >= '0' && caracter <= '9') {
            System.out.println("El caracter: '"+caracter+"' es un numero. ");
        }else {
            System.out.println("Ninguno de esos grupos. ");
        }

    }
}
