import java.util.Scanner;

/** Diseña un programa Java que calcule y muestre el perímetro de un rectángulo. El
 programa debe solicitar la medida de los lados del rectángulo.**/

public class Ej3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el largo del rectangulo: ");
        int largo= sc.nextInt();

        System.out.println("Ingrese el altura del rectangulo: ");
        int altura= sc.nextInt();

        double perimetro = 2*largo*altura;
        System.out.println("El perimetro es: "+perimetro);
    }
}
