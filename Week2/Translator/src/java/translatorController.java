
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/translatorController"})
public class translatorController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String wordInput = request.getParameter("wordInput");

        Dictionary d = new Dictionary("C:\\Users\\samul\\Documents\\MeusProjetos\\CursoDesenvolvimentoAgilComJavaAvancado\\Week2\\Translator\\src\\java\\words.txt");
        String wordOutput = d.translateWord(wordInput);
        request.setAttribute("wordOutput", wordOutput);
        request.getRequestDispatcher("results.jsp").forward(request, response);
    }
}
