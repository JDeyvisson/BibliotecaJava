import java.util.ArrayList;

public class LivroRepositorio {
    private ArrayList<Livro> livrosBD = new ArrayList<Livro>();

    public void salvar(Livro novoLivro){

        livrosBD.add(novoLivro);
    }
    public void salvar(LivroDigital novolivro){
        livrosBD.add(novolivro);
    }
    public void salvar(LivroFisico novolivro){
        livrosBD.add(novolivro);
    }
    
    public ArrayList<String> listarTodos() {
        ArrayList<String> informacoesLivros = new ArrayList<>();
    
        for (Livro livro : livrosBD) {
            if (livro instanceof LivroDigital) {
                LivroDigital livroDigital = (LivroDigital) livro;
                informacoesLivros.add(livroDigital.toString());
            } else if (livro instanceof LivroFisico) {
                LivroFisico livroFisico = (LivroFisico) livro;
                informacoesLivros.add(livroFisico.toString());
            }
        }
    
        // Faça algo com as informações, como imprimir no console
        for (String informacao : informacoesLivros) {
            System.out.println(informacao);
        }
    
        // Se necessário, você pode retornar as informações em forma de lista
        return informacoesLivros;
    }

   /*  
    public ArrayList<Livro> listarTodos(){
    
    for (Livro livro : livrosBD) {
        
        if (livro instanceof LivroDigital) {
            LivroDigital livro1 = (LivroDigital) livro;
            livro.toString();
        } else if (livro instanceof LivroFisico) {
            LivroFisico livro = (LivroFisico) livro;
            livro.toString();
        }
    }
    }
    */
    public Livro pesquisarPorISBN(Livro livroP) {
		Livro resultadoPesquisa=null;
		for (Livro livro : livrosBD) {
			if(livro.getISBN() == livroP.getISBN()) {
				resultadoPesquisa=livro;
				break;
			}		
		}
		return resultadoPesquisa;
	}
}