package Ej7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static  List<Producto> listaProductos = new ArrayList<>();


    public static void main(String[] args) {


        listaProductos.add(new Fresco("001",  LocalDate.of(2025, 5, 15),
                "Lechuga", 1235, LocalDate.of(2026, 5, 15), "España"));

       //MOSTRAR PRODUCTOS SOLO SE HACE UNO PARA PROBAR
        for (Producto p : listaProductos) {
            p.mostrarInfo();
        }



    }
}
