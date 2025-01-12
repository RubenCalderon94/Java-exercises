package EjerciciosArrays;
/*
 Diseña un programa Java que guarde DNI y nombre de 10 alumnos y sus notas en
tres exámenes (datos enteros). El programa solicitará un DNI al usuario y mostrará:
DNI del alumno: 8.888.099-X
Nombre: Luis Arrimada Vivas
Notas:
Examen 1: ***** 5
Examen 2: **** 4 Suspenso.
Examen 3: *** 3 Suspenso.
 */

import java.util.Random;
import java.util.Scanner;

public class Ej27 {
    public static void main(String[] args) {

        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        String dni;


        String [][] a = new String[10][2];//Declaramos una matriz de 10 filas y 2 columas
        int [][] notas = new int[10][3];//Declaramos una matriz de 10 filas y 3 columnas

        //Rellenamos primera matriz de DNIS Y ALUMNOS
        a[0][0]="11111111A";
        a[0][1]="Antonio";
        a[1][0]="11111112B";
        a[1][1]="Fernando";
        a[2][0]="11111113C";
        a[2][1]="Samuel";
        a[3][0]="11111114D";
        a[3][1]="Gonzalo";
        a[4][0]="11111115E";
        a[4][1]="Angel";
        a[5][0]="11111116F";
        a[5][1]="Jorge";
        a[6][0]="11111117H";
        a[6][1]="Ismael";
        a[7][0]="11111118J";
        a[7][1]="Pablo";
        a[8][0]="11111119K";
        a[8][1]="Carlos";
        a[9][0]="11111110L";
        a[9][1]="Sara";




        for(int i=0; i<notas.length; i++) {//Generamos las notas al azar
            for(int j=0; j<notas[i].length;j++) {
                notas[i][j]= rd.nextInt(10)+1;
            }
        }

        System.out.println("Dime tu DNI:");
        dni=sc.nextLine();

        for(int i=0; i<a.length; i++) {

            if(dni.equalsIgnoreCase(a[i][0])) { //Comparamos el dni pasado por consola , a nuestra base de datos
                System.out.println("DNI del alumno "+ a[i][0]);
                System.out.println("Nombre: "+ a[i][1]);
                System.out.println("Notas:");
                System.out.print("Examen 1:" );
                System.out.println(notas[i][0]);
                System.out.print("Examen 2:" );
                System.out.println(notas[i][1]);
                System.out.print("Examen 3:" );
                System.out.println(notas[i][2]);
            }
        }


    }
}

/*
EJERCICIO BIEN REALIZADO CON FUNCIONES Y MAS COMPLETO
package arrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) {
		String [][] alumnos = new String[10][2];
		int [][] notas = new int[10][3];
		Scanner sc =new Scanner(System.in);
		String dni;

		rellenarAlumnos(alumnos);
		rellenarNotas(notas);

		System.out.println("Dime un DNI");
		dni=sc.nextLine();

		buscarImprimir(dni, alumnos, notas);
	}

	private static void buscarImprimir(String dni,String[][] a, int[][] n) {

		for(int i=0; i<a.length; i++) {

			if(dni.equalsIgnoreCase(a[i][0])) {
				System.out.println("DNI del alumno "+ a[i][0]);
				System.out.println("Nombre: "+ a[i][1]);
				System.out.println("Notas:");
				System.out.print("Examen 1:" );
				imprimeAsteriscos(n[i][0]);
				System.out.print("Examen 2:" );
				imprimeAsteriscos(n[i][1]);
				System.out.print("Examen 3:" );
				imprimeAsteriscos(n[i][2]);

			}
		}
	}

	private static void imprimeAsteriscos(int x) {
		for (int j=0; j<x;j++) {
			System.out.print("*");
		}
		System.out.printf(" %d", x);
		if(x<5) {
			System.out.print(" Suspenso.");
		}
		System.out.println();

	}

	private static void rellenarNotas(int[][] n) {
		Random rd = new Random();

		for(int i=0; i<n.length; i++) {
			for(int j=0; j<n[i].length;j++) {
				n[i][j]= rd.nextInt(11);
			}
		}

	}

	private static void rellenarAlumnos(String[][] a) {

		a[0][0]="11111111A";
		a[0][1]="Antonio";
		a[1][0]="11111112B";
		a[1][1]="Fernando";
		a[2][0]="11111113C";
		a[2][1]="Samuel";
		a[3][0]="11111114D";
		a[3][1]="Gonzalo";
		a[4][0]="11111115E";
		a[4][1]="Angel";
		a[5][0]="11111116F";
		a[5][1]="Jorge";
		a[6][0]="11111117H";
		a[6][1]="Ismael";
		a[7][0]="11111118J";
		a[7][1]="Pablo";
		a[8][0]="11111119K";
		a[8][1]="Carlos";
		a[9][0]="11111110L";
		a[9][1]="Sara";

	}

}
 */
