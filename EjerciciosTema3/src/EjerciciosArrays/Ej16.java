package EjerciciosArrays;

/*
 Diseña   un    programa    Java    que    trabaje    con    este    array    int    []    a=
{1,66,15,33,2,34,65,39,15,78}, e intercambie los valores del array de la siguiente
forma: el primero con el último, el segundo con el penúltimo, el tercero con el
antepenúltimo, ...
 */

public class Ej16 {
    public static void main(String[] args) {

        int [] a= {1,66,15,33,2,34,65,39,15,78};
        int aux;

        muestraArray(a);
        for (int i = 0; i <a.length/2 ; i++) {//Recorremos el array y vamos cambiando posiciones
            aux=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=aux;
        }
        muestraArray(a);
    }
    private static void muestraArray(int[] a) {//Funcion que muestra el array
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+",");
        }
        System.out.println();
    }

}


