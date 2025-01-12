package EjerciciosArrays;

/*
 Diseña un programa Java que mueva los valores de un array una posición hacia el
final (hacia la derecha). El último elemento pasará a ser el primero.
 */

public class Ej15 {
    public static void main(String[] args) {

        int[] a= {1,66,15,33,2,34,65,39,15,78};//CREAMOS ARRAY
        int ultimo =a[a.length-1];//Guardamos el ultimo

        for (int i = a.length-1; i >0 ; i--) { //Corremos una posicion cada numero
            a[i]=a[i-1];
        }
        a[0]=ultimo;

        for (int i=0; i<a.length; i++) { //Mostramos el array ya modificado
            System.out.println(a[i]);
        }
    }
}
