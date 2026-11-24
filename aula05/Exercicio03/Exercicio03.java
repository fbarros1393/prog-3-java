package Exercicio03;
/*
 * EXERCICIO 03 - AULA 05
 * Conteudo: throw, throws e IllegalArgumentException.
 */

public class Exercicio03 {

    // Metodo responsavel por calcular a raiz quadrada
    public static double calcularRaiz(int numero)
            throws IllegalArgumentException {

        // Verifica se o numero informado e negativo
        if (numero < 0) {
            // Lanca uma excecao com mensagem explicativa
            throw new IllegalArgumentException("Nao existe raiz quadrada real de numero negativo.");
        }
        // Calcula a raiz quadrada utilizando Math.sqrt
        return Math.sqrt(numero);
    }
    public static void main(String[] args) {
        // Vetor com tres valores para teste
        int[] numeros = {0, 25, -9};
        // Percorre o vetor
        for (int i = 0; i < numeros.length; i++) {

            try {
                // Chama o metodo calcularRaiz
                double resultado = calcularRaiz(numeros[i]);
                // Exibe o resultado calculado
                System.out.println("Raiz de " + numeros[i] + " = " + resultado);
            } catch (IllegalArgumentException e) {
              // Exibe a mensagem da excecao lancada
                System.out.println("Erro ao calcular " + numeros[i] + ": " + e.getMessage());
            }
        }
    }
}
