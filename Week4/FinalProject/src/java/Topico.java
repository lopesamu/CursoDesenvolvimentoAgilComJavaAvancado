
public class Topico {

    private String login;
    private String titulo;
    private String conteudo;

    public Topico(String login, String titulo, String conteudo) {
        this.login = login;
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

}
