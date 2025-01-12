package EjerciciosFunciones;
/*
Diseña un programa Java que incluya una función que devuelva true o false si dos
números pasados como parámetros son amigos o no. Crea también una función que
devuelva la suma de los divisores de un número entero
 */

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese el primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = sc.nextInt();



        System.out.println("¿Los numeros "+num1+ " y " +num2+ " son amigos? "+  devuelveNumero(num1,num2));

    }

    private static boolean devuelveNumero(int num3, int num4) {

        return (num3==sumaDivisores(num3) && num4==sumaDivisores(num4));//Devolvemos un bolean, si los numeros
        //pasados por consola son primos o no


    }


    static int sumaDivisores(int numero) {//

        int suma=0;
        for (int i = 1; i <=numero/2; i++) {
            if (numero%i==0)
                suma+=i;
        }

        return suma;
    }
}
