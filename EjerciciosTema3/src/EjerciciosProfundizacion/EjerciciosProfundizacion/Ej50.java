package EjerciciosProfundizacion.EjerciciosProfundizacion;

/*0. Diseña un programa Java que muestre un menú con las siguientes opciones y
programa cada una de ellas. El menú se repetirá hasta pulsar salir.
a. Código ASCII del carácter...
b. Carácter asociado al código ASCII…
c. Listado de minúsculas
d. Listado de mayúsculas*/

import java.util.Scanner;

public class Ej50 {
    public static void main(String[] args) {

        char opcion, caracter;
        int codigoAscii;
        boolean salir = false;

        Scanner sc = new Scanner(System.in);


        do{

            System.out.println ("***MENU***\n" +
                    "a. Código ASCII del carácter\n" +
                    "b. Carácter asociado al código ASCII\n" +
                    "c. Listado de minúsculas\n" +
                    "d. Listado de mayúsculas\n" +
                    "e. Salir\n");

            System.out.println("Seleccione una de las opciones del menu:");
            opcion = sc.next().toLowerCase().charAt(0);


            switch (opcion) {
                case 'a':
                    System.out.print("Ingresa un carácter: ");
                    caracter = sc.next().charAt(0);  // Lee el primer carácter ingresado

                    codigoAscii = (int) caracter;  // Convierte el carácter a su código ASCII
                    System.out.println("El código ASCII del carácter '" + caracter + "' es: " + codigoAscii);
                    break;
                case 'b':
                    System.out.print("Ingresa un código ASCII (número entre 0 y 127): ");
                    codigoAscii = sc.nextInt();

                    // Verificar que el código ASCII esté en el rango válido
                    if (codigoAscii >= 0 && codigoAscii <= 127) {
                        caracter = (char) codigoAscii;  // Convierte el código ASCII al carácter correspondiente
                        System.out.println("El carácter asociado al código ASCII " + codigoAscii + " es: '" + caracter + "'");
                    } else {
                        System.out.println("Código ASCII no válido. Debe ser un número entre 0 y 127.");
                    }
                    break;

                case 'c':
                    for(char i='a'; i<='z'; i++){
                        System.out.print(i+",");
                    }
                    System.out.println();
                    break;

                case 'd':
                    for(char i='A'; i<='Z'; i++){
                        System.out.print(i+",");
                    }
                    System.out.println();
                    break;

                case 'e':
                    System.out.println("Programa finalizado");
                    salir=true;
                    break;

                default:
                    System.out.println("Error en la entrada de datos");
                    break;
            }

        }while(!salir);

    }
}
