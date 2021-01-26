package basico;

public class Arrays {
    public static void main(String[] args) {
        // Arrays numericos são automaticamente preeenchidos com 0
        // Arrays string são automaticamente preeenchidos com null


        // Definindo os valores na declaração
        int[] array = {1, 2, 3};
        String[] array2 = {"Ola", "Tudo", "Bem"};

        // Definindo um array com 10 posições
        double[] array3 = new double[10];
        String[] array4 = new String[10];

        System.out.println(array3[0]);
        System.out.println(array4[0]);


        // For normal
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        // Foreach
        array2[0] = "Troquei";
        array2[1] = "Troquei de novo";
        for(String palavra : array2){
            System.out.println(palavra);
        }

        // Matriz
        int[][] matriz = new int[2][]; // tamanho da linha e coluna o tamanho da coluna não precisa ser declarado
        int[][] matriz2 = {{1, 2, 3},{5, 6},{100}};

        matriz2[0][0] = 200;
        matriz2[0][1] = 300;
        for (int[] numero: matriz2) {
            for (int n : numero) {
                System.out.print(n + " ");
            }
        }


        int[][] matriz3 = new int[2][10];
        for (int i = 0; i < 2; i++){ //linha
            for (int j = 0; j < 10; j++){ //coluna
                matriz3[i][j] = j;
            }
        }
        System.out.println();
        for (int[] linha : matriz3){ //linha
            for (int coluna : linha){ //coluna
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }
}
