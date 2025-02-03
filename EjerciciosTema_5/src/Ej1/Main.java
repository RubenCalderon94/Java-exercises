package Ej1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Se crea un objeto cliente y vehiculo
        Cliente c1 = new Cliente("12345678A", "Juan", "García", "123456789");
        Vehiculo v1 = new Vehiculo("1234ABC", "Ford", "Focus", 50, true);

        VehiculoAlquilado vA1 = new VehiculoAlquilado(c1, v1, LocalDate.now(), 5);
        /*
        VehiculoAlquilado vA1 = new VehiculoAlquilado(c1, v1, LocalDate.now(), 5);

        VehiculoAlquilado: Se crea un objeto de tipo VehiculoAlquilado, que representa
        una instancia de un vehículo que ha sido alquilado por un cliente.
        Se pasan 4 parámetros al constructor de VehiculoAlquilado:
        Cliente c1: El cliente que ha alquilado el vehículo (Juan García).
        Vehiculo v1: El vehículo que ha sido alquilado (Ford Focus).
        LocalDate.now(): La fecha actual (es decir, el día en que se ha hecho el alquiler).
        5: El número de días que el cliente alquiló el vehículo.
        VehiculoAlquilado vA1: El objeto vA1 representa el alquiler de un vehículo (v1)
        por parte de un cliente (c1) durante 5 días, comenzando desde la fecha actual
          */
        System.out.println("Cliente: " + c1.getNombreCompleto());
        System.out.println("Vehículo: " + v1.getModelo());
        System.out.println("Fecha: " + vA1.getFecha());
        System.out.println("Días: " + vA1.getnDias());
        System.out.println("Importe total: " + vA1.getImporteTotal());
    }

}
