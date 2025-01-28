package Ej6;

import Ej5.Alumno;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        //1. Creación de fechas de nacimiento

        LocalDate fechaNacimiento1 = LocalDate.of(2000, 1, 1);
        LocalDate fechaNacimiento2 = LocalDate.of(2001, 2, 2);
        LocalDate fechaNacimiento3 = LocalDate.of(2002, 3, 3);
        /*Aquí se crean tres instancias de la clase LocalDate que representan las fechas de nacimiento
        de los tres alumnos. La clase LocalDate se utiliza para representar una fecha (año, mes, día) sin la hora.
                Cada llamada a LocalDate.of() crea una nueva fecha.*/

        //2. Creación de objetos Alumno que lo importamos del ejercicio 5, porque ya lo tenemos creao

        Alumno al1 = new Alumno(1, "Juan", "García", fechaNacimiento1, "1º", 5.0, 6.0);
        Alumno al2 = new Alumno(2, "Ana", "López", fechaNacimiento2, "2º", 7.0, 8.0);
        Alumno al3 = new Alumno(3, "Luis", "Martínez", fechaNacimiento3, "3º", 9.0, 10.0);

        //Creamos una instancia para gestionar los alumnos.
        GestionAlumnos ga = new GestionAlumnos();

        //Añadimos los 3 alumnos que hemos creado
        ga.addAlumno(al1);
        ga.addAlumno(al2);
        ga.addAlumno(al3);

        //Mostramos Alumnos del metodo anteriormente creado
        ga.mostrarAlumnos();
        System.out.println();

        //Mostramos Notas del metodo anteriormente creado
        ga.mostrarNotas();

        /*Se busca al alumno con número de expediente 2 (en este caso, Ana López)
        utilizando el método buscarAlumnoPorNumeroExpediente().
                Si se encuentra el alumno, se guarda en la variable alumno.
                Luego, se imprime la información del alumno utilizando el método toString().
                Dependiendo de cómo esté implementado el método toString() en la clase Alumno5,
        se mostrará una representación textual del alumno.*/
        Alumno alumno = ga.buscarAlumnoPorNumeroExpediente(2);
        System.out.println(alumno.toString());
        System.out.println();
        System.out.println(alumno);//por defecto llama a toString
    }
}
