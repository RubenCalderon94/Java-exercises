package EjerciciosProfundizacion.EjerciciosProfundizacion;

/* Crea una aplicación que pida al usuario una palabra secreta y, a continuación,
tendrá tres oportunidades de adivinarla.*/

import java.util.Scanner;

public class Ejercicio3examen {
    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);

        // Establecer la palabra secreta
        System.out.print("Establece la palabra secreta: ");
        String palabraSecreta = sc.nextLine();

        System.out.println("\nAhora tienes tres intentos para adivinar la palabra secreta.");

        boolean adivinada = false; // Bandera para verificar si fue adivinada
        int intentos = 3;

        for (int i = 1; i <= intentos; i++) {
            System.out.print("Intento " + i + ": ");
            String intento = sc.nextLine();

            if (intento.equals(palabraSecreta)) {
                System.out.println("¡Felicidades! Has adivinado la palabra secreta.");
                adivinada = true;
                break;
            } else {
                System.out.println("Palabra incorrecta.");
            }
        }

        if (!adivinada) {
            System.out.println("Lo siento, has agotado los tres intentos. La palabra secreta era: " + palabraSecreta);
        }

        //OTRA FORMA
        /* Crea una aplicación que pida al usuario una palabra secreta y, a continuación,
tendrá tres oportunidades de adivinarla. Si no se adivina dar la opcion de repetir de nuevo*/

        //import java.util.Scanner;
        //
        //public class AdivinaPalabra {
        //    public static void main(String[] args) {
        //        Scanner scanner = new Scanner(System.in);
        //        boolean seguirIntentando = true; // Variable para controlar si el usuario quiere repetir
        //
        //        while (seguirIntentando) {
        //            // Establecer la palabra secreta
        //            System.out.print("Establece la palabra secreta: ");
        //            String palabraSecreta = scanner.nextLine();
        //
        //            System.out.println("\nAhora tienes tres intentos para adivinar la palabra secreta.");
        //
        //            boolean adivinada = false; // Bandera para verificar si fue adivinada
        //            int intentos = 3;
        //
        //            for (int i = 1; i <= intentos; i++) {
        //                System.out.print("Intento " + i + ": ");
        //                String intento = scanner.nextLine();
        //
        //                if (intento.equals(palabraSecreta)) {
        //                    System.out.println("¡Felicidades! Has adivinado la palabra secreta.");
        //                    adivinada = true;
        //                    break;
        //                } else {
        //                    System.out.println("Palabra incorrecta.");
        //                }
        //            }
        //
        //            if (!adivinada) {
        //                System.out.println("Lo siento, has agotado los tres intentos. La palabra secreta era: " + palabraSecreta);
        //            }
        //
        //            // Preguntar si quiere intentar nuevamente
        //            System.out.print("\n¿Quieres intentarlo de nuevo? (s/n): ");
        //            String respuesta = scanner.nextLine();
        //
        //            if (respuesta.equalsIgnoreCase("n")) {
        //                seguirIntentando = false;
        //                System.out.println("Gracias por jugar. ¡Hasta luego!");
        //            } else {
        //                System.out.println("Vamos a intentarlo de nuevo.");
        //            }
        //        }
        //
        //        scanner.close();
        //    }
        //}

    }
}

