
public class Usuario {

    private String login;
    private String password;
    private String name;
    private String email;
    private int pontos;

    public Usuario(String login, String password, String name, String email, int pontos) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.email = email;
        this.pontos = pontos;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
}
