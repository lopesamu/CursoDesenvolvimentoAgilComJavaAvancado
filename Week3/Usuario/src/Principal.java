public class Principal {
    public static void main(String[] args) {
        UsuarioDAOImplementacao1 u = new UsuarioDAOImplementacao1();
        
        u.adicionarPontos("samu", 40);
        
        Usuario x = u.recuperar("samu");
        
        System.out.println(x.toString());
        
    }
}
