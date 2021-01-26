/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.introducaometodos.classe;

/**
 *
 * @author Igor
 */
public class Calculadora {

    // cria um metodo publico que não retorna nada
    public void somaDoisNumeros() {
        System.out.println(5 + 5);
    }

    
    // Cria um metodo publico que é capaz de recer argumento mas não retona nada
    public void multiplicaDoisNumeros(int numero1, int numero2) {
        System.out.println("O resultado da multiplicacao de " + numero1 + " e "
                + numero2 + " é " + numero1 * numero2);
    }

    
    // Cria um metodo publico que é capaz de rebecer argumento e retorna um valor
    public double subtraiDoisNumeros(double numero1, double numero2) {
        return numero1 - numero2;
    }
    

    // Nesse caso o metodo não retorna nenhum valor, porem o return para sua execução
    public void divideDoisNumeros(double numero1, double numero2) {
        if (numero2 != 0) {
            System.out.println("O resultado retornado é " + numero1 / numero2);
            return;
        }
        System.out.println("Não é possivel dividir por 0");
    }
    

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 40;
        num2 = 50;
        System.out.println(num1 + " Na Função " + num2);
    }
    

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
    
    
    // O java se encarrega de passar os valores para array
    // Só é possivel ter um var args pos metodo
    // Se eu quiser enviar outros valores junto com o var args ele precisa ser o ultimo
    public void somaVarArgs(double argumento1, int... numeros){
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(argumento1 + "<-argumento1 | var args->" + soma);
    }

}
