package javacore.introducaometodos.classe;

public class Estudantes_private {
    private String nome;
    private int idade;
    private double[] notas = new double[3];
    private boolean aprovado;
    
/*
    Utilizar variaveis privadas é algo muito utilizado na programação;
    Não devemos deixar as variaveis para que sejam acessadas de qualque lugar
    assim com os metodos atribuidos no final do código podemos setar e pegar 
    os dados, podemos fazer uma filtragem de dados e também caso quisermos
    impedir os metodos de serem usados apenas excluimos eles.
    Isso se chama encapsulamento
*/
        
    public void dadosAlunos(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
             
        System.out.print("Notas: ");
        for(double nota : this.notas){
            System.out.print(nota + " ");
        }
        calculaMedia(this.notas);
    }
    
    public void calculaMedia(double[] notas) {
        double soma = 0;
        double media;
        for(double nota : notas){
            soma += nota;
        }

        media = soma/3;
        
        if(media >= 6){
            this.aprovado = true;
            System.out.println("\nAPROVADO: " + media);
        }
        else {
            this.aprovado = false;
            System.out.println("\nREPROVADO: " + media);
        }
    }
    
    // Com variaveis privadas eu preciso definir alguma maneira para acessa-las
    // Padrão para atrabuir valor aos dados
    public void setNome(String nome){
        this.nome = nome; 
    }
    
    public void setIdade(int idade){
        if(idade < 0){
            System.out.println("Você não pode atribuir uma idade negativa");
            return;
        }
        this.idade = idade; 
    }
    
    public void setNotas(double[] notas){
        this.notas = notas; 
    }

    // Padrão para devolver dados
    public String getNome(){
        return this.nome; 
    }
    
    public int getIdade(){
        return this.idade; 
    }
    
    public double[] getNotas(){
        return this.notas; 
    }

    // Valores booleanos
    public boolean isAprovado(){
        return this.aprovado;
    }
}
