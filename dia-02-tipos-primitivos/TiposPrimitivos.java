package org.example;

public class TiposPrimitivos {

    public static void main(String[] args) {

        // --- INTEIROS ---
        int idade = 28;
        long cpf = 12345678901L;

        // --- DECIMAIS ---
        double preco = 49.90;

        // --- LÓGICO ---
        boolean ativo = true;

        // --- CARACTERE ---
        char inicial = 'C';

        // --- IMPRIMINDO OS PRIMITIVOS ---
        System.out.println("idade: " + idade);
        System.out.println("cpf: " + cpf);
        System.out.println("preco: " + preco);
        System.out.println("ativo: " + ativo);
        System.out.println("inicial: " + inicial);

        // --- WRAPPERS ---
        Integer idadeObj = idade;           // autoboxing: int → Integer
        Double precoObj = preco;            // autoboxing: double → Double
        Boolean ativoObj = ativo;           // autoboxing: boolean → Boolean

        System.out.println("idadeObj: " + idadeObj);

        // --- MÉTODOS DOS WRAPPERS ---
        int convertido = Integer.parseInt("100");
        String emTexto = Integer.toString(idade);
        int maximo = Integer.MAX_VALUE;

        System.out.println("convertido: " + convertido);
        System.out.println("emTexto: " + emTexto);
        System.out.println("maximo: " + maximo);
    }
}
