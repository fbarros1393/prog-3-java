package exercicio06;

/*
 * EXERCICIO 06 - AULA 05
 * Conteudo: Validacao de dados e tratamento de erros.
 */

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        // Scanner para ler os dados digitados
        Scanner sc = new Scanner(System.in);

        try {

            // Solicita a descricao do produto
            System.out.print("Descricao do produto: ");
            String descricao = sc.nextLine();

            // Solicita o preco como texto
            System.out.print("Preco do produto: ");
            String textoPreco = sc.nextLine();

            // Converte o preco para double
            double preco = Double.parseDouble(textoPreco);

            // Solicita a quantidade como texto
            System.out.print("Quantidade em estoque: ");
            String textoQuantidade = sc.nextLine();

            // Converte a quantidade para int
            int quantidade = Integer.parseInt(textoQuantidade);

            // Verifica se o preco e negativo
            if (preco < 0 || !Double.isFinite(preco)) {

                // Lanca excecao para preco invalido
                throw new IllegalArgumentException("O preco deve ser um numero valido e nao negativo.");
            }
            // Verifica se a quantidade e negativa
            if (quantidade < 0) {

                // Lanca excecao para quantidade invalida
                throw new IllegalArgumentException( "A quantidade nao pode ser negativa.");
            }

            // Calcula o valor total do estoque
            double valorTotal = preco * quantidade;

            // Exibe as informacoes
            System.out.println("\n=== PRODUTO CADASTRADO ===");
            System.out.println("Descricao: " + descricao);

            System.out.printf("Preco: R$ %.2f%n", preco);

            System.out.println("Quantidade: " + quantidade);

            System.out.printf(
                "Valor total do estoque: R$ %.2f%n",
                valorTotal);

        } catch (NumberFormatException e) {

            // Captura conversoes invalidas
            System.out.println(
                "Erro: preco ou quantidade invalida.");

        } catch (IllegalArgumentException e) {

            // Captura os valores fora das regras
            System.out.println("Erro: " + e.getMessage());

        } finally {

            // Executa ao concluir o bloco try/catch
            System.out.println("Encerrando cadastro de produto.");
        }

        // Fecha o Scanner
        sc.close();
    }
}
