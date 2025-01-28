package Ej5;

/*
5. En un nuevo proyecto, copia la clase Alumno del ejercicio 1, y añade:
a. Dos atributos que guarden sendas notas (tipo double).
b. Crea los métodos get/set correspondientes, modifica también el
constructor para que incluya estas notas.
c. Crea un método que devuelva la media de las notas (double).
d. Crea un método que devuelva número de expediente, nombre y nota
media.

 */

import java.time.LocalDate;

public class Alumno {

    //ATRIBUTOS

    private int expediente;
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private String curso;
    private double nota1;
    private double nota2;


    //Constructores
    public Alumno(int expediente, String nombre, String apellidos, LocalDate fechaNacimiento,
                  String curso, double nota1, double nota2) {
        this.expediente=expediente;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.fechaNacimiento=fechaNacimiento;
        this.curso=curso;
        this.nota1=nota1;
        this.nota2=nota2;

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

    public double getNota1() {
        return nota1;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }


    //c. Crea un método que devuelva la media de las notas (double).
    public double getMedia(){
        return (nota1 + nota2) / 2;
    }

    //d. Crea un método que devuelva número de expediente, nombre y nota
    public String getDevuelve(){
        return "Número de expediente: " + expediente + "\n" +
                "Nombre: " + nombre + "\n" +
                "Media: " + getMedia();
    }


    @Override
    public String toString() {
        return"Expediente: "+ this.expediente +
                " Nombre: "+ this.nombre +
                " Apellidos: "+ this.apellidos +
                " Fecha Nacimiento: "+ this.fechaNacimiento +
                " Curso: "+ this.curso +
                " nota1: "+ this.nota1 +
                " nota2: "+ this.nota2;
    }

}
