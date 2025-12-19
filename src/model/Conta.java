package model;

public abstract class Conta {

    private String numero;
    private String titular;
    protected double saldo;

    public Conta(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public abstract boolean sacar(double valor);

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void transferir(double valor, Conta destino) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Não foi possível realizar a transferência.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public void imprimirExtrato() {
        System.out.println("Titular: " + titular);
        System.out.println("Conta: " + numero);
        System.out.println("Saldo: " + saldo);
    }
}
