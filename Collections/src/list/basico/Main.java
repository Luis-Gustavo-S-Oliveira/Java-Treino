package list.basico;

public class Main {
    public static void main(String[] args) {
    
    CarrinhoCompras carrinho = new CarrinhoCompras();

    carrinho.adicionarItem("Arroz", 20.0, 2);
    carrinho.adicionarItem("Feijao", 10.0, 1);
    carrinho.adicionarItem("Macarrao", 5.0, 3); 
    System.out.println("Itens no carrinho: " + carrinho.exibirItens());
    System.out.println("Valor total: " + carrinho.calcularTotal()); 
    carrinho.removerItem("Feijao");
    System.out.println("Itens no carrinho apos remocao: " + carrinho.exibirItens());
    System.out.println("Valor total apos remocao: " + carrinho.calcularTotal());


    }
}
