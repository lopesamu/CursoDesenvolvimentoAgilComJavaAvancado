
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TopicoDAO {

    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Authenticator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void inserir(Topico t) {
        try (Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/forum",
                "postgres", "13041996")) {
            String sql = "INSERT INTO topico(titulo, conteudo, login) VALUES (?, ?, ?);";
            PreparedStatement stm = c.prepareStatement(sql);
            stm.setString(1, t.getTitulo());
            stm.setString(2, t.getConteudo());
            stm.setString(3, t.getLogin());
            stm.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Não foi possivel executar o acesso", e);
        }
    }
}
