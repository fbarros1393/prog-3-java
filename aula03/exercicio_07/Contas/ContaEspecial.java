package exercicio_07.Contas;
/**
 * Herda da classe conta 
 */
public class ContaEspecial extends Conta {
    //Atributo exclusivo da conta especial
    private double limite;

    //construtor da conta especial
    public ContaEspecial(int numero, String nomeTitular, double limite) {
        //chama o construtor da classe pai
        super(numero, nomeTitular);

        //inicializa o atributo exclusivo
        this.limite = limite;
    }
    //metodo para construir o limite
    public double getLimite() {
        return limite;
    }

    //metodo para modificar o limite
    public void setLimite(double limite) {
        this.limite = limite;

    }
    //sobrescreve o metodo sacar da classe pai 
    @Override 
    public boolean sacar(double valor) {
        //permite ultilizar o saldo do limite
        if (valor > 0 && valor <= saldo + limite) {
            saldo = saldo - valor;
            return true;
        }
        return false;
    }
    //sobrescrve a indentificação da conta 
    @Override 
    public void imprimirTipoConta() {
        System.out.println("Conta especial");

    }
     
}
