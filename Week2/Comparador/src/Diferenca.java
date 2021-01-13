
class Diferenca {

    private String propriedade;
    private Object novo;
    private Object velho;

    public Diferenca(String propriedade, Object novo, Object velho) {
        this.propriedade = propriedade;
        this.novo = novo;
        this.velho = velho;
    }

    @Override
    public String toString() {
        return "Diferenca{" + "propriedade=" + propriedade + ", novo=" + novo + ", velho=" + velho + '}';
    }

}
