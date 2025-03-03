package Ej12;

public class Persona implements Comparable<Persona> {

    //ATRIBUTOS
    private String dni;
    private String nombre;
    private Trabajo trabajo;
    private int edad;

    //CONSTRUCTOR
    public Persona(String dni, Trabajo trabajo, String nombre, int edad) {
        this.dni = dni;
        this.trabajo = trabajo;
        this.nombre = nombre;
        this.edad = edad;
    }


    //GETTER Y SETTER
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Trabajo getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(Trabajo trabajo) {
        this.trabajo = trabajo;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }


    public void setPuesto(Trabajo t) {
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", trabajo=" + trabajo +
                ", edad=" + edad +
                '}';
    }

    @Override
    public int compareTo(Persona p) {
        //para ordenar datos numericos
        /*if(this.edad > p.edad) {
            return 1;
        } else if(this.edad < p.edad) {
            return -1;
        } else {
            return 0;
        }*/
        //para ordenar datos alfabeticos
        return this.dni.compareTo(p.getDni());
    }
}
