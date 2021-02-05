package javacore.heranca.classes;

/*
    A herança no java é utilzada por dois motivos principais
    1 - Reaproveitar o código
    2 - Utilizar polimorfismo

    Todas as Classes são filhas de outras, mesmo sem o extends declarado,
    todas as classes são filhasde uma classe chamada Object
    Você pode fazer o teste adicionando à classe um
    extends Object

 */
public class Pessoa {
    // Modificador precisa ser protected para acessar os dados na classe filha
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Rua: " + this.endereco.getRua());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
