package PruebaExamen;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Trabajador implements Comparable<Trabajador>{

    //ATRIBUTOS
    protected int id;
    protected String nombre;
    protected LocalDate fechaNacimiento;


    //COSNTRUCTOR
    public Trabajador(int id, LocalDate fechaNacimiento, String nombre) {
        this.id = id;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
    }



    //GETTER Y SETTER
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    @Override
    public String toString() {
        return "Trabajador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }


    public abstract double calcularSalario();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trabajador that = (Trabajador) o;
        return id == that.id && Objects.equals(nombre, that.nombre) && Objects.equals(fechaNacimiento, that.fechaNacimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, fechaNacimiento);
    }


    @Override
    public int compareTo(Trabajador t) {
        return this.id - t.id;
    }
}
