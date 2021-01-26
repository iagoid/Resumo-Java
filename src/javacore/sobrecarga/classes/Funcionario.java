package javacore.sobrecarga.classes;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private String rg;


//    Construtores: são executados na inicialização da classe
//    Construtores NUNCA retornam algo, EXATAMENTE o nome da classe, caso você
//    não coloque o java automaticaamente cria um, que não faz nada
//    Neste código eu defino que não podemos criar Funcionários sem nome, cpf, salario e rg
    public Funcionario(String nome, String cpf, double salario, String rg){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.rg = rg;
    }
    public Funcionario(String nome){
        this.nome = nome;
    }
    // Agora eu posso excluir os metodos init pois eles fazem a mesma coisa que o construtor e usando sobrecarga

    public void init(String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

//    Sobrecarga de metodos é quando o metodo tem o mesmo nome, mas os parametros são
//    diferentes, seja em tipo ou quantidade
//    Utilizada para não quebrar o código de outros desenvolvedores que utilizam o código
//    Como os primeiros 3 atributos são os mesmos, chamamos o metodo anterior para imprimir
    public void init(String nome, String cpf, double salario, String rg){
        init(nome, cpf, salario);
        this.rg = rg;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.salario);
        System.out.println(this.rg);
        System.out.println("-----------------------");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    public String getRg() {
        return rg;
    }
}
