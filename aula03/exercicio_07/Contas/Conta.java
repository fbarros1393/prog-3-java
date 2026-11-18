package exercicio_07.Contas;
/**
 * Classe conta
 * Superclasse para o tipos de conta bancárias
 */
public class Conta {
    //Atributos de uma conta 
    private int numero;
    private String nomeTitular;

    //protect permite o acesso pelas subclasses
    protected double saldo;

    //construtor que recebe numero, titular e saldo 

    public Conta(int numero, String nomeTitular, double saldo) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;

    }

    //construtor pra conta começar em 0

    public Conta(int numero, String nomeTitular) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.saldo = 0;
    }

    //metodo pra depositar um valor na conta 
    public void depositar(double valor) {
        //pra permitir somente depositos positivos
        if (valor > 0) {
            saldo = saldo + valor;
        }
    } 
    //Metodo pra sacar
    public boolean sacar(double valor) {
        //verificar se o valor é positivo 
        //e se exite saldo suficiente

        if (valor > 0 && valor <= saldo) {
            saldo = saldo -valor;
            return true;
        }
        //retornar falso quando o saque não é permitido 
        return false;

    }
   
    //Retornar o saldo atual 
    public double getSaldo() {
        return saldo;
    }
    //retorna o numero da conta
    public int getNumero() {
        return numero;
    }
    //retorna o nome do titular
    public String getNomeTitular() {
        return nomeTitular;
    }
    //permite alterar o nome do titular
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;

    }
    //indentifica o tipo da conta 
    public void imprimirTipoConta() {
        System.out.println("Conta Comum");
    }
}
