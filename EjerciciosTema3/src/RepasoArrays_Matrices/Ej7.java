package RepasoArrays_Matrices;

/*
. Diseña un programa Java que partiendo de este array, int [] a=
{1,66,15,33,2,34,65,39,15,78}, genere otro con los mismos valores pero alternando
entre positivos y negativos. Al final, muestra los dos arrays
 */
public class Ej7 {
    public static void main(String[] args) {

        int [] a= {1,66,15,33,2,34,65,39,15,78};
        int [] array2= new int [a.length];//Creamos nuevo array para que me guarde el array modificado

        muestraArray1(a);//Muestro array orignal
        muestraArray2(a, array2);// Muestro array ya modificado, pero hay que pasarle como parametro el
        //array ( a ) y el array ( array2), si no , no funciona

    }
    public static void muestraArray1(int [] array) {
        System.out.println("Mostramos el  Array orignal" );
        for (int i = 0; i < array.length; i++) {//ME RECORRE EL ARRAY A Y ME LO MUESTRA
            System.out.print(+array[i]+", ");
        }
    }

    public static void muestraArray2(int [] array1, int [] array2) {

        for (int i = 0; i < array2.length; i++) {//ME RECORRE EL ARRAY A Y LO PASAMOS A NEGATIVO SALTEANDO
            if(i%2==0){
            }else {
                array2[i]=-array1[i];//Opciones impares del array
            }
        }
        System.out.println("Mostramos el  Array Modificado" );
        for (int i = 0; i < array2.length; i++) {
            System.out.print(+array2[i]+", ");
        }

    }
}
