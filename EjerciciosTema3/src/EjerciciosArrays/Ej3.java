package EjerciciosArrays;

/*
Intercambia los contenidos de las posiciones primera y última de este array int [] a=
{1,66,15,33,2,34,65,39,15,78}. Mostrar los valores del array tras el intercambio.
 */
public class Ej3 {
    public static void main(String[] args) {

        int posicion0;

        int [] a={1,66,15,33,2,34,65,39,15,78};

        //Intercambiamos posicion 0 por posicion 9.
        posicion0=a[0];
        a[0]=a[9];
        a[9]=posicion0;

        //Mostramos el array ya intercambiado con bucle for
        for (int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}
