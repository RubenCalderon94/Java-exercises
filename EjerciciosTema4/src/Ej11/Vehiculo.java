package Ej11;
/*
- De cada vehículo se guarda matrícula, marca, modelo, potencia, consumo
medio y precio de alquiler diario. Diseña la clase Vehiculo con los atributos
que se han indicado, getters/setters y constructor. Diseña también un segundo
constructor que reciba como parámetros la matrícula y el precio diario de
alquiler
 */
public class Vehiculo {

    //ATRIBUTOS
    private String matricula;
    private String marca;
    private String modelo;
    private int potencia;
    private double consumo;
    private double precio;

    //CONSTRUCTOR
    public Vehiculo(String marca, String matricula, String modelo, int potencia, double consumo, double precio) {
        this.marca = marca;
        this.matricula = matricula;
        this.modelo = modelo;
        this.potencia = potencia;
        this.consumo = consumo;
        this.precio = precio;
    }

    //CONSTRUCTOR 2 NOS LO PIDE EL EJERCICIO
    public Vehiculo(String matricula, double precio) {
        this.matricula = matricula;
        this.precio = precio;

    }

    //GETTER Y SETTER
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", potencia=" + potencia +
                ", consumo=" + consumo +
                ", precio=" + precio +
                '}';
    }
}
