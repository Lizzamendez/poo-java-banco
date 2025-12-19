package model;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String numero, String titular) {
        super(numero, titular);
    }

    @Override
    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        System.out.println("Saldo insuficiente.");
        return false;
    }
}
