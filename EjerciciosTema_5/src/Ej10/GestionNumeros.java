package Ej10;

import java.util.Random;

public class GestionNumeros implements InterfazNumeros {
    Random rd = new Random();

    //ATRIBUTOS
    private int[] numeros ; // Array de 10 números enteros

    // Constructor que genera números aleatorios para el array
    public GestionNumeros(int cantidad){
        numeros = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            numeros[i] = rd.nextInt(100);
        }
    }

    @Override
    public void mostrarNumeros() {
        for(int i: numeros)
            System.out.println(i);
    }


    @Override
    public void mostrarNumerosComoString() {
        System.out.println("[");
        for (int i = 0; i < numeros.length; i++) {
            if(i == numeros.length-1){
                System.out.print(numeros[i]);
            }else{
                System.out.print(numeros[i]+", ");
            }
        }
        System.out.println("]");

        //System.out.println(numeros.toString());
    }


    @Override
    public void multiplicarPor(int multiplicador) {
        for(int n:numeros){
            n = n*multiplicador;
        }
        mostrarNumeros();
    }



    @Override
    public int contarValoresMayoresQue(int valor) {
        int count = 0;
        for(int n:numeros){
            if(n > valor){
                count++;
            }
        }
        return count;
    }

    @Override
    public int contarValoresEntre(int num1, int num2) {
        int count = 0;
        for(int n:numeros){
            if(n > num1 && n < num2){
                count++;
            }
        }
        return count;
    }


    @Override
    public int compararCon(int[] num) {
        int suma = 0;
        if(num.length > this.numeros.length){
            for(int n:num){
                suma += n;
            }
        }
        else{
            for(int n:this.numeros){
                suma += n;
            }
        }
        return suma;
    }

    @Override
    public int[] getArray(int[] nu) {
        if(nu.length > numeros.length){
            return nu;
        }
        else{
            return numeros;
        }

    }
}
