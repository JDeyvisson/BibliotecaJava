package entidade;

import java.util.ArrayList;

public class Biblioteca {
    private String local;
    private int numero;
    private ArrayList<Livro> Acervo = new ArrayList<Livro>();
    
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
    public ArrayList<Livro> getAcervo() {
        return Acervo;
    }
    public void setAcervo(ArrayList<Livro> acervo) {
        Acervo = acervo;
    }
}