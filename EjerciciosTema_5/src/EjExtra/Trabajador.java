package EjExtra;

import java.time.LocalDate;

public abstract class Trabajador implements Comparable<Trabajador> {

    //ATRIBUTOS
    private int id;
    private String nombre;
    private LocalDate fechaNacimiento;


    //CONSTRUCTOR
    public Trabajador(int id, String nombre, LocalDate fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
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
        return "Trabajadores{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }

    @Override
    public int compareTo(Trabajador t) {
        return this.nombre.compareTo(t.nombre);
    }

    public abstract double calculaSalario();
}
