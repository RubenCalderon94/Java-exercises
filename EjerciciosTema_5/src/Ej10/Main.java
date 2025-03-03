package Ej10;

public class Main {
    public static void main(String[] args) {

        GestionNumeros gn = new GestionNumeros(100);
        gn.mostrarNumeros();
        gn.mostrarNumerosComoString();
        gn.multiplicarPor(2);
        System.out.println("Valores mayores que 50: "+gn.contarValoresMayoresQue(50));
        System.out.println("Valores entre 20 y 50: "+gn.contarValoresEntre(20, 50));

    }
}
