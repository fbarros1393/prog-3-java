package exercicio_07.Loja;
/**
 * 
 * Clase Livro
 * Herda nome e preco da classe produto 
 */

public class Livro extends  Produto { 
    //atributos exclusivo de livro 
    private String autor;
    //Construtor recebe os dados do livro

    public Livro(String nome, double preco, String autor) {
        //Envia nome e preço para o construtor de produto 
        super(nome, preco);

        //inicializa o atributo autor
        this.autor = autor;
    }
    //Sobreescreve o toString da classe produto 
    @Override 
    public String toString() {
        //aproveita o texto da classe pai
        //e acrescenta o autor
        return super.toString() + "Autor: " + autor;
    }
    
}
