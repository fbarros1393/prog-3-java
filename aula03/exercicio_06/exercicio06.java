package exercicio_06;
/**Crie uma classe ContaBancaria com o atributo numero. 
* Sobrescreva os métodos toString() e equals(): 
* Teste no main: 
* Crie duas contas com números iguais ecompare com equals(). 
*Imprima um objeto diretamente para verificar o funcionamento do toString()
*@author Felix de Jesus Sousa Barros 
*@version 1.0
*@since 2026-11-14
*/

// classe que reprenta uma conta bancária 
class ContaBancaria {
    //Atributo, somente a classe acessa diretamente
    private int numero;

    //cocnstrutor que inicializa o numero da conta 
    public ContaBancaria(int numero) {
        this.numero = numero;
    }

    //metodo get pra consultar o numero 
    public int getNumero() {
        return numero;
    }

    //Sobescreve o metodo herdado de object
    @Override
    public String toString() {
        //define  como o objeto sera exibido 
        return "Conta Bancaria: " + numero;

    }
    //Sobrescreve o metodo equals da classe object
    @Override
    public boolean equals(Object obj) {
        //verifica se o objeto recebido e nulo 
        if (obj == null) {
            return false;
        }
    

         //Verificando se os objetos pertence a mesma clasee
         if (obj.getClass() != this.getClass()) {
        return false;
        }

        //converte object para a conta Bancaria
         ContaBancaria outra = (ContaBancaria) obj;
         //compara os numeros das contas 
        return this.numero == outra.getNumero();
    }
    
    //matem o contrato de igualdade do java
    //objetos iguais devem ter o mesmo hashCode
    public int hashCode() {
        return Integer.hashCode(numero);
    }
}   

//Classe principal

public class exercicio06 {
    public static void main(String[] args) {
        //criando duas contas com numeros iguais
        ContaBancaria conta01 = new ContaBancaria(456);
        ContaBancaria conta02 = new ContaBancaria(456);

        //criando uma terceira conta com numero diferente

        ContaBancaria conta03 = new ContaBancaria(654);
        //imprime diretamente o objeto
        //o java chama automaticamente o toString()

        System.out.println(conta01);
        //compara a primeira conta com a segunda

        System.out.println(
            "Conta 1 igual a Conta 2? "
            + conta01.equals(conta02));

        //Compara a primeira com a terceira 
        System.out.println(
            "Conta 1 igual a Conta 3? "
            + conta01.equals(conta03));

    }
}

