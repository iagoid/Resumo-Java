package javacore.modificadorestatico.classes;

public class ClienteBlocoInicializacao {
    private static int[] parcelas;
    //    0 - Bloco de inicialização é executado a JVM carregar a classe
    //    1 - alocado espaço a memória para objeto criado
    //    2 - Cada atributo de classe é criado com seus valores default ou os declarados
    //    3 - bloco de inicialização é executado
    //    4 - O construtor é executado

    // Bloco de Inicialização Estático
    // Cuidado, ele é executado apenas uma vez
    // Caso existam dois blocos de inicializacao estáticos eles são
    // executados naa ordem que aparecerem
    // Caso tenha um bloco não estático ele executa depois dos estáticos todas as vezes que for chamado
    {
        System.out.println("Será executado depois dos estáticos todas as vezes que for chamado");
    }

    static {
        parcelas = new int[100];
        System.out.println("Exibindo Parcelas");
        for(int i = 1; i <= 100; i++){
            parcelas[i-1] = i;
        }
    }

    static {
        System.out.println("Programa Carregado");
    }


    public ClienteBlocoInicializacao() {
    }

    public static int[] getParcelas() {
        return parcelas;
    }

    public static void setParcelas(int[] parcelas) {
        ClienteBlocoInicializacao.parcelas = parcelas;
    }
}
