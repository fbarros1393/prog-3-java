package Exercicio05;
/*
 * EXERCICIO 05 - AULA 05
 * Conteudo: Lancamento e propagacao de excecoes.
 */
public class Exercicio05 {

    // Metodo que verifica a idade recebida
    public static void validarIdade(int idade)
            throws IllegalArgumentException {

        // Verifica se a idade e negativa
        if (idade < 0) {

            // throw lanca uma excecao durante a execucao
            throw new IllegalArgumentException(
                "A idade nao pode ser negativa.");
        }

        // Executa somente quando a idade e valida
        System.out.println("Idade valida: " + idade);
    }

    // Metodo intermediario que chama validarIdade
    public static void cadastrarPessoa(int idade)
            throws IllegalArgumentException {

        System.out.println("Iniciando cadastro...");

        // A excecao, se ocorrer, sera propagada
        // para o metodo que chamou cadastrarPessoa
        validarIdade(idade);

        System.out.println("Cadastro realizado!");
    }

    // Metodo principal
    public static void main(String[] args) {

        // Vetor com idades para os testes
        int[] idades = {20, -5, 30};

        // Percorre as idades
        for (int i = 0; i < idades.length; i++) {

            System.out.println("\n=== TESTE " + (i + 1) + " ===");

            try {

                // Chama o metodo intermediario
                cadastrarPessoa(idades[i]);

            } catch (IllegalArgumentException e) {

                // Captura a excecao propagada
                System.out.println(
                    "Erro: " + e.getMessage());
            }
        }
    }
}
