package Exercicio01;

/*
 * EXERCICIO 01 - AULA 05
 * Conteudo: try-catch e ArithmeticException.
 *
 * Objetivo: realizar uma divisao inteira
 * e tratar o erro de divisao por zero.
 */

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        // Scanner permite ler valores pelo teclado
        Scanner sc = new Scanner(System.in);

        // Realiza tres testes
        for (int i = 1; i <= 3; i++) {

            System.out.println("\n=== TESTE " + i + " ===");

            try {

                // Solicita o primeiro numero
                System.out.print("Digite o primeiro numero: ");
                int numero1 = Integer.parseInt(sc.nextLine());

                // Solicita o segundo numero
                System.out.print("Digite o segundo numero: ");
                int numero2 = Integer.parseInt(sc.nextLine());

                // Realiza a divisao inteira
                // Se numero2 for zero, ocorre uma excecao
                int resultado = numero1 / numero2;

                // Exibe o resultado quando a divisao e valida
                System.out.println("Resultado: " + resultado);

            } catch (ArithmeticException e) {

                // Captura especificamente a divisao por zero
                System.out.println(
                    "Erro: nao e possivel dividir por zero.");

            } catch (NumberFormatException e) {

                // Captura entrada que nao representa inteiro
                System.out.println(
                    "Erro: digite apenas numeros inteiros.");
            }
        }

        // Fecha o Scanner ao terminar os testes
        sc.close();
    }
}
