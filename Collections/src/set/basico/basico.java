package set.basico;

public class basico {
    public static void main(String[] args) {
        
    
    ConjuntoPalavrasUnicas cp = new ConjuntoPalavrasUnicas();

    cp.adicionarPalavra("oi");
    cp.adicionarPalavra("tudo");
    cp.adicionarPalavra("oi");
    cp.adicionarPalavra("bem");
    cp.adicionarPalavra("com");
    cp.adicionarPalavra("vc");

    cp.exibirPalavrasUnicas();  

    cp.removerPalavra("com");

    System.out.println(cp.verificarPalavra("tudo"));

    cp.exibirPalavrasUnicas();

    
    
    }
}