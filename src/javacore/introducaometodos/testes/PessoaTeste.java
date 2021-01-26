/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.introducaometodos.testes;

import javacore.introducaometodos.classe.Pessoa;

/**
 *
 * @author Igor
 */
public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa pess1 = new Pessoa();
        Pessoa pess2 = new Pessoa();
        
        pess1.nome = "João";
        pess1.cpf = "054.434.34.544";
        pess1.idade = 34;
        
        pess2.nome = "Maria";
        pess2.cpf = "324.2121.433.43";
        pess2.idade = 86;
        
        // Estou passando a variavel com o objeto para ser imprimido
        // Vale lembrar que e posso passar assim
        // pess2.imprime(pess1);
        // pois pess1 e pess2 referenciam o mesmo objeto, mas  o que é passado,
        // o que está entre os parentes, é o que difere (os dados)
        pess1.imprime(pess1);
        pess2.imprime(pess2);
        
        
        // Como objetos são por referencia, caso eu mude o valor no metodo ele muda
        System.out.println("Agora eu alterei o valor dentro do metodo");
        pess1.imprime(pess1);
        pess1.imprime(pess2);
        
        
        
        // É necessário passar as referencias aos objetos diferente
        System.out.println("Agora iremos mostrar os valores sem passar referencia");
        pess1.nome = "Carlos";
        pess2.nome = "Lucas";
        System.out.println(pess1);
        pess1.imprimeSemRefenciar();
        System.out.println(pess2);
        pess2.imprimeSemRefenciar();
    }
    
}
