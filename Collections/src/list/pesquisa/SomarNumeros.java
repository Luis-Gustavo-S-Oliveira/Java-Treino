package list.pesquisa;
import java.util.*;

public class SomarNumeros {

    private List<Integer> numeros;

    public SomarNumeros() {
        this.numeros = new ArrayList<>();
    }
    
    public void adicionarNumero(int numero){
        numeros.add(numero);

    }

    public int calcularsomar(){
        int total = 0;
        for(int i = 0; i < numeros.size();i++){
            total += numeros.get(i);    
        }
        return total;
    }

    public int encontrarMaiorNumero(){
        int maior = 0;
        if(numeros.isEmpty()){
            throw new IllegalStateException("A lista esta vazia");
            }else{
                for (int i = 0; i < numeros.size(); i++){
                    if(maior < numeros.get(i)){
                        maior = numeros.get(i);
        }}}
        return maior;
    }
    public int encontrarMenorNumero(){
        int menor = Integer.MAX_VALUE;
        if (numeros.isEmpty()){
            throw new IllegalStateException("A lista esta vazia");
            }else {
                for (int i = 0; i < numeros.size(); i++){
                    if(menor > numeros.get(i)){
                    menor = numeros.get(i);
        }      
            }}
        return menor;
    }    
}
