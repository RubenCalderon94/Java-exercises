package EjerciciosProfundizacion;

/**. Diseña un programa Java que muestre en pantalla los números enteros entre 5 y 25,
 su cuadrado y su cubo. Recuerda que para usar la potencia se utiliza Math.pow (base,
 exponente).*/

public class Ej13 {
    public static void main(String[] args) {
        for (int i=5; i<=25; i++){


            System.out.printf("\nNúmero: %2.3f\t"
                            + "Cuadrado: %2.3f\t"
                            + "Cubo: %2.3f",
                    (double)i, Math.pow(i, 2) , Math.pow(i, 3));
        }

    }
}
