package interfaces;

import entidade.Usuario;

public interface IUsuarioServico {
	public void cadastrar(Usuario novoUsuario);
	public void listarTodos();

}