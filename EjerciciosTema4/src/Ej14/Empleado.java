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
        /*
    Este es el constructor de la clase Empleado. El constructor es un método especial que se
    llama cuando se crea un objeto de la clase. Este constructor toma un solo parámetro, datos,
    que es un String que contiene la información del empleado.
     */
        String[] emp = datos.split(",");
        /*
        Aquí, el String datos se divide (o "parte") en varios elementos utilizando la coma (,) como delimitador.
        El método split(",") devuelve un arreglo de String llamado emp, donde cada elemento del arreglo corresponde
        a una parte de la información del empleado:

        emp[0] -> ID del empleado.
        emp[1] -> Nombre del empleado.
        emp[2] -> Apellido del empleado.
        emp[3] -> Correo electrónico del empleado.
        emp[4] -> Género del empleado.
        emp[5] -> Fecha de nacimiento del empleado (en formato DD/MM/YYYY).
        emp[6] -> Salario del empleado.
         */

        //Asignación de valores a los atributos del objeto Empleado:

        this.id = emp[0];// Asigna el valor de emp[0] al atributo id.
        this.nombre = emp[1];// Asigna el valor de emp[1] al atributo nombre.
        this.apellido = emp[2];// Asigna el valor de emp[2] al atributo apellido.
        this.correo = emp[3];// Asigna el valor de emp[3] al atributo correo.
        this.genero = emp[4];// Asigna el valor de emp[4] al atributo genero.
        int dia = Integer.parseInt(emp[5].substring(0, 2));
        int mes = Integer.parseInt(emp[5].substring(3, 5));
        int anio = Integer.parseInt(emp[5].substring(6));
        /*
        La fecha de nacimiento está en el formato DD/MM/YYYY, y la tarea aquí es extraer el día,
        mes y año de esa cadena para poder construir un objeto LocalDate:

        emp[5].substring(0, 2) extrae los primeros 2 caracteres, que corresponden al día (DD).
        emp[5].substring(3, 5) extrae los caracteres que corresponden al mes (MM).
        emp[5].substring(6) extrae los caracteres que corresponden al año (YYYY).
        Después, estos valores se convierten en enteros usando Integer.parseInt().
         */
        //Creación del objeto LocalDate:
        this.fechaNac = LocalDate.of(anio, mes, dia);
        //Conversión del salario a un objeto BigDecimal:
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
