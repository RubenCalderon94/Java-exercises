package EjerciciosFunciones;

/*
Diseña un programa Java que incluya una función que reciba como parámetro un
entero y devuelva el factorial de dicho número entero. El factorial de 5 es: 5*4*3*2*1,
o bien 5 * el factorial de 4.
 */

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero entero: ");
        num = sc.nextInt();
        System.out.println("El factorial del numero "+num+ " es "+  devuelveFactorial(num));

    }

    private static int  devuelveFactorial(int num1) {

        int f=1;//Incrementamos el acumulador a 1, porque multiplica, si dejamos en 0 no funciona
        for (int i = num1; i >= 1; i--) {
            f*=i;//Acunluador multiplicando
        }
        return f;//Devuelve el resultado de la (f), y lo devuelve en un entero como hemos declarado con int
    }

    //FACTORIAL RECURSIVO
    /*static int factorialRecursivo (int a) {
        if (a==0 || a==1)
            return 1;
        else
            return a * factorialRecursivo(a-1);
    }*/
}
