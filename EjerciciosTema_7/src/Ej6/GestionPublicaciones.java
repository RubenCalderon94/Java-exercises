package Ej6;

import java.util.HashMap;
import java.util.Map;

public class GestionPublicaciones {

    //ATRIBUTOS
    Map<String, Publicacion> mapPubli;


    //CONSTRUCTOR
    public GestionPublicaciones() {
        mapPubli = new HashMap<>();
    }


    //METODOS
    //AÑADIR
    public void añadir(Publicacion p) {
        mapPubli.put(p.getTitulo(), p);
    }

    //ELIMINAR
    public boolean eliminar(String titulo) {
        if (mapPubli.containsKey(titulo)) {
            mapPubli.remove(titulo);
            return true;
        }
        return false;
    }

    //LISTAR
    public Publicacion getPublicacion(String titulo) {//Requiere llamar a mapPubli.get(t) para obtener el valor, lo que es menos eficiente
        return mapPubli.get(titulo);
    }

    /*public void mostrarPublicaciones() { // Más eficiente porque accede directamente a clave y valor.
        for (Map.Entry<String, Publicacion> entry : mapPubli.entrySet()) {
            System.out.println(entry.getValue());
        }
    }*/

    public void mostrarPublicaciones() { //Requiere llamar a mapPubli.get(t) para obtener el valor, lo que es menos eficiente
        for(String t : mapPubli.keySet()){
            System.out.println(t +"," + mapPubli.get(t));
        }
    }



}
