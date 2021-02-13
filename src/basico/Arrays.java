package basico;

import javacore.sobrecarga_construtores.classes.Estudante;

import java.util.ArrayList;
import java.util.Collections;

public class Arrays {
    public static void main(String[] args) {


        // ArrayList
        // É melhor usar um ArrayList pois eu posso modificar
        // seu tamanho a qualquer momento
        ArrayList<String> carros = new ArrayList<String>();

        //adicionando elementos no ArrayList
        carros.add("Fusca");
        carros.add("Kombi");
        carros.add("Opala");

        //adicionando elemento no ArrayList em uma determinada posição
        carros.add(0, "Belina");

        //imprimindo todos os elementos do ArrayList carros
        System.out.println(carros + " Tamanho: " + carros.size());

        //para pegar um elemento, usa-se o método get
        String imprimir = carros.get(2);
        System.out.println("O carro na posição 2 é: " + imprimir);

        //alterar o elemento da posição 3
        carros.set(3, "Corsa");
        System.out.println(carros + " Tamanho: " + carros.size());

        //remove o elemento na posição 1
        carros.remove(1);
        System.out.println(carros + " Tamanho: " + carros.size());

        //removendo o objeto passado como parâmetro
        carros.remove("Corsa");
        System.out.println(carros + " Tamanho: " + carros.size());

        //Percorrendo todos os elementos de um ArrayList usando o for
        System.out.print("Imprimindo todos os elementos na mesma linha: ");
        for (int i = 0; i < carros.size(); i++) {
            System.out.print(carros.get(i) + " ");
        }

        //Percorrendo todos os elementos de um ArrayList usando o for, sem necessidade de uso de variável de controle
        System.out.print("\n\nImprimindo todos os elementos na mesma linha - versão 2: ");
        for (String c : carros) {
            System.out.print(c + " ");
        }

        //adicionando mais alguns elementos
        carros.add("Focus");
        carros.add("Ranger");
        carros.add("Ecoport");
        carros.add("Fiesta");

        //Imprimendo todos os elementos
        System.out.println("\n" + carros + " Tamanho: " + carros.size());

        //Ordenando todos os elementos em órdem alfabética
        Collections.sort(carros);
        System.out.println(carros + " Tamanho: " + carros.size());

        //se o ArrayList não estiver vazio, procurar o elemento Ranger e informar a posição que ele se encontra
        if (!carros.isEmpty()) {
            if (carros.contains("Ranger")) {
                System.out.println("Tem o objeto Ranger, na posição: " + carros.indexOf("Ranger"));
            } else {
                System.out.println("Não tem o objeto Ranger");
            }
        }

        //limpar todos os elementos de um ArrayList
        carros.clear();
        System.out.println(carros + " Tamanho: " + carros.size());
        System.out.println("\n\n");


        // ArrayList de Objetos
        // * Antes estude o que é um objeto e sobrecarga

        ArrayList<Estudante> estudanteArrayList = new ArrayList<>();

        Estudante estudante1 = new Estudante("2020302020", "Iago", new double[]{7.4, 6.7, 9});
        Estudante estudante2 = new Estudante("34873487348", "Lucas", new double[]{7, 10, 4.5});
        Estudante estudante3 = new Estudante("332345435", "Maria", new double[]{7, 6.7, 9}, "12/02/21");
        estudanteArrayList.add(estudante1);
        estudanteArrayList.add(estudante2);
        estudanteArrayList.add(estudante3);

        for (Estudante estudante : estudanteArrayList) {
            estudante.imprime();
        }
        System.out.println("\n\n");

        /////////////////////////////////////////////////////////////////////////////////////////////////////////


        // Arrays normais
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
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // Foreach
        array2[0] = "Troquei";
        array2[1] = "Troquei de novo";
        for (String palavra : array2) {
            System.out.println(palavra);
        }

        // Matriz
        int[][] matriz = new int[2][]; // tamanho da linha e coluna o tamanho da coluna não precisa ser declarado
        int[][] matriz2 = {{1, 2, 3}, {5, 6}, {100}};

        matriz2[0][0] = 200;
        matriz2[0][1] = 300;
        for (int[] numero : matriz2) {
            for (int n : numero) {
                System.out.print(n + " ");
            }
        }


        int[][] matriz3 = new int[2][10];
        for (int i = 0; i < 2; i++) { //linha
            for (int j = 0; j < 10; j++) { //coluna
                matriz3[i][j] = j;
            }
        }
        System.out.println();
        for (int[] linha : matriz3) { //linha
            for (int coluna : linha) { //coluna
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }
}
