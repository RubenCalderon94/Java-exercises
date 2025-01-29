package Ej7;

import Ej4.DvdCine;
import Ej4.Genero;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int num;
        ArrayList<DvdCine> miListaPelis = new ArrayList<>();
        GestionDvd pelis = new GestionDvd();

        do {
            showMenu();
            System.out.println("Ingrese un numero del menú: ");
            num = sc.nextInt();
            switch (num) {
                case 1://mostrar la lista
                    miListaPelis = pelis.mostrarLista();
                    for (DvdCine y : miListaPelis) {
                        System.out.println(y.getTitulo() + ", " + y.getProductora());
                    }
                    break;
                case 2://Mostrar la pelicula de más duración
                    System.out.println(pelis.pelisMasDuracion());
                    break;
                case 3://Pedir un género y mostrar título de las pelis
                    ArrayList<String> listaTitulos = new ArrayList<>();
                    System.out.println("Dime un género");
                    String genero = sc.nextLine().toUpperCase();
                    listaTitulos = pelis.mostrarTitulo(genero);
                    for (String t : listaTitulos) {
                        System.out.println(t);
                    }
                    break;
                case 4://pedir título y mostrar duracion
                    sc.nextLine();
                    System.out.println("Dime un título");
                    String titulo = sc.nextLine();
                    System.out.println(pelis.mostraDuracion(titulo));
                    break;
                case 5: //salir
                    salir = true;
                    break;
                case 6://insertar una peli nueva
                    ArrayList<String> actors1 = new ArrayList<String>();
                    actors1.add("Al Mario");
                    actors1.add("Ruben Blades");
                    DvdCine miPeli = new DvdCine("La bala que torcio la esquina", "No te veo", "LSD",
                            actors1, Genero.ACCION, "añlfjasñldkfj", 250);
                    pelis.insertPeli(miPeli);
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (!salir);

    }

    private static void showMenu() {
        System.out.println("""
                    1. Mostrar la lista de películas (Título y productora)
                    2. Mostrar la película de más duración (Título y minutos)
                    3. Pedir un género y mostrar el título de las pelis de ese género.
                    4. Duración de la peli. Pedir título y mostrar su duración.
                    5. Salir
                """);
    }
}

