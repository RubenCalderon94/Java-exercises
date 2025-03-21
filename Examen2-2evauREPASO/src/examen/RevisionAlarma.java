package examen;

import java.time.LocalDate;

public class RevisionAlarma extends Servicios {

    //ATRIBUTOS
    private int numAlarmas;

    //CONSTRUCTOR
    public RevisionAlarma(int id, Empleado empleado, LocalDate fechaInicio, String cliente, int numAlarmas) {
        super(id, empleado, fechaInicio, cliente);
        this.numAlarmas = numAlarmas;
    }


    //GETTER Y SETTER

    public int getNumAlarmas() {
        return numAlarmas;
    }

    public void setNumAlarmas(int numAlarmas) {
        this.numAlarmas = numAlarmas;
    }



    @Override
    public double costeMaterial() {
        return 0;
    }

    @Override
    public double costeManoObra() {
        return Convenio.precioHora("examen.RevisionAlarma")*numAlarmas;
    }

    @Override
    public double costeTotal() {
        return costeManoObra();
    }

    @Override
    public String detalleServicio() {
        return "REVISION ALARMA\n"  +
                "Cliente:" + super.getCliente() +
                "Fecha de inicio: "+ Util.FORMATO.format(super.getFechaInicio())+
                "\n_______________________________________________"+
                "\nTecnico....................: " + super.getEmpleado() +
                "\nNumero de sensores.........: " + numAlarmas +
                "\nCoste mano de obra:........: " + costeManoObra() +
                "\n_______________________________________________"+
                "\nTOTAL: " + costeTotal();
    };

    @Override
    public String toString() {
        return "examen.RevisionAlarma," + super.getId() +"," + super.getEmpleado().getId() + "," + super.getEmpleado().getNombre()+","+
                super.getFechaInicio() + "," + super.getCliente() +"," + numAlarmas;
    }
}



