package EXAMEN_2;

import java.util.Random;
import java.util.Scanner;

public class prueba {
    static Scanner sc = new Scanner(System.in);//DECLARADO GLOBAL
    static Random rd = new Random();//DECLARDO GLOBAL
    static int[][] m;//DECLARAMOS UNA MATRIZ, PARA RELLENAR POR EL USUARIO
    static int maximo = Integer.MIN_VALUE; //DECLARADO GLOBAL VARIABLE MAXIMO
    static int minimo = Integer.MAX_VALUE;//DECLARADO GLOBAL VARIABLE MINIMO
    static boolean opciones = false;
    static String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
            "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};//DECLARADO GLOBAL

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
                        calcularMaximoMinimoMedia();
                    }
                    break;

                case 4:
                    if (!opciones) {
                        System.out.println("Primero debes generar la matriz (opción 1).");
                    } else {
                        buscarNumeroAcabado();
                    }
                    break;

                case 5:
                    if (!opciones) {
                        System.out.println("Primero debes generar la matriz (opción 1).");
                    } else {
                        int nvocales, maxletras = 0, posicion = 0;
                        for (int i = 0; i < meses.length; i++) {
                            nvocales = vocales(meses[i]);
                            if (nvocales > maxletras) {
                                maxletras = nvocales;
                                posicion = i;
                            }
                        }
                        System.out.println("La palabra " + meses[posicion] +
                                " tiene " + maxletras + " vocales");
                    }
                    break;

                case 6:
                    if (!opciones) {
                        System.out.println("Primero debes generar la matriz (opción 1).");
                    } else {
                        //buscaLetraFinal();
                    }
                    break;

                case 7:
                    if (!opciones) {
                        System.out.println("Primero debes generar la matriz (opción 1).");
                    } else {
                        filaMayor();
                    }
                    break;

                case 8:
                    if (!opciones) {
                        System.out.println("Primero debes generar la matriz (opción 1).");
                    } else {
                        //columnaMayor();
                    }
                    break;

                case 9:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del menú.");
            }
        } while (opcion != 9);


    }

    public static void mostrarMenu() {
        System.out.println("""
                ***MENU****\s
                1 Crear una matriz\s
                2 Calcular suma de impares\s
                3 Calcular máximo, mínimo y media\s
                4 Busca número acabado\s
                5 Operaciones array de strings\s
                6 Busca letra final\s
                7 Fila mayor\s
                8 Columna mayor\s
                9 Salir""");

    }


    public static void generarMatriz() {
        int filas, columnas;
        System.out.print("Introduce el número de filas: ");
        filas = sc.nextInt();
        System.out.print("Introduce el número de columnas: ");
        columnas = sc.nextInt();

        m = new int[filas][columnas];//MATRIZ GENERADA POR EL USUARIO

        System.out.println("Matriz generada:");
        for (int i = 0; i < filas; i++) {//FILAS
            for (int j = 0; j < columnas; j++) {//COLUMNAS
                m[i][j] = rd.nextInt(100) + 1; // VALORES DE 1 AL 100
                m[i][i] = 0; // NOS PONE LA DIAGONAL PRINCIPAL CON 0
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

    public static void calcularMaximoMinimoMedia() {

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


    public static void buscarNumeroAcabado() {

        System.out.print("Introduce el valor a buscar entre 0 y 9 ");
        int valor = sc.nextInt();
        boolean encontrado = false;

        if (valor > 0 && valor < 9) {
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    if (m[i][j] == valor) {
                        encontrado = true;
                        System.out.println("Encontrado en: Fila " + i + ", Columna " + j);
                    }

                }
            }
            if (!encontrado) {
                System.out.println("El valor no se encuentra en la matriz.");
            }

        } else {
            System.out.println("El valor esta fuera del rango del 0 al 9");
        }


    }

    public static int vocales(String palabra) {


        int count = 0;
        for (int j = 0; j < palabra.length(); j++) {
            if (palabra.charAt(j) == 'a' || palabra.charAt(j) == 'e'
                    || palabra.charAt(j) == 'i' || palabra.charAt(j) == 'o'
                    || palabra.charAt(j) == 'u') {

                count++;
            }
        }
        return count;

    }

    public static void filaMayor() {
        int acumulador = 0, filaMayor = 0;
        for (int i = 0; i < m.length; i++) {//FILAS
            for (int j = 0; j < m[i].length; j++) {//COLUMNAS
                System.out.print("\t" + m[i][j]);
                acumulador += m[i][j];//SUMA CADA LINEA

            }
            if (acumulador > filaMayor) {
                filaMayor = acumulador;

            }
            System.out.println(" \t Suma de la fila es " + acumulador);
            acumulador = 0;//HAY QUE PONERLO DE CERO PORQUE AL SALTAR DE LINEA SIGUE SUMANDO TODO EN GENERAL,
            //DEBE SUMAR DE LINEA EN LINEA

        }
        System.out.println("La suma mayor de todas las filas es: " + filaMayor);

    }


}