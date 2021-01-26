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
public class Operadores {
    public static void main(String[] args){
        // Operadores matemáticos
        int numero1 = 10, numero2 = 20, numero3, soma;
        float numeroFloat;
        soma = numero1 + numero2;
        numeroFloat = (float) numero1; // Numero por atribuição
        System.out.println(numero1 + numero2 + " <-- Antes Depois --> " + numero1 + numero2);
        System.out.println("Soma " + soma);
        
        System.out.println(numero1 - numero2 + " <-- Outras operações --> " + numero1 * numero2 + "   " + numero1 % numero2 + "   " + numero1 / numero2
        + "   " + numero1 % numero2);
        
        
        
        // Operadores comparação
        numero1 = 10;
        numero2 = 10;
        numero3 = 20;
        
        boolean igual12 = numero1 == numero2;
        boolean diferente12 = numero1 != numero2;
        boolean diferente23 = numero2 == numero3;
        
        System.out.println("\n1 == 2 " + igual12 + "\n1 != 2 " + diferente12 + "\n2 == 3 " + diferente23);
        System.out.println("");
        
        
        
        // Operadores logico
        numero1 = 10;
        numero2 = 10;
        numero3 = 20;
        // Mostra todas as mensagens que se encaixam
        if(numero1 == numero2){
            System.out.println("numero1 == numero2");
            System.out.println(numero1 + " e " + numero2 + " são iguais");
        }
        
        if(numero2 != numero3){
            System.out.println("numero2 != numero3");
            System.out.println(numero1 + " e " + numero2 + " são diferentes");
        }
        System.out.println("");
        
        // Mostra apenas a primeira que se encaixam
        if(numero1 != numero2){
            System.out.println("numero1 != numero2");
            System.out.println(numero1 + " e " + numero2 + " são iguais");
        }
        
        else if(numero2 != numero3){
            System.out.println("numero2 != numero3");
            System.out.println(numero1 + " e " + numero2 + " são diferentes");
        }
        
        
        // Usando dois operadores     
        System.out.println("");
        if(numero1 == numero2 && numero2 == numero3){
            System.out.println("numero1 == numero2 && numero2 == numero3");
            System.out.println(numero1 + " e " + numero2 + " são iguais E " 
                    + numero2+ " e " + numero3 + " são diferentes" );
        }
        
        if(numero1 == numero2 || numero2 == numero3){
            System.out.println("numero1 == numero2 || numero2 == numero3");
            System.out.println(numero1 + " e " + numero2 + " são iguais OU " 
                    + numero2+ " e " + numero3 + " são diferentes" );
        }
        
        
        // Nada se encaixa
        System.out.println("");
        if(numero1 == 777){
            System.out.println("Numero1 = 777");
        }
        else if(numero1 == 666){
            System.out.println("Numero1 = 666");
        }
        else {
            System.out.println("Nada se encaixa");
        }
        
    } 
}
