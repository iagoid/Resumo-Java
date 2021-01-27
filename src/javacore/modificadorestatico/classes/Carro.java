package javacore.modificadorestatico.classes;

public class Carro {
    // Foi criada uma lei que limita o carro à uma velocidade de 240km/h
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 240; // Operador estático
    // Este atributo não pertence mais ao objeto e sim a CLASSE
    // ou seja, o valor é compartilhado com todos os objetos
    private static int maxPassageiros = 5; // Operador estático privado

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Carro() {

    }

    public void imprime() {
        System.out.println("Carro: " + this.nome);
        System.out.println("Velocidade Máxima: " + this.velocidadeMaxima);
        // Também é importante lembrar que não utilizamos this
        System.out.println("Velocidade Limite: " + velocidadeLimite);
        System.out.println("Máximo de Passageiros: " + maxPassageiros);
        System.out.println("------------------------");
    }


    // Fazer os setter e getter de um atributo estático
    // Só é possível acessar atributos ESTÁTICOS dentro de um método estático
    // pois os métodos estáticos são iniciados antes dos objetos e atributos de classe
    // Não é possível utilizar uma atribuição pelo mesmo nome pois o java dá
    // prioridade aquela que está mais próxima, podemos então mudar o nome
    // da variável nos argumentos ou indicar a classe
    public static void setMaxPassageiros(int maxPassageiros) {
        Carro.maxPassageiros = maxPassageiros;
        //maxPassageiros = passageiros;
    }

    public static int getMaxPassageiros() {
        return maxPassageiros;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}
