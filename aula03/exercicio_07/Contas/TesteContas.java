package exercicio_07.Contas;
// classe principal para testar os tipos de contas

public class TesteContas {
    public static void main(String[] args) {
        //Criando uma conta
        Conta comum = new Conta(1, "Felix");

        // criando uma conta especial com limite 100
        ContaEspecial especial = new ContaEspecial(2, "Maria", 100);

        //criando uma conta poupança
        Contapoupanca poupanca = new Contapoupanca(3, "Hendriw");

        //depositar 100 e sacar 30 
        comum.depositar(100);
        comum.sacar(30);

        //Depositar 50 e sacar 120 da conta especial
        especial.depositar(50);
        especial.sacar(120);



        //depositar 200 e aplicar reajuste de 5%
        poupanca.depositar(200);
        poupanca.reajustar(0.05);

        //Mostrando o tipo e o saldo da conta 
        comum.imprimirTipoConta();
        System.out.println("SAldo: " + comum.getSaldo());

        especial.imprimirTipoConta();
        System.out.println("Saldo: " + especial.getSaldo());

        poupanca.imprimirTipoConta();
        System.out.println("Saldo: " + poupanca.getSaldo());

    }
}
