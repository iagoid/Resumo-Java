package javacore.heranca.testes;

import javacore.heranca.classes.Endereco;
import javacore.heranca.classes.Funcionario;
import javacore.heranca.classes.Pessoa;

public class HerancaTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Iago");
        pessoa.setNome("Iago");
        pessoa.setCpf("052.654.234-15");

        Endereco endereco = new Endereco();
        endereco.setRua("Rua Teodoro Peixoto");
        endereco.setBairro("Tiradentes");

        pessoa.setEndereco(endereco);

        pessoa.imprime();

        // Verificando a extensão do funcionario
        // Veja que não criamos metodos set ou imprime
        System.out.println("------- Dados do funcionario -------");
        Funcionario funcinario = new Funcionario("Pedro");
        funcinario.setNome("Lucas");
        funcinario.setCpf("045.235.6554-12");
        funcinario.setEndereco(endereco);
        funcinario.setSalario(3500.00);
        funcinario.imprime();

    }
}
