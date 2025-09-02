package list.ordenacao;

public class Main {
    public static void main(String[] args) {    
        OrdenacaoNumeros ordenacao = new OrdenacaoNumeros();
        ordenacao.adicionarNumero(10);
        ordenacao.adicionarNumero(5);
        ordenacao.adicionarNumero(20);
        ordenacao.adicionarNumero(3);

        System.out.println("Números antes da ordenação:");
        System.out.println(ordenacao.getNumeros()); 
        ordenacao.ordenarAscendente();
        System.out.println("Números após a ordenação ascendente:");
        System.out.println(ordenacao.getNumeros());
        ordenacao.ordenarDescendente();
        System.out.println("Números após a ordenação descendente:");
        System.out.println(ordenacao.getNumeros());
}
}
