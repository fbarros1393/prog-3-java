package exercicio_04;

/*
 * EXERCICIO 04 - AULA 04
 * Conteudo: Interfaces e polimorfismo.
 */

// Interface que define as operacoes de pagamento
interface Pagamento {

    // Metodo para processar o pagamento
    void processarPagamento(double valor);

    // Metodo para cancelar o pagamento
    void cancelarPagamento();
}
// Classe que representa pagamento por cartao
class PagamentoCartao implements Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.printf( "Pagamento de R$ %.2f realizado no cartao.%n", valor);
    }

    @Override
    public void cancelarPagamento() {
        System.out.println("Pagamento do cartao cancelado.");
    }
}
// Classe que representa pagamento por Pix
class PagamentoPix implements Pagamento {

    @Override
    public void processarPagamento(double valor) {

        System.out.printf("Pix de R$ %.2f realizado.%n", valor);
    }

    @Override
    public void cancelarPagamento() {
        System.out.println("Pagamento Pix cancelado.");
    }
}

// Classe que representa pagamento por boleto
class PagamentoBoleto implements Pagamento {

    @Override
    public void processarPagamento(double valor) {

        System.out.printf("Boleto de R$ %.2f gerado.%n", valor);
    }

    @Override
    public void cancelarPagamento() {
        System.out.println("Boleto cancelado.");
    }
}

// Classe principal
public class Exercicio04 {

    public static void main(String[] args) {

        // Cria um vetor do tipo da interface Pagamento
        Pagamento[] pagamentos = new Pagamento[3];

        // Cada posicao recebe um tipo de pagamento
        pagamentos[0] = new PagamentoCartao();
        pagamentos[1] = new PagamentoPix();
        pagamentos[2] = new PagamentoBoleto();

        // Percorre todas as formas de pagamento
        for (int i = 0; i < pagamentos.length; i++) {

            // Cada objeto executa seu proprio metodo
            pagamentos[i].processarPagamento(150.00);

            // Executa o cancelamento correspondente
            pagamentos[i].cancelarPagamento();

            System.out.println();
        }
    }
}
