package EjerciciosIniciacion;

import java.util.Scanner;

/**Diseña un programa Java que solicite nombre y edad de una persona e indique si la
 persona es menor de edad (menor de 18 años), adulto (entre 18 y 65 años,
 incluidos) o mayor de edad (más de 65 años). El mensaje tipo será: “Paco tienes 12
 años, eres menor de edad”*/

public class Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese tu edad: ");
        int edad = sc.nextInt();

        if(edad < 18) {
            System.out.println(nombre + " eres menor de edad, tienes " + edad+ " años");
        } else if(edad == 18 | edad == 65) {
            System.out.println(nombre + " eres adulto, tienes " + edad+ " años");
        } else {
            System.out.println(nombre + " eres mayor de edad, tienes " + edad+ " años");
        }
        sc.close();

    }
}
