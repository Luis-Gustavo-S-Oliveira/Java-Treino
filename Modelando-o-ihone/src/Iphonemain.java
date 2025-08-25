import funcoes.*;
import java.util.Scanner;

public class Iphonemain {

    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    do {
        System.out.println("Escolha uma opção (ou 'sair' para encerrar): ");
        System.out.print("1 - Musica, 2 - Internet, 3 - Telefone: ");
        String opoticao = scanner.nextLine();
        
        switch (opoticao) {
            case "1" -> {
                System.out.println("Você escolheu Música.");
                    do { 
                        System.out.print("Escolha uma música para tocar (ou '1' para voltar para o menu principal): ");
                        String musicaEscolhida = scanner.nextLine().toLowerCase().trim();
                        Musica musica = new Musica();
                            musica.Entrar();
                            System.out.println(musica.selecionarMusica(musicaEscolhida));
                            if (musicaEscolhida.equals("1")) {
                                break;
                            }else if (!musicaEscolhida.equals("voltar")) {
                                    System.out.print("Digite 'tocar' para tocar a música, 'pausar' para pausar ou 'sair' para voltar: ");
                                    String acao = scanner.nextLine();
                                    if (acao.equals("tocar")) {
                                        musica.tocarmusica();
                                    } else if (acao.equals("pausar")) {
                                        musica.pausarmusica();
                                    } else if (acao.equals("sair")) {
                                        musica.sair();
                                        break;
                                    } else {
                                        System.out.println("Ação inválida. Tente novamente.");
                                    }
                                }
                                
                            
            
                        musica.sair();
                        break;
                    }
                    while (true);
            }    
            case "2"->
                System.out.println("Você escolheu Internet.");
            case "3"->
                System.out.println("Você escolheu Telefone.");
            default->
                throw new AssertionError();
        }
        if (opoticao.equals("sair")) {
            System.out.println("Encerrando o programa...");
            break;
        }


    } while (true);

      
        
        NavegarInternet internet = new NavegarInternet();
        internet.Entrar();
        internet.exibirPagina("www.google.com");
        internet.adicionarNovaAba();
        internet.atualizarPagina();
        internet.sair();


        
        Telefone telefone = new Telefone();
        telefone.Entrar();
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();
        telefone.sair();
    }
}
