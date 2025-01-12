package EXAMEN_2;

/*
MENU Y OPCIONES
 */

import java.util.Random;
import java.util.Scanner;

public class EJERCICIO1 {
    static Scanner sc = new Scanner(System.in);//DECLARADO GLOBAL
    static Random rd = new Random();//DECLARDO GLOBAL
    static int[][] m;//DECLARAMOS UNA MATRIZ, PARA RELLENAR POR EL USUARIO
    static int maximo = Integer.MIN_VALUE; //DECLARADO GLOBAL VARIABLE MAXIMO
    static int minimo = Integer.MAX_VALUE; //DECLARADO GLOBAL VARIABLE MINIMO
    static boolean opciones = false;
    public static void main(String[] args) {

        int opcion;

        do {
            mostrarMenu();
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:

                    generarMatriz();
                    opciones = true;
                    break;

                case 2:
                    if (!opciones) {
                        System.out.println("Primero debes generar la matriz (opción 1).");
                    } else {
                        contarImpares();
                    }
                    break;

                case 3:
                    if (!opciones) {
                        System.out.println("Primero debes generar la matriz (opción 1).");
                    } else {
                        calcularMaximoMinimo();
                    }
                    break;

                case 4:
                    if (!opciones) {
                        System.out.println("Primero debes generar la matriz (opción 1).");
                    } else {
                        diagonalEnCero();
                    }
                    break;

                case 5:
                    if (!opciones) {
                        System.out.println("Primero debes generar la matriz (opción 1).");
                    } else {
                        buscarValor();
                    }
                    break;

                case 6:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del menú.");
            }
        } while (opcion != 6);


    }

    public static void mostrarMenu() {
        System.out.println("""
                ***MENU****\s
                1 Generar\s
                2 Calcular número de impares\s
                3 Calcular máximo y mínimo\s
                4 Diagonal en cero\s
                5 Busca\s
                6 Salir\s""");

    }


    public static void generarMatriz() {
        int filas, columnas;
        System.out.print("Introduce el número de filas: ");
        filas = sc.nextInt();
        System.out.print("Introduce el número de columnas: ");
        columnas = sc.nextInt();

        m = new int[filas][columnas];//MATRIZ GENERADA POR EL USUARIO

        System.out.println("Matriz generada:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                m[i][j] = rd.nextInt(100) + 1; // Valores entre 1 y 100
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void contarImpares() {
        int count = 0;
        int suma = 0;//ACUMULADOR
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] % 2 != 0) {
                    count++;
                    suma += m[i][j];
                }
            }
        }
        System.out.println("Los impares encontrados son: " + count + " y la suma de todos ellos es: " + suma);
    }

    public static void calcularMaximoMinimo() {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] > maximo) {
                    maximo = m[i][j];
                }
                if (m[i][j] < minimo) {
                    minimo = m[i][j];
                }
            }
        }

        System.out.println("Máximo: " + maximo + ", Mínimo: " + minimo);
    }

    public static void diagonalEnCero() {
        if (m.length != m[0].length) {
            System.out.println("La matriz debe de ser cuadrada para realizar el cambio de la diagonal principal a 0");
            return;
        }

        for (int i = 0; i < m.length; i++) {//RECORREMOS Y PONEMOS A 0
            m[i][i] = 0;
        }

        System.out.println("Matriz con diagonal en cero:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
        /*//segunda diagonal
        for (int i = 0; i < m.length; i++) {
            m[i][m.length - 1 - i] = 0; //SEGUNDA DIAGONAL ACESSO
        }

        System.out.println("Matriz con la segunda diagonal en cero:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
        */

    }

    public static void buscarValor() {
        System.out.print("Introduce el valor a buscar: ");
        int valor = sc.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == valor) {
                    encontrado = true;
                    System.out.println("Encontrado en: Fila " + i+ ", Columna " + j);
                }
            }
        }

        if (!encontrado) {
            System.out.println("El valor no se encuentra en la matriz.");
        }
    }




}
