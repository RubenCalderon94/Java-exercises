package tema3.profundizacion;
/*
54. Diseña un programa que muestra en pantalla una figura como la de la imagen.
Solicita filas, en la imagen 6.
*
**
* *
*  *
*   *
******
 */
import java.util.Scanner;

public class Ej54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineas;

        System.out.println("Escribe el número de filas:");
        lineas = sc.nextInt();

        for (int i = 1; i <= lineas; i++) {
            for (int j = 1; j <= i; j++) {
                if(j==1 || j==i || i==lineas) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
