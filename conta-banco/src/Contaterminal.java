
import java.util.Scanner;

public class Contaterminal {
    public static void main(String[] args) throws Exception {
        Scanner sacana = new Scanner(System.in);
        System.out.println("Informe sua agencia ");
        String agencia = sacana.nextLine();
        System.out.println("Informe seu numero ");
        int numero = sacana.nextInt();
        sacana.nextLine();
        System.out.println("Informe seu nome ");
        String name = sacana.nextLine();
        System.out.println("Informe seu saldo ");
        double saldo = sacana.nextDouble();

        System.out.printf("Olá %S, obrigado por criar uma conta em nosso banco, sua agência é %S, conta %S e seu saldo de %S reais já está disponível para saque ",name, agencia, numero,saldo);




    }
}
