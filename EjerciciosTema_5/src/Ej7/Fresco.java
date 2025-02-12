package Ej7;

import java.time.LocalDate;

public class Fresco extends Producto {

    //ATRIBUTOS
    private LocalDate fechaEnvasado;
    private String paisOrigen;

    //CONSTRUCTOR
    public Fresco(String idproducto, LocalDate fechaEnvasado, String descripcion, int numlote, LocalDate fechaCaducidad1, String paisOrigen) {
        super(idproducto, fechaEnvasado, descripcion, numlote);
        this.fechaEnvasado = fechaCaducidad1;
        this.paisOrigen = paisOrigen;
    }

    //GETTER Y SETTER
    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    // Implementación del método abstracto
    @Override
    public void mostrarInfo() {
        System.out.println("Producto Fresco:");
        System.out.println("ID: " + getIdproducto());
        System.out.println("Descripción: " + getDescripcion());
        System.out.println("Fecha de Caducidad: " + getFechaCaducidad());
        System.out.println("Número de Lote: "+getNumlote() );
        System.out.println("Fecha de Envasado: " + getFechaEnvasado());
        System.out.println("País de Origen: " + getPaisOrigen());


    }
}
