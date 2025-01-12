import java.util.Scanner;

/** Diseña un programa en Java que pida el año de nacimiento de una persona y su
 nombre y escriba un mensaje del tipo: Paco tienes 24 años.**/

public class Ej4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el año de nacimiento: ");
        int año = sc.nextInt();

        System.out.println("Escribe tu nombre:  ");
        String nombre = sc.next();

        int resultado = 2024-año;
        System.out.println( nombre+ " tienes " + resultado+ " años");

        sc.close();

    }
}
