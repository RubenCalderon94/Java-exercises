package examen;

import java.time.LocalDate;

public class TrabajoPintura extends Servicios {

    //ATRIBUTOS
    private double metrosCuadrados;
    private double precioMetroCuadrado;

    //CONSTRUCTOR
    public TrabajoPintura(int id, Empleado empleado, LocalDate fechaInicio, String cliente, double precioMetroCuadrado, double metrosCuadrados) {
        super(id, empleado, fechaInicio, cliente);
        this.precioMetroCuadrado = precioMetroCuadrado;
        this.metrosCuadrados = metrosCuadrados;
    }

    //GETTER Y SETTER
    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public double getPrecioMetroCuadrado() {
        return precioMetroCuadrado;
    }

    public void setPrecioMetroCuadrado(double precioMetroCuadrado) {
        this.precioMetroCuadrado = precioMetroCuadrado;
    }


    @Override
    public double costeMaterial() {
        return  (metrosCuadrados / 7.8) * precioMetroCuadrado;
    }

    @Override
    public double costeManoObra() {
        return Convenio.precioHora("examen.TrabajoPintura");
    }

    @Override
    public double costeTotal() {
        double coste_total = costeMaterial() + costeManoObra();
        if (metrosCuadrados<50){
            coste_total *= 1.15;
        }
        return coste_total;
    }

    @Override
    public String detalleServicio() {
        if(metrosCuadrados< 50){

            return "TRABAJO PINTURA\n"  +
                    "Cliente:" + super.getCliente() +
                    "Fecha de inicio: "+ Util.FORMATO.format(super.getFechaInicio())+
                    "\n_______________________________________________"+
                    "\nPintor...................: " + super.getEmpleado() +
                    "\nMetros cuadrados.........: " + metrosCuadrados +
                    "\nPrecio por metro cuadrado: " + precioMetroCuadrado +
                    "\nCoste material...........: " + costeMaterial() +
                    "\nCoste mano de obra:....... " + costeManoObra() +
                    "\nCoste adicional........... " + (costeTotal()*0.15) +
                    "\n_______________________________________________"+
                    "\nTOTAL: " + costeTotal();
        }
        return "TRABAJO PINTURA\n"  +
                "Cliente:" + super.getCliente() +
                "Fecha de inicio: "+ Util.FORMATO.format(super.getFechaInicio())+
                "\n_______________________________________________"+
                "\nPintor...................: " + super.getEmpleado() +
                "\nMetros cuadrados.........: " + metrosCuadrados +
                "\nPrecio por metro cuadrado: " + precioMetroCuadrado +
                "\nCoste material...........: " + costeMaterial() +
                "\nCoste mano de obra:....... " + costeManoObra() +
                "\n_______________________________________________"+
                "\nTOTAL: " + costeTotal();
    };

    @Override
    public String toString() {
        return "examen.TrabajoPintura,"+super.getEmpleado()+","+super.getEmpleado().getId()+","+
                super.getEmpleado().getNombre()+","+super.getFechaInicio()+","+super.getCliente()+","+metrosCuadrados+","+precioMetroCuadrado;
    }
}


