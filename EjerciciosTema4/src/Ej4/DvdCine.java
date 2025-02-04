package Ej4;

/*
Diseña un programa Java que trabaje con una clase llamada DvdCine.
a. Su atributos serán: título, director, productora, actores principales,
género, resumen y duración.
b. Debe incluir un constructor que reciba como parámetros los atributos.
c. Crea un método llamado esThriller que devuelva true o false según la
película sea o no de este género.
d. Crea todos los métodos gets/sets.
e. Crea un método llamada mismaProductora que reciba un objeto de la
clase DvdCine como parámetro. Este método devuelve true o false si
el objeto utilizado con el método es de la misma productora que el
pasado como parámetro.
f. Crea objetos y prueba estos métodos.

 */
import java.util.ArrayList;
import java.util.Objects;
public class DvdCine {

    //ATRIBUTOS A).

    private String titulo;
    private String director;
    private String productora;
    private ArrayList<String> actores=new ArrayList<String>();
    private Genero genero;
    private String resumen;
    private int duracion;

    //CONTRUCTOR B).

    public DvdCine(String titulo,String director, String productora,
                   ArrayList<String> actores, Genero genero, String resumen, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.productora = productora;
        this.actores = actores;
        this.genero = genero;
        this.resumen = resumen;
        this.duracion = duracion;


    }

    //BOLEAN METODO THRILLER C).

    public boolean esThriller(){
        //return this.genero == Generos.THRILLER;
        return this.genero.equals(Genero.THRILLER);
    }


    //GETTER Y SETTER D).


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public ArrayList<String> getActores() {
        return actores;
    }

    public void setActores(ArrayList<String> actores) {
        this.actores = actores;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }


  // BOLEAN METODO MISMA  PRODUCTORA E).
  public boolean mismaProductora(DvdCine otroCine){
      return this.productora.equals(otroCine.getProductora());
  }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DvdCine dvdCine = (DvdCine) o;
        return Objects.equals(titulo, dvdCine.titulo) && Objects.equals(director, dvdCine.director);
    }

    /*
        1. equals(Object o)
    Este método compara el objeto actual con otro objeto o para determinar si son iguales. Los pasos son:

    Si el objeto o es null o no es de la misma clase que el objeto actual, devuelve false.
    Si el objeto o es de la misma clase (DvdCine), compara los atributos titulo y director usando Objects.equals().
    Este método maneja correctamente las comparaciones con valores null.
    Si ambos atributos son iguales, devuelve true, indicando que los objetos son considerados iguales.
     */

    @Override
    public int hashCode() {// NOS CREA UN CODIGO ESPECIFICO PARA TITULO Y DIRECTOR
        return Objects.hash(titulo, director);
    }


    /*
    2. hashCode()
      Este método genera un valor hash único para el objeto, basado en los atributos titulo y director.
      Usar Objects.hash() asegura que dos objetos iguales (según el método equals())
      tendrán el mismo valor hash, lo cual es importante cuando los objetos se
      usan en colecciones como HashMap o HashSet.
     */


    @Override
    public String toString() {
        return "DvdCine{" +
                "titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", productora='" + productora + '\'' +
                ", actores=" + actores +
                ", genero=" + genero +
                ", resumen='" + resumen + '\'' +
                ", duracion=" + duracion +
                '}';


        /*
        toString()
        Este método genera una representación en forma de cadena (String) del objeto.
        En este caso, devuelve un String con los valores de los atributos titulo, director, productora,
        actores, genero, resumen y duracion, de una forma legible.
        Esto es útil para imprimir el objeto o mostrarlo en un log de manera más comprensible.
         */
    }



}
