package exercicio_01;
/**Crie uma classe Livro com os atributos titulo e autor. 
 *Implemente dois construtores:  
 *Um sem parâmetros que define valores padrão. 
 *Um com parâmetros para inicializar os atributos.  
 *No método main, instancie dois objetos utilizando os dois construtores diferentes e exiba os dados. 
 *
*@author Felix de Jesus Sousa Barros 
*@version 1.0
*@since 2026-10-03
 */

 //Atributos
public  class Livro {
    private String titulo;
    private String autor;

    //construtor sem parametro
    public Livro() {
        this.titulo = "Titulo desconhecido";
        this.autor = "Autor desconhecido";
    }

    //Construtor com parâmetro
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor =  autor;
    }

    //Retorna com os atributos do livro

    @Override 
    public String toString() {
        return "Livro { titulo= '" + titulo + "', autor= '" + autor + "' }";
    }


//Método main para os teste
public static void main(String[] args) {
    //Objeto criado com o construtor sem parâmetros

    Livro livroPadrao = new Livro();
    //Objeto criado com o construtor com parâmetro

    Livro livroPersonalizado = new Livro("Dom Casmurro", "Machado de Assis");
    
    //Exibindo dados dos dois objetos
    System.out.println("--> Livro 1 (com construtor padrão) <--");
    System.out.println("Titulo: " + livroPadrao.getTitulo());
    System.out.println("Autor: " + livroPadrao.getAutor());

    System.out.println("--> Livro 2 (construtor com parâmetros) <--");
    System.out.println("Titulo: " + livroPersonalizado.getTitulo());
    System.out.println("Autor: " +livroPersonalizado.getAutor());

    //Usando o toString()
    System.out.println("\n --> Representação via toString() <--");
    System.out.println(livroPadrao);
    System.out.println(livroPersonalizado);  

    }
}
