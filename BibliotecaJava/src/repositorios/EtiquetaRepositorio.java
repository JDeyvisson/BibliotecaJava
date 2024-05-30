package repositorios;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import entidade.Etiqueta;
import entidade.Livro;



public class EtiquetaRepositorio{

    private Connection connection;
    public EtiquetaRepositorio() {
        // Configurar a conexão com o banco de dados
        String url = "jdbc:mysql://localhost:3306/etiquetabd";
        String user = "root";
        String password = "admin";

        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Criar etiqueta no banco de dados
    public void criarEtiqueta(Etiqueta etiqueta) {
        String query = "INSERT INTO etiquetas (nome, livro_nome) VALUES (?, ?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, etiqueta.getNome());
            preparedStatement.setString(2, etiqueta.getLivro().getTitulo());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Ler todas as etiquetas do banco de dados
    public List<Etiqueta> lerTodasEtiquetas() {
        List<Etiqueta> etiquetas = new ArrayList<>();
        String query = "SELECT * FROM etiquetas";

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String nome = resultSet.getString("nome");
                String livro_nome = resultSet.getString("livro_nome");
                Livro livro = new Livro(livro_nome, livro_nome, 0);
                etiquetas.add(new Etiqueta(nome, livro));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return etiquetas;
    }

        // Atualizar etiqueta no banco de dados
        public void atualizarEtiqueta(String nomeAntigo, String novoNome) {
            String query = "UPDATE etiquetas SET nome = ? WHERE nome = ?";
    
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, novoNome);
                preparedStatement.setString(2, nomeAntigo);
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    
        // Remover etiqueta do banco de dados
        public void removerEtiqueta(String nome) {
            String query = "DELETE FROM etiquetas WHERE nome = ?";
    
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, nome);
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }

}
}