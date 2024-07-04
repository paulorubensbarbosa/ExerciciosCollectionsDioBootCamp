package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    public Map<String, String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra (String palavra, String definicao){
        dicionario.put(palavra, definicao);
    }

    public void removerPalavra (String palavra){
        if(!dicionario.isEmpty()) {
            dicionario.remove(palavra);
        } else {
            System.out.println("Dicionário vazio");
        }
    }

    public void exibirPalavras (){
        if (!dicionario.isEmpty()) {
            System.out.println(dicionario);
        } else {
            System.out.println("Dicionário vazio");
        }
    }

    public void pesquisarPorPalavra (String palavra){
        if (!dicionario.isEmpty()){
            String palavraPesquisada = dicionario.get(palavra);
            System.out.println(palavraPesquisada);
        } else {
            System.out.println("Dicionário vazio");
        }
    }

    @Override
    public String toString() {
        return "Dicionario{" +
                "dicionario = " + dicionario +
                '}';
    }
}
