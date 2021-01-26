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
        boolean verdade = true;
        long numeroGrande = 1000L;
        char caracteres = 'A', caractereNumero = 99; /* 2 bytes, pode colocar numeros que 
        serão traduzidos para tabela unicode */
        System.out.println("caractereNumero " + caractereNumero + " caracteres " + caracteres);
        System.out.println("Seu numero é " + numeroInteiro);
        System.out.println("numeroGrande " + numeroGrande);
    }
}
