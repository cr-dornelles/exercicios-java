package org.example;

public class ExemploEnum {

    public static void main(String[] args) {

        // declarando uma variável do tipo StatusPedido
        StatusPedido status = StatusPedido.APROVADO;

        // imprimindo o valor
        System.out.println("Status atual: " + status);

        // usando em uma condição
        if (status == StatusPedido.APROVADO) {
            System.out.println("Pedido aprovado. Preparando envio.");
        }

        // listando todos os valores possíveis do enum
        System.out.println("\nTodos os status possíveis:");
        for (StatusPedido s : StatusPedido.values()) {
            System.out.println("  " + s);
        }

        // posição do valor no enum (começa em zero)
        System.out.println("\nPosição de APROVADO: " + status.ordinal());

        // nome do valor como String
        System.out.println("Nome: " + status.name());
    }
}
