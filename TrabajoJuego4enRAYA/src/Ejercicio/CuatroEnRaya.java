package Ejercicio;

import java.util.Scanner;
import java.util.Random;

public class CuatroEnRaya {

        public static Scanner sc = new Scanner(System.in);
        public static Random rd = new Random();
        public static char[][] tablero = new char[6][7]; // Tablero de 6 filas y 7 columnas
        public static char campoVacio = '-'; // Representa una casilla vacía
        public static char jugador1 = 'X'; // Ficha del jugador 1
        public static char jugador2 = 'O'; // Ficha del jugador 2 (máquina)

        public static void main(String[] args) {
            boolean salir = false;
            int menu, ficha, turno;
            while (!salir) {
                boolean finJuego = false;
                turno = 1;
                menu();
                menu = sc.nextInt();
                switch (menu) {
                    case 1:
                        iniciarTablero();
                        mostrarTablero();
                        while (!finJuego) {
                            if (turno % 2 != 0) {
                                System.out.println("Turno jugador 1 (X), introduce el número de la columna donde quieres poner la ficha");
                                ficha = sc.nextInt() - 1;
                                while (ficha < 0 || ficha > 6 || !casillaValida(ficha)) {
                                    System.out.println("Casilla ocupada o inválida. Intenta de nuevo.");
                                    ficha = sc.nextInt() - 1;
                                }
                                colocarFicha(ficha, turno);
                            } else {
                                System.out.println("Turno jugador 2 (O), la máquina está pensando...");
                                ficha = obtenerJugadaMaquina();
                                colocarFicha(ficha, turno);
                            }

                            mostrarTablero();

                            if (comprobarGanador()) {
                                if (turno % 2 != 0) {
                                    System.out.println("¡Jugador 1 ha ganado!");
                                } else {
                                    System.out.println("¡Jugador 2 (la máquina) ha ganado!");
                                }
                                finJuego = true;
                            } else if (tableroLleno()) {
                                System.out.println("¡Es un empate!");
                                finJuego = true;
                            }

                            turno++;
                        }
                        break;
                    case 2:
                        intrucciones();
                        break;
                    case 3:
                        System.out.println("Hasta la próxima, espero que hayas disfrutado la partida");
                        salir = true;
                        break;
                    default:
                        System.out.println("Introduce un valor correcto del menú");
                }
            }
        }

        public static void menu() {
            System.out.println("""
                Menú 4 en raya.
                1. Jugar
                2. Instrucciones
                3. Salir
                """);
        }

        public static void intrucciones() {
            System.out.println("""
                Instrucciones 4 en raya
                Las normas del cuatro en raya son muy sencillas. Se juega siempre entre 2 jugadores y sobre un tablero de 7x6 casillas. 
                En cada turno, cada jugador coloca una ficha de su color en una columna y esta cae hasta la primera casilla disponible. 
                El que consigue ubicar 4 fichas del mismo color seguidas en horizontal, vertical u oblicuo gana. 
                Si nadie lo consigue la partida termina en empate.
                """);
        }

        public static void iniciarTablero() {
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    tablero[i][j] = campoVacio;
                }
            }
        }

        public static void mostrarTablero() {
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    System.out.print(tablero[i][j] + "\t");
                }
                System.out.println();
            }
        }

        public static boolean casillaValida(int ficha) {
            return tablero[0][ficha] == campoVacio;
        }

        public static void colocarFicha(int columna, int turno) {
            char ficha;
            if (turno % 2 != 0) {
                ficha = jugador1;
            } else {
                ficha = jugador2;
            }
            for (int i = 5; i >= 0; i--) {
                if (tablero[i][columna] == campoVacio) {
                    tablero[i][columna] = ficha;
                    break;
                }
            }
        }

        public static boolean comprobarGanador() {
            // Verificación de filas, columnas y diagonales
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 4; j++) {
                    if (tablero[i][j] != campoVacio && tablero[i][j] == tablero[i][j + 1] && tablero[i][j] == tablero[i][j + 2] && tablero[i][j] == tablero[i][j + 3]) {
                        return true;
                    }
                }
            }

            for (int j = 0; j < 7; j++) {
                for (int i = 0; i < 3; i++) {
                    if (tablero[i][j] != campoVacio && tablero[i][j] == tablero[i + 1][j] && tablero[i][j] == tablero[i + 2][j] && tablero[i][j] == tablero[i + 3][j]) {
                        return true;
                    }
                }
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    if (tablero[i][j] != campoVacio && tablero[i][j] == tablero[i + 1][j + 1] && tablero[i][j] == tablero[i + 2][j + 2] && tablero[i][j] == tablero[i + 3][j + 3]) {
                        return true;
                    }
                }
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 3; j < 7; j++) {
                    if (tablero[i][j] != campoVacio && tablero[i][j] == tablero[i + 1][j - 1] && tablero[i][j] == tablero[i + 2][j - 2] && tablero[i][j] == tablero[i + 3][j - 3]) {
                        return true;
                    }
                }
            }

            return false;
        }

        public static boolean tableroLleno() {
            for (int i = 0; i < tablero[0].length; i++) {
                if (tablero[0][i] == campoVacio) {
                    return false;
                }
            }
            return true;
        }

        // Método mejorado para que la máquina elija su jugada
        public static int obtenerJugadaMaquina() {
            int mejorColumna = -1;
            int puntuacionMaxima = Integer.MIN_VALUE;

            // Evaluamos todas las columnas posibles
            for (int col = 0; col < 7; col++) {
                if (casillaValida(col)) {
                    // Probar la jugada
                    colocarFicha(col, 2); // Jugada de la máquina

                    int puntuacion = evaluarJugada(jugador2);

                    // Deshacer la jugada
                    deshacerJugada(col);

                    if (puntuacion > puntuacionMaxima) {
                        puntuacionMaxima = puntuacion;
                        mejorColumna = col;
                    }
                }
            }

            return mejorColumna;
        }

        // Método para evaluar la jugada de la máquina
        public static int evaluarJugada(char jugador) {
            // Evaluamos el tablero y asignamos una puntuación basada en la probabilidad de ganar o bloquear
            // A mayor puntuación, mejor jugada
            // Ejemplo simple: Si la jugada lleva a la victoria, puntuamos muy alto

            if (comprobarGanador()) {
                return 100; // Si la máquina gana, puntuación alta
            }

            // Puedes agregar más reglas para evaluar las jugadas
            return 0; // Puntuación neutra si no hay una victoria directa
        }

        // Método para deshacer una jugada
        public static void deshacerJugada(int columna) {
            for (int i = 0; i < 6; i++) {
                if (tablero[i][columna] != campoVacio) {
                    tablero[i][columna] = campoVacio;
                    break;
                }
            }
        }
    }
