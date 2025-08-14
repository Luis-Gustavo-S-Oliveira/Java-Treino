
import java.util.Scanner;

public class Metodomain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do { 
            System.out.println("1 - ");
            System.out.println("2 - ");
            System.out.println("3 - ");
            System.out.println("4 - ");
            System.out.println("5 - ");
            System.out.println("6 - ");
            System.out.println("7 - ");
            System.out.println("8 - sair ");
            System.out.print("Escolha uma opção: "); 
            int opcao = scanner.nextInt();
            if  (opcao == 8) {
                System.out.println("Saindo...");
                break;
            }
            switch (opcao){
                case 1 -> System.out.println("Opção 1 selecionada");
                case 2 -> System.out.println("Opção 2 selecionada");
                case 3 -> System.out.println("Opção 3 selecionada");
                case 4 -> System.out.println("Opção 4 selecionada");
                case 5 -> System.out.println("Opção 5 selecionada");
                case 6 -> System.out.println("Opção 6 selecionada");
                case 7 -> System.out.println("Opção 7 selecionada");
                
            }
            
        } while (true);
    }
}
