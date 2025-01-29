package Ej7;

 /*
 Diseña un programa Java que trabaje con la clase DvdCine creada en el ejercicio
anterior. Crea una clase (GestionDvd) que incluya como atributo un array de objetos
pertenecientes a la clase DvdCine y como métodos las opciones del menú.
El menú de la aplicación sería:
Menú de opciones:
1. Mostrar la lista de películas (Título y productora)
2. Mostrar la película de más duración (Título y minutos)
3. Pedir un género y mostrar el título de las pelis de ese género.
4. Duración de la peli. Pedir título y mostrar su duración.

  */

import Ej4.DvdCine;
import Ej4.Genero;

import java.util.ArrayList;

public class GestionDvd {

    //Creamos un arraylist para las peliculas DvdCine de otro ejercicio anterior
    //EN ESTE CASO SERIA EL ATRIBUTO
    private ArrayList<DvdCine> listaPelis = new ArrayList<>();

    //CONSTRUCTOR
    public GestionDvd() {
        insertarDatosPrueba();
    }


    //METODO para poder insertar peliculas en el ARRAY
    public void insertPeli(DvdCine pelis) {
        listaPelis.add(pelis);
    }

    //Insertamos los datos que nos proporciona el ejercicio
    public void insertarDatosPrueba() {

        //1
        ArrayList<String> actors = new ArrayList<String>();
        actors.add("Ian McKellen");
        actors.add("Martin Freeman");
        listaPelis.add(new DvdCine("El hobbit. La desolación de Smaug", "Peter Jackson",
                "New Line Cinema.", actors, Genero.FICCION, "Bla...", 123));
        //2
        ArrayList<String> actors1 = new ArrayList<String>();
        actors1.add("Al Pacino");
        actors1.add("Marlon Brando");
        listaPelis.add(new DvdCine("El Padrino", "Francis Ford Copola", "Paramount Pictures",
                actors1, Genero.DRAMA, "Bla...", 175));
        //3
        ArrayList<String> actors2 = new ArrayList<String>();
        actors2.add("Di Caprio");
        listaPelis.add(new DvdCine("Titanic", "Francis Ford Copola", "Paramount Pictures. 20th" +
                "Century Fox", actors2, Genero.DRAMA, "Bla...", 123));
        //4
        listaPelis.add(new DvdCine("El Rey León", "WD", "Walt Dysney", null, Genero.INFANTIL,
                "Bla...", 86));
        //5
        listaPelis.add(new DvdCine("Los Vengadores", "--", "Marvel Studios. Walt Dysney", null,
                Genero.FICCION, "Bla...", 114));
        //6
        listaPelis.add(new DvdCine("Avatar", "Francis Ford Copola", "20th Century Fox", null,
                Genero.FICCION, "Bla...", 126));
        //7
        listaPelis.add(new DvdCine("Harry Potter. Las reliquias de la muerte", "--", "Warner Bros.",
                null, Genero.FICCION, "Bla...", 131));
        //8
        listaPelis.add(new DvdCine("El señor de los anillos. El retorno del rey", "Francis Ford" +
                "Copola", "New Line Cinema", null, Genero.FICCION, "Bla...", 175));
        //9
        listaPelis.add(new DvdCine("Toy Story 3", "----", "Dysney/Pixar", null, Genero.INFANTIL, "Bla...",
                78));
        //10
        listaPelis.add(new DvdCine("The Dark Knight Rises", "--", "Warner Bros.", null, Genero.FICCION, "Bla...", 99));
    }

    //1. Mostrar la lista de películas (Título y productora)
    public ArrayList<DvdCine> mostrarLista() {
        return listaPelis;
    }

    //2. Mostrar la película de más duración (Título y minutos)
    public String pelisMasDuracion() {
        int duracion = 0;
        String tituloDuracion = "";
        for (DvdCine peli : listaPelis) {
            if (peli.getDuracion() > duracion) {
                duracion = peli.getDuracion();
                tituloDuracion = peli.getTitulo();
            }
        }
        return tituloDuracion + ", " + duracion;
    }

    //3. Pedir un género y mostrar el título de las pelis de ese género.
    public ArrayList<String> mostrarTitulo(String genero) {
        ArrayList<String> pelisGeneros = new ArrayList<>();
        Genero generoEnum = Genero.valueOf(genero.toUpperCase());

        for (DvdCine peli : listaPelis) {
            if (peli.getGenero().equals(generoEnum)) {
                pelisGeneros.add(peli.getTitulo());
            }
        }
        return pelisGeneros;

    }

    //4. Duración de la peli. Pedir título y mostrar su duración.
    public int mostraDuracion(String tit) {

        for (DvdCine peli : listaPelis) {
            if (peli.getTitulo().equals(tit)) {
                return peli.getDuracion();
            }
        }
        return 0;
    }


}




