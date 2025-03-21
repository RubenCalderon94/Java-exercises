package Ej6;

public class Publicacion {

    //ATRIBUTOS
    private String titulo;
    private String tipo;
    private String editorial;
    private String periocidad;
    private int numEjemplares;

    //CONSTRUCTOR
    public Publicacion(String titulo, int numEjemplares, String periocidad, String editorial, String tipo) {
        this.titulo = titulo;
        this.numEjemplares = numEjemplares;
        this.periocidad = periocidad;
        this.editorial = editorial;
        this.tipo = tipo;
    }

    //GETTER Y SETTER
    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPeriocidad() {
        return periocidad;
    }

    public void setPeriocidad(String periocidad) {
        this.periocidad = periocidad;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    @Override
    public String toString() {
        return "Publicacion{" +
                "titulo='" + titulo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", editorial='" + editorial + '\'' +
                ", periocidad='" + periocidad + '\'' +
                ", numEjemplares=" + numEjemplares +
                '}';
    }
}
