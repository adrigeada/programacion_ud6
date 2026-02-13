package org.example.ECommerce;

public class Paypal extends MetodoPago{
    private final String FORMATO_CUENTA= "^[A-Za-z0-9+_.-]+@[A-Za-z0-9+_.-]+.com$";

    private String cuenta;
    private double saldo;

    public Paypal(String cuenta){
        this.cuenta = cuenta;
        this.saldo = 23;
    }

    public boolean validarPayPal(){

        if (cuenta.matches(FORMATO_CUENTA)){
            System.out.println("Cuenta válida");
            return true;
        }else {
            System.out.println("Formato de cuenta no válido");
            return false;
        }
    }

    public boolean validarSaldo(double importe){
        if (importe<=saldo){
            System.out.println("Saldo suficiente. Procesando pago de "+importe+"€. Nuevo saldo: "+(saldo-importe)+"€.");
            return true;
        }else {
            System.out.println("Saldo insuficiente para pagar "+importe+"€. Tu saldo actual es: "+saldo);
            return false;
        }
    }


    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de importe "+importe+"€ con PayPal.");
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Paypal{" +
                "cuenta='" + cuenta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
