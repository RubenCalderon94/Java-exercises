package Ej9;

import java.util.ArrayList;
import java.util.List;

public class Cola implements IcolaPila {

    //ATRIBUTOS
    private int top=0;//posicion de llenado
    private List<Persona> listaCola;//Arraylist para guardar pesona

    //CONSTRUCTOR
    public Cola() {
        listaCola = new ArrayList<>();
    }

    @Override
    public void insertar(Persona p) {
        listaCola.add(p);
    }

    @Override
    public Persona primero() {
        return listaCola.get(0);

    }

    @Override
    public Persona extraer() {
        return listaCola.get(0);//Extrae el primer elemento de la cola
    }

    @Override
    public boolean esVacia() {
        if(listaCola.isEmpty()){ //isEmpty retorna true si la lista esta vacia
            return true;
        }
        return false;
    }

    @Override
    public void mostrar() {
        for (Persona p : listaCola) {
            System.out.println(p);
        }

    }
}
