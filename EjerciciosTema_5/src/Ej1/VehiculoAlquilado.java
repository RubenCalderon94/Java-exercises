package Ej1;
/*
Composición de clases. A partir de las clases Vehiculo y Cliente debemos construir la
clase VehiculoAlquilado.
Vehiculo tiene los atributos matrícula, marca, modelo, tarifa y disponible. Todos String
salvo tarifa que es double y disponible boolean. Métodos: constructor, getters y
setters.
Cliente tiene los atributos DNI, nombre, apellidos y teléfono, todos String. Métodos:
constructor, getters, setters y al menos getNombreCompleto.
La clase VehiculoAlquilado tiene como atributos un vehículo, un cliente, la fecha de
alquiler (LocalDate) y el número de días de alquiler. Métodos: constructor,
getters/setters y getImporteTotal (numero de días de alquiler por tarifa)
 */

import java.time.LocalDate;

public class VehiculoAlquilado {

    //ATRIBUTOS
    private Vehiculo vehiculo;
    private Cliente cliente;
    private LocalDate fecha;
    private int nDias;

    //CONSTRUCTOR

    public VehiculoAlquilado(Cliente cliente, Vehiculo vehiculo, LocalDate fecha, int nDias) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fecha = fecha;
        this.nDias = nDias;
    }

    //GETTER Y SETTER

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getnDias() {
        return nDias;
    }

    public void setnDias(int nDias) {
        this.nDias = nDias;
    }

    public double getImporteTotal() {
        return vehiculo.getTarifa() * nDias;
    }
}
