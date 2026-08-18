/**
 * Disciplina: Programação 3
 * Professora: Tainá Isabela
 * 
 * Descrição: O programa realiza umas das 4 operaçoes (-), (+), (x), (/)
 * entre duas váriaves, os valores serão escolhido pelo usuário.
 * 
 * @author Felix de Jesus Sousa Barros 
 * @version 1.0
 * @since 2026-08-17
 */
import java.util.Scanner;//pra pegar o que o usuário digitar 
public class opbasicas {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro númmero: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Resultados ");
        System.out.println("Soma = " + (num1 + num2));
        System.out.println("Subtração = " + (num1 - num2));
        System.out.println("Multiplicação = " + (num1 * num2));

        if(num2 != 0){
            System.out.println("Divisão = " + (num1 / num2));
        } else {
            System.out.println("Erro !!! Divisão por 0 não existe");
        }

        scanner.close();
        



    }
    
}
