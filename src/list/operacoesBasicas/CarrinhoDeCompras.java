package list.operacoesBasicas;

import java.util.ArrayList;

public class CarrinhoDeCompras {

    public ArrayList<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<Item>();
    }

    public void adicionarItem(String nome, double preco, double quantidade){
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removeItem(String nome){
        if(!carrinho.isEmpty()){
            ArrayList<Item> itensParaRemover = new ArrayList<>();
            for(Item i : carrinho){
                if(i.getNome().equals(nome)) {
                    itensParaRemover.add(i);
                }
            }
            carrinho.removeAll(itensParaRemover);
            System.out.println("Itens removidos");
        }else{
        throw new RuntimeException("O carrinho está vazio");}
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        if (!carrinho.isEmpty()) {
            for (Item i : carrinho) {
                valorTotal += i.getPreco() * i.getQuantidade();
            }
            return valorTotal;
        } else throw new RuntimeException("A lista está vazia");
    }

    public ArrayList<Item> exibirItens(){
        return carrinho;
    }

}
