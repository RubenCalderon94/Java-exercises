package Ej11;

/*
Diseña una segunda clase llamada GestionVehiculos, que tendrá un array de
100 vehículos como atributo. El constructor de esta clase llenará el array con
datos de 100 vehículos. Esta clase tendrá los métodos filtrarPorConsumo,
que recibe un parámetro double relativo al consumo y devolverá una lista de
los vehículos con un consumo igual o inferior al pasado. Diseña también dentro
de esta clase el método mostrarTodos, que imprimirá en pantalla datos de
todos los vehículos. Por último, diseña el método precioMedioAlquiler que
devolverá un double con este dato.

 */

import java.util.ArrayList;

public class GestionVehiculos {
    //COMO ATRIBUTO UN ARRAY
    private ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();

    //CONSTRUCTOR
    public GestionVehiculos() { //RELLENAREMOS EL ARRAYLIST DE 100 VEHICULOS
        String matricula;
        String marca;
        String modelo;
        int potencia = 100;
        double consumo = 5.0;
        double precio = 50.0;
        for (int i = 0; i < 100; i++) {
            matricula = "000AAA" + i;
            marca = "marca" + i;
            modelo = "modelo" + i;
            potencia = potencia + i;
            consumo = consumo + i;
            precio = precio + i;
            //AQUI IREMOS AÑADIENDO LOS VEHICULOS AL ARRAYLIST
            listaVehiculos.add(new Vehiculo(matricula, marca, modelo, potencia, consumo, precio));

        }
    }

    //METODOS
    public ArrayList<Vehiculo> filtrarPorConsumo(double c) {
        ArrayList<Vehiculo> listaFiltrada = new ArrayList<Vehiculo>();

        for (Vehiculo v : listaVehiculos) {
            if (v.getConsumo() <= c) {
                listaFiltrada.add(v);
            }
        }
        return listaFiltrada;
    }


    public void mostrarTodos() {
        for (Vehiculo v : listaVehiculos) {
            System.out.println(v);
        }
    }

    public double precioMedioAlquiler() {
        double precio = 0;
        for (Vehiculo v : listaVehiculos) {
            precio += v.getPrecio();
        }
        return precio / listaVehiculos.size();
        // listaVehiculos.size() devuelve la cantidad total de vehículos en la lista.
    }

}
