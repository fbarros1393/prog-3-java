package exercicio_01;
/*
 * EXERCICIO 01 - AULA 04
 * Conteudo: Classes e metodos abstratos.
 */

// Classe abstrata: nao pode ser instanciada diretamente
abstract class ContaBancaria {

    // Atributos comuns aos tipos de conta
    protected String titular;
    protected double saldo;

    // Construtor da classe abstrata
    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Metodo abstrato: cada subclasse define o saque
    public abstract boolean sacar(double valor);

    // Metodo abstrato: sera implementado nas subclasses
    public abstract void depositar(double valor);

    // Metodo concreto: ja possui uma implementacao
    public void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
    }
}

// ContaCorrente herda da classe abstrata ContaBancaria
class ContaCorrente extends ContaBancaria {

    // Taxa fixa cobrada por saque
    private double taxaSaque = 1.00;

    // Construtor da conta corrente
    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    // implementacao obrigatoria do metodo sacar
    @Override
    public boolean sacar(double valor) {

        // O valor total inclui a taxa de saque
        double total = valor + taxaSaque;

        // Verifica se o valor e valido e existe saldo
        if (valor > 0 && saldo >= total) {
            saldo = saldo - total;
            System.out.println("Saque realizado!");
            return true;
        }

        System.out.println("Saque invalido ou saldo insuficiente!");
        return false;
    }

    // implementacao do metodo depositar
    @Override
    public void depositar(double valor) {

        // Depositos devem ser positivos
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Deposito realizado!");
        } else {
            System.out.println("Valor de deposito invalido!");
        }
    }
}

// ContaPoupanca tambem herda de ContaBancaria
class ContaPoupanca extends ContaBancaria {

    // Construtor da conta poupanca
    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    // saque sem cobranca de taxa
    @Override
    public boolean sacar(double valor) {

        if (valor > 0 && saldo >= valor) {
            saldo = saldo - valor;
            System.out.println("Saque realizado!");
            return true;
        }

        System.out.println("Saque invalido ou saldo insuficiente!");
        return false;
    }

    // deposito da conta poupanca
    @Override
    public void depositar(double valor) {

        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Deposito realizado!");
        } else {
            System.out.println("Valor de deposito invalido!");
        }
    }
}

// Classe principal do exercicio
public class Exercicio01 {

    public static void main(String[] args) {

        // Referencias da classe abstrata
        ContaBancaria conta1 =
                new ContaCorrente("Joao", 100.00);

        ContaBancaria conta2 =
                new ContaPoupanca("Maria", 100.00);


        // Testes da conta corrente
        System.out.println(" CONTA CORRENTE ");
        conta1.depositar(50);
        conta1.sacar(30);
        conta1.sacar(200); // Teste de saldo insuficiente
        conta1.exibirSaldo();

        // testes da conta poupanca
        System.out.println("\n CONTA POUPANCA ");
        conta2.depositar(50);
        conta2.sacar(30);
        conta2.sacar(-10); // Teste de valor invalido
        conta2.exibirSaldo();
    }
}
