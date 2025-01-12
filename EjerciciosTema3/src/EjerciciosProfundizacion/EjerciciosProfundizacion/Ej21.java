package EjerciciosProfundizacion;

/**Diseña un programa Java que imprima en pantalla los números impares del 1 al 99 y
 la suma de los mismos*/

public class Ej21 {
    public static void main(String[] args) {

        System.out.println("Numeros del 1 al 99 impares y la suma de los mismos:");

        int suma=0;
        for (int i=1; i<=99; i+=2){
            suma+=i;
            System.out.println(i);
        }
        System.out.println("La acumulacion de los numeros del 1 al 99 impares es: "+suma);


    }
}
