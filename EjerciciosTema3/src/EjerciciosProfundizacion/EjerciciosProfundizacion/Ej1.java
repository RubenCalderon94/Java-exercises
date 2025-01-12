package EjerciciosProfundizacion;

/**Diseña un programa Java que muestre en pantalla los números enteros del 1 al 100.
 a. Mediante for*/



import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i=1; i<=100; i++){
            System.out.println("Del 1 al 100 mediante un for: "+i);
        }

        /**b. Mediante while*/
        int x=1;
        while (x<=100){
                System.out.println("Del 1 al 100 mediante un while: "+x);
                x++;
        }

        /** c. Mediante do-while*/
        int a=1;
        do {

            System.out.println("Del 1 al 100 mediante un do-while: "+a);
            a++;
        } while (a<=100);

    }
}
