package exercicio_08;
/**
 * 
 * Clase Livro
 * Acrescentando o codigo de barras ao construtor
 * 
 */
public class Livro extends Produto {
    //Atributo especifico especifico de Livro
    private String autor;

    //Construtor com quatro paramentros
    public Livro(String nome, double preco, String autor, String codigoBarras) {
        //inicializa os atributos herdados
        super(nome, preco, codigoBarras);

        //inicializa o atributo exclusivo
        this.autor = autor;
    }
    //Acrescenta o autor as informações do produto
    @Override 
    public String toString() {
        return super.toString() + " Autor: " + autor;
    }
    
}
