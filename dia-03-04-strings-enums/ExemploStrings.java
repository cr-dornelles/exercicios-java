package org.example;

public class ExemploStrings {

    public static void main(String[] args) {

        String nome = "  Cristian Dornelles  ";

        // length — total de caracteres (incluindo espaços)
        System.out.println("length: " + nome.length());

        // trim — remove espaços do início e do fim
        String nomeSemEspacos = nome.trim();
        System.out.println("trim: " + nomeSemEspacos);

        // toUpperCase / toLowerCase
        System.out.println("maiúsculas: " + nomeSemEspacos.toUpperCase());
        System.out.println("minúsculas: " + nomeSemEspacos.toLowerCase());

        // contains — verifica se um trecho existe
        System.out.println("contém 'Cristian': " + nomeSemEspacos.contains("Cristian"));
        System.out.println("contém 'Bruno': " + nomeSemEspacos.contains("Bruno"));

        // replace — substitui um trecho por outro
        String substituido = nomeSemEspacos.replace("Cristian", "Vitória");
        System.out.println("replace: " + substituido);

        // substring — extrai um pedaço pelos índices
        System.out.println("substring(0,8): " + nomeSemEspacos.substring(0, 8));

        // split — divide em partes usando um separador
        String[] partes = nomeSemEspacos.split(" ");
        System.out.println("split[0]: " + partes[0]);
        System.out.println("split[1]: " + partes[1]);

        // imutabilidade — nome original não mudou
        System.out.println("nome original: " + nome);
    }
}
