/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.text.DecimalFormat;

/**
 *
 * @author Igor
 */
public class Break_continue {

    public static void main(String[] args) {
//        Quantas vezes um carro pode ser parcelado
//        Porém não podem existir parcelas menores que 1000

        double valorTotal = 30000, parcela;
        DecimalFormat formatador = new DecimalFormat("0.00");

        for (parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            // Codigo Normal
//            if (valorParcela >= 1000) {
//                System.out.println("Parcela " + parcela + " R$: " + formatador.format(valorParcela));
//            } else {
//                break;
//            }
            // Código otimizado
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$: " + formatador.format(valorParcela));
            // Essa linha continua a ser executada até chegar em 30000, mas nosso resultado só vai até 30 
            // Logo devemos usar break para quebrar o laço for
            System.out.println("-------------------------");
        }
        
        
        
        
        
        
// -------------------------- Continue ---------------------------------------//
        for(parcela = valorTotal; parcela >= 1; parcela--){
            double valorParcela = valorTotal / parcela;
            if (valorParcela <= 1000) {
                continue;
            }
            System.out.println("Parcela Decrescente " + parcela + " R$: " + formatador.format(valorParcela));
            // Linhas abaixo nunca são executadas pois o continue faz retornar ao for
        }

    }

}
