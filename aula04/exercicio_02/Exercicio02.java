package exercicio_02;

/*
 * EXERCICIO 02 - AULA 04
 * Conteudo: Classe abstrata e polimorfismo.
 */

import java.util.Scanner;

// Classe abstrata que representa um funcionario
abstract class Funcionario {

    // Atributos comuns aos funcionarios
    protected String nome;
    protected String matricula;
    protected double salarioBase;

    // Construtor da classe pai
    public Funcionario(String nome, String matricula, double salarioBase) {

        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    // Metodo abstrato que calcula o salario
    public abstract double calcularSalario();

    // Metodo concreto que exibe os dados
    public void exibirDados() {
         System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.printf("Salario: R$ %.2f%n", calcularSalario());
    }
}

// Funcionario CLT herda da classe Funcionario
class FuncionarioCLT extends Funcionario {

    public FuncionarioCLT(String nome, String matricula, double salarioBase) {
        // Inicializa os atributos da classe pai
        super(nome, matricula, salarioBase);
    }

    // Sobrescreve o calculo do salario
    @Override
    public double calcularSalario() {
        // Salario acrescido de 10%
        return salarioBase + (salarioBase * 0.10);
    }
}

// Funcionario que recebe uma comissao adicional
class FuncionarioComissionado extends Funcionario {

    // Atributo exclusivo da subclasse
    private double comissao;

    // Construtor do funcionario comissionado
    public FuncionarioComissionado(String nome, String matricula, double salarioBase, double comissao) {
        super(nome, matricula, salarioBase);
        this.comissao = comissao;
    }

    // Calcula o salario incluindo a comissao
    @Override
    public double calcularSalario() {
        return salarioBase + comissao;
    }
}

// Classe principal
public class Exercicio02 {

    public static void main(String[] args) {

        // Scanner para receber dados pelo teclado
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a comissao em reais: ");
        double comissao = sc.nextDouble();

        // Cria um funcionario CLT usando a classe pai
        Funcionario funcionario1 =  new FuncionarioCLT("Carlos", "001", 2000);
        // Cria um funcionario comissionado
        Funcionario funcionario2 = new FuncionarioComissionado( "Ana", "002", 1800, comissao);

        // Exibe os dados do funcionario CLT
        System.out.println("\n=== FUNCIONARIO CLT ===");
        funcionario1.exibirDados();

        // Exibe os dados do funcionario comissionado
        System.out.println("\n=== FUNCIONARIO COMISSIONADO ===");
        funcionario2.exibirDados();

        // Fecha o Scanner
        sc.close();
    }
}

