package javacore.modificadorestatico.teste;

import javacore.modificadorestatico.classes.ClienteBlocoInicializacao;

public class ClienteTeste {
    public static void main(String[] args) {

        // Só executa o bloco de inicialização estático uma unica vez
        ClienteBlocoInicializacao c1 = new ClienteBlocoInicializacao();
        ClienteBlocoInicializacao c2 = new ClienteBlocoInicializacao();
        ClienteBlocoInicializacao c3 = new ClienteBlocoInicializacao();

        System.out.println("Tamanho máximo parcelas "+ ClienteBlocoInicializacao.getParcelas().length);
        System.out.println("Tamanho máximo parcelas "+ ClienteBlocoInicializacao.getParcelas().length);
        System.out.println("Tamanho máximo parcelas "+ ClienteBlocoInicializacao.getParcelas().length);
    }
}
