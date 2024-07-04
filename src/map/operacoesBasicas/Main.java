package map.operacoesBasicas;

public class Main {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("Sábio", "pessoa inteligente");
        dicionario.adicionarPalavra("Inteligente", "pessoa sábia");
        dicionario.adicionarPalavra("Musica", "ruído");
        dicionario.adicionarPalavra("ruído", "som");

        dicionario.exibirPalavras();
        dicionario.pesquisarPorPalavra("Inteligente");
        dicionario.removerPalavra("Musica");
        dicionario.exibirPalavras();

    }
}
