package EjerciciosProfundizacion.EjerciciosProfundizacion;

/*Diseña un programa que genere e imprima 10 números al azar entre 1 y 50 mediante
la clase Random*/

import java.util.Random;

public class Ej46 {
    public static void main(String[] args) {
        Random rd = new Random();
        int num;
        for(int i=1; i<=10; i++){
            num=rd.nextInt(51-1)+1;
            System.out.println(num);
        }
    }
}
