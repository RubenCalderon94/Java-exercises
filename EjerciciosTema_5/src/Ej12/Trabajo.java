package Ej12;

public class Trabajo {
    //ATRIBUTOS
    private int id;
    private String descripcion;
    private double salario;

    //CONSTRUCTOR
    public Trabajo(int id, String descripcion, double salario) {
        this.id = id;
        this.descripcion = descripcion;
        this.salario = salario;
    }

    //GETTER Y SETTER
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Trabajo{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", salario=" + salario +
                '}';
    }
}
