package exercicio_07;
/*
 * EXERCICIO 07 - AULA 04
 * Desafio Integrador: Plataforma Esportiva
 *
 * Conteudos:
 * Classes abstratas, interfaces, heranca,
 * polimorfismo, enums e validacoes.
 */

// Enum que define os niveis dos atletas
enum NivelAtleta {
    NOVATO,
    AMADOR,
    PROFISSIONAL
}

// Interface para atletas que correm
interface Corredor {
    void correr();
}

// Interface para atletas que nadam
interface Nadador {
    void nadar();
}

// Interface para atletas que pedalam
interface Ciclista {
    void pedalar();
}

// Classe abstrata que representa um atleta
abstract class Atleta {

    // Atributos comuns a todos os atletas
    private String nome;
    private int idade;
    private NivelAtleta nivel;

    // Construtor da classe abstrata
    public Atleta(String nome, int idade, NivelAtleta nivel) {

        // Verifica se o nome e valido
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome nao pode ser vazio.");
        }

        // Impede o cadastro de idade negativa
        if (idade < 0) {
            throw new IllegalArgumentException("A idade nao pode ser negativa.");
        }

        // Inicializa os atributos
        this.nome = nome.trim();
        this.idade = idade;
        this.nivel = nivel;
    }

    // Retorna o nome do atleta
    public String getNome() {
        return nome;
    }

    // Retorna o nivel do atleta
    public NivelAtleta getNivel() {
        return nivel;
    }

    // Exibe as informacoes comuns
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nivel: " + nivel);
    }

    // Metodo abstrato para apresentar as modalidades
    public abstract void exibirModalidades();
}

// Classe que representa um corredor profissional
class CorredorProfissional extends Atleta
        implements Corredor {

    // Construtor
    public CorredorProfissional(
            String nome, int idade, NivelAtleta nivel) {

        // Chama o construtor de Atleta
        super(nome, idade, nivel);
    }

    // Implementacao do metodo da interface Corredor
    @Override
    public void correr() {
        System.out.println(getNome() + " esta correndo.");
    }

    // Implementacao do metodo abstrato de Atleta
    @Override
    public void exibirModalidades() {
        System.out.println("Modalidade: Corrida");
    }
}

// Classe que representa um nadador profissional
class NadadorProfissional extends Atleta
        implements Nadador {

    // Construtor
    public NadadorProfissional(String nome, int idade, NivelAtleta nivel) {
        super(nome, idade, nivel);
    }
    // Implementa o metodo da interface Nadador
    @Override
    public void nadar() {
        System.out.println(getNome() + " esta nadando.");
    }

    // Implementa o metodo abstrato de Atleta
    @Override
    public void exibirModalidades() {
        System.out.println("Modalidade: Natacao");
    }
}

// Triatleta herda de Atleta e implementa 3 interfaces
class Triatleta extends Atleta implements Corredor, Nadador, Ciclista {
    // Construtor
    public Triatleta(String nome, int idade, NivelAtleta nivel) {
        super(nome, idade, nivel);
    }
    // Implementacao do metodo correr
    @Override
    public void correr() {
        System.out.println(getNome() + " esta correndo.");
    }

    // Implementacao do metodo nadar
    @Override
    public void nadar() {
        System.out.println(getNome() + " esta nadando.");
    }

    // Implementacao do metodo pedalar
    @Override
    public void pedalar() {
        System.out.println(getNome() + " esta pedalando.");
    }

    // Apresenta as modalidades do triatleta
    @Override
    public void exibirModalidades() {
        System.out.println("Modalidades: Corrida, Natacao e Ciclismo");
    }
}
// Classe principal
public class Exercicio07 {

    public static void main(String[] args) {

        // Cria um vetor usando a classe abstrata Atleta
        Atleta[] atletas = new Atleta[4];

        // Adiciona os quatro atletas ao vetor
        atletas[0] = new CorredorProfissional("Carlos", 25, NivelAtleta.PROFISSIONAL);
        atletas[1] = new NadadorProfissional("Ana", 22, NivelAtleta.PROFISSIONAL);
        atletas[2] = new Triatleta("Pedro", 30, NivelAtleta.AMADOR);
        atletas[3] = new Triatleta("Maria", 19, NivelAtleta.NOVATO);

        System.out.println("=== ATLETAS CADASTRADOS ===");

        // Percorre todos os atletas do vetor
        for (int i = 0; i < atletas.length; i++) {

            System.out.println("\nAtleta " + (i + 1));

            // Exibe nome, idade e nivel
            atletas[i].exibirDados();

            // Executa a versao do metodo da subclasse
            atletas[i].exibirModalidades();
        }

        // Demonstra referencias do tipo das interfaces
        System.out.println("\n=== TESTE DAS INTERFACES ===");

        // Converte a referencia para a interface Corredor
        Corredor corredor = (Corredor) atletas[0];
        corredor.correr();

        // Converte a referencia para a interface Nadador
        Nadador nadador = (Nadador) atletas[1];
        nadador.nadar();

        // Recupera o objeto Triatleta do vetor
        Triatleta triatleta = (Triatleta) atletas[2];

        // O mesmo objeto pode ser usado pelas 3 interfaces
        Corredor corrida = triatleta;
        Nadador natacao = triatleta;
        Ciclista ciclismo = triatleta;

        // Executa as tres modalidades do mesmo atleta
        corrida.correr();
        natacao.nadar();
        ciclismo.pedalar();
    }
}
