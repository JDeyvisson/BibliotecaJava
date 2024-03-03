public class Usuario {
	private String nome;
	private String Id;
	
	
	public Usuario(String nome, String Id) {
		this.nome = nome;
		this.Id = Id;
	
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getId() {
		return Id;
	}
	public void setId(String Id) {
		this.Id = Id;
	}
	
	
}