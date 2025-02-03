package Ej13;

/*
Diseña también una clase llamada GestionProductos que tendrá un
array de 100 productos como atributo. Esta clase llevará los siguientes métodos:
a. Constructor. Llenará el array de productos con valores al azar.
b. filtrarPorPrecioVenta. Pasar un precio y mostrar todos productos con precio
superior al pasado.
c. filtrarPorTipo. Pasar un tipo de producto y mostrar los que coinciden con él.
d. mostrarDiferencia. Mostrar nombre de producto, precio de compra, precio de
venta y la diferencia entre ambos.
e. mostrarProductoPosicion. Recibe como parámetro una posición y muestra el
producto que está en esa posición del array.
f. cambiarPor. Este método recibe un producto y una posición y sustituirá en el
array el producto situado en la posición indicada por el producto pasado como
parámetro. Devuelve verdadero o falso, según se haya podido hacer el cambio
o no.

 */
import java.util.ArrayList;
import java.util.Random;

public class GestionProductos {
    //ATRIBUTOS
    // ATRIBUTOS
    private ArrayList<Producto> listaProductos; // Inicializamos el ArrayList
    Random rand = new Random();
    String[] tipos = {"Pintura", "Herramienta", "Recambio", "Cinta"};

    // Constructor: Llenar el ArrayList de productos con valores aleatorios
    public GestionProductos() {
        listaProductos = new ArrayList<Producto>();  // Inicializamos el ArrayList
        for (int i = 0; i < 100; i++) {
            String codigo = "P" + (i + 1);
            String nombre = "Producto " + (i + 1);
            String tipo = tipos[rand.nextInt(tipos.length)];
            double precioVenta = 10 + rand.nextDouble() * 100;  // Precio entre 10 y 110
            double precioCompra = precioVenta - (rand.nextDouble() * 10); // Precio compra inferior al de venta
            int unidadesDisponibles = rand.nextInt(100) + 1;  // Entre 1 y 100 unidades

            listaProductos.add(new Producto(codigo, nombre, tipo, precioVenta, precioCompra, unidadesDisponibles));
        }
    }

    // Métodos
    // b. filtrarPorPrecioVenta. Pasar un precio y mostrar todos los productos con precio superior al pasado
    public void filtrarPorPrecioVenta(double precio) {
        System.out.println("Productos con precio de venta superior a " + precio + ":");
        for (Producto p: listaProductos) {
            if (p.getPrecioVenta() > precio) {
                System.out.println(p);
            }
        }
    }

    // c. filtrarPorTipo. Pasar un tipo de producto y mostrar los que coinciden con él
    public void filtrarPorTipo(String tipo) {
        System.out.println("Productos de tipo " + tipo + ":");
        for (Producto p : listaProductos) {
            if (p.getTipo().equalsIgnoreCase(tipo)) {
                System.out.println(p);
            }
        }
    }

    // d. mostrarDiferencia. Mostrar nombre de producto, precio de compra, precio de venta y la diferencia
    public void mostrarDiferencia() {
        for (Producto p : listaProductos) {
            System.out.println("Nombre: " + p.getNombre() +
                    ", Precio de compra: " + p.getPrecioCompra() +
                    ", Precio de venta: " + p.getPrecioVenta() +
                    ", Diferencia: " + (p.getPrecioVenta() - p.getPrecioCompra()));
        }
    }

    // e. mostrarProductoPosicion. Recibe como parámetro una posición y muestra el producto que está en esa posición
    public void mostrarProductoPosicion(int posicion) {
        if (posicion >= 0 && posicion < listaProductos.size()) {
            System.out.println("Producto en la posición " + posicion + ": " + listaProductos.get(posicion));
        } else {
            System.out.println("Posición inválida.");
        }
    }

    // f. cambiarPor. Este método recibe un producto y una posición y sustituirá en el array el
    //  producto situado en la posición indicada por el producto pasado como parámetro
    public boolean cambiarPor(Producto nuevoProducto, int posicion) {
        if (posicion >= 0 && posicion < listaProductos.size()) {
            listaProductos.set(posicion, nuevoProducto);  // Usamos set() para reemplazar el producto
            return true;
        }
        return false;


    }
}
