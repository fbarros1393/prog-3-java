/**
 * Disciplina: Programação 3
 * Professora: Tainá Isabela
 * 
 * Descrição: O programa  determina e escreve os números primos compreendidos entre um intervalo
fornecido pelo usuário
 * @author Felix de Jesus Sousa Barros 
 * @version 1.0
 * @since 2026-08-18
 */
import java.util.Scanner;
public class numprimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero do seu internalo: ");
        int inicio = scanner.nextInt();

        System.out.print("Digite o segundo numero do seu intervalo: ");
        int fim = scanner.nextInt();

        System.out.println("Numeros primos no intervalo " + inicio + "-->" + fim);
        
        boolean encontrou = false;
        for (int i = inicio; i <= fim; i++) {
            if (ehPrimo(i)) {
                System.out.print(i +  ",");
                encontrou = true;

            }
        }
        //Para o caso de não encontrar números primos
        if (!encontrou) {
            System.out.println("Nenhum número primo encontrado dentro desse intervalo");
        }
        scanner.close();

    }

    //Método para verifcar se o numero é primo 
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return  false;

        }
        for (int i = 2; i * i <= numero; i++) {
            
            if (numero % i == 0 ) {
                    return false;
            }

        }

        
        return true;
    }
    
    
}
