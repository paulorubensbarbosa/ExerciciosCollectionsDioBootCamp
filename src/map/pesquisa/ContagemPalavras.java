package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavras() {
        this.contagemPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        contagemPalavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!contagemPalavrasMap.isEmpty()) {
            if (contagemPalavrasMap.containsKey(palavra)) {
                contagemPalavrasMap.remove(palavra);
            } else {
                System.out.println("A palavra não está presente na contagem");
            }
        } else {
            System.out.println("A contagem está vazia");
        }
    }

    public int exibirContagemPalavras() {
        int contagemTotal = 0;
        for (int contagem : contagemPalavrasMap.values()){
            contagemTotal += contagem;
        }
        return contagemTotal;
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisRepetida = null;
        Integer maiorContagem = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : contagemPalavrasMap.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                palavraMaisRepetida = entry.getKey();
            }
        }
        return palavraMaisRepetida;
    }

}
