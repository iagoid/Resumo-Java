package javacore.blocodeinicializacao.classes;

public class Cliente {
    //    1 - alocado espaço a memória para objeto criado
    //    2 - Cada atributo de classe é criado com seus valores default ou os declarados
    //    3 - bloco de inicialização é executado
    //    4 - O construtor é executado
    private int[] parcelas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

    // Bloco de Inicialização
    {
        parcelas = new int[100];
        System.out.println("Exibindo Parcelas");
        for(int i = 1; i <= 100; i++){
            parcelas[i-1] = i;
        }
    }

    public Cliente() {
        System.out.println("Exibindo Parcelas");
        for (int parcela : this.parcelas) {
            System.out.print(parcela + " ");
        }
    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}
