
import java.util.List;
import org.dbunit.Assertion;
import org.dbunit.JdbcDatabaseTester;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.ITable;
import org.dbunit.util.fileloader.FlatXmlDataFileLoader;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteUsuarioDAOImplementacao1 {

    JdbcDatabaseTester jdt;

    @Before
    public void setUp() throws Exception {
        jdt = new JdbcDatabaseTester("org.postgresql.Driver", "jdbc:postgresql://localhost:5432/coursera", "postgres", "13041996");
        FlatXmlDataFileLoader loader = new FlatXmlDataFileLoader();
        jdt.setDataSet(loader.load("/inicio.xml"));
        jdt.onSetup();
    }

    /*insere um novo usuário no banco de dados
    @Test
    public void inserir() {
        List<Usuario> lista = UsuarioDAO.todosUsuarios();
        assertEquals(2, lista.size());
        assertEquals("joao", lista.get(0).getLogin());
    }*/
    @Test
    public void inserir() throws Exception {
        Usuario u = new Usuario();
        u.setLogin("duda");
        u.setEmail("duda@gmail.com");
        u.setNome("Maria Eduarda");
        u.setSenha("1010");
        u.setPontos(50);
        UsuarioDAOImplementacao1 x = new UsuarioDAOImplementacao1();
        x.inserir(u);

        IDataSet currentDataSet = jdt.getConnection().createDataSet();
        ITable currentTable = currentDataSet.getTable("USUARIO");
        FlatXmlDataFileLoader loader = new FlatXmlDataFileLoader();
        IDataSet expectedDataSet = loader.load("/verifica.xml");
        ITable expectedTable = expectedDataSet.getTable("USUARIO");
        Assertion.assertEquals(expectedTable, currentTable);
    }

    @Test
    public void recuperar() {
        UsuarioDAOImplementacao1 x = new UsuarioDAOImplementacao1();
        assertEquals("joao", x.recuperar("joao").getLogin());
    }
    
    @Test
    public void adicionarPontos() {
        UsuarioDAOImplementacao1 x = new UsuarioDAOImplementacao1();
        assertEquals(10, x.recuperar("joao").getPontos());
        
        x.adicionarPontos("joao", 20);
        assertEquals(30, x.recuperar("joao").getPontos());
    }
    
    @Test
    public void ranking() {
        UsuarioDAOImplementacao1 x = new UsuarioDAOImplementacao1();
        assertEquals(x.ranking().get(0).getLogin(), "maria");
        assertEquals(x.ranking().get(1).getLogin(), "joao");
    }
    
    

}
