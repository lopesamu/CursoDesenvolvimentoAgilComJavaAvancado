
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String login = request.getParameter("inputLogin");
        String senha = request.getParameter("inputPassword");

        Authenticator a = new Authenticator();
        try {
            String nomeUsuario = a.Autenticar(login, senha);
            request.setAttribute("name", nomeUsuario);
            request.getRequestDispatcher("topicos.jsp").forward(request,response);
        } catch (Exception ex) {
            request.setAttribute("erro", ex.getMessage());
            request.getRequestDispatcher("cadastro.jsp").forward(request,response);
        }

    }

}
