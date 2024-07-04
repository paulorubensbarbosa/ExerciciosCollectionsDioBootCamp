package map.ordenacao;

public class Main {
    public static void main(String[] args) {
        EstoqueProdutos biblioteca = new EstoqueProdutos();
        biblioteca.adicionarProduto("123", "Ab", "Paulo", 1 , 1);
        biblioteca.adicionarProduto("124", "Bb", "Paulo", 2 , 2);
        biblioteca.adicionarProduto("125", "Cb", "Saulo", 1 , 3);
        biblioteca.adicionarProduto("126", "Db", "Rubens", 1 , 4);

        System.out.println(biblioteca);
        biblioteca.exibirLivrosOrdenadorPorTitulo();
        biblioteca.exibirLivrosOrdenadosPorPreco();
        System.out.println(biblioteca.pesquisarLivrosPorAutor("Paulo"));

        System.out.println(biblioteca.exibirLivroMaisBarato());
        System.out.println(biblioteca.obterLivroMaisCaro());
    }
}
