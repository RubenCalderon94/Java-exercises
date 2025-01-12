package EjerciciosArrays;
/*
Diseña un programa Java que partiendo de este array, int [] a=
{1,66,15,33,2,34,65,39,15,78}, genere otro con los mismos valores pero alternando
entre positivos y negativos. Al final, muestra los dos arrays.
 */
public class Ej7 {
    public static void main(String[] args) {

        int [] a= {1,66,15,33,2,34,65,39,15,78};
        int [] b= new int [a.length];

        //Recorremos el array y mostramos
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+", ");
        }
        System.out.println();

        //Transformamos a negativos alternando
        for (int i=0;i<a.length;i++){
            if(i%2==0){
            }else {
            b[i]=-a[i];//Opciones impares del array
            }
        }

        //Mostramos segundo array transformado
        for (int i=0;i<b.length;i++){
            System.out.print(b[i]+", ");
        }

    }
}
