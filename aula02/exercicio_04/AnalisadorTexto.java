package exercicio_04;
/*** Disciplina: Programação 3
 * Professora: Tainá Isabela
 * 
 * Exercicio 4 
 * Escreva um programa em Java que receba uma frase (ex: " Programação Orientada a Objetos com Java " )
 * e execute as seguintes operações utilizando métodos da classe String :
 * Remova os espaços em branco do início e do fim utilizando trim() .
 * Imprima a quantidade total de caracteres da frase tratada usando length() .
 * Exiba a frase completamente em maiúsculas com toUpperCase() .
 * Substitua a palavra "Java" por "Linguagem Java" utilizando replace() .
 * Exiba o caractere localizado na posição de índice 5 com charAt() .
 * 
 * @author Felix de Jesus Sousa Barros 
 * @version 1.0
 * @since 2026-09-05
 */


public class AnalisadorTexto {
    public static void main(String[] args) {
        //Frase de exemplo com espaço no inicio e no fim 

        String fraseOriginal = " Programação Orientada a Objetos  com Java ";

        System.out.println("-Frase Original: " + fraseOriginal);

        // REmover espaços em branco do inicio ao fim 
        String fraseTratada = fraseOriginal.trim();
        System.out.println("-Frase com trim(): " + fraseTratada );

        //Imprimir a quantidade total de caractere da frase tratada
        int totalCaracteres = fraseTratada.length();
        System.out.println("-Quantidade total de caracteres: " + totalCaracteres);

        //Exibir a frase em Maiscula
        String fraseMaiscula = fraseTratada.toUpperCase();
        System.out.println("-Frase em maisculo: " + fraseMaiscula);

        //Substituir a palavra java por Linguagem Java
    String fraseSubstituida = fraseTratada.replace("Java","Linguagem Java");
    System.out.println("-Frase com substituição " + fraseSubstituida);

    //Exibir o caractere localizado no indice 5

    char caractereIndice5 = fraseTratada.charAt(5);
    System.out.println("-Caractere na posição 5: " + caractereIndice5);

    }
    
}