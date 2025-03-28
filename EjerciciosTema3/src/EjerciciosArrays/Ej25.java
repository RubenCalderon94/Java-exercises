package EjerciciosArrays;

import java.util.Random;
import java.util.Scanner;

/*
Diseña un programa Java que guarde los nombres de 20 alumnos de una clase y sus
notas a lo largo de las tres evaluaciones de un curso académico en sendos arrays.

SE PIDE:
-Mostrar a cada alumno y sus tres notas.
-Mostrar a cada alumno y la media de sus notas (double).

NOTAS:
-Para llenar el array de los nombres de los alumnos utiliza “Alumno1”,
“Alumno2”... y hazlo mediante un bucle.

Para las notas genera valores aleatorios de tipo double entre 1 y 10. Ojo, las
notas no podrán superar el valor 10.

 */
public class Ej25 {
    public static void main(String[] args) {
        Random rd = new Random();

        // Crear arrays para nombres y notas
        String[] nombres = new String[20];
        double[][] notas = new double[20][3]; // Tres evaluaciones por alumno


        for (int i = 0; i < 20; i++) {  // Generar nombres automáticamente y notas aleatorias
            nombres[i] = "Alumno" + (i + 1); // Nombres como "Alumno1", "Alumno2", ...
            for (int j = 0; j < 3; j++) {
                notas[i][j] = rd.nextDouble(10)+1;
            }
        }


        System.out.println("Alumnos y sus notas:"); // Mostrar alumnos y sus notas
        for (int i = 0; i < 20; i++) {
            System.out.print(nombres[i] + " \t ");
            double suma = 0;
            for (int j = 0; j < 3; j++) {
                System.out.printf("%.2f ", notas[i][j]); // Imprime las notas con dos decimales(printf(%.2f)me imprime solo dos decimales)
                suma += notas[i][j];
            }
            double media = suma / 3;
            System.out.printf(" | Media: %.2f%n", media); // Imprime la media con dos decimales
        }


    }
}
