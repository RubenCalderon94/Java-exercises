package Ej8;

public class Main {
    public static void main(String[] args) {


        double l = Mates.logitudCircunferencia(12.55);
        System.out.println(l);

        if (Mates.miraSiPar(12523684)) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }

        if (Mates.miraSiPrimo(12523684)) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }

        if (Mates.sonAmigos(66928, 66992)) {
            System.out.println("Son amigos");
        } else {
            System.out.println("No son amigos");
        }

    }
}

