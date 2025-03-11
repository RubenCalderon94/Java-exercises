package PruebaExamen;

import java.util.*;

public class Gestion {

    //ATRIBUTOS
    private List<Trabajador> listaT = new ArrayList<>();


    public void nuevoTrabajador(Trabajador t) {
        listaT.add(t);
    }

    public Trabajador buscarTrabajador(int id) {
        for (Trabajador t : listaT) {
            if (t.id == id) {
                return t;
            }
        }
        return null;
    }


    public Trabajador buscarTrabajador(String nombre) {
        for (Trabajador t : listaT) {
            if (t.nombre.equals(nombre)) {
                return t;
            }
        }
        return null;
    }


    public List<Trabajador> buscarTrabajadorClase(String c) {
        List<Trabajador> listaC = new ArrayList<>();
        if (c.equals("Comercial")) {
            for (Trabajador t : listaT) {
                if (t instanceof Comercial) {
                    listaC.add(t);
                }
            }

        } else if (c.equals("Produccion")) {
            for (Trabajador t : listaT) {
                if (t instanceof Produccion) {
                    listaC.add(t);
                }
            }
        }

        return listaC;

        /*

        for (Trabajador t : listaT){
            if (t.getClass().getSimpleName().equals(c)){
                lista.add(t);
            }
        }
        return lista;*/
    }

    public int buscarRepetidos(Comercial c) {
        int repe = 0;
        for (Trabajador t : listaT) {
            if (t instanceof Comercial) {
                //Comercial com = (Comercial) t;
                if (t.equals(c)) {
                    repe++;
                }
            }
        }
        return repe;
    }


    public boolean eliminarTrabajador(int id) {
        Iterator<Trabajador> it = listaT.iterator();
        while (it.hasNext()) {
            Trabajador t = it.next();
            if (t.id == id) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public void mostrarListaOrdenNatural() {
        Collections.sort(listaT);
        for (Trabajador t : listaT) {
            System.out.println(t);
        }
        // System.out.println(listaT);
    }

    public void mostrarListaOrdenNombre() {
        Collections.sort(listaT, new Comparator<Trabajador>() {
            @Override
            public int compare(Trabajador t1, Trabajador t2) {
                return t1.nombre.compareTo(t2.nombre);
            }
        });
        for (Trabajador t : listaT) {
            System.out.println(t);
        }
    }







}
