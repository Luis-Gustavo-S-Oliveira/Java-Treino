public sealed class ingresso permits ingressoFamiliar, IngressoMetade {

    protected  int valor;
    private String nomeFilme;
    private Boolean dublado;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }




}
