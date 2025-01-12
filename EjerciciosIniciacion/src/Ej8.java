import java.util.Scanner;

/** Diseña un programa Java que pida tres números de tipo double y calcule la media
 aritmética de los mismos. **/

public class Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 3 numeros: ");
        double num1 = sc.nextInt();
        double num2 = sc.nextInt();
        double num3 = sc.nextInt();

        double resultado = (num1 + num2 + num3) / 3 ;

        System.out.println("La media aritmetica es: " + resultado);

        sc.close();



    }
}
