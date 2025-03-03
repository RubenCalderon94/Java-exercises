package Ej12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PersonaDao {

    private List<Persona> listaP;

    public PersonaDao() {
        listaP = new ArrayList<>();
    }

    public void insertarPersona(Persona p) {
        listaP.add(p);
    }

    public Persona buscarPersona(String dni) {

        for (Persona p : listaP) {
            if (p.getDni().equals(dni)) {
                return p;
            }
        }
        return null;
    }

    public int getNumeroPersonas() {
        return listaP.size();//SIZE recorre hasta el ultimo en un arraylist
    }

    public void mostrarDatos() {
        //ordenarDatos();//ordenar por dni
        //ordenarDatosPorEdad();//ordenar por edad
        for (Persona p : listaP) {
            System.out.println(p);
        }
    }

    public List<Persona> getNPrimerasPersonas(int n) {
        List<Persona> listaNp = new ArrayList<>();
        Collections.sort(listaP);//Collections.sort ordena de forma natural una lista
        //HAY QUE UTILIZAR CompareTo
        if (n <= listaP.size()) {
            for (int i = 0; i < n; i++) {
                listaNp.add(listaP.get(i));
            }
        }
        return listaNp;

    }

    public boolean cambiarPuestoTrabajo(String dni, Trabajo t) {
        for (Persona p : listaP) {
            if (p.getDni().equals(dni)) {
                p.setPuesto(t);
                return true;
            }
        }
        return false;
    }

    public void ordenarDatos() {
        Collections.sort(listaP);
    }

   public void ordenarDatosPorEdad() {
        Collections.sort(listaP, new ComparadorEdad(){
            @Override
            public int compare(Persona o1, Persona o2) {
                if(o1.getEdad() > o2.getEdad()) {
                    return 1;
                } else if(o1.getEdad() < o2.getEdad()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }

    /**
     * Este método no funciona porque no se puede eliminar un elemento de una lista mientras se está recorriendo
     * @param dni
     */
    /*public void eliminarPersona(String dni) {
        for (Persona p : listaP) {
            if (p.getDni().equals(dni)) {
                listaP.remove(p);
                break;
            }
        }
    }*/

    public void eliminarPersonas(String dni) {
        Iterator<Persona> it = listaP.iterator();
        /*Un Iterator es una interfaz que permite recorrer una colección (en este caso, listaP),
         obteniendo uno a uno los elementos de la lista.
        El método iterator() devuelve un iterador que permite recorrer todos los elementos de la lista.*/
        while (it.hasNext()) {//El método it.hasNext() devuelve true si hay más elementos en la lista para iterar.
            // Si no quedan más elementos, devuelve false, y el bucle termina.
            Persona p = it.next();
            if (p.getDni().equals(dni)) {
                it.remove();//remove es eliminar
                break;
            }
        }
    }
}



