package exercicio_05;
/**
* Disciplina: Programação 3
* Professora: Tainá Isabela
* 
* Exercício 5 
* Crie uma classe chamada Produto com os atributos: id (int), nome (String) e preco (double).
* Implemente o método aplicarDesconto(double porcentagem) que atualiza o preço do produto aplicando a
* porcentagem de desconto informada.
* Implemente o método exibirDetalhes() mostrando o id, nome e preço formatado.
* No main , crie dois objetos Produto , aplique um desconto de 10% no primeiro produto e 15% no segundo, e
* exiba os detalhes atualizados de ambos.
* 
* @author Felix de Jesus Sousa Barros 
* @version 1.0
* @since 2026-09-05
*/
public class Produto {
    //Atributos da classe
    int id;
    String nome;
    double preco;

    //método para aplicar o desconto no preço do produto 
    void aplicarDesconto(double porcentagem) {
        double valorDesconto = this.preco * (porcentagem / 100.0);
        this.preco = this.preco - valorDesconto;
    }

    // Método para exibir detalhes e informações do produto 
    void exibirDetalhes() {
        //Exibe o preço formatado com duas casas decimais
        System.out.printf("ID: %d | Nome: %s | Preço: R$ %.2f%n", this.id, this.nome, this.preco);

    }

}

// Criando a main para teste do produto 

 class TesteProduto {
    public static void main(String[] args) {
        // Criando o primeiro produto 
        Produto p1 = new Produto();
        p1.id  = 001;
        p1.nome = "Notebook";
        p1.preco = 3500.00;

        //Craindo o segundo produto
        Produto p2 = new Produto();
        p2.id = 002;
        p2.nome = "Smartphone";
        p2.preco = 2000.00;

        //Aplicando desconto de 10 % no primeiro produto 
        p1.aplicarDesconto(10);
        // Aplicando desconto de 15% no segundo produto
        p2.aplicarDesconto(15);

        //Exibir os detalhes atualizados de cada produto 

        System.out.println("Detalhes dos produtos depois dos descontos");
        p1.exibirDetalhes();
        p2.exibirDetalhes();
    }
}
