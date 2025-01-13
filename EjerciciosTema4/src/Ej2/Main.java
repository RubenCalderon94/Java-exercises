package Ej2;

public class Main {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado( 6556, "Ruben", "Cald", 1500);
        Empleado empleado2 = new Empleado( 7777, "Juan", "Ruiz", 1600);

        //IMPRIMIMOS NOMBRES DE EMPLEADO 1 Y 2
        System.out.println(empleado1.getNombreCompleto());
        System.out.println(empleado2.getNombreCompleto());


        //INCREMENTAMOS SALARIO AL EMPLEADO2
        empleado2.incrementaSalario(30);
        System.out.println(empleado2.getSalarioMensual());

        //IMPRIMIMOS SOLO SALARIOS
        System.out.println(empleado1.getSalarioAnual());
        System.out.println(empleado2.getSalarioAnual());


        //IMPRIMIMOS TODOS LOS DATOS DE CADA EMPLEADO
        System.out.println(empleado1.toString());
        System.out.println();
        System.out.println(empleado2.toString());
    }
}