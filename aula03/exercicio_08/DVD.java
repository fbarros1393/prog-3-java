package exercicio_08;
/**
 * 
 *  Clase DVD
 * represnta um numero de duração 
 *
 */
public class DVD extends Produto { 
    //Duração do DVD em minutos

    private int duracao;

    //cosntrutor DVD
    public DVD(String nome, double preco, int duracao, String codigoBarras) {
        //inicializa a parte herdade de produto
        super(nome, preco, codigoBarras);
        //inicializa a duracao
        this.duracao = duracao;
    }
    //Acrescenta a duração as informações
    @Override 
    public String toString() {
        return super.toString() + " Duração:  " + duracao + "minutos";
    }
    
}
