
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAOImplementacao1 implements UsuarioDAO {

    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void inserir(Usuario u) {
        try (Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/coursera",
                "postgres", "13041996")) {
            String sql = "INSERT INTO usuario(login, email, nome, senha, pontos) VALUES (?, ?, ?, ?, ?);";
            PreparedStatement stm = c.prepareStatement(sql);
            stm.setString(1, u.getLogin());
            stm.setString(2, u.getEmail());
            stm.setString(3, u.getNome());
            stm.setString(4, u.getSenha());
            stm.setInt(5, u.getPontos());
            stm.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Não foi possivel executar o acesso", e);
        }
    }

    @Override
    public Usuario recuperar(String login) {
        Usuario result = new Usuario();
        
        try (Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/coursera",
                "postgres", "13041996")) {
            String sql = "SELECT * FROM usuario WHERE login = ?;";
            PreparedStatement stm = c.prepareStatement(sql);
            stm.setString(1, login);
            ResultSet rs = stm.executeQuery();

            

            while (rs.next()) {
                Usuario u = new Usuario();
                u.setLogin(rs.getString("login"));
                u.setEmail(rs.getString("nome"));
                u.setNome(rs.getString("email"));
                u.setSenha(rs.getString("nome"));
                u.setPontos(rs.getInt("pontos"));
                result = u;
            }
        } catch (SQLException e) {
            throw new RuntimeException("Não foi possivel executar o acesso", e);
        }
        return result;
    }

    @Override
    public void adicionarPontos(String login, int pontos) {
        try (Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/coursera",
                "postgres", "13041996")) {
            String sql = "UPDATE usuario SET pontos = pontos + ? WHERE login = ?;";
            PreparedStatement stm = c.prepareStatement(sql);
            stm.setInt(1, pontos);
            stm.setString(2, login);
            stm.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Não foi possivel executar o acesso", e);
        }
    }

    @Override
    public List<Usuario> ranking() {
        List<Usuario> todosUsuarios = new ArrayList<>();
        
        try (Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/coursera",
                "postgres", "13041996")) {
            String sql = "SELECT * FROM usuario ORDER BY pontos DESC;";
            PreparedStatement stm = c.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                Usuario u = new Usuario();
                u.setLogin(rs.getString("login"));
                u.setEmail(rs.getString("nome"));
                u.setNome(rs.getString("email"));
                u.setSenha(rs.getString("nome"));
                u.setPontos(rs.getInt("pontos"));
                todosUsuarios.add(u);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Não foi possivel executar o acesso", e);
        }
        return todosUsuarios;
    }
}
