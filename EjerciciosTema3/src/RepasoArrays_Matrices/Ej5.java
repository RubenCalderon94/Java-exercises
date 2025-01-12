package RepasoArrays_Matrices;

/*
Diseña un programa Java que visualice el contenido de este array, int [] a=
{1,66,15,33,2,34,65,39,15,78}, e imprima cual es el mayor de los valores del mismo.
Diseña una función que reciba un array como parámetro y devuelva el mayor
valor del mismo.
 */

public class Ej5 {
    public static void main(String[] args) {

        int [] a= {1,66,15,33,2,34,65,39,15,78};

        devuelveMayor(a);

    }

    public static void devuelveMayor(int [] array) {

        int mayor=0;//Variable para guardar el nuemero mayor

        for (int i = 0; i < array.length; i++) {//Mostramos el array completo
            System.out.print(array[i]+", ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {//Lo recorremos y vemos cual es el mayor numero
            if (array[i]>mayor) {
                mayor=array[i];
            }

        }
        System.out.println("El numero mayor es: "+mayor);

    }

}
