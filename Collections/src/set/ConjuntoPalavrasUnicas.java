package set;
import java.util.*;

public class ConjuntoPalavrasUnicas {
    
    private Set<String> palavrasUnicas;

    @Override
    public String toString() {
        return  "palavrasUnicas =" + palavrasUnicas +
                '}';
    }

    

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra){
        palavrasUnicas.remove(palavra);
    }

    public boolean verificarPalavra(String palavra){
        return palavrasUnicas.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavrasUnicas.toString());
    }



}
