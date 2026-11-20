package exercicio_05;

/*
 * EXERCICIO 05 - AULA 04
 * Conteudo: Enumeracoes e switch.
 */

// Enum com os possiveis estados de um pedido
enum StatusPedido {

    AGUARDANDO_PAGAMENTO,
    PAGO,
    ENVIADO,
    ENTREGUE,
    CANCELADO
}

// Classe que representa um pedido
class Pedido {

    // Atributos do pedido
    private int numero;
    private double valor;
    private StatusPedido status;

    // Construtor
    public Pedido(int numero, double valor) {

        this.numero = numero;
        this.valor = valor;

        // Todo pedido comeca aguardando pagamento
        this.status = StatusPedido.AGUARDANDO_PAGAMENTO;
    }

    // Metodo para alterar o status do pedido
    public void alterarStatus(StatusPedido novoStatus) {

        this.status = novoStatus;
    }

    // Metodo que exibe os dados e a situacao
    public void exibirSituacao() {

        System.out.println("Pedido numero: " + numero);

        System.out.printf("Valor: R$ %.2f%n", valor);

        // Analisa o status atual do pedido
        switch (status) {

            case AGUARDANDO_PAGAMENTO:
                System.out.println("Aguardando pagamento.");
                break;

            case PAGO:
                System.out.println("Pagamento confirmado.");
                break;

            case ENVIADO:
                System.out.println("Pedido enviado.");
                break;

            case ENTREGUE:
                System.out.println("Pedido entregue.");
                break;

            case CANCELADO:
                System.out.println("Pedido cancelado.");
                break;
        }
    }
}

// Classe principal
public class Exercicio05 {

    public static void main(String[] args) {

        // Cria tres pedidos
        Pedido pedido1 = new Pedido(1, 100.00);
        Pedido pedido2 = new Pedido(2, 250.00);
        Pedido pedido3 = new Pedido(3, 80.00);

        // O pedido1 permanece aguardando pagamento

        // Altera o segundo pedido para pago
        pedido2.alterarStatus(StatusPedido.PAGO);

        // Altera o terceiro pedido para enviado
        pedido3.alterarStatus(StatusPedido.ENVIADO);

        // Exibe os tres pedidos
        System.out.println(" PEDIDO 1 ");
        pedido1.exibirSituacao();

        System.out.println("\n PEDIDO 2 ");
        pedido2.exibirSituacao();

        System.out.println("\n PEDIDO 3 ");
        pedido3.exibirSituacao();

        // Testa os dois estados que ainda nao apareceram
        pedido2.alterarStatus(StatusPedido.ENTREGUE);
        pedido3.alterarStatus(StatusPedido.CANCELADO);

        System.out.println("\n NOVOS STATUS ");
        pedido2.exibirSituacao();
        pedido3.exibirSituacao();
    }
}
