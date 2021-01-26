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
public class If_else_switch_ternario {

    public static void main(String[] args) {
        int idade = 20;
        boolean x = false;
//        Não permitido
//        if(idade){;
//            System.out.println("Entrou na condição");
//        }




        if (x == true) {
            System.out.println("Não entrou pois não se encaixa na comparação");
        } else if (x = true) {
            System.out.println("Entrou pois não é comparação");
        }

        int numero = 10;
        String categoria;

        if (numero < 5) {
            categoria = "Menor que 5";
        } else if (numero > 5 && numero < 10) {
            categoria = "Maior que 5 e menor que 10";
        }
//        else{
//            categoria = "Maior que 10";
//        }

        // Há brechas para que a váriavel não seja inicializada
        // Por isso é necessário colocar um else ou atribuir valor no começo
//        System.out.println(categoria);









// Operador ternário
        int tamanho = 170;
        String status;

        status = tamanho > 160 ? "Alto" : "Baixo";
        System.out.println(status);

        
        
        
        
//Switch
    byte dia = 5;
    // Aceita: char, int, byte, short, enum e String
    switch(dia){
        case 1:
            System.out.println("Domingo");
            break;
        case 2:
            System.out.println("Segunda");
            break;
        case 3:
            System.out.println("Terça");
            break;
        case 4:
            System.out.println("Quarta");
            break;
        case 5:
            System.out.println("Quinta");
            break;
        case 6:
            System.out.println("Sexta");
            break;
        case 7:
            System.out.println("Sabado");
            break;
        default:
            System.out.println("Opção inválida");
    }
            
    }
}
