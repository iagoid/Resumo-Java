/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.introducaometodos.testes;

import javacore.introducaometodos.classe.Calculadora;

/**
 *
 * @author Igor
 */
public class CalculadoraTeste {
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();
        
        calculadora.somaDoisNumeros();
        calculadora.multiplicaDoisNumeros(7, 6);
        
        // Caso queira retornar valor com casas decimais definir tudo como 
        // double ou float, até o tipo dos argumentos
        System.out.println("Subtração: " + calculadora.subtraiDoisNumeros(88.6d, 7.43d));

        
        calculadora.divideDoisNumeros(88, 0);
        
        int[] arrayNumero = {1, 2, 3, 4, 5};
        calculadora.somaArray(arrayNumero);
        
        // O java se encarrega de passar os valores para array
        calculadora.somaVarArgs(1,2,3,4,5);
    }
    
}
