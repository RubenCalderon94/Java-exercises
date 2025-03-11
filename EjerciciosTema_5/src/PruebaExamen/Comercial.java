package PruebaExamen;

import java.time.LocalDate;

public class Comercial extends Trabajador implements Iventas {

    //ATRIBUTOS
    private double Kilometros;
    private double salarioBase;


    //CONSTRUCTOR
    public Comercial(int id, LocalDate fechaNacimiento, String nombre, double kilometros, double salarioBase) {
        super(id, fechaNacimiento, nombre);
        Kilometros = kilometros;
        this.salarioBase = salarioBase;
    }


    //GETTER Y SETTER
    public double getKilometros() {
        return Kilometros;
    }

    public void setKilometros(double kilometros) {
        Kilometros = kilometros;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }


    @Override
    public String toString() {
        return "Comercial{" +
                "Kilometros=" + Kilometros +
                ", salarioBase=" + salarioBase +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }


    @Override
    public double calcularSalario() {
        return salarioBase + 0.5 * Kilometros;
    }


    @Override
    public double ventasRealizadas() {
        return 1000;
    }
}


