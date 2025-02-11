package Ej4;

public class Main {
    public static void main(String[] args) {

        // TODO Auto-generated method stub
        ColeccionCuentas cuentas = new ColeccionCuentas();


        cuentas.mostrarCuentas();
        int cuentasActualizadas = cuentas.incrementarSaldoCuentasDe("1", 1000.9);
        System.out.println("*************************************");
        System.out.println(cuentasActualizadas);
        cuentas.mostrarCuentas();

        CuentaBancaria c = cuentas.buscarCuenta("10004");
        if (c!=null)
            System.out.println(c.toString());
        else
            System.out.println("La cuenta no existe");

        System.out.println(cuentas.transferirCantidad("10000", "10004",-1000));
        cuentas.mostrarCuentas();

    }

}
