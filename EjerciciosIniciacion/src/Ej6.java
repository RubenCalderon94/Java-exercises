import java.util.Scanner;
/**Diseña un programa Java que transforme una temperatura dada en centígrados a
 kelvin.**/

public class Ej6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese temperatura en celsius: ");
        double celsius = sc.nextDouble();

        double kelvin = celsius + 273.15;

        System.out.println("La temperatura:" + celsius +" grados" +  " en Kelvin es: " + kelvin);
        sc.close();
    }
}
