package org.example;

public class ContaPoupanca extends ContaBancaria {

    private double taxaRendimento;

    @Override
    public void setSaldo(double novoSaldo) {
        if (novoSaldo >= 100) {
            saldo = novoSaldo;
        }
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxa) {
        if (taxa >= 0) {
            taxaRendimento = taxa;
        }
    }

    @Override
    public void calcularTaxa() {
        System.out.println("Sem taxa");
    }

}
