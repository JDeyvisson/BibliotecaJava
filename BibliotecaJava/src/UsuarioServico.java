import java.util.ArrayList;

public class UsuarioServico implements IUsuarioServico,IUsarioPServico{
	private UsuarioRepositorio UsuarioRepo=new UsuarioRepositorio();
	
	public void cadastrar(String nome, String Id) {
		if(!nome.isBlank() && !nome.isEmpty()) {		
			Usuario Usuario=new Usuario(nome, Id);
			UsuarioRepo.salvar(Usuario);
			
		}
	}
	public void pesquisarPorId(String Id) {
		if(!Id.isBlank() && !Id.isEmpty() && Id.length()>0) {
			Usuario UsuarioP=new Usuario(null, Id);
			Usuario resultado=UsuarioRepo.pesquisarPorId(UsuarioP);
			System.out.println("Nome:"+resultado.getNome());
			System.out.println("Id:"+resultado.getId());
		}
	}
	@Override
	public void cadastrar(Usuario novoUsuario) {
		UsuarioRepo.salvar(novoUsuario);
		
	}
	@Override
	public void listarTodos() {
        ArrayList<Usuario> usuarios = UsuarioRepo.listarTodos();
        for (Usuario usuario : usuarios) {
            System.out.println("Nome: " + usuario.getNome());
            System.out.println("ID: " + usuario.getId());
            System.out.println("---------------");
        }
	}
    
  

}