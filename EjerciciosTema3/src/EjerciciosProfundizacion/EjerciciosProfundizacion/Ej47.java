package EjerciciosProfundizacion.EjerciciosProfundizacion;

/*Diseña un programa que genere e imprima 10 números al azar entre 1 y 50 mediante
la clase Random. Al final el programa debe mostrar el mayor de todos ellos.*/

import java.util.Random;

public class Ej47 {
    public static void main(String[] args) {

        Random rd = new Random();
        int num, mayor=0;

        for (int i = 1; i <=10; i++) {
            num = rd.nextInt(51-1)+1;
            System.out.println(num);
            if (num>mayor){
                mayor=num;
            }

        }
        System.out.println("El numero mayor generado es: "+mayor);
    }
}
