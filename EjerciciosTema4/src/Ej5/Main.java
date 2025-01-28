package Ej5;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate fecha = LocalDate.of(2000, 1, 1);
        Alumno alumno = new Alumno(1, "Juan", "García", fecha, "1º",7.5, 8.0);
        System.out.println(alumno);

        System.out.println(alumno);

        System.out.println("Nota media: " + alumno.getMedia());
        System.out.println(alumno.getDevuelve());

    }
}
