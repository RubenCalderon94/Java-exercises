package Ej2;

public class Main {
    public static void main(String[] args) {

        //Prueba las clases: crea clientes, cuentas, haz depósitos y transferencias.


        //INSTANCIAMOS DOS CLIENTES ( CREAMOS DOS CLIENTES)
        Cliente cliente1 = new Cliente("85500050D", "ruben", "calderon", "655411221");
        Cliente cliente2 = new Cliente("85500050d", "CARLOS", "calderon", "655411221");

        //INSTANCIAMOS DOS CUENTAS BANCARIAS (CREAMOS DOS CUENTAS BANCARIAS )

        CuentaBancaria cb1 = new CuentaBancaria(12.544, "122211522211444555", cliente1);
        CuentaBancaria cb2 = new CuentaBancaria(45.214, "44474558874455445", cliente2);


        System.out.println("Saldo cuenta1: " + cb1.getSaldo());
        System.out.println("Saldo cuenta2: " + cb2.getSaldo());


        cb1.depositar(400);
        System.out.println("Nuevo saldo cuenta1: " + cb1.getSaldo());

        cb1.transferencia(cb2,350);
        System.out.println("Nuevo saldo cuenta2: " + cb1.getSaldo());
        System.out.println("Saldo cuenta1: " + cb2.getSaldo());
    }
}
