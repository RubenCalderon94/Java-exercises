package Ej1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate f = LocalDate.of(2000, 12, 19);
        LocalDate f1= LocalDate.of(2011, 03, 15);

        Alumno alumno1 = new Alumno(23, "Juan", "Ruiz", f, "python");
        Alumno alumno2 = new Alumno(24, "Pepe", "Gomez", f1, "C++");


        System.out.println("Alumno 1:"+ alumno1.getNombre()+" "+ alumno1.getApellidos());
        System.out.println("Alumno 2:"+ alumno2.getNombre()+" "+ alumno2.getApellidos());


        System.out.println(alumno1.toString());
        System.out.println(alumno2.toString());


    }
}
