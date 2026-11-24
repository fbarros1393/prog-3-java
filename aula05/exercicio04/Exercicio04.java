package exercicio04;
/*
 * EXERCICIO 04 - AULA 05
 * Conteudo: ArrayIndexOutOfBoundsException.
 *
 * Objetivo: consultar nomes em um vetor
 * e tratar indices invalidos.
 */
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        // Cria o Scanner
        Scanner sc = new Scanner(System.in);

        // Vetor com cinco nomes
        String[] nomes = {"Ana", "Carlos", "Maria", "Pedro", "Joao"};


        // Realiza tres consultas
        for (int i = 1; i <= 3; i++) {
            System.out.println("\n CONSULTA " + i );
            System.out.println("O vetor possui " + nomes.length + " nomes.");

            try {
                // Solicita o indice que sera consultado
                System.out.print("Digite o indice: ");
                int indice = Integer.parseInt(sc.nextLine());
                // Acessa diretamente a posicao solicitada
                String nome = nomes[indice];
                // Exibe o nome encontrado
                System.out.println("Nome encontrado: " + nome);
            } catch (ArrayIndexOutOfBoundsException e) {
                // Executa se o indice nao existir no vetor
                System.out.println("Erro: indice fora dos limites do vetor.");
            } catch (NumberFormatException e) {

                // Executa se o usuario nao informar inteiro
                System.out.println( "Erro: digite um indice inteiro.");
            }
        }
        // Fecha o Scanner
        sc.close();
    }
}
