package Ej11;

import java.util.Random;

public class Matriz implements Imatriz {
    Random rd = new Random();

    //ATRIBUTOS
    private int[][] matriz;

    //CONSTRUCTOR
    public Matriz(int filas, int columnas, int valorMin, int valorMax) {
        matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = rd.nextInt(valorMax - valorMin) + valorMin;
            }
        }
    }


    @Override
    public void imprimirMtriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println();
    }

    @Override
    public int getMaximo() {
        return 0;
    }

    @Override
    public double getMedia() {
        return 0;
    }
}
