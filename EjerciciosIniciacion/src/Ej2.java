import java.util.Scanner;

/**Diseña un programa que calcule el área de un círculo. El programa pedirá el radio y
 mostrará el área (pi*radio*radio).**/


public class Ej2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
        double radio = sc.nextDouble();

        double area = Math.PI * radio * radio;
        System.out.println("El area del circulo es: " + area);
    }

}
