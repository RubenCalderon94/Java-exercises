package EjerciciosProfundizacion.EjerciciosProfundizacion;

/*Diseña un programa que genere e imprima 10 números al azar entre 1 y 500 mediante
la clase Random. Al final el programa debe mostrar el menor y el mayor de todos ellos*/

import java.util.Random;

public class Ej48 {
    public static void main(String[] args) {

        int num, mayor=0, menor=500;
        Random rd = new Random();

        for (int i=1; i<=10; i++){
            num = rd.nextInt(500-1)+1;
            System.out.println(num);
            if (num>mayor){
                mayor=num;
            }else if (num<menor){
                menor=num;
            }
        }
        System.out.println("El numero mayor es: "+mayor);
        System.out.println("El numero menor es: "+menor);
    }

}
