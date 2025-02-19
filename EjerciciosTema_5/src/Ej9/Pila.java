package Ej9;

import java.util.ArrayList;
import java.util.List;

public class Pila implements IcolaPila {

    //ATRIBUTOS
    private int top=0;//posicion de llenado
    private List<Persona> listaPila;//Arraylist para guardar pesona

    //Constructor
    public Pila() {
        listaPila = new ArrayList<>();
    }

    @Override
    public void insertar(Persona p) {
        listaPila.add(p);
    }

    @Override
    public Persona primero() {
        return listaPila.get(0);
    }

    @Override
    public Persona extraer() {
        return listaPila.getLast();//accede al último elemento de una estructura
        //OTRA FORMA return listaPila.get(listaPila.size()-1);
    }

    @Override
    public boolean esVacia() {
        return listaPila.isEmpty();
    }

    @Override
    public void mostrar() {
        for (Persona p : listaPila) {
            System.out.println(p);
        }

    }
}
