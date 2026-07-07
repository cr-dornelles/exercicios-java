package org.example;

public class ExemploAbstracao {
    public static void main(String[] args) {
        ContaCorrente corrente = new ContaCorrente();
        corrente.setTitular("Cristian");
        corrente.setSaldo(1000.00);

        ContaPoupanca poupanca = new ContaPoupanca();
        poupanca.setTitular("Vitória");
        poupanca.setSaldo(500.00);

        System.out.println("--- Taxas ---");
        corrente.calcularTaxa();
        poupanca.calcularTaxa();

        System.out.println("\n--- Transferência ---");
        System.out.println("Saldo corrente antes: " + corrente.getSaldo());
        System.out.println("Saldo poupança antes: " + poupanca.getSaldo());

        corrente.transferir(300.00, poupanca);

        System.out.println("Saldo corrente depois: " + corrente.getSaldo());
        System.out.println("Saldo poupança depois: " + poupanca.getSaldo());
    }
}
