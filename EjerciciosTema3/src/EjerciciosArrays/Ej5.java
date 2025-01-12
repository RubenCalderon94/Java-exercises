package EjerciciosArrays;

/*
Diseña un programa Java que visualice el contenido de este array, int [] a=
{1,66,15,33,2,34,65,39,15,78}, e imprima cual es el mayor de los valores del mismo.
Diseña una función que reciba un array como parámetro y devuelva el mayor
valor del mismo.
 */

public class Ej5 {
    public static void main(String[] args) {

        int [] a= {1,66,15,33,2,34,65,39,15,78};
        int mayor=0;

        //Visualizamos el array
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        mayor=numeroMayor(a);
        System.out.println("El numero mayo es: "+mayor);

    }

    public static int numeroMayor( int [] p){
        //Declaramos variable para guardar el numero mayor
        int m=0;

        //Recorremos el array y vemos cual es el amyor
        for (int i=0;i<p.length;i++){
           if (p[i] > m) {
                m = p[i];
           }
        }
        return m;


    }

}
