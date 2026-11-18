package exercicio_09;

/*
 * Classe Loja
 * Conteudo: Busca sequencial e ordenacao de produtos.
 */

// Importa a classe Arrays da biblioteca Java
import java.util.Arrays;

public class Loja {

    // Metodo para buscar produtos pelo codigo de barras
    public static void buscarProduto(
            Produto procurado, Produto[] produtos) {

        // Percorre o vetor de produtos
        for (int i = 0; i < produtos.length; i++) {

            // Verifica a igualdade entre os produtos
            if (produtos[i].equals(procurado)) {

                // Informa a posicao encontrada
                System.out.println(
                        "Produto encontrado na posicao: " + i);
                return;
            }
        }

        // Exibe caso o produto nao seja encontrado
        System.out.println("Produto nao encontrado!");
    }

    public static void main(String[] args) {

        // Cria um vetor com capacidade para 5 produtos
        Produto[] produtos = new Produto[5];

        // Cadastra os produtos no vetor
        produtos[0] = new Livro(
                "Java Basico", 80, "Ana Souza", "789001");

        produtos[1] = new CD(
                "Rock Nacional", 35, 12, "789002");

        produtos[2] = new DVD(
                "Curso de Java", 45, 120, "789003");

        produtos[3] = new Livro(
                "Estruturas de Dados", 95,
                "Carlos Lima", "789004");

        produtos[4] = new CD(
                "Jazz", 40, 10, "789005");

        // Mostra o vetor antes da ordenacao
        System.out.println("=== VETOR ORIGINAL ===");

        for (int i = 0; i < produtos.length; i++) {
            System.out.println(produtos[i]);
        }

        // Cria dois produtos para testar a busca
        Produto buscaIgual = new Livro(
                "Java Basico", 80, "Ana Souza", "789001");

        Produto buscaDiferente = new Livro(
                "Java Basico", 80, "Ana Souza", "999999");

        // Realiza as duas buscas antes da ordenacao
        System.out.println("\n=== BUSCA COM CODIGO IGUAL ===");
        buscarProduto(buscaIgual, produtos);

        System.out.println("\n=== BUSCA COM CODIGO DIFERENTE ===");
        buscarProduto(buscaDiferente, produtos);

        // Ordena utilizando o metodo compareTo()
        // definido na classe Produto
        Arrays.sort(produtos);

        // Exibe os produtos depois da ordenacao
        System.out.println("\n=== VETOR ORDENADO ===");

        for (int i = 0; i < produtos.length; i++) {
            System.out.println(produtos[i]);
        }
    }
}

