import java.util.Scanner;

/**Diseña un programa que solicite nombre, peso y altura de una persona y a partir de
 estos datos emita un mensaje del tipo: Paco, tu IMC es 24,566. El IMC es el índice
 de masa corporal.**/

public class Ej5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese su peso: ");
        double peso = sc.nextDouble();

        System.out.println("Ingrese su altura: ");
        double altura = sc.nextDouble();


        double imc = peso/(altura*altura);

        System.out.println(nombre+ " tu IMC es: " + imc);

        sc.close();


    }
}
