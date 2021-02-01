package javacore.associacao.testes;

import javacore.associacao.classes.Aluno;
import javacore.associacao.classes.Local;
import javacore.associacao.classes.Professor;
import javacore.associacao.classes.Seminario;

public class AlunosTeste {
    public static void main(String[] args) {
        // Criamos o aluno e então o seminario, ai associamos o seminário aos alunos
        Aluno aluno = new Aluno("Iago", 19);
        Aluno aluno2 = new Aluno("Joana", 34);

        Seminario seminario = new Seminario("Programação em Java");
        Professor professor = new Professor("Yoda", "Usar a força");
        Local local = new Local("Rua das Araras", "Logo ali");

        // Associa os dados
        aluno.setSeminario(seminario);
        aluno2.setSeminario(seminario);

        seminario.setProfessor(professor);
        seminario.setLocal(local);
        seminario.setAlunos(new Aluno[]{aluno, aluno2});// Envio de array

        Seminario[] semiArray = new Seminario[1];// outro encvio de array
        semiArray[0] = seminario;
        professor.setSeminarios(semiArray);

        aluno.print();
        professor.print();
        seminario.print();
        local.print();
    }
}
