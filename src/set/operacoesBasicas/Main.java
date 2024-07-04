package set.operacoesBasicas;

public class Main {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();
        conjunto.adicionarPalavra("Paulo");
        conjunto.adicionarPalavra("Saulo");
        conjunto.adicionarPalavra("Saulo");
        conjunto.adicionarPalavra("saulo");
        System.out.println(conjunto);
        conjunto.removerPalavra("saulo");
        conjunto.removerPalavra("Saulo");
        System.out.println(conjunto);
        conjunto.verificarPalavra("Paulo");
        conjunto.removerPalavra("Paulo");
        System.out.println(conjunto);
        conjunto.verificarPalavra("Paulo");
        conjunto.adicionarPalavra("Teste");
        conjunto.adicionarPalavra("Teste2");
        conjunto.exibirPalavrasUnicas();
    }
}
