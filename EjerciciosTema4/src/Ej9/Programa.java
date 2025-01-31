package Ej9;

/*
 Diseña una aplicación Java que trabaje con una clase llamada Programa (Software).
Cada programa tendrá como atributos su nombre, versión, función (sistema operativo,
servidor de bases de datos, ofimática, …), año de lanzamiento, empresa que lo
desarrolla, tipo de licencia y precio.
Diseña también una clase llamada GestionProgramas que contendrá:
- un array de 25 elementos de la clase Programa
- métodos que sirvan para programar las funciones del siguiente menú:
Menú
1. Insertar nuevo programa (controlar elementos libres)
2. Mostrar lista de software
3. Filtrar por licencia
4. Filtrar por función
5. Eliminar el último elemento
6. Buscar programa por nombre y retornar programa
7. Salir
 */

public class Programa {

    //ATRIBUTOS
    private String nombre;
    private String version;
    private String funcion;
    private int anoCreacion;
    private String empresa;
    private String licencia;
    private double precio;

    //CONSTRUCTOR

    public Programa(String nombre, String version, String funcion, int anoCreacion, String empresa, String licencia, double precio) {
        this.nombre = nombre;
        this.version = version;
        this.funcion = funcion;
        this.anoCreacion = anoCreacion;
        this.empresa = empresa;
        this.licencia = licencia;
        this.precio = precio;

    }


    //GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public String getFuncion() {
        return funcion;
    }
    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }
    public int getAnoCreacion() {
        return anoCreacion;
    }
    public void setAnoCreacion(int anoCreacion) {
        this.anoCreacion = anoCreacion;
    }
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public String getLicencia() {
        return licencia;
    }
    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }


    //METODO TOSTRING
    @Override
    public String toString() {
        return "Programa{" +
                "nombre='" + nombre + '\'' +
                ", version='" + version + '\'' +
                ", funcion='" + funcion + '\'' +
                ", anoCreacion=" + anoCreacion +
                ", empresa='" + empresa + '\'' +
                ", licencia='" + licencia + '\'' +
                ", precio=" + precio +
                '}';
    }




}
