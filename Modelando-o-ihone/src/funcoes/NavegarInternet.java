package funcoes;

public final class NavegarInternet implements Essencial {

    public void Entrar (){
        System.out.println("Entrando no navegador de internet...");
    }
    
    public void sair (){
        System.out.println("Saindo do navegador de internet...");
    }

     public void exibirPagina (String url){
        System.out.println("Exibindo a página: " + url);       
     }

    public void adicionarNovaAba (){
        System.out.println("Adicionando nova aba...");
    }   

    public void atualizarPagina (){
        System.out.println("Atualizando a página...");
    }   
}
