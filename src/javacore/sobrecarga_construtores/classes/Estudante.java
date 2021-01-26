package javacore.sobrecarga_construtores.classes;

public class Estudante {
    private String matricula;
    private String nome;
    private double[] notas;
    private String dataMatricula;

//    Construtores: são executados na inicialização da classe
//    Construtores NUNCA retornam algo, EXATAMENTE o nome da classe, caso você
//    não coloque o java automaticaamente cria um, que não faz nada
//    Neste código eu defino que não podemos criar Estudante sem matricula, nome e notas

    public Estudante(String matricula, String nome, double[] notas) {
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }

//    Aqui eu utilizo o metodo de sobrecarga para chamar o construtor
//    SÓ um CONSTRUTOR pode chamar outro CONSTRUTOR, nunca posso chama-los dentro de métodos
//    Obrigatoriamente essa chamada precisa ocorrer na PRIMEIRA LINHA
    public Estudante(String matricula, String nome, double[] notas, String dataMatricula) {
        this(matricula, nome, notas);
        this.dataMatricula = dataMatricula;
    }


    //    Mas aqui posso criar sem definir argumentos
    public Estudante() {

    }

    public void imprime() {
        System.out.println(this.matricula);
        System.out.println(this.nome);
        for (double nota : this.notas) {
            System.out.println(nota + " ");
        }
        System.out.println("------------------");
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
