package examen;

public class Convenio {
    public static final double PRECIO_HORA = 30;
    public static final double PRECIO_REVISION = 20;

    public static double precioHora(String s) {
        if (s.equals("examen.TrabajoPintura")) {
            return PRECIO_HORA;
        } else if (s.equals("examen.RevisionAlarma")) {
            return PRECIO_REVISION;
        }
        return PRECIO_HORA;
    }
    /*
    public static double precioTotal(examen.Servicios s) {
        return precioHora(s) * s.horasTrabajadas();
    }*/
}
