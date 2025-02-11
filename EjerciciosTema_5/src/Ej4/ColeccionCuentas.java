package Ej4;

import java.util.ArrayList;
import java.util.Random;

public class ColeccionCuentas {
    private ArrayList<CuentaBancaria> listaCuentas = new ArrayList<>();

    public ColeccionCuentas() {
        Random rnd = new Random();
        Cliente [] clientes = {new Cliente("1", "Sara Baras", "654456777"),
                new Cliente("2", "Paloma Alba", "653336777"),
                new Cliente("3", "Ferm�n Cacho", "37377377"),
                new Cliente("4", "Gimena Asa", "388399399")};

        for (int i = 0; i < clientes.length; i++) {
            listaCuentas.add(new CuentaBancaria("1000"+i, clientes[rnd.nextInt(clientes.length)], 2000));
        }
    }

    public void mostrarCuentas() {
        for(CuentaBancaria c: listaCuentas) {
            System.out.println(c);
        }
    }

    //retorna el n� de cuentas actualizadas
    //incrementa en la cantidad pasada las cuentas de ese cliente.
    public int incrementarSaldoCuentasDe (String dniCliente, double cantidad) {
        int cuentasActualizadas = 0;
        for(CuentaBancaria c: listaCuentas) {
            if (c.getCliente().getDni().equals(dniCliente)) {
                c.depositar(cantidad);
                cuentasActualizadas++;
            }
        }
        return cuentasActualizadas;
    }

    //retorna la cuenta con ese n�mero
    public CuentaBancaria buscarCuenta(String numeroCuenta) {
        for (CuentaBancaria c: listaCuentas) {//for each
            if (c.getNumeroCuenta().equals(numeroCuenta)) {//equals de String
                return c;
            }
        }
        return null;
    }

    //retorna true si se pudo hacer la transferencia y false en caso contrario
    public boolean transferirCantidad(String cuentaOrigen, String cuentaDestino, double cantidad) {

        CuentaBancaria origenCuenta = buscarCuenta(cuentaOrigen);
        CuentaBancaria destinoCuenta = buscarCuenta(cuentaDestino);

        if (origenCuenta!=null && destinoCuenta!=null) {
            return origenCuenta.transferencia(destinoCuenta, cantidad);
        } else {
            return false;
        }

    }

}
