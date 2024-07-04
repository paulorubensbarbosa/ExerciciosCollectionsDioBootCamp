package map.ordenacao;

public class Livro implements Comparable<Livro> {
    private String titulo;
    private String autor;
    private int quantidade;
    private double preco;

    public Livro(String titulo, String autor, int quantidade, double preco) {
        this.titulo = titulo;
        this.quantidade = quantidade;
        this.preco = preco;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public int compareTo(Livro l) {
        return titulo.compareTo(l.getTitulo());
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }
}
