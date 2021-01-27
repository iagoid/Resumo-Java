package javacore.modificadorestatico.teste;

import javacore.modificadorestatico.classes.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        // Algo interessante sobre os metodos estáticos é qque eu posso altera-los
        // ou pegar seu valor antes mesmo de criar um objeto
        System.out.println(Carro.getMaxPassageiros());

        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("Audi", 275);
        Carro carro3 = new Carro("Mercedes", 290);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();

        // Agora a lei mudou então precisamos mudar a velocidade limite de todos
        System.out.println("#######################");
        Carro.velocidadeLimite = 200;
        Carro.setMaxPassageiros(4);
        // É importante fazer dessa maneira sem o setVelocidadeMaximapois parece que estou apenas
        // alterando apenas um objeto, mas estou mudando de todos
        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
