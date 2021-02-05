/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.util.Locale;

/**
 * @author Igor
 */
public class ImprimindoVariaveis {
    public static void main(String[] args) {
        //////// tipos de variaveis -- int, double, float, char, string, byte, short, long ////////
        int numeroInteiro = 10;
        String ola = "Seja bem vindo";
        double d1 = 1.32323233;
        float f1 = (float) 1.3232;
        boolean verdade = true;
        long numeroGrande = 1000L;
        byte b1 = 127; // Economizar dados em grande arrays
        char caracteres = 'A', caractereNumero = 99; /* 2 bytes, pode colocar numeros que
        serão traduzidos para tabela unicode */
        Character caracter = new Character('X');
        char[] semana = {'S', 'T', 'Q', 'Q', 'S', 'S', 'D'};
        System.out.println("caractereNumero " + caractereNumero + " caracteres " + caracteres);
        System.out.println("Seu numero é " + numeroInteiro);
        System.out.println("numeroGrande " + numeroGrande);
        System.out.println();


        //--------------------------------- Wrappers -----------------------------------------------
        // Os Wrappers permitem que você utilize diversos metodos que os tipos primitivos não possuem
        Integer valor1 = 10;
        Float valor2 = (float) 55.55;
        Boolean valor3 = Boolean.TRUE;
        Short valor4 = (short) 5;
        Character valor5 = 'a';
        Double valor6 = 1.433252;
        Long valor7 = (long) 2324.3233434243;


        // *Lembre-se: os wrappers estão em diferentes locais da memória, logo é necessário compara-los
        // utilizando o equals e não ==.
        // Porém, caso os valores sejam menores que 128 ele executa normalmente
        Integer comparaA = 127;
        Integer comparaB = 127;
        // comparaA = 128;
        // comparaB = 128;

        if(comparaA == comparaB){
            System.out.println("ComparaA igual ComparaB");
        }
        else {
            System.out.println("ComparaA diferente ComparaB");
        }


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
        System.out.println(a == a2);// Compara se o endereçamento é o mesmo
        System.out.println(a == b);// Compara se o endereçamento é o mesmo
        System.out.println(a == c);// Compara se o endereçamento é o mesmo
        System.out.println("a igual a --> " + a.equals(a2));// Compara se o conteudo é o mesmo
        System.out.println("a igual b --> " + a.equals(b));// Compara se o conteudo é o mesmo
        System.out.println("a igual c --> " + a.equals(c));// Compara se o conteudo é o mesmo

        // Verificações de strings
        String preco = "R$: 12,00";
        for (int i = 0; i < preco.length(); i++) {
            Character letra = preco.charAt(i);
            if (Character.isDigit(letra)) {
                System.out.print(letra + "-digito ");
            } else if (Character.isAlphabetic(letra)) {
                System.out.print(letra + "-letra_");
                if (Character.isLowerCase(letra)) {
                    System.out.print("minuscula ");
                } else if (Character.isUpperCase(letra)) {
                    System.out.print("maiuscula ");
                }

            } else if (Character.isSpaceChar(letra)) {
                System.out.print("espaço ");
            }
        }
        System.out.println();


        // Converções de texto
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());

        //0 se as strings forem iguais
        // um numero negativo se a string que invoca o compareTo for menor
        // um numero positivo se a string que invoca o compareTo for maior
        a = "alo";
        a2 = "alo";
        b = "avo";
        c = "avos";
        System.out.println("Igual devolve " + a.compareTo(a2));
        System.out.println("Menor devolve " + a.compareTo(b));
        System.out.println("Maior devolve " + c.compareTo(b));


        // Comparar caracteres
        a = "a";
        a2 = "A";
        if (a.equalsIgnoreCase(a2)) {
            System.out.println("compara ignorando maiusculas e minusculas");
        } else if (a.equals(a2)) {
            System.out.println("compara diferenciando maiusculas e minusculas");
        }


        // Comparar com o inicio ou fim
        String nome = "Iago Dalmolin";
        if (nome.startsWith("Iago")) {
            System.out.println("Inicia com Iag");
        }
        if (nome.endsWith("lin")) {
            System.out.println("Inicia com lin");
        }
        if (nome.startsWith("go")) {
            System.out.println("Não vai pegar");
        }
        if (nome.startsWith("go", 2)) {
            System.out.println("Ignora as 2 primeiras letras verificando o go");
        }


        // Ocorrências na String
        nome = "Samara Alana";
        System.out.println("Primeira letra 'a' na posição " + nome.indexOf("a"));
        System.out.println("Ignorando as 6 primeiras letras  " + nome.indexOf("a", 6));
        System.out.println("Última letra 'a' na posição " + nome.lastIndexOf("a"));
        System.out.println("Ignorando as 6 ultimas letras  " + nome.lastIndexOf("a", 6));


        // Copiar pedaço de string
        String primeiroNome = nome.substring(0, 6);
        System.out.println(primeiroNome);
        String sobrenome = nome.substring(7);
        System.out.println(sobrenome);

        // Substituir parte da String
        nome = nome.replace("a", "e");
        System.out.println(nome);


        // Retirar espaços inicio e fim
        String espaco = "       Texto    ";
        System.out.println("Com espaços " + espaco);
        System.out.println("Sem espaços " + espaco.trim());


        // Cópia par um array
        nome = "Ednaldo Perreira";
        char[] copiaNome = nome.toCharArray();
        for (char letra : copiaNome) {
            System.out.print(letra + "-");
        }
        System.out.println();


        // Concatenar String
        String n1 = "Olá";
        String n2 = "Mundo";
        String n3 = n1.concat(n2);
        System.out.println(n3);


        // Converter outros tipos de dados para String
        double d = 102939939.939;
        boolean bool = true;
        long l = 1232874;
        char[] arrayChar = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        System.out.println("Retorna Valor : " + String.valueOf(d));
        System.out.println("Retorna Valor: " + String.valueOf(bool));
        System.out.println("Retorna Valor : " + String.valueOf(l));
        System.out.println("Retorna Valor : " + String.valueOf(arrayChar));


    }
}
