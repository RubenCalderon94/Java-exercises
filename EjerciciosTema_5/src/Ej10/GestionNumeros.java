package Ej10;

import java.util.Random;

public class GestionNumeros implements InterfazNumeros {

    //ATRIBUTOS
    private int[] numeros = new int[10]; // Array de 10 números enteros

    // Constructor que genera números aleatorios para el array
    public GestionNumeros() {
        Random rd = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rd.nextInt(100); // Números aleatorios entre 0 y 99
        }
    }

    @Override
    public void mostrarNumeros() {

    }


    @Override
    public void mostrarNumerosComoString() {

    }

    @Override
    public void multiplicarPor(int multiplicador) {
        for (int v: numeros) {
            System.out.println( v= v * multiplicador);
        }
    }

    @Override
    public int contarValoresMayoresQue(int valor) {
        return 0;
    }

    @Override
    public int contarValoresEntre(int numero1, int numero2) {
        return 0;
    }

    @Override
    public int compararCon(int[] numeros) {
        return 0;
    }

    @Override
    public int[] getArray(int[] num) {
        return new int[0];
    }
}
