
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Authenticator {

    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Authenticator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String Autenticar(String login, String password) throws Exception {
        try (Connection c = DriverManager.getConnection("jdbc:postgresql://localhost/forum", "postgres", "13041996")) {
            PreparedStatement ps = c.prepareStatement("select nome from usuario where login = ? and senha = ?;");
            ps.setString(1, login);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getString("nome");
            } else {
                throw new Exception("O usuário não foi autenticado. Faça o seu cadastro agora");
            }
        }
    }
}
