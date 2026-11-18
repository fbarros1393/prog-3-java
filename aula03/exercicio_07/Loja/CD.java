package exercicio_07.Loja;
/**
 * 
 * Classe CD
 * herda os atributos da classe produtos 
 * 
 */
public class CD extends Produto { 
    //atributos especificos de cd 
    private int numeroFaixas;

    //cosntrutor de cd
    public CD(String nome, double preco, int numeroFaixas) {
        //inicializa os atributos do pai
        super(nome, preco);

        //inicializa o numero de faixas
        this.numeroFaixas = numeroFaixas;
    }
    //personaliza a representação do CD
    @Override 
    public String toString() {
        return super.toString() + " Faixas: " + numeroFaixas;
    }
    
}
