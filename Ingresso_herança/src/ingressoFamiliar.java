public non-sealed class ingressoFamiliar extends ingresso {

    private int quantidade;

    public int quantidadePessoas(int quantidade) {
        
        this.valor = this.valor * quantidade; 
        if (quantidade > 3) {
            this.valor = this.valor - (this.valor / 5);
            return this.valor;
        }else {
            return this.valor;
        }
    }    
    
}
