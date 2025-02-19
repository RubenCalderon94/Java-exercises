package Ej10;

import java.util.Random;

public class GestionNumeros implements InterfazNumeros {

    //ATRIBUTOS
    private int[] numeros = new int[10]; // Array de 10 números enteros

    // Constructor que genera números aleatorios para el array
    public GestionNumeros() {
        Random rand = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(100); // Números aleatorios entre 0 y 99
        }
    }

    @Override
    public void mostrarNumeros() {

    }

    @Override
    public void mostrarNumerosComoString() {

    }

    @Override
    public void multiplicarPor(int numero) {

    }

    @Override
    public int contarValoresMayoresQue(int numero) {
        return 0;
    }

    @Override
    public int contarValoresEntre(int numero1, int numero2) {
        return 0;
    }

    @Override
    public int compararCon(int[] otroArray) {
        return 0;
    }

    @Override
    public int[] getArray(int[] otroArray) {
        return new int[0];
    }
}
