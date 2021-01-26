/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.introducaoclasse.testes;

import javacore.introducaoclasse.classes.Carro;

/**
 *
 * @author Igor
 */
public class CarroTeste {

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Ferrari 20XL";
        carro.velocidadeMaxima = 402.55f;
        
        
        System.out.println(carro.modelo);
        System.out.println(carro.ano); // Recebeu valor de inicialização
        System.out.println(carro.cor); // Não recebeu valores
        System.out.println(carro.velocidadeMaxima);
    }
}
