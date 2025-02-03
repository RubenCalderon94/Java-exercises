package Ej11;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Aquí se está creando una nueva instancia de la clase GestionVehiculos y se almacena en la variable gv.
        GestionVehiculos gv = new GestionVehiculos();
        System.out.println("Precio medio de alquiler: " + gv.precioMedioAlquiler());
        // Este método de la clase GestionVehiculos calcula el precio medio de alquiler de todos los vehículos en la
        //  lista listaVehiculos
        System.out.println("Vehículos con consumo menor o igual a 50: ");
        ArrayList<Vehiculo> listFiltrada =gv.filtrarPorConsumo(50) ;
        // Este método filtra la lista de vehículos en base al consumo, devolviendo una nueva lista
        // listFiltrada que contiene solo aquellos vehículos cuyo consumo es menor o igual a 50.
        for (Vehiculo v : listFiltrada) {//AHORA RECORREMOS EL ARRAYLIST LISTAFILTRADA E IMPRIMIMOS
            System.out.println(v);
        }
        System.out.println("*****************************************************************");
        gv.mostrarTodos();//AQUI MOSTRAMOS TODOS SIN FILTRAR NI NADA
    }
}
