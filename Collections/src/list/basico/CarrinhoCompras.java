package list.basico;

import java.util.ArrayList;
import java.util.List;


public class CarrinhoCompras {

    private List <Items> carrinho;

    public CarrinhoCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinho.add(new Items(nome, preco, quantidade));

    }

    public void removerItem(String nome){
        carrinho.removeIf(item -> item.getNome().equalsIgnoreCase(nome));
    }

    public double calcularTotal(){
    double total = 0.0;
        for(int i = 0; i < carrinho.size(); i++){
            total += carrinho.get(i).getPreco() * carrinho.get(i).getQuantidade();
        }
        
        return total;
    }

    public String exibirItens(){
        return carrinho.toString();
    }
}
