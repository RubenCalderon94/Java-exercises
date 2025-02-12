package Ej6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Instanciamos una lista vehiculos (CREAMOS LA LISTA)
        List<Vehiculos> listaVehiculos = new ArrayList<>();

        //AÑADIMOS A LA LISTA 10 VEHICULOS (TURISMOS Y FURGONETAS)
        listaVehiculos.add(new Turismo("123ABC", "Toyota", "Corolla", 50.0, true, 4, true));
        listaVehiculos.add(new Furgoneta("456DEF", "Ford", "Transit", 80.0, false, 2000, 1000));
        listaVehiculos.add(new Turismo("789GHI", "Honda", "Civic", 60.0, true, 4, false));
        listaVehiculos.add(null);  // Vacío
        listaVehiculos.add(new Furgoneta("321JKL", "Mercedes", "Sprinter", 100.0, true, 3000, 1500));
        listaVehiculos.add(new Turismo("654MNO", "BMW", "X1", 70.0, false, 5, true));
        listaVehiculos.add(null);  // Vacío
        listaVehiculos.add(new Turismo("987PQR", "Audi", "A3", 65.0, true, 4, true));
        listaVehiculos.add(new Furgoneta("135STU", "Volkswagen", "Crafter", 90.0, true, 2500, 1200));
        listaVehiculos.add(null); // vacio


        for (Vehiculos v : listaVehiculos) {
            if (v != null) {
                // Verificar el tipo de objeto con instanceof
                //INSTANCEOFinstanceof se usa para verificar si el objeto es una instancia de una clase particular
                //(en este caso, si el vehículo es de tipo Turismo o Furgoneta).
                if (v instanceof Turismo) {
                    System.out.println("Es un Turismo: " + v.toString());  // Llamamos a toString() de Turismo
                } else if (v instanceof Furgoneta) {
                    System.out.println("Es una Furgoneta: " + v.toString());  // Llamamos a toString() de Furgoneta
                }
            } else {
                System.out.println("Vehiculo vacío (null)");
            }
        }


    }
}
