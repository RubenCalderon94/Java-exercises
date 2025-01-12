import java.util.Scanner;

/** Diseña un programa Java que pida tres números y escriba en pantalla, la suma de los
tres, su producto y la resta del primero más el segundo menos el tercero. **/


public class Ej1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        System.out.println("Ingrese el tercer numero: ");
        int num3 = sc.nextInt();


        int suma= num1+num2+num3;
        System.out.println("La suma de los numeros es: "+suma);

        int producto= num1*num2*num3;
        System.out.println("La multiplicacion de los numeros es: "+producto);

        int resta= num1-num2;
        System.out.println("La resta de los numeros es: "+resta);

        sc.close();


    }
}

