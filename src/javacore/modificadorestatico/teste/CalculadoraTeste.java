package javacore.modificadorestatico.teste;

import javacore.modificadorestatico.classes.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {

        Calculadora.somaDoisNumeros();
        Calculadora.multiplicaDoisNumeros(7, 6);

        System.out.println("Subtração: " + Calculadora.subtraiDoisNumeros(88.6d, 7.43d));


        Calculadora.divideDoisNumeros(88, 0);

        int[] arrayNumero = {1, 2, 3, 4, 5};
        Calculadora.somaArray(arrayNumero);

        Calculadora.somaVarArgs(1, 2, 3, 4, 5);
    }

}
