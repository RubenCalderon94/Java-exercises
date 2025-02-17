package Ej8;

import Ej7.Fresco;
import Ej7.Producto;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] opciones = {"Menú",
                "1. Modif. Tª congelación",
                "2. Productos X país",
                "3. Productos Caducados",
                "4. Productos del tipo...",
                "5. Salir",
                "Elige opción: "};

        ColeccionProductos c = new ColeccionProductos();
        Menu menu = new Menu(opciones);
        String opcion = "";
        do {
            opcion = menu.mostrarMenu();
            switch (opcion) {
                case "1":

                    for (Producto p : c.obtenerProductosDelTipo("Congelado")) {
                        System.out.println(p);
                    }
                    System.out.println("ID? ");
                    int  id = sc.nextInt();
                    System.out.println("T�? ");
                    double temp = sc.nextDouble();
                    boolean retorno = c.modificarTemperaturaCongelacion(String.valueOf(id), temp);
                    if (retorno)
                        System.out.println("T� modificada");
                    else
                        System.out.println("Producto no encontrado o no es congelado");
                    break;

                case "2":
                    System.out.println("Pais? ");
                    String pais = sc.next();
                    List<Fresco> a = c.consultarProductosPorPaisOrigen(pais);
                    System.out.println("Productos del pais: " + pais);
                    for (Fresco f : a) {
                        System.out.println(f);
                    }
                    break;

                case "3":
                    System.out.println("Productos caducados");
                    List<Producto> caducados = c.consultarProductosCaducados();
                    for (Producto p : caducados) {
                        System.out.println(p);
                    }
                    break;
                case "4":
                    System.out.println("Tipo producto? ");
                    String tipo = sc.next();
                    List<Producto> productosTipo = c.obtenerProductosDelTipo(tipo);
                    for (Producto p : productosTipo) {
                        System.out.println(p);
                    }
                    break;
                case "5":
                    System.out.println("Fin");
                    break;
                default:
                    System.out.println("Error en la opci�n");
            }
        } while (!opcion.equals("5"));

    }


}
