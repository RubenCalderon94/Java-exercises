package Ej15;

public class App {

    public static void main(String[] args) {

        GestionCiudades g = new GestionCiudades();

        g.mostrar();


        System.out.println("Ciudad con id 1: " + g.buscarCiudadPorId("1"));

        Ciudad c1 = g.buscarCiudadPorId("1");
        Ciudad c2 = g.buscarCiudadPorId("2");

        Boolean a = GestionCiudades.comparaCiudades(c1, c2);
    }

}


