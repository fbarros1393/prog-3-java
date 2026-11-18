package exercicio_07.Contas;

public class Contapoupanca extends Conta {
    // cosntrutor da conta poupança
    public Contapoupanca(int numero, String nomeTitular) {
        //inicializa a parte herdada da classe conta 
        super(numero, nomeTitular);
    }
    //colocando um reajuste ao saldo
    public void reajustar(double percentual) {
        //consultando o saldo atual 
        double saldoAtual = getSaldo();

        //calculando o reajuste 
        double reajuste = saldoAtual * percentual;
        
        //acrescentar o reajuste ao saldo 
        depositar(reajuste);

    }

    //Sobrescreve o metodo da classe pai 
    @Override 
    public void imprimirTipoConta() {
        System.out.println("Conta Poupança");
    }
    
}
