package EjerciciosProfundizacion.EjerciciosProfundizacion;

/*. Diseña un programa que genere 10 números al azar mediante el método nextInt() de
la clase Random. El programa mostrará al final cuántos de esos números son positivos
y cuántos negativos.*/

import java.util.Random;

public class Ej49 {
    public static void main(String[] args) {
        int num, count=0, contador=0;
        Random rd = new Random();

        for (int i=1; i<=10; i++){
            num = rd.nextInt();
            System.out.println(num);
            if (num>0){
                count++;

            }else {
                contador++;

            }
        }
        System.out.println("De los 10 numeros, "+count+" son positivos");
        System.out.println("De los 10 numeros, "+contador+" son negativos");

    }
}
