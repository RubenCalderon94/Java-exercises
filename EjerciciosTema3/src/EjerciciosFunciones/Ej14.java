package EjerciciosFunciones;

/*
 Diseña un programa Java que incluya una función que muestre en pantalla los pares
de números primos gemelos que hay entre 1 y un número pasado como parámetro.
Se dice que dos números primos son gemelos si uno de ellos es igual al otro
más dos unidades. Así, los números 3 y 5 son primos gemelos.
Antes de nada, diseña una función que devuelva true o false según un número pasado
como parámetro sea primo o no.
1, 2, 3, 4, 5, ……………..100
 */

public class Ej14 {
    public static void main(String[] args) {

        mostrarPrimosGemelosEntre1yN(100);

    }

    static void mostrarPrimosGemelosEntre1yN(int n) {

        for (int i = 1; i <= n; i++) {

            if (esPrimo(i) && esPrimo(i+2))
                System.out.printf("Primos gemelos: %d, %d\n", i , (i+2));
        }

    }

    static boolean esPrimo(int n) {
        if (n < 2)
            return false;
        else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        }


    }
}
