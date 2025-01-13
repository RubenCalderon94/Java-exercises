package Ej1;

/*Diseña un programa en Java que trabaje con una clase llamada Alumno. Serán
atributos del alumno su número de expediente, nombre, apellidos, fecha de nacimiento
y curso en el que se matricula. La clase debe incluir un constructor y los métodos get
y set correspondientes y toString. Instancia varios objetos de esta clase y prueba los
métodos creados.*/


import java.time.LocalDate;

public class Alumno {

    //ATRIBUTOS

    private int expediente;
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private String curso;


    //Constructores
    public Alumno(int expediente, String nombre, String apellidos, LocalDate fechaNacimiento, String curso) {
        this.expediente=expediente;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.fechaNacimiento=fechaNacimiento;
        this.curso=curso;

    }

    //GET Y SET

    public int getExpediente() {
        return expediente;
    }
    public void setExpediente(int expediente) {
        this.expediente = expediente;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return"Expediente: "+ this.expediente +
                " Nombre: "+ this.nombre +
                " Apellidos: "+ this.apellidos +
                " Fecha Nacimiento: "+ this.fechaNacimiento +
                " Curso: "+ this.curso;
    }

}













