package Ej6;

public class Furgoneta extends Vehiculos{

    //ATRIBUTOS
    private int capacidad;
    private int carga;

    //CONSTRUCTOR
    public Furgoneta(String marca, String modelo, String matricula, Double tarifa, boolean disponible, int capacidad, int carga) {
        super(marca, modelo, matricula, tarifa, disponible);
        this.capacidad = capacidad;
        this.carga = carga;
    }

    //GETTER Y SETTER
    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return   "Furgoneta{" + super.toString() +
                "capacidad=" + capacidad +
                ", carga=" + carga +
                '}';
    }
}
