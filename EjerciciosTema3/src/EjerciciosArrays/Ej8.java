package EjerciciosArrays;

/*
Diseña un programa que llene un array de 10 elementos con valores al azar entre 1 y
1000 mediante un bucle while. Luego el programa dará al usuario la opción de obtener
la media de los valores del array y el menor de los valores del array.
Diseña una función para cada caso, ambas llevarán como argumento de entrada
el array
 */

import java.util.Random;
import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        //Array de 10 posiciones
        int [] a=new int[10];

        int countWhile=10, menor;
        float media;

        //relleno del array
        while(countWhile!=0) {
            countWhile--;
            a[countWhile]=rd.nextInt(1000)+1;
        }
        //solicitar opción
        System.out.println("Menor (1) o Media(2)");
        if(sc.nextInt()==1) {;
            menor = calculameMenor(a);
            System.out.println("El menor número es: "+ menor);
        }

        else {
            media = calculameMedia(a);
            System.out.println("La media es "+ media);
        }
        sc.close();
    }

    private static float calculameMedia(int[] c) {
        float media=0;

        for(int i=0;i<c.length;i++) {
            media+=c[i];
        }
        return media/c.length;
    }

    private static int calculameMenor(int[] b) {
        int menor=b[0];

        for(int i=0; i<b.length;i++) {
            if(menor<b[i]) {
                menor=b[i];
            }
        }
        return menor;


    }
}
