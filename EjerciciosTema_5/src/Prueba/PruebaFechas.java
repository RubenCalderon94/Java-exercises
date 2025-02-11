package Prueba;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class PruebaFechas {
    public static void main(String[] args) {
        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();
        // Formatear la fecha como una cadena
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = fechaActual.format(formato);
        // Imprimir la fecha formateada
        System.out.println("Fecha actual: " + fechaFormateada);

        LocalDate fechaActual1 = LocalDate.now();
        System.out.println("Fecha actual: " + fechaActual);
        // Sumar días a la fecha actual
        LocalDate fechaSumaDias = fechaActual.plusDays(5);
        boolean esAnterior = fechaSumaDias.isBefore(fechaActual);
        boolean esPosterior = fechaSumaDias.isAfter(fechaActual);
        System.out.println("Fecha después de sumar 5 días: " + fechaSumaDias);
        // Restar meses a la fecha actual
        LocalDate fechaRestaMeses = fechaActual.minusMonths(2);
        System.out.println("Fecha después de restar 2 meses: " + fechaRestaMeses);
        // Sumar años a la fecha actual
        LocalDate fechaSumaAnios = fechaActual.plusYears(3);
        System.out.println("Fecha después de sumar 3 años: " + fechaSumaAnios);

        LocalDate mifecha = LocalDate.of(2021, 12, 25);

        int diferenciaDias = fechaActual1.compareTo(mifecha);
        System.out.println("Diferencia en días: " + diferenciaDias);
        long diferenciaMeses = ChronoUnit.DAYS.between(fechaSumaDias, fechaRestaMeses);

    }
}
