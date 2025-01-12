package RepasoArrays_Matrices;

/*
Intercambia los contenidos de las posiciones primera y última de este array int [] a=
{1,66,15,33,2,34,65,39,15,78}. Mostrar los valores del array tras el intercambio
 */

public class Ej3 {
    public static void main(String[] args) {

        int [] a= {1,66,15,33,2,34,65,39,15,78};

        intercambioValor(a);


    }

    public static void intercambioValor( int [] array){

        int posicion0;

        posicion0=array[0];
        array[0]=array[9];
        array[9]=posicion0;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }

    }
}
