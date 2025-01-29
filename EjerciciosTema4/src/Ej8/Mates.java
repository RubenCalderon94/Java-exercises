package Ej8;
/*
Clase Mates. Crea una clase con este nombre y con las siguientes características.
a. Atributo constante con el valor de PI.
b. Método estático que retorna la longitud de una circunferencia a partir de un
radio pasado como argumento.
c. Método estático que devuelva si un número es par o no (true o false).
d. Método estático que devuelva si un número es primo o no (true o false).
e. Método estático que devuelva la suma de los divisores de un número.
f. Método estático que devuelva verdadero o falso si dos números son amigos o
no (true o false).

 */

public class Mates {
    //a. Atributo constante con el valor de PI.
    private static final double PI = 3.141592;

    //b. Método estático que retorna la longitud de una circunferencia a partir de un
    //radio pasado como argumento.
    public static double logitudCircunferencia(double r) {
        return 2 * PI * r;
    }

    //c. Método estático que devuelva si un número es par o no (true o false).
    public static boolean miraSiPar(int n) {
        return n % 2 == 0;
    }

    //d. Método estático que devuelva si un número es primo o no (true o false).
    public static boolean miraSiPrimo(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //e. Método estático que devuelva la suma de los divisores de un número.
    public static int sumaDivisores(int n) {
        int suma = 0;
        for (int i = n / 2; i > 0; i--) {
            if (n % i == 0) {
                suma += i;
            }
        }
        return suma;
    }

    //f. Método estático que devuelva verdadero o falso si dos números son amigos o
    //no (true o false).
    public static boolean sonAmigos(int a, int b) {
        int sum1, sum2;

        sum1 = Mates.sumaDivisores(a);
        sum2 = Mates.sumaDivisores(b);

        return (sum1 == b && sum2 == a);
    }
}
