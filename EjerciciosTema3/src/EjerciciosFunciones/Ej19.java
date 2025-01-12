package EjerciciosFunciones;

/*
 Diseña una función Java que devuelva un String con la fecha actual del sistema.
A. Con la clase Date. Para conocer la fecha del sistema debes crear un objeto de
la clase Date(), contenida en el paquete java.util. Un objeto de estas
características se crea así: Date fecha = new Date();
Para acceder a la fecha actual debes utilizar el método toString() de ese objeto,
de la forma: String fechaActual = fecha.toString();
B. Con la clase LocalDate. Utiliza también el método toString. Un objeto
LocalDate se crea así:
a. LocalDate fechaActual = LocalDate.now();
b. LocalDate fecha = LocalDate.of(año, mes, dia);
 */
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ej19 {
    public static void main(String[] args) {

        System.out.println("Fecha actual con Localdate: " + getFechaActualconLocalDate());
        System.out.println("Fecha actual con Date: " + getFechaActualConDate());
        System.out.println("Fecha y hora  actual  con LocalDateTime: ");
        mostrarFechaHoraActual();

    }
    static String getFechaActualconLocalDate() {
        LocalDate fecha = LocalDate.now();//Nos dice la fecha en HORARIO AMERICANO
        return fecha.toString();//Metodo subSTRING
    }

    static String getFechaActualConDate() {
        Date fecha = new Date(0);//No funciona, obsoleta
        return fecha.toString();//Metodo subSTRING
    }

    public static void mostrarFechaHoraActual() {//SE MUESTRA EN FORMATO EUROPEO
        // Obtener la fecha y hora actual
        LocalDateTime fechaHoraActual = LocalDateTime.now();

        // Formatear la fecha y hora
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // Mostrar la fecha y hora
        System.out.println("Fecha y hora actual: " + fechaHoraActual.format(formato));
    }

}

