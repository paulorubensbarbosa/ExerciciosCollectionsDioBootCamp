package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> listaNumeros;

    public OrdenacaoNumeros() {
        this.listaNumeros = new ArrayList<Integer>();
    }


    public void adicionarNumero(int n){
        listaNumeros.add(n);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> listaOrdenadaAscendente = new ArrayList<>(listaNumeros);
        Collections.sort(listaOrdenadaAscendente);
        return listaOrdenadaAscendente;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> listaOrdemDescendente = new ArrayList<>(listaNumeros);
        listaOrdemDescendente.sort(Collections.reverseOrder());
        return listaOrdemDescendente;
    }

    public void exibirNumeros(){
        System.out.println(listaNumeros);
    }


    @Override
    public String toString() {
        return "OrdenacaoNumeros{" +
                "listaNumeros=" + listaNumeros +
                '}';
    }


}
