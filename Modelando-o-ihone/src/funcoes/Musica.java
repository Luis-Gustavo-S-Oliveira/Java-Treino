package funcoes;

public non-sealed class  Musica implements Essencial {

    public void Entrar (){
        System.out.println("Entrando no aplicativo de música...");
    
    }

    public void sair (){
        System.out.println("Saindo do aplicativo de música...");
    }

    public void tocarmusica (){
        System.out.println("Tocando música...");
    
    }

    public void pausarmusica (){
        System.out.println("Música pausada.");
    }   

    public String selecionarMusica (String nomeMusica){
        return "Selecionando a música: " + nomeMusica;
    }
}
