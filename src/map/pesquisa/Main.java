package map.pesquisa;

public class Main {
    public static void main(String[] args) {
        ContagemPalavras palavras = new ContagemPalavras();
        palavras.adicionarPalavra("Paulo", 1);
        palavras.adicionarPalavra("Saulo", 2);
        palavras.adicionarPalavra("Rey", 3);
        palavras.adicionarPalavra("yass", 4);
        palavras.adicionarPalavra("teste", 1);

        System.out.println(palavras.encontrarPalavraMaisFrequente());
        System.out.println(palavras.exibirContagemPalavras());


    }
}
