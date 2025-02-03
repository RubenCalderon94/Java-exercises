package Ej12;

public class Main {
    public static void main(String[] args) {
        //CREAMOS DOS INSTANCIAS Y SE CREA EL OBJETO p1 y p2
        Password p1 = new Password();
        Password p2 = new Password(20);
        //MOSTRAMOS CONTRASEÑA DE p1 con p1.getContrasena() y al igual con p2
        System.out.println("Contraseña 1: " + p1.getContrasena());
        System.out.println("Contraseña 2: " + p2.getContrasena());
        //COMO CREAMOS UN METODO BOOLEAN PARA VER SI p1 y p2 es fuerte o no
        System.out.println("Contraseña 1 es fuerte: " + p1.esFuerte());
        System.out.println("Contraseña 2 es fuerte: " + p2.esFuerte());

    }
}
