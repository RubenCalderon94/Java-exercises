package Ej6;

public class Turismo extends Vehiculos {

    //ATRIBUTOS
    private int puertas;
    private boolean automatico;


    //CONSTRUCTOR
    public Turismo(String marca, String modelo, String matricula, Double tarifa, boolean disponible, int puertas, boolean automatico) {
        super(marca, modelo, matricula, tarifa, disponible);
        this.puertas = puertas;
        this.automatico = automatico;
    }

    //GETTER Y SETTER

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public boolean isAutomatico() {
        return automatico;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }
}
