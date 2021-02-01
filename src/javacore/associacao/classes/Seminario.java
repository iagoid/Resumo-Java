package javacore.associacao.classes;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;

    public Seminario() {
    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public void print() {
        System.out.println("--- Relatório de Seminário ---");
        System.out.println("Titulo: " + this.titulo);
        if (this.professor != null) {
            System.out.println("Professor: " + this.professor.getNome());
        } else {
            System.out.println("Nenhum professor");
        }
        System.out.print("Alunos: ");
        if (alunos != null && alunos.length != 0) {
            for (Aluno aluno : alunos) {
                System.out.println(aluno.getNome());
            }
        } else {
            System.out.println("Nenhum aluno");
        }
        if (this.local != null) {
            System.out.println("Local: " + this.local.getRua() + " " + this.local.getBairro());
        }
        else {
            System.out.println("Sem local definido");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
