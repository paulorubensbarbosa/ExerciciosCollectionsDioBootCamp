package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> conjuntoPalavras;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavras = new HashSet<>();
    }

    public Set<String> getConjuntoPalavras() {
        return conjuntoPalavras;
    }

    public void setConjuntoPalavras(Set<String> conjuntoPalavras) {
        this.conjuntoPalavras = conjuntoPalavras;
    }

    public void adicionarPalavra(String palavra){
        conjuntoPalavras.add(palavra);
    }

    public void removerPalavra(String palavraParaRemover){
        for(String palavra : conjuntoPalavras){
            if (palavra.equals(palavraParaRemover)){
                conjuntoPalavras.remove(palavraParaRemover);
                break;
            }
        }
    }

    public void verificarPalavra(String palavraParaVerificar) {
        if (!conjuntoPalavras.isEmpty()) {
            if (conjuntoPalavras.contains(palavraParaVerificar)) {
                System.out.println("A palavra está presente no conjunto");
            } else {
                System.out.println("A palavra não está presente no conjunto");
            }
        } else {
            System.out.println("O conjunto está vazio");
        }
    }
    public void exibirPalavrasUnicas(){
        if (!conjuntoPalavras.isEmpty())
        for(String palavra : conjuntoPalavras){
            System.out.println(palavra);
        } else {
            System.out.println("Conjunto vazio");
        }
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas{" +
                "conjuntoPalavras=" + conjuntoPalavras +
                '}';
    }
}
