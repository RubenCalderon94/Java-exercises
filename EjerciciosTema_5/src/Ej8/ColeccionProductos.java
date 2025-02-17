package Ej8;

import Ej7.Congelado;
import Ej7.Fresco;
import Ej7.Producto;
import Ej7.Refrigerado;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ColeccionProductos {

    //ATRIBUTOS
    private List<Producto> listaProductos;

    //CONSTRUCTOR
    public ColeccionProductos() {
        // INSTANCIAMOS listaProductos, hay se van a guardar todos los productos que vamos a añadir
        listaProductos =  new ArrayList<Producto>();
        //creamos 20 productos
        for(int i = 0; i < 20; i++) {
            int id = i;
            String descripcion = "Producto " + i;
            LocalDate fechaC = LocalDate.of(2025, 06, 01);
            String lote = "1234"+ i;
            int tipo = (int) (Math.random() * 3);
            switch (tipo) {
                case 0://congelado
                    double tempC = -5.0f * i;
                    listaProductos.add(new Congelado("001",  LocalDate.of(2025, 5, 15),
                            "Tomate", 1235, 15));

                    break;
                case 1://regrigerado
                    int codigo = 300 + i;
                    listaProductos.add(new Refrigerado("001",  LocalDate.of(2025, 5, 15),
                            "Tomate", 1235, "España" ));
                    break;
                case 2://Fresco
                    LocalDate fechaE = LocalDate.now().minusDays(5);
                    String [] paises = {"España", "Francia", "Italia", "Alemania", "Portugal"};
                    String pais = paises[(int) (Math.random() * 5)];
                    listaProductos.add(new Fresco("001",  LocalDate.of(2025, 5, 15),
                            "Lechuga", 1235, LocalDate.of(2026, 5, 15), "España"));
            }
        }
        //hago caducar el primer producto
        listaProductos.get(0).setFechaCaducidad(LocalDate.now().minusDays(30));

    }

    //METODOS

    //retorna array de productos
    public List<Producto> getProductos() {
        return listaProductos;
    }

    //modifica la temperatura de congelación de un producto pasado por id
    public boolean modificarTemperaturaCongelacion(String id, double temp) {
        for(Producto p : listaProductos) {
            if(p.getIdproducto() == id && p instanceof Congelado) {
                ((Congelado) p).setTemperatura(temp);
                return true;
            }
        }
        return false;
    }

    //retorna array de productos frescos de un país pasado por parámetro
    public List<Fresco> consultarProductosPorPaisOrigen(String pais) {
        List<Fresco> listaF = new ArrayList<Fresco>();
        for(Producto p : listaProductos) {
            if(p instanceof Fresco && ((Fresco) p).getPaisOrigen().equals(pais)) {
                listaF.add((Fresco) p);
            }
        }
        return listaF;
    }

    //retorna array de productos caducados
    public List<Producto> consultarProductosCaducados() {
        List<Producto> listaCaducados = new ArrayList<Producto>();
        for (Producto p : listaProductos) {
            if(p.getFechaCaducidad().isBefore(LocalDate.now())) {
                listaCaducados.add(p);
            }

        }
        return listaCaducados;
    }

    //retorna array de productos de un tipo pasado por parámetro
    public List<Producto> obtenerProductosDelTipo(String tipo) {
        List<Producto> listaTipo = new ArrayList<Producto>();
        for(Producto p : listaProductos) {
            if(p instanceof Congelado && tipo.equals("Congelado")) {
                listaTipo.add(p);
            } else if(p instanceof Fresco && tipo.equals("Fresco")) {
                listaTipo.add(p);
            } else if(p instanceof Refrigerado && tipo.equals("Refrigerado")) {
                listaTipo.add(p);
            }
        }
        return listaTipo;

    }
}
