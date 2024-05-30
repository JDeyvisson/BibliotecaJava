package entidade;

import java.util.List;
import java.util.Scanner;

import repositorios.BibliotecaRepositorio;
import repositorios.EtiquetaRepositorio;
import repositorios.LivroRepositorio;
import repositorios.UsuarioRepositorio;
import servicos.UsuarioServico;

public class App {
     public static void main(String[] args) {
        EtiquetaRepositorio etiquetaDAO = new EtiquetaRepositorio();

        Livro livro1 = new Livro("Livro A", null, 0);
        Livro livro2 = new Livro("Livro B", null, 0);

        // Cenário de sucesso: criar etiqueta
        Etiqueta etiqueta1 = new Etiqueta("Etiqueta1", livro1);
        etiquetaDAO.criarEtiqueta(etiqueta1);

        // Cenário de falha: tentar criar uma etiqueta com nome repetido
        Etiqueta etiqueta2 = new Etiqueta("Etiqueta1", livro2);
        etiquetaDAO.criarEtiqueta(etiqueta2); // Isso deve gerar uma exceção de chave duplicada ou violação de restrição única

        // Ler todas as etiquetas
        List<Etiqueta> todasEtiquetas = etiquetaDAO.lerTodasEtiquetas();
        for (Etiqueta etiqueta : todasEtiquetas) {
            System.out.println("Etiqueta: " + etiqueta.getNome() + ", Livro: " + etiqueta.getLivro().getTitulo());
        }

        // Atualizar etiqueta
        etiquetaDAO.atualizarEtiqueta("Etiqueta1", "NovaEtiqueta");

        // Remover etiqueta
        etiquetaDAO.removerEtiqueta("NovaEtiqueta");
    }
        
        /* 

        UsuarioRepositorio usuarioRepositorio = new UsuarioRepositorio();
        UsuarioServico usuarioServico = new UsuarioServico(usuarioRepositorio);
        Scanner scanner = new Scanner(System.in);

        // Loop para testar o login e cadastro de usuário
        while (true) {
            System.out.println("Escolha uma opção: 1. Login 2. Cadastro 3. Sair");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // consumir nova linha

            if (escolha == 1) {
                System.out.print("Digite o login: ");
                String login = scanner.nextLine();

                System.out.print("Digite a senha: ");
                String senha = scanner.nextLine();

                String resultado = usuarioRepositorio.acessarSistema(login, senha);
                System.out.println(resultado);
            } else if (escolha == 2) {
                System.out.print("Digite o login: ");
                String login = scanner.nextLine();

                System.out.print("Digite a senha: ");
                String senha = scanner.nextLine();

                String resultado = usuarioServico.cadastrarUsuario(login, senha);
                System.out.println(resultado);
            } else if (escolha == 3) {
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
    /* 
    Biblioteca biblioteca1 = new Biblioteca("Rua 1", 1);
    BibliotecaRepositorio bibliotecaRepositorio1 = new BibliotecaRepositorio();
    bibliotecaRepositorio1.adicionarBiblioteca(biblioteca1);
    Biblioteca biblioteca2 = new Biblioteca("Rua 2", 2);
    bibliotecaRepositorio1.adicionarBiblioteca(biblioteca2);
    bibliotecaRepositorio1.listarBibliotecas();
    Livro livro1 = new Livro("You", "Joao", 1);
    Livro livro2   = new Livro("me", "pedro", 2);
    LivroRepositorio livroRepositorio1= new LivroRepositorio();
    livroRepositorio1.adicionarLivro(livro1);
    livroRepositorio1.adicionarLivro(livro2);
    livroRepositorio1.exibirLivros();
    */
    
        

}




