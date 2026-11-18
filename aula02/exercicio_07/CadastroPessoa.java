package exercicio_07;
/*Validador de Cadastro e Busca em Lista
**Desenvolva uma classe CadastroPessoa que integre validação de Strings e busca em coleções:
*Crie uma lista ArrayList<String> para cadastrar nomes de usuários.
*Implemente um método estático validarNome(String nome) que retorna true apenas se o nome não for nulo,
*não estiver vazio e possuir pelo menos 3 caracteres (dica: utilize trim() e length() ).
*Adicione 4 nomes válidos à lista.
*Crie um método de busca que receba a lista e uma String de busca, percorrendo a lista com Iterator para
*verificar se existe algum usuário cujo nome seja igual (ignorando maiúsculas e minúsculas via
*equalsIgnoreCase() ).
*
*@author Felix de Jesus Sousa Barros 
*@version 1.0
*@since 2026-10-03
 */

import java.util.ArrayList;
import java.util.Iterator;


public class CadastroPessoa {
    //Lista que armazena os nomes cadastrados
    private ArrayList<String> nomes = new ArrayList<>();

    //Valida o nome de usuário 

    public static boolean validarNome(String nome) {
        if (nome ==  null) {
            return false;
        }

        String nomeTratado = nome.trim();
        return !nomeTratado.isEmpty() && nomeTratado.length() >=3;
    }

    //Adiciona um nome a lista desde que ele seja válido 
    public boolean adicionarNome(String nome) {
        if (validarNome(nome)) {
            nomes.add(nome.trim());
            return true;
        }

        System.out.println("Nome inválido, não cadastrado: \"" + nome + "\"");
        return false;
    }

    //Buscar um nome na lista, ignorando maiúsculas/minúsculas
    //Ultilizando iterator para percorrer a seleção 
    public static boolean buscarNome(ArrayList<String> lista, String busca) {
        if (lista == null || busca == null) {
            return false;
        }
        Iterator<String> iterator = lista.iterator();
        while (iterator.hasNext()) {
            String nomeAtual = iterator.next();
            if (nomeAtual.equalsIgnoreCase(busca.trim())) {
                return true;
            }
        }
        return false;
    }

    //getter para expor a lista 
    public ArrayList<String> getNomes() {
        return nomes;
    }

    //Método main para teste 
    public static void main(String[] args) {
        CadastroPessoa cadastro = new CadastroPessoa();
        
        //Adicionando nomes válidos
        cadastro.adicionarNome("Ana");
        cadastro.adicionarNome("Felix");
        cadastro.adicionarNome("Tiago");
        cadastro.adicionarNome("John");
        cadastro.adicionarNome("Eliane");
        
        //tentando cadastrar nome inválido para testar as validações
        cadastro.adicionarNome(null);
        cadastro.adicionarNome("");
        cadastro.adicionarNome(" ");
        cadastro.adicionarNome("Jo");

        System.out.println("\n| Nomes Cadastrados | ");
        for (String nome : cadastro.getNomes()) {
            System.out.println("--> " + nome);
        }

        //teste de busca
        System.out.println("\n| Resultados da busca |");
        System.out.println("Buscar 'Ana' -->  " + buscarNome(cadastro.getNomes(), "Ana"));
        System.out.println("Buscar 'FELIX' -->  " + buscarNome(cadastro.getNomes(), "FELIX"));
        System.out.println("Buscar 'Marcos' -->  " + buscarNome(cadastro.getNomes(), "Marcos"));

    }
}
