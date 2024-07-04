package list.ordenacao;

public class Main {
    public static void main(String[] args) {
        OrdenacaoNumeros num = new OrdenacaoNumeros();
        num.adicionarNumero(1);
        num.adicionarNumero(2);
        num.adicionarNumero(3);
        num.adicionarNumero(4);
        num.adicionarNumero(6);
        num.adicionarNumero(7);
        num.adicionarNumero(8);

        num.exibirNumeros();
        System.out.println(num.ordenarDescendente());
        System.out.println(num.ordenarAscendente());
    }
}
