
import java.util.Scanner;

public class Metodomain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();



        do { 
            System.out.println("======================");
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
                case 2 -> carro.desligar();
                case 3 -> carro.acelerar();
                case 4 -> carro.desacelerar();
                case 5 -> {System.out.print("Digite a direção (esquerda/direita): ");
                    carro.virar(String.valueOf(scanner.next()));
                }
                case 6 -> System.out.println("Velocidade atual: " + carro.getVelocidade() + " km/h");
                case 7 -> carro.marchar();
                
            }
            
        } while (true);
    }
}
