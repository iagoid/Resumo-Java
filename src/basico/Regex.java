package basico;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {

        // https://www.devmedia.com.br/conceitos-basicos-sobre-expressoes-regulares-em-java/27539
        // https://medium.com/@alexandreservian/regex-um-guia-pratico-para-express%C3%B5es-regulares-1ac5fa4dd39f


        String fonte = "Iago Ivanir Dalmolin --- iagoid01@gmail.com";
        String verificacao = "[a-zA-Z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$";

        // Guarda o padrão
        Pattern padrao = Pattern.compile(verificacao);

        // Verifica se ele combina
        Matcher match = padrao.matcher(fonte);

        if (match.find() == true) {
            System.out.println("Email encontrado");
            System.out.println("Posição de inico do padrão " + match.start());
            System.out.println("Posição de fim do padrão " + match.end());
            // Também posso usar o substring para pegar a palavra
            System.out.println(match.group());
        } else {
            System.out.println("Padrão não encontrado");
        }
        System.out.println();



        // Agora eu verifico vários emails (tirei o $)
        String REGEX = "[a-zA-Z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}";
        String INPUT = "lucas@gmail.com pedro@hotmail.com maicom@truco.xxx";
        Pattern p = Pattern.compile(REGEX);
        Matcher match2 = p.matcher(INPUT);

        while (match2.find()) {
            System.out.println(match2.group());
        }
    }
}
