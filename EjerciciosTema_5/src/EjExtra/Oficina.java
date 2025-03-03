package EjExtra;

import java.time.LocalDate;

public class Oficina extends Trabajador {

    //ATRIBUTOS
    private String tipoJornada;
    private double sueldoBase;

    //CONSTRUCTOR
    public Oficina(int id, String nombre, LocalDate fechaNacimiento, String tipoJornada, double sueldoBase) {
        super(id, nombre, fechaNacimiento);
        this.tipoJornada = tipoJornada;
        this.sueldoBase = sueldoBase;
    }

    //GETTER Y SETTER
    public String getTipoJornada() {
        return tipoJornada;
    }

    public void setTipoJornada(String tipoJornada) {
        this.tipoJornada = tipoJornada;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    @Override
    public String toString() {
        return "Oficina{" + super.toString() +
                "tipoJornada='" + tipoJornada + '\'' +
                ", sueldoBase=" + sueldoBase +
                '}';
    }

    @Override
    public double calculaSalario() {
        return sueldoBase;
    }


}
