package Ej10;

public class Main {
    public static void main(String[] args) {
        //INSTANCIAMOS (CREAMOS UN PARKING DE 2 PALZAS)
        Parking parking1 = new Parking(2);
        //INSTANCIAMOS (CREAMOS 3 VEHICULOS)
        Vehiculo vehiculo1 = new Vehiculo("1234ABC");
        Vehiculo vehiculo2 = new Vehiculo("5678DEF");
        Vehiculo vehiculo3 = new Vehiculo("9012GHI");

        //NOS RECOGE DATOS DE ENTRADA Y CUENTA CADA ENTRADA AL PARKING DE CADA COCHE
        parking1.entradaVehiculo(vehiculo1);
        parking1.entradaVehiculo(vehiculo2);
        //EL TERCER VEHICULO NO ENTRA PORQUE EL PARKING SOLO ES DE DOS PLAZAS
        parking1.entradaVehiculo(vehiculo3);

        //MOSTRAMOS VEHICULOS REGISTRADOS EN EL PARKING
        parking1.mostrarVehiculos();
        //MOSTRAMOS PLAZAS LIBRES
        parking1.plazasLibres();

        // SE REGISTRA LA SALIDA DEL VEHICULO 2
        parking1.salidaVehiculo(vehiculo2);
        parking1.mostrarVehiculos();
        parking1.plazasLibres();

    }
}
