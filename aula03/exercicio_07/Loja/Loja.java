package exercicio_07.Loja;
/**
 * 
 * Classe Loja
 * REsponsavel por criar e exibir os produtos 
 * 
 */
public class Loja {
    public static void main(String[] args) {
        //Criando um vetor do tipo produto com 5 posições
        Produto[] produtos = new Produto[5]; 
        //Adiciona dois livros dois cds e um dvd
        produtos[0] = new Livro("Java Basico", 80, "Ana Souda ");
        produtos[1] = new CD("Rock Naciona", 35, 12);
        produtos[2] = new DVD("Curso de Java", 45, 120);
        produtos[3] = new Livro("Estrutura de Dados", 95, "Carlos Lima");
        produtos[4] = new CD("Forró", 40, 10);

        //Exibindo uma mensagem no terminal 

        System.out.println("  PRODUTOS DA LOJA   ");
        //Laço for para percorre as posiçoes do vetor
        for (int i = 0; i < produtos.length; i++) {
            //chama automaticamente o toString 
            //coreespondente ao tipo real do prodtuto 
            System.out.println(produtos[i]);

        }
    }
    
}
