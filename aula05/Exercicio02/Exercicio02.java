package Exercicio02;
/*
 * EXERCICIO 02 - AULA 05
 * Conteudo: NumberFormatException e finally.
 */

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        // Cria o Scanner para entrada de dados
        Scanner sc = new Scanner(System.in);

        // Tres testes: inteiro, letras e decimal
        for (int i = 1; i <= 3; i++) {

            System.out.println("\n=== TESTE " + i + " ===");

            try {

                // Recebe o valor como String
                System.out.print("Digite um numero inteiro: ");
                String texto = sc.nextLine();

                // Converte o texto para inteiro
                int numero = Integer.parseInt(texto);

                // Exibe o valor convertido
                System.out.println(
                    "Numero convertido: " + numero);

            } catch (NumberFormatException e) {

                // Trata texto que nao representa inteiro
                System.out.println(
                    "Erro: o valor informado nao e inteiro.");

            } finally {

                // Executa tanto no sucesso quanto no erro
                System.out.println("Encerrando programa...");
            }
        }

        // Libera o recurso de leitura
        sc.close();
    }
}
