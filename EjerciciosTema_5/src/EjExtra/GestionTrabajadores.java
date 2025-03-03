package EjExtra;

import java.util.*;

public class GestionTrabajadores {

    //ATRIBUTOS
    List<Trabajador> listaT = new ArrayList<>();


    public void insertarTrabajador(Trabajador t) {
        listaT.add(t);
    }

    public Trabajador buscarTrabajador(int id) {
        for (Trabajador t : listaT) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }

    public Trabajador buscarTrabajador(String nombre) {
        for (Trabajador t : listaT) {
            if (t.getNombre().equals(nombre)) {
                return t;
            }
        }
        return null;
    }

    public double verSalario(Trabajador t) {
        return t.calculaSalario();
    }

    public boolean modificarDatos(Trabajador t, String nombre) {
        if (t != null) {
            t.setNombre(nombre);
            return true;
        }
        return false;
    }

    public boolean modificarSueldo(Trabajador t, double sueldo) {
        if (t != null) {
            if (t instanceof Mecanico) {
                ((Mecanico) t).setSueldoBase(sueldo);
                return true;
            } else if (t instanceof Conductor) {
                ((Conductor) t).setSueldoBase(sueldo);
                return true;
            } else if (t instanceof Oficina) {
                ((Oficina) t).setSueldoBase(sueldo);
                return true;
            }
        }
        return false;
    }

    public void mostrarListaTrabajadores(boolean b) {
        if (b) {//ordenado por nombre, esta es la ordenación por defecto o natural.
            Collections.sort(listaT);
        } else {//ordenado por fecha de nacimiento, hay que utilizar una clase Comparator
            Collections.sort(listaT, new Comparator<Trabajador>() {
                @Override
                public int compare(Trabajador t1, Trabajador t2) {
                    return t1.getFechaNacimiento().compareTo(t2.getFechaNacimiento());
                }
            });
        }
    }


    public boolean eliminarTrabajador(Trabajador t) {
        return listaT.remove(t);
    }

    public boolean eliminarTrabajador(int id) {
        //1 forma
        /*Trabajador t = buscarTrabajador(id);
        if (t != null){
            return listaT.remove(t);
        }
        return false;*/
        //2 forma con Iterator
        Iterator<Trabajador> it = listaT.iterator();
        while (it.hasNext()) {
            if (it.next().getId() == id) {
                it.remove();
                return true;
            }
        }
        return false;

    }


}
