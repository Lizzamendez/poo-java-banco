package model;

public class ContaCorrente extends Conta {

    private static final double TAXA_SAQUE = 1.50;

    public ContaCorrente(String numero, String titular) {
        super(numero, titular);
    }

    @Override
    public boolean sacar(double valor) {
        double valorTotal = valor + TAXA_SAQUE;
        if (saldo >= valorTotal) {
            saldo -= valorTotal;
            return true;
        }
        System.out.println("Saldo insuficiente.");
        return false;
    }
}
