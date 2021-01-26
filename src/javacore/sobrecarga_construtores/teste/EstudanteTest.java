package javacore.sobrecarga_construtores.teste;

import javacore.sobrecarga_construtores.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("2020302020", "Iago", new double[]{7.4, 6.7, 9});
        estudante.imprime();

        Estudante estudante2 = new Estudante("98324834932", "Cláudio", new double[]{3.4, 2.7, 6}, "26/01/2021");
        estudante.imprime();
    }
}
