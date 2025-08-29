package list.basico;

public class Items {
    private String nome;
    private double preco;
    private int quantidade;

    public Items(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "\n Items " + "nome = " + nome + ", preco = " + preco + ", quantidade = " + quantidade   ;
    }
}
