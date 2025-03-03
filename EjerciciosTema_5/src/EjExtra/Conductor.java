package EjExtra;

import java.time.LocalDate;

public class Conductor extends Trabajador{

    //ATRIBUTOS
    private String tipoCarnet;
    private LocalDate caducidadCarnet;
    private double sueldoBase;
    private double Kilometros;


    //CONSTRUCTOR
    public Conductor(int id, String nombre, LocalDate fechaNacimiento, String tipoCarnet, double kilometros, double sueldoBase, LocalDate caducidadCarnet) {
        super(id, nombre, fechaNacimiento);
        this.tipoCarnet = tipoCarnet;
        this.Kilometros = kilometros;
        this.sueldoBase = sueldoBase;
        this.caducidadCarnet = caducidadCarnet;
    }

    //GETTER Y SETTER
    public String getTipoCarnet() {
        return tipoCarnet;
    }

    public void setTipoCarnet(String tipoCarnet) {
        this.tipoCarnet = tipoCarnet;
    }

    public LocalDate getCaducidadCarnet() {
        return caducidadCarnet;
    }

    public void setCaducidadCarnet(LocalDate caducidadCarnet) {
        this.caducidadCarnet = caducidadCarnet;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getKilometros() {
        return Kilometros;
    }

    public void setKilometros(double kilometros) {
        Kilometros = kilometros;
    }

    @Override
    public String toString() {
        return  "Conductor{"+ super.toString() +
                "tipoCarnet='" + tipoCarnet + '\'' +
                ", caducidadCarnet=" + caducidadCarnet +
                ", sueldoBase=" + sueldoBase +
                ", Kilometros=" + Kilometros +
                '}';
    }

    @Override
    public double calculaSalario() {
        return sueldoBase + (0.5 * Kilometros);
    }
}
