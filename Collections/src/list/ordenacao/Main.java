package list.ordenacao;

public class Main {
    public static void main(String[] args) {    
        OrdenacaoNumeros ordenacao = new OrdenacaoNumeros();
        ordenacao.adicionarNumero(10);
        ordenacao.adicionarNumero(5);
        ordenacao.adicionarNumero(20);
        ordenacao.adicionarNumero(3);

        ordenacao.ordenarAscendente();
        System.out.println("Números em ordem ascendente: " + ordenacao.numeros);
        ordenacao.ordenarDescendente();
        System.out.println("Números em ordem descendente: " + ordenacao.numeros);
}
}
