package Ej9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int num;
        // Crea una instancia de la clase GestionProgramas para gestionar la lista de programas
        GestionProgramas gp = new GestionProgramas();


        do {
            showMenu();
            System.out.println("Ingrese un numero del menú: ");
            num = sc.nextInt();
            switch (num) {
                // Casos según la opción del usuario
                case 1:
                    System.out.println("Dime el nombre del programa");
                    String nombre = sc.nextLine();
                    System.out.println("Dime la version del programa");
                    String version = sc.nextLine();
                    System.out.println("Dime la funcion del programa");
                    String funcion = sc.nextLine();
                    System.out.println("Dime el año de creacion del programa");
                    int anoCreacion = sc.nextInt();
                    System.out.println("Dime la empresa del programa");
                    String empresa = sc.nextLine();
                    System.out.println("Dime la licencia del programa");
                    String licencia = sc.nextLine();
                    System.out.println("Dime el precio del programa");
                    double precio = sc.nextDouble();
                    Programa miProg = new Programa(nombre, version, funcion, anoCreacion, empresa, licencia, precio);
                    gp.InsertPrograma(miProg);
                    /*
                    Programa miProg: Aquí se está declarando una variable llamada miProg de tipo Programa.
                    Esta variable va a almacenar una nueva instancia del objeto Programa.new Programa(...):
                    Se está creando un nuevo objeto de la clase Programa.
                    El operador new se utiliza para instanciar un objeto en Java, es decir,
                    para reservar espacio en memoria para este objeto.
                     */
                    break;

                case 2://mostrar lista de software
                    gp.mostrarProgramas();
                    break;

                case 3://filtrar por licencia
                    System.out.println("Dime la licencia");
                    String l = sc.nextLine();
                    gp.filtrarPorLicencia(l);

                    break;
                case 4://filtrar por funcion
                    System.out.println("Dime la funcion del programa");
                    String f = sc.nextLine();
                    gp.filtrarPorFuncion(f);
                    break;
                case 5: //eliminar ultimo elemento
                    gp.eliminarUltimoElemento();
                    break;
                case 6://Buscar programa por nombre y retornar programa
                    System.out.println("Dime el nombre de un programa");
                    String nom = sc.nextLine();
                    Programa p = gp.buscarProgramaPorNombre(nom);
                    if (p == null) {
                        System.out.println("No se ha encontrado el programa");
                    } else {
                        System.out.println(p);
                    }
                    break;
                case 7://salir
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        } while (!salir);


    }

    private static void showMenu() {
        System.out.println("""
                    1. Insertar nuevo programa (controlar elementos libres)
                    2. Mostrar lista de software
                    3. Filtrar por licencia
                    4. Filtrar por función
                    5. Eliminar el último elemento
                    6. Buscar programa por nombre y retornar programa
                    7. Salir
                """);
    }
}
