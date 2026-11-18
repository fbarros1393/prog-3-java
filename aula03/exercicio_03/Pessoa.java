package exercicio_03;
/***
*Crie uma classe Pessoa com os atributos nome e idade. 
*Depois, crie a subclasse Aluno que herda de Pessoa e adiciona o atributo matricula.  
*Crie um construtor para Aluno que receba todos os dados e utilize super() para inicializar nome e idade. 
*Instancie um objeto de Aluno e mostre suas informações. 
* 
*@author Felix de Jesus Sousa Barros 
*@version 1.0
*@since 2026-10-03 
*/

public class Pessoa{
    private String nome;
    private int idade;

    //construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    //métedos get
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    //metodos set
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade;
    }
}
//Criando a subclasse aluno com um novo atributo 
class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, String matricula,int idade) {
        super(nome, idade);
        this.matricula = matricula;
    }
    public String getMatricula() {
        return matricula;
    }
    @Override 
    public String toString() {
        return super.toString() + ", Matricula: " + matricula;
    }
}
class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Felix Barros ", "2024117200", 21);
        System.out.println("Nome   : " + aluno.getNome());
        System.out.println("Idade  : " + aluno.getIdade());
        System.out.println("Matricula: " + aluno.getMatricula());
            
    }
}




