package funcoes;

public sealed interface Essencial permits Musica, NavegarInternet, Telefone {

    public void Entrar ();
    
    public void sair ();

}
