package exercicio_06;
/*
 * EXERCICIO 06 - AULA 04
 * Conteudo: Enum, classes e controle de permissoes.
 */

// Enum que representa os niveis de acesso
enum NivelAcesso {

    BASICO,
    INTERMEDIARIO,
    ADMIN
}

// Classe que representa um usuario
class Usuario {

    // Atributos
    private String nome;
    private NivelAcesso nivel;

    // Construtor
    public Usuario(String nome, NivelAcesso nivel) {

        this.nome = nome;
        this.nivel = nivel;
    }

    // Retorna o nome do usuario
    public String getNome() {
        return nome;
    }

    // Verifica se o usuario pode acessar um recurso
    public boolean verificarPermissao(String recurso) {

        // Nao permite recurso nulo
        if (recurso == null) {
            return false;
        }

        // Padroniza o texto para maiusculo
        recurso = recurso.trim().toUpperCase();

        // Analisa o nivel do usuario
        switch (nivel) {

            case BASICO:

                // Usuario basico so pode consultar
                return recurso.equals("CONSULTAR");

            case INTERMEDIARIO:

                // Pode consultar e editar
                return recurso.equals("CONSULTAR")
                        || recurso.equals("EDITAR");

            case ADMIN:

                // Pode realizar todas as operacoes previstas
                return recurso.equals("CONSULTAR")
                        || recurso.equals("EDITAR")
                        || recurso.equals("GERENCIAR_USUARIOS");
        }

        // Se nao houver permissao, retorna falso
        return false;
    }
}

// Classe principal
public class Exercicio06 {

    public static void main(String[] args) {

        // Cria tres usuarios com niveis diferentes
        Usuario usuario1 =
                new Usuario("Ana", NivelAcesso.BASICO);

        Usuario usuario2 =
                new Usuario("Carlos", NivelAcesso.INTERMEDIARIO);

        Usuario usuario3 =
                new Usuario("Maria", NivelAcesso.ADMIN);

        // Vetor que armazena os usuarios
        Usuario[] usuarios = {
            usuario1, usuario2, usuario3
        };

        // Vetor com os tres recursos do sistema
        String[] recursos = {
            "CONSULTAR",
            "EDITAR",
            "GERENCIAR_USUARIOS"
        };

        // Percorre todos os usuarios
        for (int i = 0; i < usuarios.length; i++) {

            System.out.println("\nUsuario: " + usuarios[i].getNome());

            // Testa os tres recursos para cada usuario
            for (int j = 0; j < recursos.length; j++) {

                boolean permitido = usuarios[i].verificarPermissao(recursos[j]);

                System.out.println( recursos[j] + ": " + (permitido ? "PERMITIDO" : "NEGADO"));
            }
        }
    }
}
