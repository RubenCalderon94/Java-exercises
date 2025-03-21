package examen;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Servicios implements Comparable<Servicios> {

    //ATRIBUTOS
    private int id;
    private Empleado empleado;
    private LocalDate fechaInicio;
    private String cliente;


    //CONSTRUCTOR
    public Servicios(int id, Empleado empleado, LocalDate fechaInicio, String cliente) {
        this.id = id;
        this.empleado = empleado;
        this.fechaInicio = fechaInicio;
        this.cliente = cliente;
    }


    //GETTER Y SETTER
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public abstract double costeMaterial();

    public abstract double costeManoObra();

    public abstract double costeTotal();

    public abstract String detalleServicio();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Servicios servicios = (Servicios) o;
        return id == servicios.id && Objects.equals(empleado, servicios.empleado) && Objects.equals(fechaInicio, servicios.fechaInicio) && Objects.equals(cliente, servicios.cliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, empleado, fechaInicio, cliente);
    }

    @Override
    public int compareTo(Servicios o) {
        return fechaInicio.compareTo(o.fechaInicio);
    }
}
