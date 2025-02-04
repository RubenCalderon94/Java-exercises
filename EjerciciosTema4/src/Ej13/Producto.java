package Ej13;

public class Producto {

    //ATRIBUTOS
    private int codigo;
    private String nombre;
    private String tipo;
    private double precioVenta;
    private double precioCompra;
    private int unidadesDisponibles;

    //CONSTRUCTOR
    public Producto( int codigo, String nombre, String tipo, double precioVenta, double precioCompra, int unidadesDisponibles) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.tipo = tipo;
        this.precioVenta = precioVenta;
        this.precioCompra = precioCompra;
        this.unidadesDisponibles = unidadesDisponibles;
    }

    //GETTER Y SETTER

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public double getDiferencia() {
        return precioVenta - precioCompra;
    }

    //TOSTRING
    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precioVenta=" + precioVenta +
                ", precioCompra=" + precioCompra +
                ", unidadesDisponibles=" + unidadesDisponibles +
                '}';
    }


}
