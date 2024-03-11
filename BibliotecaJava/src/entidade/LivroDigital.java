package entidade;
public class LivroDigital extends Livro{

    public String toString(){
        return
                "Nome: " + getTitulo() + "\n" +
                "Autor: " + getAutor() + "\n" +
                "ISBN: " + getISBN() + "\n" +
                "Status: " + getStatus() + "\n" + 
                "-------------------";
                

    }

    public LivroDigital(String titulo, String autor, int iSBN) {
        super(titulo, autor, iSBN);
        //TODO Auto-generated constructor stub
    }
 


}
