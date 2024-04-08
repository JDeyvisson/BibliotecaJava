package entidade;
public class Usuario {
	private String nome;
	private int Id;
	
	
	public Usuario(String nome, int Id) {
		this.nome = nome;
		this.Id = Id;
	
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return Id;
	}
	public void setId(int Id) {
		this.Id = Id;
	}
	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", Id=" + Id + "]";
	}
	
	
}