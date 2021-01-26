/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.introducaometodos.testes;

import javacore.introducaometodos.classe.Estudantes_private;

/**
 *
 * @author Igor
 */
public class EstudantesTeste {
    public static void main(String[] args) {
        Estudantes_private estudantes = new Estudantes_private();
        
        // Setando dados
        estudantes.setNome("João");
        estudantes.setIdade(-17);
        estudantes.setNotas(new double[]{5, 7.3, 5.4});
        estudantes.dadosAlunos();
        
        // Retornando dados
        System.out.println(estudantes.getNome());
    }
}
