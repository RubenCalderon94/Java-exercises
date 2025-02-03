package Ej2;

public class CuentaBancaria {
    //ATRIBUTOS
    private Cliente cliente;
    private double saldo;
    private String ncuenta;

    //CONSTRUCTOR
    public CuentaBancaria(double saldo, String ncuenta, Cliente cliente) {
        this.saldo = saldo;
        this.ncuenta = ncuenta;
        this.cliente = cliente;
    }

    //GETTER Y SETTER


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNcuenta() {
        return ncuenta;
    }

    public void setNcuenta(String ncuenta) {
        this.ncuenta = ncuenta;
    }



    //METODOS
    //depositar. incrementa el saldo de la cuenta en la cantidad pasada como parámetro.
    public void depositar(double valor){
        saldo += valor;
    }

    //transferencia. Mover una cantidad a otra cuenta. Ambas, cantidad y
    //cuenta, pasadas como parámetro. La operación sólo se llevará a cabo
    //si hay saldo suficiente. Este método devolverá true/false según se
    //pueda realizar o no la transferencia.

    public boolean transferencia(CuentaBancaria cuentaDestino, double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            cuentaDestino.depositar(valor);
            return true;
        }
        return false;
    }

}
