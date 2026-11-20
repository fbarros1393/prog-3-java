package exercicio_03;
/*
 * EXERCICIO 03 - AULA 04
 * Conteudo: Interfaces e implementacao multipla.
 */

// Interface que define a atividade de correr
interface Corredor {

    // Metodo que deve ser implementado
    void correr();
}

// Interface que define a atividade de nadar
interface Nadador {

    void nadar();
}

// Interface que define a atividade de pedalar
interface Ciclista {

    void pedalar();
}

// Classe que implementa as tres interfaces
class Triatleta implements Corredor, Nadador, Ciclista {

    // Nome do atleta
    private String nome;

    // Construtor
    public Triatleta(String nome) {
        this.nome = nome;
    }

    // Implementacao do metodo da interface Corredor
    @Override
    public void correr() {
        System.out.println(nome + " esta correndo.");
    }

    // Implementacao do metodo da interface Nadador
    @Override
    public void nadar() {
        System.out.println(nome + " esta nadando.");
    }

    // Implementacao do metodo da interface Ciclista
    @Override
    public void pedalar() {
        System.out.println(nome + " esta pedalando.");
    }

    // Metodo que executa todas as modalidades
    public void mostrarModalidades() {

        System.out.println("Modalidades de " + nome + ":");

        correr();
        nadar();
        pedalar();
    }
}

// Classe principal
public class Exercicio03 {

    public static void main(String[] args) {

        // Cria dois objetos do tipo Triatleta
        Triatleta atleta1 = new Triatleta("Pedro");
        Triatleta atleta2 = new Triatleta("Mariana");

        // Executa as modalidades do primeiro atleta
        atleta1.mostrarModalidades();

        System.out.println();

        // Executa as modalidades do segundo atleta
        atleta2.mostrarModalidades();
    }
}
