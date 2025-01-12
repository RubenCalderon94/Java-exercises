package EjerciciosProfundizacion.EjerciciosProfundizacion;

import java.util.Scanner;

/**obviamente sin incluir al propio número.
 28. Diseña un programa en Java que compruebe si dos números son amigos. Se dice
 que dos números son amigos si la suma de los divisores del primero es igual al
 segundo y viceversa. Prueba con 220 y 284, son amigos. */

public class Ej28 {
    public static void main(String[] args) {

       int num1, num2, suma1, suma2;
       suma1=0;
       suma2=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = sc.nextInt();

        for (int i = 1; i <= num1-1; i++) {
            if (num1%i==0) {
                suma1+=i;
            }
        }

        for (int j = 1; j <= num1-1; j++) {
            if (num2%j==0) {
                suma2+=j;
            }
        }


        if (suma1==suma2) {
            System.out.println("Los numeros "+num1+", "+num2+" son perfectos");
        }else {
            System.out.println("Los numeros "+num1+", "+num2+" no son perfectos");

        }

    }
}
