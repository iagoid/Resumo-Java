package javacore.associacao.classes;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor() {
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void print() {
        System.out.println("--- Relatório de Professor ---");
        System.out.println("nome: " + this.nome);
        System.out.println("especialidade: " + this.especialidade);

        if (this.seminarios != null && seminarios.length != 0) {
            System.out.print("Seminarios: ");
            for (Seminario sem : this.seminarios) {
                System.out.println(sem.getTitulo());
            }
        } else {
            System.out.println("Nenhum Seminario");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
