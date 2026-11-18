package exercicio_08;
/**
 * 
 * Classe Loja
 * conteudo: Busca sequencial utilizando equals
 */
public class Loja {
    //metodo que procura um produto no vetor
    public static void buscarProduto(Produto procurado, Produto[] produtos) {
        //percorrer todas as posiçoes do vetor
        for (int i = 0; i < produtos.length; i++) {
            //compara o produto atual com o procurado
            if (produtos[i].equals(procurado)) {
                //informa a posição onde foi encontrado
                System.out.println("Produto encontrado na posição: " + i);
                //encerra o metodo após encontrar
                return;
            }
        }
        //Executa está linha se não encontrou o produto 
        System.out.println("Produto não encontrado!");
    }
    public static void main(String[] args) {
        //Cria o vetor com cinco posiçoes 
        Produto[] produtos = new Produto[5];

        //cadastra cinco produtos 
        produtos[0] = new Livro("Java Basico", 80, "Ana Sousa", "789001");
        produtos[1] = new CD("Rock Naacional", 35, 12, "789002");
        produtos[2] = new DVD("Curso de Java", 45, 120, "789003");
        produtos[3] = new Livro("Estruturas de Dados", 95, "Carlos Lima", "789004");

        produtos[4] = new CD("Jazz", 40, 10, "789005");

        // Exibe todos os produtos cadastrados
        System.out.println("=== PRODUTOS DA LOJA ===");

        for (int i = 0; i < produtos.length; i++) {
            System.out.println(produtos[i]);
        }

        // Cria outro livro igual ao primeiro
        // inclusive com o mesmo codigo de barras
        Livro buscaIgual = new Livro(
                "Java Basico", 80, "Ana Souza", "789001");

        // Cria outro livro com os mesmos dados,
        // mas com um codigo de barras diferente
        Livro buscaDiferente = new Livro(
                "Java Basico", 80, "Ana Souza", "999999");

        // Pesquisa utilizando o primeiro objeto
        System.out.println("\n=== PRIMEIRA BUSCA ===");
        buscarProduto(buscaIgual, produtos);

        // Pesquisa utilizando o segundo objeto
        System.out.println("\n=== SEGUNDA BUSCA ===");
        buscarProduto(buscaDiferente, produtos);
    }
    
}
