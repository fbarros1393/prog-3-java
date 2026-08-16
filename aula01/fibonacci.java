/**
 * Disciplina: Programação 3
 * Professora: Tainá Isabela
 * 
 * Descrição: O programa calcula e imprime os 30 primeiros elementos da Série de Fibonacci.
 * A regra implementada define que os dois primeiros elementos possuem valor 1, 
 * e cada elemento subsequente é o resultado da soma dos dois anteriores.
 * 
 * @author Felix de Jesus Sousa Barros 
 * @version 1.0
 * @since 2026-08-16
 */

public class fibonacci {
    public static void main(String[] args) {
        int anterior = 1;
        int atual = 1;

        //imprime os dois primeiros na tela pois eles não precisam de cálculo
        System.out.println("Elemento 1: " + anterior);
        System.out.println("Elemnto 2: " + atual);

        //laço que inicia do 3 elemento e repete até o 30
        for (int i = 3; i <= 30; i++) {
            // a soma do anterior mais o atual 
            int proximo = anterior + atual;
            //Mostra o resultado na tela 
            System.out.println("Elemento " + i + ": " + proximo);
            //fazendo o atual avançar um elemento 
            anterior = atual;
            atual = proximo;
        }


    }
    
}
