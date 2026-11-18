package exercicio_07.Loja;
/**
 * 
 * Classe Produto
 * Super classe para livro , cd  e dvd
 */
public class Produto {
    //atributos comuns a todos os produtos 
    private String nome;
    private double preco;

    //Construtor para inicializar o produto 

    public Produto(String nome, double preco ) {
        this.nome = nome;
        this.preco = preco;
    }
    //retorna o nome do produto 
    public String getNome() {
        return nome;
    }
    //retorne preco do produto 
    public double getPreco() {
        return preco;
    }
    //define cpmo o preço será exibido
    @Override 
    public String toString() {
        return "Nome: " + nome + " Preço: R$ " + preco;
    }
}
