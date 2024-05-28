package servicos;


import entidade.Usuario;
import interfaces.IUsuarioServico;
import repositorios.UsuarioRepositorio;

public class UsuarioServico implements IUsuarioServico{
    private UsuarioRepositorio usuarioRepositorio;

    public UsuarioServico(UsuarioRepositorio usuarioRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
    }

    public String cadastrarUsuario(String login, String senha) {
        if (login == null || login.isEmpty() || senha == null || senha.isEmpty()) {
            return "Campos login ou senha estão vazios.";
        }

        if (!isLoginValido(login) || !isSenhaValida(senha)) {
            return "Login ou senha inválidos.";
        }

        if (usuarioRepositorio.usuarioExiste(login)) {
            return "Usuário já existe.";
        }

        Usuario usuario = new Usuario(login, senha);
        usuarioRepositorio.adicionarUsuario(usuario);
        return "Usuário cadastrado com sucesso!";
    }

    private boolean isLoginValido(String login) {
        return login.length() >= 3;
    }

    private boolean isSenhaValida(String senha) {
        return senha.length() >= 6;
    }

    public String pesquisarUsuario(String login) {
        if (login == null || login.isEmpty()) {
            return "Campo login está vazio.";
        }

        if (!isLoginValido(login)) {
            return "Login inválido.";
        }

        return usuarioRepositorio.pesquisarUsuario(login);
    }

    public String removerUsuario(String login) {
        if (login == null || login.isEmpty()) {
            return "Campo login está vazio.";
        }

        if (!isLoginValido(login)) {
            return "Login inválido.";
        }

        return usuarioRepositorio.removerUsuario(login);
    }
    

}