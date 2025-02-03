package Ej14;

import java.math.BigDecimal;
import java.time.LocalDate;


public class Empleado {
    //ATRIBUTOS
    private String id;
    private String nombre;
    private String apellido;
    private String correo;
    private String genero;
    private LocalDate fechaNac;
    private BigDecimal salario;

    //CONSTRUCTOR1
    public Empleado(String datos) {
        String[] emp = datos.split(",");

        this.id = emp[0];
        this.nombre = emp[1];
        this.apellido = emp[2];
        this.correo = emp[3];
        this.genero = emp[4];
        int dia = Integer.parseInt(emp[5].substring(0, 2));
        int mes = Integer.parseInt(emp[5].substring(3, 5));
        int anio = Integer.parseInt(emp[5].substring(6));

        this.fechaNac = LocalDate.of(anio, mes, dia);
        this.salario = new BigDecimal(emp[6]);
    }
    //CONSTRUCTOR2
    public Empleado(String id, String nombre, String apellido, String correo, String genero, LocalDate fechaNac,
                    BigDecimal salario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.genero = genero;
        this.fechaNac = fechaNac;
        this.salario = salario;
    }

    //GETTER Y SETTER
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    //TOSTRING
    @Override
    public String toString() {
        return "Empleado [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo
                + ", genero=" + genero + ", fechaNac=" + fechaNac + ", salario=" + salario + "]";
    }
}
