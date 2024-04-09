package repositorios;

import java.util.LinkedList;
import java.util.Queue;
import entidade.Usuario;
import interfaces.IUsuarioRepositorio;


public class UsuarioRepositorio implements IUsuarioRepositorio {
    private Queue<Usuario> filaUsuarios;

    public UsuarioRepositorio() {
        this.filaUsuarios = new LinkedList<>();
    }

    // Adiciona um novo usuário à fila
    public void adicionarUsuario(Usuario usuario) {
        filaUsuarios.offer(usuario);
    }

    // Remove e retorna o próximo usuário da fila
    public Usuario proximoUsuario() {
        return filaUsuarios.poll();
    }

    // Verifica se a fila de usuários está vazia
    public boolean filaVazia() {
        return filaUsuarios.isEmpty();
    }

    // Retorna o número de usuários na fila
    public int tamanhoFila() {
        return filaUsuarios.size();
    }

    // Método para acessar a fila de usuários (para fins de visualização ou manipulação direta)
    public Queue<Usuario> getFilaUsuarios() {
        return filaUsuarios;
    }
}