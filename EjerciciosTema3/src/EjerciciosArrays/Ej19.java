package EjerciciosArrays;

/*
. Diseña un programa Java que simule el hecho de tirar un dado 6000 veces. Los
valores posibles son 1, 2, 3, 4, 5 y 6. El programa debe mostrar cuántas veces salió
cada número y el porcentaje que esa cantidad representa sobre el total de tiradas. Se
valorará la utilización de arrays para llevar a cabo los cálculos.
 */

import java.util.Random;

public class Ej19 {
    public static void main(String[] args) {

        int count1=0, count2=0, count3=0, count4=0, count5=0, count6=0;

        // Declaración del array con 10 elementos
        int[] array = new int[6000];

        // Crear una instancia de la clase Random
        Random rd= new Random();

        // Llenar el array con valores aleatorios entre 1 y 6
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(6) + 1; // Genera un número entre 1 y 6
        }

        for (int i = 0; i < array.length; i++) { //Imprimimos el array
            System.out.println(array[i] + " ");


        }

        for (int i = 0; i < array.length; i++) { //Recorremos array y con el contador vamos guardando cada numero que coincida
            if (array[i] == 1) {
                count1++;
            } else if (array[i] == 2) {
                count2++;
            } else if (array[i] == 3) {
                count3++;
            } else if (array[i] == 4) {
                count4++;
            } else if (array[i] == 5) {
                count5++;
            } else
              count6++;

        }

        System.out.println("EL numero 1 ha salido "+count1+" veces. Que representa un "+((count1*100)/6000)+"%");
        System.out.println("EL numero 2 ha salido "+count2+" veces. Que representa un "+((count2*100)/6000)+ "%");
        System.out.println("EL numero 3 ha salido "+count3+" veces. Que representa un "+((count3*100)/6000)+ "%");
        System.out.println("EL numero 4 ha salido "+count4+" veces. Que representa un "+((count4*100)/6000)+ "%");
        System.out.println("EL numero 5 ha salido "+count5+" veces. Que representa un "+((count5*100)/6000)+ "%");
        System.out.println("EL numero 6 ha salido "+count6+" veces. Que representa un "+((count6*100)/6000)+ "%");
    }

}

