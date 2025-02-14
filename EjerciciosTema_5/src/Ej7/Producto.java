package Ej7;

import java.time.LocalDate;

public abstract class Producto {
    //ATRIBUTOS
    private String idproducto;
    private String descripcion;
    private LocalDate fechaCaducidad;
    private int numlote;

    //CONSTRUCTOR
    public Producto(String idproducto, LocalDate fechaCaducidad, String descripcion, int numlote) {
        this.idproducto = idproducto;
        this.fechaCaducidad = fechaCaducidad;
        this.descripcion = descripcion;
        this.numlote = numlote;
    }


    //GETTER Y SETTER
    public String getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public int getNumlote() {
        return numlote;
    }

    public void setNumlote(int numlote) {
        this.numlote = numlote;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    // Método abstracto para mostrar información
    public abstract void mostrarInfo();


}

