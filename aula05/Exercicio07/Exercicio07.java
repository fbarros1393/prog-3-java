package Exercicio07;
/*
 * EXERCICIO 07 - AULA 05
 * Desafio Integrador: Cadastro de Alunos
 *
 * Conteudos:
 * try, catch, finally, throw, throws e validacao.
 */

import java.util.Scanner;
public class Exercicio07 {
    // Metodo responsavel pela validacao da idade
    public static void validarIdade(int idade)
            throws IllegalArgumentException {

        // Verifica se a idade e negativa
        if (idade < 0) {
            // Lanca uma excecao quando a idade e invalida
            throw new IllegalArgumentException( "A idade nao pode ser negativa.");
        }
    }
    // Metodo responsavel pela validacao da nota
    public static void validarNota(double nota)
            throws IllegalArgumentException {

        // Verifica se a nota esta entre 0 e 10
        if (!Double.isFinite(nota) || nota < 0 || nota > 10) {

            // Lanca uma excecao para notas invalidas
            throw new IllegalArgumentException( "A nota deve estar entre 0 e 10.");
        }
    }

    // Metodo responsavel pela validacao do nome
    public static void validarNome(String nome)
            throws IllegalArgumentException {

        // Nao permite nomes vazios
        if (nome == null || nome.trim().isEmpty()) {

            throw new IllegalArgumentException( "O nome nao pode estar vazio.");
        }
    }

    // Metodo principal
    public static void main(String[] args) {

        // Scanner para ler os dados do usuario
        Scanner sc = new Scanner(System.in);

        // Contadores de cadastros
        int aceitos = 0;
        int rejeitados = 0;

        // Controla se o programa deve continuar
        boolean continuar = true;

        // Repete enquanto o usuario desejar
        while (continuar) {

            System.out.println("\n CADASTRO DE ALUNOS ");

            try {

                // Solicita o nome
                System.out.print("Nome: ");
                String nome = sc.nextLine();

                // Valida o nome informado
                validarNome(nome);

                // Solicita a idade como texto
                System.out.print("Idade: ");
                String textoIdade = sc.nextLine();

                // Converte a idade para inteiro
                int idade = Integer.parseInt(textoIdade);

                // Valida a idade
                validarIdade(idade);

                // Solicita a nota como texto
                System.out.print("Nota: ");
                String textoNota = sc.nextLine();

                // Converte a nota para double
                double nota = Double.parseDouble(textoNota);

                // Valida a nota
                validarNota(nota);

                // Executa somente se todos os dados
                // passaram pelas validacoes
                System.out.println("\nCadastro aceito!");
                System.out.println("Aluno: " + nome);
                System.out.println("Idade: " + idade);

                System.out.printf("Nota: %.2f%n", nota);

                // Incrementa o contador de aceitos
                aceitos++;

            } catch (NumberFormatException e) {

                // Captura texto invalido em campos numericos
                System.out.println(
                    "Cadastro rejeitado: digite numeros validos.");

                // Incrementa o contador de rejeitados
                rejeitados++;

            } catch (IllegalArgumentException e) {

                // Captura erros das validacoes
                System.out.println(
                    "Cadastro rejeitado: " + e.getMessage());

                // Incrementa o contador de rejeitados
                rejeitados++;

            } finally {

                // Executa depois de cada tentativa
                System.out.println("Tentativa de cadastro finalizada.");
            }
            // Pergunta se deseja realizar outro cadastro
            System.out.print("\nCadastrar outro aluno? (S/N): ");
            String resposta = sc.nextLine();
            // Se a resposta nao for S, encerra o laco
            if (!resposta.equalsIgnoreCase("S")) {
                continuar = false;
            }
        }
        // Exibe o resumo dos cadastros
        System.out.println("\n=== RESUMO FINAL ===");

        System.out.println("Cadastros aceitos: " + aceitos);
        System.out.println("Cadastros rejeitados: " + rejeitados);

        System.out.println(
            "Total de tentativas: " + (aceitos + rejeitados));

        // Fecha o Scanner
        sc.close();
    }
}

