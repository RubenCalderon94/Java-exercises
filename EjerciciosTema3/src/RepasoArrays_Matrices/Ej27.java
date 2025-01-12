package RepasoArrays_Matrices;

/*
. Diseña un programa Java que guarde DNI y nombre de 10 alumnos y sus notas en
tres exámenes (datos enteros). El programa solicitará un DNI al usuario y mostrará:
DNI del alumno: 8.888.099-X
Nombre: Luis Arrimada Vivas
Notas:
Examen 1: ***** 5
Examen 2: **** 4 Suspenso.
Examen 3: *** 3 Suspenso
 */


import java.util.Random;
import java.util.Scanner;

public class Ej27 {
    static Scanner sc =new Scanner(System.in);//SCANNER DECLARADO GLOBAL
    static Random rd = new Random();//RAMDON DECLARADO GLOBAL
    public static void main(String[] args) {
        String [][] alumnos = new String[10][2];
        int [][] notas = new int[10][3];

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


        for(int i=0; i<n.length; i++) {
            for(int j=0; j<n[i].length;j++) {
                n[i][j]= rd.nextInt(10)+1;
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
