package Ej9;

/*
Diseña también una clase llamada GestionProgramas que contendrá:
- un array de 25 elementos de la clase Programa
- métodos que sirvan para programar las funciones del siguiente menú:
Menú
1. Insertar nuevo programa (controlar elementos libres)
2. Mostrar lista de software
3. Filtrar por licencia
4. Filtrar por función
5. Eliminar el último elemento
6. Buscar programa por nombre y retornar programa
7. Salir
 */
import java.util.ArrayList;

public class GestionProgramas {

    //Creamos el ARRAYLIST que se van a introducir los datos de la clase Programa
    private ArrayList<Programa> listaPrograma = new ArrayList();

    //METODO 1. Insertar nuevo programa (controlar elementos libres)
    public void  InsertPrograma (Programa p) {
        listaPrograma.add(p);
    }

    //METODO 2.Mostrar lista de software
    public void mostrarProgramas (){
        for (Programa p : listaPrograma) {
            System.out.println(p);
        }

    }
    //METODO  3.Filtrar por licencia
    public void filtrarPorLicencia (String licencia) {
        for (Programa p : listaPrograma) {
            if (p.getLicencia().equals(licencia)) {
                System.out.println(p);
            }
        }
    }

    //METODO 4.Filtrar por función
    public void filtrarPorFuncion (String funcion) {
        for (Programa p : listaPrograma) {
            if (p.getFuncion().equals(funcion)) {
                System.out.println(p);
            }
        }
    }

    //METODO 5. Eliminar el último elemento
    public void eliminarUltimoElemento() {
        //if (listaProgramas.size() > 0) {
        if (!listaPrograma.isEmpty()) {
            listaPrograma.remove(listaPrograma.size() - 1);
        }
    }

    //METODO 6. Buscar programa por nombre y retornar programa
    //DEEBEMOS RETORNAR POR LO TANTO NO SE USA VOID, PORQUE DEVUELVE ALGO
    public Programa buscarProgramaPorNombre(String nom) {
        for (Programa p: listaPrograma) {
            if (p.getNombre().equals(nom)) {
                return p;
            }
        }
        return null;
    }



}
