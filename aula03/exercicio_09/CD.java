package exercicio_09;
/**
 * 
 * Clase CD
 * representa um produto com o numero de faixas 
 */
public class CD extends Produto { 
    //atributo exclusivo da classe cd
    private int numeroFaixas;

    //construtor cd
    public CD(String nome, double preco, int numeroFaixas, String codigoBarrras) {
        //chama o construtor da classe pai 
        super(nome, preco, codigoBarrras);

        //inicializa o numero de faixas
        this.numeroFaixas = numeroFaixas;

    }
    //personaliza a exibição das informações 
    @Override 
    public String toString() {
        return super.toString() + " Faixas " + numeroFaixas;
    }
    
}
