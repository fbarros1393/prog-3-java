package exercicio_03;
/*** Disciplina: Programação 3
 * Professora: Tainá Isabela
 * 
 * Exercicio 3 do Slide
 * Criar uma ArrayList<String> para armazenar nomes de alunos. Adicionar pelo menos 5nomes.
 *  Use um Iterator para percorrer e imprimir cada nome da lista. 
 * Em seguida remover um nome e exiba novamente a lista atualizada.
 * 
 * @author Felix de Jesus Sousa Barros 
 * @version 1.0
 * @since 2026-09-04
 */


import java.util.ArrayList; //Importar a classe
import java.util.Iterator; // inportar a interface Iterator 


public class TesteListaAlunos {
    public static void main(String[] args) {

        //ArrayList para armazenar nomes 
        ArrayList<String> alunos = new ArrayList<>();

        //Adicionar os nomes na lista
        alunos.add("Felix");
        alunos.add("Tiago");
        alunos.add("John");
        alunos.add("Tarciso");
        alunos.add("Danilo");

        //Iterator para percorrer e imprimir os elementos 
        System.out.println("  Lista inicial de alunos  ");
        Iterator<String> it = alunos.iterator();

        while (it. hasNext()) {
            String nome = it.next(); // obtém o elemento atual e avança
            System.out.println("Aluno: " + nome);

        }
        //REmover um nome da lista
        alunos.remove("Felix");

        //exibir a lista atualizada percorrendo com um novo iterator
        System.out.println("Lista atualizada apos a retirado do Felix");
        Iterator<String> itAtualizado = alunos.iterator();

        while (itAtualizado.hasNext()) {
            System.out.println("Aluno: " + itAtualizado.next());
        }


    }
    
}
