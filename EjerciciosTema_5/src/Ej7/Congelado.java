package Ej7;

import java.time.LocalDate;

public class Congelado extends Producto {

    //ATRIBUTOS
    private double temperatura;


    //CONSTRUCTOR
    public Congelado(String idproducto, LocalDate fechaCaducidad, String descripcion, int numlote, double temperatura) {
        super(idproducto, fechaCaducidad, descripcion, numlote);
        this.temperatura = temperatura;
    }

    //GETTER Y SETTER
    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    // Implementación del método abstracto
    @Override
    public void mostrarInfo() {
        System.out.println("Producto Fresco:");
        System.out.println("ID: " + getIdproducto());
        System.out.println("Descripción: " + getDescripcion());
        System.out.println("Fecha de Caducidad: " + getFechaCaducidad());
        System.out.println("Número de Lote: "+getNumlote() );
        System.out.println("Temperatura recomendada de congelacion: " + getTemperatura() );



    }
}
