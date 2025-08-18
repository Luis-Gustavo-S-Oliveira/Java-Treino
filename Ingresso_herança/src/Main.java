
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do ingresso:");
         
        ingresso ingresso1 = new ingresso();

        ingresso1.setValor(scanner.nextInt());
        System.out.println("Valor do ingresso normal: " + ingresso1.getValor());


        ingressoFamiliar ingressoFamiliar = new ingressoFamiliar();
        System.out.println("Digite a quantidade de pessoas:");
        ingressoFamiliar.setValor(ingresso1.getValor());
        ingressoFamiliar.quantidadePessoas(scanner.nextInt());

        System.out.println("Valor do ingresso familiar: " + ingressoFamiliar.getValor());


        IngressoMetade ingressoMetade = new IngressoMetade();
        
        ingressoMetade.desconto(ingresso1.getValor());
        System.out.println("Valor do ingresso com desconto de metade: " + ingressoMetade.getValor());  



    }
}
