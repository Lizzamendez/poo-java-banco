package model;

public class ContaEspecial extends Conta {

    private double limite;

    public ContaEspecial(String numero, String titular, double limite) {
        super(numero, titular);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (saldo + limite >= valor) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("Limite insuficiente.");
            return false;
        }
    }

    public double getLimite() {
        return limite;
    }

    @Override
    public void imprimirExtrato() {
        super.imprimirExtrato();
        System.out.println("Limite: " + limite);
    }
}
