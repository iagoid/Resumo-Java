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
public class ParametrosTeste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int num1 = 5;
        int num2 = 10;
        calc.alteraDoisNumeros(num1, num2);
        System.out.println(num1 + " Nos parametros " + num2);
    }
    
}
