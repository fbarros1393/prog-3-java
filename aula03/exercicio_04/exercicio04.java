package exercicio_04;
/**Crie uma classe Animal com um método emitirSom(). 
 * Crie duas subclasses:Cachorro e Gato.
 *  Sobrescreva o método emitirSom() para imprimir sons diferentes. 
 * No main, crie um array de Animal contendo um Cachorro e um Gato, e percorra chamando emitirSom() para cada um.
*@author Felix de Jesus Sousa Barros 
*@version 1.0
*@since 2026-11-14
 */

//classe pai (superclasse)
class Animal {
    //metodo que será herdadado pelas classes filhas
    public void emitirSom() {
        System.out.println("Som do animal");
    }
}

//cachorro herda as caracteristicas de Animal
class Cachorro extends Animal {
    //sobescreve o metodo da classe animal 
    @Override public void emitirSom() {
        System.out.println("Cachorro: Au Au!");

    }
}

//Gato também herda da classe Animal
class Gato extends Animal {
    // implementação especifica para gatos
    public void emitirSom() {
        System.out.println("Gato: Miau!");

    }
    
}

// Classe principal 
public class exercicio04 {
    //entrada do programa
    public static void main(String[] args) {
        //cria um vetor que armazena referencia do tipo Animal
        Animal[] animais = new Animal[2];

        //colocando um cachorro na primeira posição 
        animais[0] = new Cachorro();

        //colocando um gato na segunda posição 
        animais[1] = new Gato();

        //laço pra percorrer as posiçoes do vetor
        for (int i = 0; i < animais.length; i++) {
            //cada objeto executa sua própria versao do metodo emitir som 
            animais[i].emitirSom();
        }
    }
}