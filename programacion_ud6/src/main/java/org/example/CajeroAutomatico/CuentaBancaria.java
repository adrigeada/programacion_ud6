package org.example.CajeroAutomatico;

public class CuentaBancaria {
    static final int LIMITE_DIARIO = 600;
    static final int LIMITE_INGRESO = 3000;

    private int saldo;

    public CuentaBancaria(int saldo){
        this.saldo = saldo;
    }

    public void ingresar(int cantidad){

        if (cantidad >= LIMITE_INGRESO){
            throw new DepositoMaximoException(LIMITE_INGRESO);
        }
        saldo = saldo+cantidad;
    }

    public void retirar(int cantidad){

        if (cantidad > saldo){
            throw new SaldoInsuficienteException();
        } else if (cantidad >= LIMITE_DIARIO) {
            throw new LimiteDiarioException(LIMITE_DIARIO);
        }
        saldo = saldo-cantidad;
    }

    public void consultar(){
        System.out.println("Saldo disponible: "+saldo+"€");
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "saldo=" + saldo +
                '}';
    }
}
