package Ej8;

import java.util.*;

/*
. Diseña un programa Java que cree un ArrayList y lo llene con 10 valores enteros
elegidos al azar y comprendidos entre 1 y 10. El programa mostrará en pantalla los
valores del arrayList en orden ascendente y las veces que se repite cada uno. Utiliza
un HashMap para realizar las cuentas.
 */
public class Ejercicio8 {
    public static void main(String[] args) {

        Random rd = new Random();
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            lista.add(rd.nextInt(10)+1);
        }

        Collections.sort(lista);//Ordena la lista
        for (Integer i : lista) { //Recorre la lista para imprimir
            System.out.println(i+",");
        }


        Map<Integer, Integer> mapRepe = new HashMap<>();
        for (Integer n : lista) {
            if (mapRepe.containsKey(n)) {//Si el numero ya esta en el mapa se le suma 1
                mapRepe.put(n, mapRepe.get(n) + 1);
            }

        }


        for (Integer k : mapRepe.keySet()) {
            System.out.println("El número "+k+" se repite "+mapRepe.get(k)+" veces");
        }


    }



}
