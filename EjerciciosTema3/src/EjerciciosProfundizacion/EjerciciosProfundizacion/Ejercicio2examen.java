package EjerciciosProfundizacion.EjerciciosProfundizacion;

/* Pedir 10 números. Mostrar la media de los números positivos, la media de los
números negativos y la cantidad de ceros.*/

import java.util.Scanner;

public class Ejercicio2examen {
    public static void main(String[] args) {


        double sumaP=0, sumaN=0, countP=0, countN=0, count0=0;

        Scanner sc = new Scanner(System.in);


        for (int i=1; i<=10; i++) {
            System.out.println("Ingrese un numero: ");
            int num = sc.nextInt();

            if (num>0){
                sumaP += num;
                countP++;
            }else if (num<0){
                sumaN += num;
                countN++;
            }else if (num==0){
                count0++;
            }
        }



        System.out.println("La media de los numeros positivos es: "+(sumaP/2));
        System.out.println("La media de los numeros negativos es: "+(sumaN/2));
        System.out.println("La cantidad de 0 es: "+count0);

    }

}
