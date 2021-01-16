
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/CadastroServlet"})
public class CadastroServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //receber dados do usuário
        String login = request.getParameter("inputLogin");
        String senha = request.getParameter("inputPassword");
        String nome = request.getParameter("inputName");
        String email = request.getParameter("inputEmail");
        
        //inserir usuário no banco
        Usuario u = new Usuario(login, senha, nome, email, 0);
        UsuarioDAO udao = new UsuarioDAO();
        udao.inserir(u);
        
        //ir para a página de login
        request.getRequestDispatcher("index.html").forward(request,response);
    }
}
