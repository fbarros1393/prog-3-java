package exercicio_02;
/**
 * Disciplina: Programação 3
 * Professora: Tainá Isabela
 * 
 * Exercicio 2 do Slide
 * Controle de Instâncias com Atributo Estático
 * Criar uma classe chamada Contador que contenha:
 * Um atributo estático totalObjetos (int) para contabilizar a quantidade total de instâncias criadas.
 * Um construtor que incremente automaticamente o valor de totalObjetos a cada nova instanciação.
 * Um método estático mostrarTotal() que exibe o valor atual do contador.
 * No método main , instancie 3 ou mais objetos do tipo Contador e, em seguida, chame o método estático
 * mostrarTotal() diretamente pela classe.
 * 
 * @author Felix de Jesus Sousa Barros 
 * @version 1.0
 * @since 2026-09-04
 */
public  class Contador {
    private static int totalObjetos = 0;

    public Contador () {
        totalObjetos++;
    }
    public static void  mostrar_total() {
        System.out.println("Valor total do Objeto: " + totalObjetos);
    }

    public static void main(String[] args) {
        new Contador();
        new Contador();
        new Contador();
        new Contador();
        new Contador();
        new Contador();
        
        Contador.mostrar_total();
    }
}