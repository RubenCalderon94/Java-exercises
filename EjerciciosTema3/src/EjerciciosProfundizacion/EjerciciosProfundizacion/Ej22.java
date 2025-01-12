package EjerciciosProfundizacion;

import java.util.Scanner;

/**Diseña un programa en Java que pida números al usuario. La condición de fin será la
 introducción del cero. El programa deberá mostrar la suma de todos ellos y cuántos
 han sido tecleados.*/

public class Ej22 {
    public static void main(String[] args) {


        boolean salir = false;
        int suma=0;
        int contador=0;
        do{


            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese un numero:");
            int num = sc.nextInt();
            suma+=num;
            contador++;
            System.out.println("Para finalizar el programa, introduzca el numero 0");
            if (num==0){
                salir = true;

            }


        }while(!salir);
        System.out.println("La suma de todos los numeros tecleados es:"+suma+" y han sido tecleados:"+contador+" numeros");
    }
}
