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
    private ArrayList<Producto> listaP = new ArrayList<>();

    public GestionProductos() {

        generarProductos();
    }

    private void generarProductos() {
        //double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
        Random rd = new Random();
        int codigo;
        String nombre;
        String tipo;
        double precio_venta;
        double precio_compra;
        int unidades;

        for(int i=0;i<100; i++) {
            codigo= i+1;
            nombre = "producto"+ (i+1);
            tipo = "tipo"+ (rd.nextInt(5-1)+1);
            precio_compra = 5 +(100 - 5)*rd.nextDouble();
            precio_venta= precio_compra +(100 - precio_compra)*rd.nextDouble();
            unidades =rd.nextInt(20-1)+1;

            listaP.add(new Producto(codigo, nombre, tipo, precio_venta, precio_compra, unidades));
        }
    }
    //productos con precio de venta mayor a un precio dado
    public void filtrarPrecioVenta(double precio) {

        for(Producto p: listaP) {
            if(p.getPrecioVenta() > precio) {
                System.out.println(p.toString());
            }
        }
    }
    //productos de un tipo dado
    public void filtrarPorTipo(String tipo) {

        for(Producto p: listaP) {
            if(p.getTipo().equals(tipo)) {
                System.out.println(p.toString());
            }
        }
    }
    //mostrar la diferencia entre el precio de venta y el precio de compra
    public void mostrarDiferencia() {

        for(Producto p: listaP) {
            System.out.println(p.getNombre()+","+
                    p.getPrecioCompra()+ ", diferencia: "+
                    (p.getPrecioCompra()-p.getPrecioCompra()));
        }
    }
    //mostrar el producto en una posicion dada
    public void mostrarProductoPosicion(int posicion) {

        System.out.println(listaP.get(posicion).toString());

    }
    //cambiar el producto en una posicion dada por otro producto
    public boolean cambiarPor(Producto p, int posicion) {

        System.out.println(listaP.size());
        listaP.add(posicion, p);
        System.out.println(listaP.size());

        return false;
    }
}
