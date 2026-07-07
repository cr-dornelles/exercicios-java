package org.example;

public class ContaCorrente extends ContaBancaria implements Transferivel {

    private double limiteChequeEspecial;

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limite) {
        if (limite >= 0) {
            limiteChequeEspecial = limite;
        }
    }

    @Override
    public void calcularTaxa() {
        System.out.println("Taxa mensal: R$ 12,90");
    }

    @Override
    public void transferir(double valor, ContaBancaria destino) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            destino.setSaldo(destino.getSaldo() + valor);
        }
    }
}
