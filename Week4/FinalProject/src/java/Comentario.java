
public class Comentario {

    private String login;
    private int idTopico;
    private String comentario;

    public Comentario(String login, int idTopico, String comentario) {
        this.login = login;
        this.idTopico = idTopico;
        this.comentario = comentario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getIdTopico() {
        return idTopico;
    }

    public void setIdTopico(int idTopico) {
        this.idTopico = idTopico;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

}
