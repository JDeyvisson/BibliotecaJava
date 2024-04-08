package entidade;
public class Livro {
    private String titulo;
    private String autor;
    private int ISBN;
    private boolean status;
    private boolean fisico;
    
    public boolean isFisico() {
        return fisico;
    }

    public void setFisico(boolean fisico) {
        this.fisico = fisico;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getISBN() {
        return ISBN;
    }
    public void setISBN(int iSBN) {
        ISBN = iSBN;
    }
    public Boolean isStatus(){
        return status;

    }
    public String getStatus() {
        if (status == true) {
            return "Disponivel";
        }else{
            return "Indisponivel";
        }
        
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public Livro(String titulo, String autor, int iSBN) {
        this.titulo = titulo;
        this.autor = autor;
        ISBN = iSBN;
        status = true;
    }

    public String toString(){
        return
                "Nome: " + getTitulo() + "\n" +
                "Autor: " + getAutor() + "\n" +
                "ISBN: " + getISBN() + "\n" +
                "Status: " + getStatus() + "\n" + 
                "-------------------";
                

    }    
}
