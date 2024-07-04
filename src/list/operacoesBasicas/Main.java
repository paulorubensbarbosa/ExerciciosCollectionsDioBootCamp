package list.operacoesBasicas;

public class Main {
    public static void main(String[] args) {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("livro", 10.0, 1);
        carrinho.adicionarItem("celular", 12.0, 3);
        carrinho.adicionarItem("livro", 15.0, 3);
        carrinho.adicionarItem("lapis", 1.0, 4);
        carrinho.adicionarItem("mouse", 130, 1);

        System.out.println(carrinho.carrinho);
        carrinho.removeItem("livro");

        System.out.println(carrinho.carrinho);

        System.out.println(carrinho.calcularValorTotal());

        System.out.println(carrinho.exibirItens());
    }
}