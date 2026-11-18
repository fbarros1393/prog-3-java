package exercicio_05;
/**
* Crie uma classe Calculadora com métodos somar() sobrecarregados para:
* doisinteiros, dois doubles, três inteiros.
* No main, teste cada versão do método e exiba os resultados.
*@author Felix de Jesus Sousa Barros 
*@version 1.0
*@since 2026-11-14
*/
// Classe responsável pelas operações 

class Calculadora {
    //metodo que recebe dois números inteiros
    public int somar(int a, int b) {
        //retorna a soma dos valores
        return a + b;
    }
     
    //metodo recebe dois números decimais 
    public double somar(double a, double b) {

        //retorna a soma dos valores decimais
        return a + b;
    }

    //metodo que recebe tres numeros inteiros 
    public int somar(int a, int b, int c) {
        //retorna a soma dos três valores
        return a + b + c;
    }
}

//Calsse principal

public class Exercicio05 {
    public static void main(String[] args) {
        // criando um objeto da classe calculadora
        Calculadora calc = new Calculadora();
        //chamando o metodo que recebe dois inteiros
        int resultado1 = calc.somar(19, 8);

        //chamndo o metodo que soma dois decimal (double)
        double resultado2 = calc.somar(3.5, 1.5);

        //cham o metodo que recebe três inteiros
        int resultado3 = calc.somar(2, 4, 8);

        //exibindo o metodo no terminal
        System.out.println("Soma 1: " + resultado1);
        System.out.println("soma 2: " + resultado2);
        System.out.println("Soma 3: " + resultado3);

    }
}
