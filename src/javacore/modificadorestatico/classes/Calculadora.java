package javacore.modificadorestatico.classes;


public class Calculadora {

    // NÃO utilizo nenhum atributo de classe
    // Apenas passo valores e reporno
    // Ou seja: PODE ser um METODO ESTÁTICO

    public static void somaDoisNumeros() {
        System.out.println(5 + 5);
    }


    public static void multiplicaDoisNumeros(int numero1, int numero2) {
        System.out.println("O resultado da multiplicacao de " + numero1 + " e "
                + numero2 + " é " + numero1 * numero2);
    }


    public static double subtraiDoisNumeros(double numero1, double numero2) {
        return numero1 - numero2;
    }


    public static void divideDoisNumeros(double numero1, double numero2) {
        if (numero2 != 0) {
            System.out.println("O resultado retornado é " + numero1 / numero2);
            return;
        }
        System.out.println("Não é possivel dividir por 0");
    }


    public static void alteraDoisNumeros(int num1, int num2) {
        num1 = 40;
        num2 = 50;
        System.out.println(num1 + " Na Função " + num2);
    }


    public static void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }


    public static void somaVarArgs(double argumento1, int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(argumento1 + "<-argumento1 | var args->" + soma);
    }

}
