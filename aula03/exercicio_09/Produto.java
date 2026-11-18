package exercicio_09;
/**
 * Alterações nesta classe e na classe loja
 * as demais serão a mesma do exercicico 08
 * Produto
 */
//Comparable permite comparar produtos para ordenação
public class Produto implements Comparable<Produto>{
    //Atributos da classe produto 
    private String nome;
    private double preco;
    private String codigoBarras;

    //cosntrutor para inicializar os atributos 
    public Produto(String nome, double preco, String codigoBarras) {
        this.nome = nome;
        this.preco = preco;

        //Codigos de barra deve ser informado

        if (codigoBarras == null || codigoBarras.isEmpty()) {
            throw new IllegalArgumentException("Código de Barras obrigatório");

        }
        this.codigoBarras = codigoBarras;

    }
    //retorna o nome do produto 
    public String getNome() {
        return nome;
    }
    //Retorna o código de barra 
    public String getCodigoBarras() {
        return codigoBarras;
    }
    // define como o produto sera exibido
    public String toString() {
        return "Nome: " + nome + " Preço: " + preco + " Código: " + codigoBarras;
    }
    //compara produtos pelo códigos de barras 
    @Override 
    public boolean equals(Object obj) {
        //se for nulo não é igual 
        if (obj == null) {
            return false;
        }
        //Verifica se é um objeto do tipo produto 
        if (!(obj instanceof Produto)) {
            return false;
        }
        //converte o objeto recebido para Produto 
        Produto outro = (Produto) obj;

        //compara os códigos de barras 
        return codigoBarras.equals(outro.codigoBarras);
    }
    //implementa as hascode de acordo com equals
    @Override 
    public int hashCode() {
        return codigoBarras.hashCode();
    }
    //Metodo exigido pela interface Comparable
    @Override 
    public int compareTo(Produto outro) {
        //compara os nomes em ordem alfabetica 
        //ingnorando maiusculas e minusculas
        return this.nome.compareToIgnoreCase(outro.nome);
    }

    
}
