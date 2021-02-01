package javacore.associacao.classes;

/*
A associação em java serve para mostrar o relacionamento entre as classes
Eles podem ser de 0,1 de 1,n ou n,n
Pense como se fossem tabelas de um banco de dados que se relacionam umas com as outras


FIQUE ATENTO!
Algo importante de se lembar é realizar o tratamento de erros, pois em alguns casos os
dados não podem estar inseridos na outra classe ou podem ser arrays vazios
 */

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno() {
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void print(){
        System.out.println("--- Relatório de Alunos ---");
        System.out.println("Nome: "+ this.nome);
        System.out.println("Idade: "+this.idade);
        // Pego um atributo do objeto caso ele tenha sido referenciado
        if(this.seminario != null){
            System.out.println("Seminario: "+this.seminario.getTitulo());
        }
        else {
            System.out.println("Seminario: Nenhum seminario");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
