package Ej6;

/*
 Crea otra clase llamada GestionAlumnos con las siguientes
características:
- Atributos: array de 10 Alumnos
- Métodos:
- llenarArray, rellena el array de alumnos con datos.
- mostrarAlumnos, muestra en pantalla cada alumno y su nota
media.
- mostrarNotas, muestra nº de expediente, nombre y nota media
de cada alumno.
- buscarAlumnoPorNumeroExpediente. Recibe como parámetro
un nº de expediente y devuelve/retorna al alumno con ese nº
expediente, o null si no lo encuentra.
 */

import Ej5.Alumno;

import java.util.ArrayList;

public class GestionAlumnos {

    //ATRIBUTOS
    //Estoy importando la clase Alumnos del ejercicio 5 ya que esta creada
    //y se puede utilizar y no creamos otra desde cero
    private ArrayList<Alumno> listaAlumnos= new ArrayList<>();

    //CONTRUCTOR

    public GestionAlumnos() {
    }

    //METODOS
//REllenar alumnos desde el array
    public void addAlumno(Alumno al) {
        listaAlumnos.add(al);
    }
    //- mostrarAlumnos, muestra en pantalla cada alumno y su nota
    //media.
    public void mostrarAlumnos() {
        for (Alumno al : listaAlumnos) {
            System.out.println(al.getNombre() + ", " + al.getApellidos() + ", " + al.getMedia());
        }
    }
    //- mostrarNotas, muestra nº de expediente, nombre y nota media
    //de cada alumno.
    public void mostrarNotas() {
        for (Alumno al : listaAlumnos) {
            System.out.println(al.getExpediente()+ ", " + al.getNombre() + ", " +al.getApellidos() +", "+ al.getMedia());
        }
    }

    //- buscarAlumnoPorNumeroExpediente. Recibe como parámetro
    //un nº de expediente y devuelve/retorna al alumno con ese nº
    //expediente, o null si no lo encuentra.
    public Alumno buscarAlumnoPorNumeroExpediente(int expediente) {
        for (Alumno al : listaAlumnos) {
            if (al.getExpediente() == expediente) {
                return al;
            }
        }
        return null;
    }

    /*
    Este método busca un alumno en la lista utilizando su número de expediente.
    El parámetro exp es el número de expediente que se quiere buscar.
    Si encuentra un alumno cuyo número de expediente coincide con el proporcionado,
    retorna el objeto Alumno5 correspondiente. Si no lo encuentra, retorna null.
     */











}
