package exercicio_08;
/**
 * 
 * Classe Produto
 * conteudo: Encapsulamento e sobrescrita de equals
 * 
 */


public class Produto {
    //Atributos comuns a todos os produtos 
    private String nome;
    private double preco;
    private String codigoBarras;

    //construtor com código de barras obrigatório 
    public Produto(String nome, double preco, String codigoBarras) {
        this.nome = nome;
        this.preco = preco;

        //verifica se o código de barra foi informado 
        if (codigoBarras == null || codigoBarras.isEmpty()) {
            throw new IllegalArgumentException("Codigo de barras obrigatorio");
        }
        this.codigoBarras = codigoBarras;
    }
    //Retorna o nome do produto 
    public String getNome() {
        return nome;
    }
    //retorna o preço do produto 
    public double getPreco() {
        return preco;
    }
    //retorna o código de barras 
    public String getCodigoBarras() {
        return codigoBarras;
    }
    //sobrescreve o metodo toString
    @Override 
    public String toString() {
        return "Nome: " + nome + " Preço: R$" + preco + " Codigo: " + codigoBarras;

    }
    //Compara o =s dois produtos pelo codigo de barras
    @Override 
    public boolean equals(Object obj) {
        //Verifica se o objeto recebido e nulo 
        if (obj == null) {
            return false;
        }

        //Verifica de objeto e um produto pertence a uma de suas classe
        if (!(obj instanceof Produto)) {
            return false;
        }
        //converte object para produto 
        Produto outro = (Produto) obj;
        //compara os codigos de barras
        return this.codigoBarras.equals(outro.codigoBarras);
    }
    //Produz o mesmo hashcode para codigos iguais
    @Override 
    public int hashCode() {
        return codigoBarras.hashCode();
    }
    
}
