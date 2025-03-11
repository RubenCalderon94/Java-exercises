package PruebaExamen;

import java.time.LocalDate;

public class Produccion extends Trabajador {

    //ATRIBUTOS
    private String puesto;
    private double salarioBase;

    //CONSTRUCTOR
    public Produccion(int id, LocalDate fechaNacimiento, String nombre, String puesto, double salarioBase) {
        super(id, fechaNacimiento, nombre);
        this.puesto = puesto;
        this.salarioBase = salarioBase;
    }


    //GETTER Y SETTER
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Produccion{" +
                "puesto='" + puesto + '\'' +
                ", salarioBase=" + salarioBase +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }

    @Override
    public double calcularSalario() {
        switch (puesto){
            case "operario":
                return salarioBase + 100;
            case "encargado":
                return salarioBase + 200;
            case "jefe":
                return salarioBase + 300;
        }
        return 0;
    }
}