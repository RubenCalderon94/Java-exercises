package Ej10;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Parking {

    //Atributos
    private ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
    private int plazasLibres;


    //CONTRUCTOR
    public Parking(int plazasLibres) {
        this.plazasLibres = plazasLibres;
    }

    //GETTER Y SETTER

    public int getPlazasLibres() {
        return plazasLibres;
    }

    public void setPlazasLibres(int plazasLibres) {
        this.plazasLibres = plazasLibres;
    }

    //METODOS

    public void entradaVehiculo(Vehiculo vehiculo) {
        if(plazasLibres>0){
            listaVehiculos.add(vehiculo);
            plazasLibres--;
        }else{
            System.out.println("No hay palzas libres. parking completo");
        }
    }

    public void salidaVehiculo(Vehiculo vehiculo) {
        LocalDateTime ahora = LocalDateTime.now();

        if (listaVehiculos.contains(vehiculo)) {
            long tiempo = vehiculo.getHoraEntrada().until(ahora, ChronoUnit.SECONDS);
            System.out.println("El vehículo ha estado " + tiempo + " segundos en el parking," +
                    " el precio a pagar es " + tiempo * 0.015 + "€");
            listaVehiculos.remove(vehiculo);
            plazasLibres++;
        } else {
            System.out.println("El vehículo no está en el parking");
        }
    }


    public void mostrarVehiculos() { //Recorremos el ARRAYLIST  con un for
        for (Vehiculo v : listaVehiculos) {
            System.out.println(v);
        }
    }

    public void plazasLibres () {
        System.out.println("Plazas Libres: " + plazasLibres);
    }

}
