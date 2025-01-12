package EjerciciosProfundizacion;

/**Diseña un programa Java que imprima en pantalla los números del 1 al 10 y la suma
 de los mismos.*/

public class Ej20 {
    public static void main(String[] args) {
        System.out.println("Numeros del 1 al 10 y la suma de los mismos:");

        int suma=0;
        for (int i=1; i<=10; i++){
            suma+=i;
            System.out.println(i);
        }
        System.out.println("La acumulacion de los numeros del 1 al 10 es: " +suma);


    }
}
