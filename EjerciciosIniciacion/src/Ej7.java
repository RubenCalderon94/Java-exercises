import java.util.Scanner;

/** Diseña un programa Java que solicite una cantidad en pulgadas y la convierta en
 centímetros y también en metros. **/

public class Ej7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una cantidad en pulgadas:");
        int pulgadas = sc.nextInt();

        double cm = pulgadas * 2.54;
        System.out.println("Las " + pulgadas + " pulgadas convertidas a cm son: " + cm);

        double m = pulgadas * 0.0254;
        System.out.println("Las " + pulgadas + " pulgadas convertidas a metros son: " + m);

        sc.close();
        
    }
}
