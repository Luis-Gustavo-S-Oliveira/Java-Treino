
import java.util.Scanner;

public class Metodomain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();



        do { 
            System.out.println("1 - Ligar o carro ");
            System.out.println("2 - Desligar o carro");
            System.out.println("3 - Acelerar");
            System.out.println("4 - diminuir velocidade");
            System.out.println("5 - virar para esquerda/direita");
            System.out.println("6 - verificar velocidade");
            System.out.println("7 - trocar a marcha");
            System.out.println("8 - sair ");
            System.out.print("Escolha uma opção: "); 
            int opcao = scanner.nextInt();
            if  (opcao == 8) {
                System.out.println("Saindo...");
                break;
            }
            switch (opcao){
                case 1 -> carro.ligar();
                case 2 -> System.out.println("Opção 2 selecionada");
                case 3 -> carro.acelerar();
                case 4 -> System.out.println("Opção 4 selecionada");
                case 5 -> System.out.println("Opção 5 selecionada");
                case 6 -> System.out.println("Opção 6 selecionada");
                case 7 -> System.out.println("Opção 7 selecionada");
                
            }
            
        } while (true);
    }
}
