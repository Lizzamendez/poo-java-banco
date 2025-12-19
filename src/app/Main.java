package app;

import model.*;

public class Main {

    public static void main(String[] args) {

        Conta cc = new ContaCorrente("001", "Ana");
        Conta cp = new ContaPoupanca("002", "Carlos");
        Conta ce = new ContaEspecial("003", "Marcos", 500);

        cc.depositar(1000);
        cp.depositar(1000);
        ce.depositar(200);

        cc.sacar(100);
        cp.sacar(100);
        ce.sacar(600);

        cc.transferir(200, cp);

        System.out.println("\n=== Extrato Conta Corrente ===");
        cc.imprimirExtrato();

        System.out.println("\n=== Extrato Conta Poupança ===");
        cp.imprimirExtrato();

        System.out.println("\n=== Extrato Conta Especial ===");
        ce.imprimirExtrato();
    }
}
