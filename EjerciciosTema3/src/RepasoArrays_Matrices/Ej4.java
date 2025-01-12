package RepasoArrays_Matrices;

/*
Diseña un programa Java que llene un array de 10 elementos enteros con los múltiplos
de 5 a partir de 50. Luego el programa deberá mostrar el contenido de las posiciones
pares del array
 */

public class Ej4 {
    public static void main(String[] args) {

        int [] array= new int [10];//Declaramos el array de 10 elementos


        rellenaArrayMultiplos(array);

    }

    public static void rellenaArrayMultiplos(int [] a) {


        //Como empieza desde el 50
        int n = 50;

        //Rellenamos el array con multiplos de 5 a partir de 50
        for (int i=0; i<a.length; i++){
            a[i] = n;
            n+=5; //Multiplica de 5 en 5
        }

        //Imprimimos el array solo con los numeros pares de 5 en 5
        for (int i=0; i<a.length; i++){
            if(i%2==0){
                System.out.println("Las posiciones pares son "+ a[i]);
            }
        }


    }
}
