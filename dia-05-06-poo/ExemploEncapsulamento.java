package org.example;

public class ExemploEncapsulamento {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaCorrente();
        conta.setTitular("Cristian");
        conta.setSaldo(1000.00);

        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo: " + conta.getSaldo());

        conta.setSaldo(-500);
        System.out.println("Após saldo negativo: " + conta.getSaldo());
    }
}
