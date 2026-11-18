package exercicio_06;
/**
* Disciplina: Programação 3
* Professora: Tainá Isabela
* 
* Exercício 6 
* Sistema de Gerenciamento de Contas Bancárias
* Com base no exemplo de Conta visto em aula, 
* crie uma classe ContaBancaria com os atributos numero(int), titular (String) e saldo (double).
* Crie um ArrayList<ContaBancaria> para armazenar múltiplas contas.
* Adicione 3 contas distintas na lista.
* Utilize um Iterator para percorrer a lista de contas, exibir o número e o titular de cada conta, e calcular a soma total do saldo de todas as contas da lista.
* Ao final, exiba o saldo total acumulado no banco
* 
* @author Felix de Jesus Sousa Barros 
* @version 1.0
* @since 2026-09-04
*/
import java.util.ArrayList;
import java.util.Iterator;

class ContaBancaria {
    //Atributos da classe 
    int numero;
    String titular;
    double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }    
}

class SistemaBanco {

    public static void main(String[] args) {

        // Lista para armazenar as contas bancarias
        ArrayList<ContaBancaria> listaContas = new ArrayList<>();

        // Adiciona tres contas a lista
        listaContas.add(
                new ContaBancaria(1, "Felix", 1500.50));

        listaContas.add(
                new ContaBancaria(2, "Tiago", 2300.00));

        listaContas.add(
                new ContaBancaria(3, "Tarciso", 850.75));

        // Variavel que acumula o saldo das contas
        double saldoTotal = 0;

        // Cria um Iterator para percorrer a lista
        Iterator<ContaBancaria> iterator =
                listaContas.iterator();

        System.out.println("LISTA DE CONTAS BANCARIAS");

        // Percorre enquanto existirem contas
        while (iterator.hasNext()) {

            // Obtem a conta da posicao atual
            ContaBancaria contaAtual = iterator.next();

            // Imprime os dados da conta
            System.out.printf(
                    "Conta: %d | Titular: %s | Saldo: R$ %.2f%n",
                    contaAtual.numero,
                    contaAtual.titular,
                    contaAtual.saldo);

            // Soma o saldo da conta ao total
            saldoTotal += contaAtual.saldo;
        }

        // Fora do while: imprime o total apenas uma vez
        System.out.printf(
                "Saldo total acumulado: R$ %.2f%n",
                saldoTotal);
    }
}


 


