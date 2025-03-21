package examen;

import java.util.*;

public class GestionServicios {
    private List<Servicios> listaS;

    public GestionServicios() {
        this.listaS = new ArrayList<>();
        DaoFicheros dao = new DaoFicheros();
        listaS = dao.leerServicios();
    }


    public void addServicio(Servicios servicio) {
        listaS.add(servicio);
    };


    public void mostrarEmpleados(){
        for (Servicios servicio : listaS) {
            System.out.println(servicio.getEmpleado());
        }
    }

    public Servicios buscarServicio(int id) {
        for (Servicios servicio : listaS) {
            if (servicio.getId() == id) {
                return servicio;
            }
        }
        return null;
    }

    public List<Servicios> buscarServiciosPorEmpleado(String empleado) {
        List<Servicios> serviciosEmpleado = new ArrayList<>();
        for (Servicios servicio : listaS) {
            if (servicio.getEmpleado().getNombre().equals(servicio.getEmpleado().getNombre())) {
                serviciosEmpleado.add(servicio);
            }

        }
        return serviciosEmpleado;
    }


    public List<Servicios> buscarServiciosPorCliente(String cliente) {
        List<Servicios> serviciosCliente = new ArrayList<>();
        for (Servicios servicio : listaS) {
            if (servicio.getEmpleado().getNombre().equals(servicio.getEmpleado().getNombre())) {
                serviciosCliente.add(servicio);
            }
        }
        return serviciosCliente;
    }

    public List<Servicios> ListarServiciosTipo(String tipo) {
        List<Servicios> serviciosTipo = new ArrayList<>();
        if(tipo.equals("examen.RevisionAlarma")){
            for (Servicios servicio : listaS) {
                if (servicio instanceof RevisionAlarma) {
                    serviciosTipo.add(servicio);
                }
            }
        } else {
            for (Servicios servicio : listaS) {
                if (servicio instanceof TrabajoPintura) {
                    serviciosTipo.add(servicio);
                }
            }
        }
        return serviciosTipo;
    }

    public int buscarRepetidos(Servicios s ){
        int repetidos = 0;
        for (Servicios servicio : listaS) {
            if(servicio.equals(s)){
                repetidos++;
            }
        }
        return repetidos;
    }

    public void mostrarServicio(){
        for (Servicios srv : listaS) {
            System.out.println(srv.toString());
        }
    }

    public boolean eliminarServicio(int id){
        Iterator<Servicios> iterator = listaS.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId() == id) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    //ORDEN NATURAL
    public void ordenarServicios(){
        Collections.sort(listaS, Collections.reverseOrder());
        mostrarServicio();
    }

    //ORDEN POR CLIENTE
    public void ordenarServiciosPorCliente(){
        Collections.sort(listaS, new Comparator<Servicios>() {
            @Override
            public int compare(Servicios o1, Servicios o2) {
                return o1.getCliente().compareTo(o2.getCliente());
            }
        });
        mostrarServicio();


    }


    public void guardarServicios() {
        List<String> lp = new ArrayList<>();
        for (Servicios servicio : listaS) {
            lp.add(servicio.toString());
        }
        DaoFicheros dao = new DaoFicheros();
        dao.guardarServicio(lp);
    }
}
