/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

/**
 *
 * @author Igor
 */
public class ImprimindoVariaveis {
    public static void main(String[] args){
        // tipos de variaveis -- int, double, float, char, string, byte, short, long
        int numeroInteiro = 10;
        String ola = "Seja bem vindo";
        boolean verdade = true;
        long numeroGrande = 1000L;
        char caracteres = 'A', caractereNumero = 99; /* 2 bytes, pode colocar numeros que
        serão traduzidos para tabela unicode */
        char[] semana = {'S', 'T', 'Q', 'Q', 'S', 'S', 'D'};
        System.out.println("caractereNumero " + caractereNumero + " caracteres " + caracteres);
        System.out.println("Seu numero é " + numeroInteiro);
        System.out.println("numeroGrande " + numeroGrande);
        System.out.println();


        //////////////////////////////// String ////////////////////////////////
        // Declaração por medoto primitivo
        String primitivo = new String("Declarada de forma primitiva");
        String primitivo2 = new String(ola + " Iago");
        String primitivo3 = new String(semana);// Transforma em string
        System.out.println(primitivo);
        System.out.println(primitivo2);
        System.out.println(primitivo3);

        String frase = "O importante não é vencer todos os dias, mas lutar sempre.";
        String autor = "Waldemar Valle Martins";

        System.out.println("Tamanho --> " + frase.length());
        System.out.println("Caractere na posicao 2 --> " + frase.charAt(2));
        char[] destino = new char[12];
        // A posição de 0 à 11 da string é armazenada no destino iniciando na posição 0
        frase.getChars(0, 12, destino, 0);
        System.out.print("Da posicao 0 à 11 --> ");
        for (char letra : destino) {
            System.out.print(letra);
        }
        System.out.println();

        String a = "a";
        String a2 = "a";
        String b = "b";
        String c = new String(a);
        System.out.println(a==a2);// Compara se o endereçamento é o mesmo
        System.out.println(a==b);// Compara se o endereçamento é o mesmo
        System.out.println(a==c);// Compara se o endereçamento é o mesmo
        System.out.println("a igual a --> "+ a.equals(a2));// Compara se o conteudo é o mesmo
        System.out.println("a igual b --> "+ a.equals(b));// Compara se o conteudo é o mesmo
        System.out.println("a igual c --> "+ a.equals(c));// Compara se o conteudo é o mesmo
    }
}
