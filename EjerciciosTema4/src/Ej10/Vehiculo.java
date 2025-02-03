package Ej10;

import java.time.LocalDateTime;
import java.util.Objects;

public class Vehiculo {

    //ATRIBUTOS
    private String matricula;
    private LocalDateTime horaEntrada;

    //CONSTRUCTOR


    public Vehiculo(String matricula) {
        this.matricula = matricula;
        this.horaEntrada = LocalDateTime.now();
    }

    //GETER Y SETER

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    //No hacemos set de la hora de entrada porque no tiene sentido modificarla

    @Override
    public String toString() {
        return "Matrícula: " + matricula + "\nHora de entrada: " + horaEntrada;
    }

    @Override
    public boolean equals(Object o) { //COMPARAMOS
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(matricula, vehiculo.matricula);// CON OBJECTS
        //RETORNA SI EL VEHICULO ES EL MISMO O NO
    }

    @Override
    public int hashCode() {//GENERA UN CODIGO A CADA VEHICULO Y LO ENCUENTRA MAS FACIL
        return Objects.hash(matricula);
    }


}
