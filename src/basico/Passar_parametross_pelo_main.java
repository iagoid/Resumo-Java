package basico;

public class Passar_parametross_pelo_main {

    // Ao executar um programa é possível enviar argumentos para ele diretamente
    // a forma de fazer isso pode ser diferente em cada IDE
    // Você também pode realizar essa execução diretamente no terminal
    public static void main(String[] args) {
        System.out.println("Foram passados " + args.length + " parametros");

        for(int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
    }
}
