package exercicio_07.Loja;
/**
 * 
 * Classe DVD
 * Herda da classe produto 
 */
public class DVD extends Produto {
    //Duração do dvd em minutos
    private int duracao;
    //Construtor de dvd 
    public DVD(String nome, double preco, int duracao) {
        //cahama o cosntrutor de produtos 
        super(nome, preco);

        //inicializa a duracao 
        this.duracao = duracao;


    }
    //personaliza a exibição do dvd
    @Override 
    public String toString() {
        return super.toString() + " Duração: " + duracao + "minutos";
    }
    
}
