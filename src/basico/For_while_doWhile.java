/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

/**
 *
 * @author Igor
 */
public class For_while_doWhile {

    public static void main(String[] args) {
        int numero = 0;

//        Cuidado com os loops infinitos
//        Cuidado com o <= e <
        while (numero <= 5) {
            System.out.println(numero);
            numero++;
        }
        
//--------------- Do while ----------------- //
numero = 0;
do {
    System.out.println("");
    System.out.println("Executado antes da verificação da condição");
    System.out.println("");
}
while(numero != 0);

//---------------- For ---------------------- //
        for (int i = 10, contador = 1; i > 0; i--, contador++) {
            System.out.print(contador + "-For \t");
        }
    }
}
