package EjExtra;

import java.time.LocalDate;

public class Mecanico extends Trabajador{

    //ATRIBUTOS
    private LocalDate antiguedad;
    private Categoria categoria;
    private double sueldoBase;

    //CONSTRUCTOR
    public Mecanico(int id, String nombre, LocalDate fechaNacimiento, double sueldoBase, Categoria categoria, LocalDate antiguedad) {
        super(id, nombre, fechaNacimiento);
        this.sueldoBase = sueldoBase;
        this.categoria = categoria;
        this.antiguedad = antiguedad;
    }

    //GETTER Y SETTER
    public LocalDate getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(LocalDate antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }


    @Override
    public String toString() {
        return "Mecanico{" + super.toString() +
                "antiguedad=" + antiguedad +
                ", categoria=" + categoria +
                ", sueldoBase=" + sueldoBase +
                '}';
    }

    @Override
    public double calculaSalario() {
        switch (categoria){
            case JEFE_TALLER:
                return sueldoBase + 1000;
            case OFICIAL:
                return sueldoBase + 800;
            case CHAPISTA:
                return sueldoBase + 500;
            case ELECTRICIAL:
                return sueldoBase + 300;
            case MECANICO:
                return sueldoBase + 200;
            default:
                return sueldoBase;
        }
    }
}
