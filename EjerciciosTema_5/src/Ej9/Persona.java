package Ej9;

public class Persona {

    //ATRIBUTOS
    private int id;
    private String nombre;

    //CONSTRUCTOR
    public Persona(int id, String nombre) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
