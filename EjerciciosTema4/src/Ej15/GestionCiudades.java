package Ej15;


import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class GestionCiudades {

    private ArrayList<Ciudad> listaCiudades = new ArrayList<Ciudad>();

    public GestionCiudades() {
        try {
            List<String> lines = Files.readAllLines(Paths.get("EjerciciosTema4/src/Ej15/ciudades.csv"),
                    StandardCharsets.UTF_8);
            for (String string : lines) {
                listaCiudades.add(new Ciudad(string));
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void mostrar() {
        for (Ciudad ciudad : listaCiudades) {
            System.out.println(ciudad.toString());
        }
    }

    public Ciudad buscarCiudadPorId(String id) {
        for (Ciudad c : listaCiudades) {
            if (c.getId().equals(id)) {
                return c;
            }
        }
        return null;
    }

    public Ciudad buscarCiudadMasPoblada() {
        Ciudad ciudadMasPoblada = null;
        int p = 0;
        for (Ciudad c : listaCiudades) {
            if (c.getPoblacion() > p) {
                p = c.getPoblacion();
                ciudadMasPoblada = c;
            }
        }
        return ciudadMasPoblada;
    }

    public void mostrarCiudadesDelPais(String pais) {
        for (Ciudad c : listaCiudades) {
            if (c.getPais().equals(pais)) {
                System.out.println(c.toString());
            }
        }
    }

    //En el caso que de nos pidan que devuelva varias ciudades, en lugar de mostrarlas, devolveremos un ArrayList<Ciudad>
    public ArrayList<Ciudad> ciudadesUnPais(String pais) {
        ArrayList<Ciudad> listaCiudadesDelPais = new ArrayList<>();
        for (Ciudad c : listaCiudades) {
            if (c.getPais().equals(pais)) {
                listaCiudadesDelPais.add(c);
            }
        }
        return listaCiudadesDelPais;
    }

    public static boolean comparaCiudades(Ciudad c1, Ciudad c2) {
        if ((c1.getId().equals(c2.getId())) && (c1.getNombre().equals(c2.getNombre()))) {
            return true;
        } else {
            return false;
        }
    }

    public void mostrarVariasCiudades(ArrayList<String> listaIds) {
        for (String i : listaIds) {
            Ciudad c = buscarCiudadPorId(i);
            if (c != null) {
                System.out.println(c.toString());
            }
        }
    }

    public void mostrarCiudadesPaises(ArrayList<String> listaCodigoPais) {
        for (String p : listaCodigoPais) {
            for (Ciudad c : listaCiudades) {
                if (c.getCodigoPais().equals(p)) {
                    System.out.println(c.toString());
                }
            }
        }
    }
}