package list.pesquisa;

public class Main {
    public static void main(String[] args) {

    SomarNumeros somar = new SomarNumeros();
    somar.adicionarNumero(10);
    somar.adicionarNumero(5);
    somar.adicionarNumero(20);
    somar.adicionarNumero(3);
    System.out.println("A soma dos numeros e: " + somar.calcularsomar());
    System.out.println("O maior numero e: " + somar.encontrarMaiorNumero());
    System.out.println("O menor numero e: " + somar.encontrarMenorNumero());
}
}