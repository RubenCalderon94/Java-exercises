package PruebaExamen;

import jdk.jshell.execution.Util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    Gestion g;
    List<Trabajador> lista;

    public static void main(String[] args) {

        Main p = new Main();
        p.init();

    }

    private void init() {
        boolean salir=false;
        int opcion;

        g = new Gestion();
        lista= new ArrayList<>();
        do {
            showMenu();
            opcion=sc.nextInt();
            sc.nextLine(); //limpia el buffer;
            switch(opcion) {
                case 0://Cargar
                    //g.cargarTrabajadores();
                    break;
                case 1://Nuevo Estudiante
                    Trabajador t = insertarNuevoTrabajador();
                    g.nuevoTrabajador(t);
                    break;
                case 2://Buscar Trabajador por Id
                    System.out.println("Introduce Id del trabajador:");
                    System.out.println(g.buscarTrabajador(sc.nextInt()).toString());
                    break;
                case 3://Buscar Trabajador por Nombre
                    System.out.println("Introduce nombre del trabajador:");
                    System.out.println(g.buscarTrabajador(sc.nextLine()).toString());
                    break;
                case 4://Devuelve lista Trabajadores de una clase(Comercial o Produccion)
                    System.out.println("Introduce clase");
                    lista=g.buscarTrabajadorClase(sc.nextLine());
                    for (Trabajador j : lista) {
                        System.out.println(j.toString());
                    }
                    break;
                case 5://Buscar si un Trabajador está repetido, 1=no repetido, >1 si
                    System.out.println("Introduce Id del trabajador:");
                    Trabajador t1 = g.buscarTrabajador(sc.nextInt());
                    if(t1 instanceof Comercial) {
                        if(g.buscarRepetidos((Comercial) t1)>1) {
                            System.out.println("Si hay repetidos de este trabajador");
                        }
                        else {
                            System.out.println("No hay repetidos de este trabajador");
                        }
                    }
                    break;
                case 6://Eliminar Trabajador por Id
                    System.out.println("Introduce Id del trabajador:");
                    if(g.eliminarTrabajador(sc.nextInt())) {
                        System.out.println("Eliminado trabajador");
                    }
                    else {
                        System.out.println("No se encuentra id");
                    }
                    break;
                case 7://Mostrar lista ordenada por Id(orden natural)
                    g.mostrarListaOrdenNatural();
                    break;
                case 8://Mostrar lista ordenada por Nombre
                    g.mostrarListaOrdenNombre();
                    break;
                case 9://ventas realizadas
                    System.out.println("Introduce Id del trabajador:");
                    Trabajador t2 = g.buscarTrabajador(sc.nextInt());
                    if(t2 instanceof Comercial) {
                        System.out.println("Ventas realizadas: "+((Comercial) t2).ventasRealizadas());
                    }
                    break;
                case 10://Consulta BD
                    //g.consultaBD();
                    break;
                case 11://Salir
                    salir=true;
                    break;
                default:
                    System.out.println("Debe elegir una opción del menú.");
            }

        }while(!salir);

    }

    private Trabajador insertarNuevoTrabajador() {
        int id;
        String nombre, puesto;
        LocalDate fechaNacimiento;
        double kilometros, salarioBase;

        System.out.println("Nuevo Trabajador");
        System.out.println("Id:");
        id=sc.nextInt();//si el id se calcula automaticamente no hay que enviarlo
        sc.nextLine();//limpia el buffer
        System.out.println("Nombre:");
        nombre = sc.nextLine();
        System.out.println("Fecha Nacimiento (dd/mm/yyyy):");
        fechaNacimiento = LocalDate.parse(sc.nextLine());//dd/mm/yyyy
        ;
        System.out.println("El trabajador es comercial S/N?");
        if(sc.nextLine().toUpperCase().equals("S")) {
            System.out.println("Kilometros:");
            kilometros=sc.nextDouble();
            sc.nextLine();
            System.out.println("Salario Base:");
            salarioBase=sc.nextDouble();

            return new Comercial(id, fechaNacimiento, nombre,kilometros, salarioBase);
        }
        else { //en caso contrario es de Produccion
            System.out.println("Puesto( operario, encarjado, jefe:");
            puesto=sc.nextLine();
            System.out.println("Salario Base:");
            salarioBase=sc.nextDouble();
            sc.nextLine();
            return new Produccion(id, fechaNacimiento, nombre,puesto, salarioBase);
        }
    }

    private void showMenu() {

        System.out.println("-----MENU-----\n" +
                "0 Cargar\n" +
                "1 Nuevo Trabajador\n" +
                "2 Buscar Trabajador por Id\n"+
                "3 Buscar Trabajador por Nombre\n"+
                "4 Buscar Trabajador de un tipo\n"+
                "5 Buscar si un Trabajador está repetido\n"+
                "6 Eliminar Trabajador por Id\n" +
                "7 Mostrar lista ordenada por Id\n"+
                "8 Mostrar lista ordenada por Nombre\n"+
                "9 Ventas realizadas\n"+
                "10 Guardar\n"+
                "11 Consulta BD\n"+
                "12 Salir");
    }
}
