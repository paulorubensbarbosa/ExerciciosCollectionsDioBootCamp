package list.pesquisaEmList;

public class Main {
    public static void main(String[] args) {
        SomaDeNumeros listaDeNumeros= new SomaDeNumeros();

        listaDeNumeros.adicionarNumero(8);
        listaDeNumeros.adicionarNumero(9);
        listaDeNumeros.adicionarNumero(8);
        listaDeNumeros.adicionarNumero(10);
        listaDeNumeros.adicionarNumero(-113);
        System.out.println(listaDeNumeros.calcularSoma());
        System.out.println(listaDeNumeros.encontrarMaiorNumero());
        System.out.println(listaDeNumeros.encontrarMenorNumero());
        System.out.println(listaDeNumeros.exibirNumeros());

    }
}
