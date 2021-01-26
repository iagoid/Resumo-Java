package javacore.sobrecarga.teste;

import javacore.sobrecarga.classes.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
//        Tenho que passar um nome, cpf, salario e rg para construir o objeto
        Funcionario funcionario = new Funcionario("Ednaldo Perreira", "765.654.345-12", 15000, "9754323534");
        Funcionario funcionario2 = new Funcionario("Maicon Küscuz"); //Apenas nome
        funcionario.imprime();
        funcionario2.imprime();

        // Desta maneira eu não quebro o código de outras pessos pois ele aceita os dois código
        funcionario.init("Cleiton Rasta", "111.222.333-44", 4200);
        funcionario.imprime();

        funcionario.init("Tonho da Lua", "965.534.544-12", 3500, "324332.3432");
        funcionario.imprime();
    }
}
