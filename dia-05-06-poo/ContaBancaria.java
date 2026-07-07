package org.example;

public abstract class ContaBancaria {

    private String titular;
    protected double saldo;

    public abstract void calcularTaxa();

    public String getTitular() {
        return titular;
    }

    public void setTitular(String novoTitular) {
        titular = novoTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double novoSaldo) {
        if (novoSaldo >= 0) {
            saldo = novoSaldo;
        }
    }
}
