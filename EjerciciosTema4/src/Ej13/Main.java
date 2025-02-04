package Ej13;

/*
En el main crea un objeto de la clase GestionProductos y prueba sus métodos.
 */
public class Main {
    public static void main(String[] args) {

        //CREAMOS UNA INSTANCIA, ENTONCES CREAREMOS UN OBJETO
        GestionProductos g = new GestionProductos();

        g.filtrarPrecioVenta(50.0);
        g.filtrarPorTipo("Herramienta");
        g.mostrarDiferencia();
        g.mostrarProductoPosicion(10);
        g.toString();




    }
}
