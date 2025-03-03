package Ej12;

public class Main {
    public static void main(String[] args) {

        PersonaDao dao = new PersonaDao();//IMPLEMENTAMOS LA CLASE PERSONADAO

        //Se crean tres objetos de tipo Trabajo (t1, t2, t3)
        Trabajo t1 = new Trabajo(1, "Programador", 2000);
        Trabajo t2 = new Trabajo(2, "Analista", 2500);
        Trabajo t3 = new Trabajo(3, "Jefe de proyecto", 3000);

        //Se crean tres objetos de tipo Persona (p1, p2, p3)
        Persona p1 = new Persona("2342b", t1, "juan", 45);
        Persona p2 = new Persona("2342b", t2, "luis", 40);
        Persona p3 = new Persona("2342b", t3, "carlos", 41);
        System.out.println("--------------------------------------------");
        dao.insertarPersona(p1);
        dao.insertarPersona(p2);
        dao.insertarPersona(p3);
        System.out.println("--------------------------------------------");
        System.out.println("Numero de personas: " + dao.getNumeroPersonas());
        System.out.println("--------------------------------------------");
        System.out.println("Datos de las personas:");
        dao.mostrarDatos();
        System.out.println("--------------------------------------------");
        System.out.println("Buscar persona con dni 2222B: " + dao.buscarPersona("2222B"));
        System.out.println("Buscar persona con dni 4444D: " + dao.buscarPersona("4444D"));
        System.out.println("--------------------------------------------");
        System.out.println("Cambiar puesto de trabajo de persona con dni 2222B a Jefe de proyecto: " + dao.cambiarPuestoTrabajo("2222B", t3));
        System.out.println("--------------------------------------------");
        System.out.println("Datos de las personas:");
        dao.mostrarDatos();
        System.out.println("--------------------------------------------");
        System.out.println("Obtener 2 primeras personas:");
        for (Persona p : dao.getNPrimerasPersonas(2)) {
            System.out.println(p);
        }
        System.out.println("--------------------------------------------");
        dao.eliminarPersonas("2222B");
    }
}
