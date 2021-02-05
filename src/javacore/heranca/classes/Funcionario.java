package javacore.heranca.classes;


// Extendeu a classe pessoas, tendo todos os atributos dela
// Funcionario é uma Pessoa
public class Funcionario extends Pessoa {
    private Double salario;

    // É passado um argumento no construtor de pessoa
    // assim para criarmoss um funcionario que extende pessoas precisamos
    // ter um construtor que pegue o valor do nome da pessoa
    // *assim como o this, o super é a primeira linha de construção
    public Funcionario(String nome){
        super(nome);
    }
    // Chamo o metodo da classe mãe
    public void imprime() {
        super.imprime();
        System.out.println("Salário: " + this.salario);
        imprimeReciboPagamento();
    }

    // Aqui acessamos um dado da classe mãe (não pode ser private mas protected)
    public void imprimeReciboPagamento() {
        System.out.println("Eu " + super.nome + " recebi o salário de " + this.salario);
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
