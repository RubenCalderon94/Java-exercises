package Ej6;

public class Vehiculos {
    //ATRIBUTOS
    private String matricula;
    private String marca;
    private String modelo;
    private Double tarifa ;
    private boolean disponible;


    //CONSTRUCTOR
    public Vehiculos(String marca, String modelo, String matricula, Double tarifa, boolean disponible) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.tarifa = tarifa;
        this.disponible = disponible;
    }


    //GETTER Y SETTER
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getTarifa() {
        return tarifa;
    }

    public void setTarifa(Double tarifa) {
        this.tarifa = tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Vehiculos{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tarifa=" + tarifa +
                ", disponible=" + disponible +
                '}';
    }
}
