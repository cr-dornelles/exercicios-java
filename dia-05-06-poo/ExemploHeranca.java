package org.example;

public class ExemploHeranca {
    public static void main(String[] args) {
        System.out.println("--- ContaCorrente ---");
        ContaCorrente corrente = new ContaCorrente();
        corrente.setTitular("Cristian");
        corrente.setSaldo(50.00);
        System.out.println("Saldo com 50: " + corrente.getSaldo());

        System.out.println("\n--- ContaPoupanca ---");
        ContaPoupanca poupanca = new ContaPoupanca();
        poupanca.setTitular("Vitória");
        poupanca.setSaldo(50.00);
        System.out.println("Saldo com 50: " + poupanca.getSaldo());
        poupanca.setSaldo(500.00);
        System.out.println("Saldo com 500: " + poupanca.getSaldo());
    }
}
