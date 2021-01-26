package javacore.introducaoclasse.testes;

// Aqui ela é mportada
import javacore.introducaoclasse.classes.Estudante;

public class EstudanteTeste {
    public static void main(String[] args){
//        A classe estudante esta em outro pacote
// Temos uma váriavel e referencia chamada iago(chamar de estudante) do tipo Estudante que 
// esta fazendo referencia para um objeto do tipo Estudante

        Estudante iago = new Estudante();
        iago.nome = "Iago";
        iago.matricula = "202000";
        iago.idade = 19;
        
        
        System.out.println(iago.nome);
        System.out.println(iago.matricula);
        System.out.println(iago.idade);
    }
    
}
