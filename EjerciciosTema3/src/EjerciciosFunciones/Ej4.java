package EjerciciosFunciones;

/*
Diseña un programa Java que incluya una función que devuelva el carácter asociado
a un código ASCII pasado como parámetro
 */

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero, devolveremos el caracter asociado ");
        num = sc.nextInt();

        System.out.println("El caracter asociado al numero "+num+" es: "+devuelveCarater(num));

    }
    public static char devuelveCarater( int a) {//Funcion para devolver el caracter que corresponde al numero
        // guardado por el usuario

        return  (char) a;//Devolvemos el caracter asociado al num


    }
}
