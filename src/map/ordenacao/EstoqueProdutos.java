package map.ordenacao;

import java.util.*;

public class EstoqueProdutos {
    private Map<String, Livro> estoqueDeLivrosMap;

    public EstoqueProdutos() {
        this.estoqueDeLivrosMap = new HashMap<>();
    }

    public void adicionarProduto(String cod, String titulo, String autor, int quantidade, double preco) {
        estoqueDeLivrosMap.put(cod, new Livro(titulo, autor, quantidade, preco));
    }

    public void removeLivro(String titulo) {
        Set<String> livrosParaRemover = new HashSet<>();
        for (Map.Entry<String, Livro> entry : estoqueDeLivrosMap.entrySet()) {
            if (entry.getValue().getTitulo().equals(titulo)) {
                livrosParaRemover.add(entry.getKey());
            }
        }
        for (String livro : livrosParaRemover) {
            estoqueDeLivrosMap.remove(livro);
        }
    }

    public void exibirLivrosOrdenadorPorTitulo() {
        Map<String, Livro> livroOrdemTitulo = new TreeMap<>(estoqueDeLivrosMap);
        System.out.println(livroOrdemTitulo);
    }

    public void exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(estoqueDeLivrosMap.entrySet());
        Map<String, Livro> livrosOrdenados = new LinkedHashMap<>();
        Collections.sort(livrosParaOrdenarPorPreco, Comparator.comparingDouble(entry -> entry.getValue().getPreco()));
        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
            livrosOrdenados.put(entry.getKey(), entry.getValue());
        }
        System.out.println(livrosOrdenados);
    }

    public List<Map.Entry<String, Livro>> pesquisarLivrosPorAutor(String autor) {
        List<Map.Entry<String, Livro>> livrosDoAutor = new ArrayList<>();

        for (Map.Entry<String, Livro> entry : estoqueDeLivrosMap.entrySet()) {
            if (entry.getValue().getAutor().equals(autor)) {
                livrosDoAutor.add(entry);
            }
        }
        return livrosDoAutor;
    }

    public Livro obterLivroMaisCaro() {
        Livro livroMaisCaro = null;
        double maiorValor = Double.MIN_VALUE;
        for (Map.Entry<String, Livro> entry : estoqueDeLivrosMap.entrySet()) {
            if (entry.getValue().getPreco() >= maiorValor) {
                livroMaisCaro = entry.getValue();
                maiorValor = entry.getValue().getPreco();
            }
        }
        return livroMaisCaro;
    }

    public Livro exibirLivroMaisBarato() {
        Livro livroMaisBarato = null;
        double menorValor = Double.MAX_VALUE;
        for (Map.Entry<String, Livro> entry : estoqueDeLivrosMap.entrySet()) {
            if (entry.getValue().getPreco() <= menorValor){
                livroMaisBarato = entry.getValue();
                menorValor = entry.getValue().getPreco();
            }
        }
        return livroMaisBarato;
    }


    @Override
    public String toString() {
        return "EstoqueProdutos{" +
                "estoqueDeLivrosMap=" + estoqueDeLivrosMap +
                '}';
    }
}
