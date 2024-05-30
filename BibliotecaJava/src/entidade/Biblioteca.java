package entidade;

public class Biblioteca {
    private String local;
    private int numero;
    private String nome;

    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    @Override
    public String toString() {
        return "Biblioteca [local=" + local + ", numero=" + numero + "]";
    }
    public Biblioteca(String local, int numero) {
        this.local = local;
        this.numero = numero;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    
}