package Ej7;

import java.time.LocalDate;

public class Refrigerado extends Producto{

    //ATRIBUTOS
    private String codigo;


    //CONSTRUCTOR
    public Refrigerado(String idproducto, LocalDate fechaCaducidad, String descripcion, int numlote, String codigo) {
        super(idproducto, fechaCaducidad, descripcion, numlote);
        this.codigo = codigo;
    }

    //GETTER Y SETTER
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    // Implementación del método abstracto
    @Override
    public void mostrarInfo() {
        System.out.println("Producto Fresco:");
        System.out.println("ID: " + getIdproducto());
        System.out.println("Descripción: " + getDescripcion());
        System.out.println("Fecha de Caducidad: " + getFechaCaducidad());
        System.out.println("Número de Lote: "+ getNumlote() );
        System.out.println("Fecha de Envasado: " + getCodigo());



    }
}
