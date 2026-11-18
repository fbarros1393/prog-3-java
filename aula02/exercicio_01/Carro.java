/**
* Disciplina: Programação 3
* Professora: Tainá Isabela
* 
* Exercício 1 
* Criação da Classe Carro e Instanciação
* Crie uma classe chamada Carro com os seguintes atributos: marca (String), modelo (String) e ano (int).
* Adicione um método exibirInfo() que imprime no console as informações detalhadas do carro.
* No método main de uma classe principal (ex: TestaCarro ), crie duas instâncias da classe Carro , atribua
* valores aos seus atributos e chame o método exibirInfo() para cada uma.
* 
* @author Felix de Jesus Sousa Barros 
* @version 1.0
* @since 2026-09-04
*/

public class Carro { 
    //atributos 
    String marca;
    String  modelo;
    int ano;

    //método para exibir as informações 
    public void exibir_info() {
        System.out.println("Marca: " + marca + "| Modelo: " + modelo + "| Ano: " + ano);

    }
    // Classe para testar os carros 

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.marca = "Chevrolet";
        carro1.modelo = "Agile";
        carro1.ano = 2012;

        Carro carro2 = new Carro();
        carro2.marca = "Honda";
        carro2.modelo = "Civic";
        carro2.ano = 2009;


        System.out.println("Dados do primeiro carro");
        carro1.exibir_info();
        System.out.println(" Dados do segundo carro");
        carro2.exibir_info();
        


    }


    
}
