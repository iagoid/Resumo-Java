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
public class Pessoa {
    public String nome;
    public int idade;
    public String cpf;
    
    
    // a variavel pessoa irá referenciar o objeto do tipo Pessoa 
    // passado em PessoaTeste que é o pess1 e pess2
    public void imprime(Pessoa pessoa) {
        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);
        System.out.println(pessoa.cpf);
        System.out.println("------------------");
        pessoa.nome = "Cleiton";
    }
    
    
    // O this pega o valor do proprio objeto, no endereço que ele e encontra
    public void imprimeSemRefenciar() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.cpf);
        System.out.println("*************************************************");
    }
}
