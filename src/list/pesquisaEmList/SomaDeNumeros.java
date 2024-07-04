package list.pesquisaEmList;

import java.util.ArrayList;
import java.util.List;

public class SomaDeNumeros {
    private List<Integer> listaInteiros;

    public SomaDeNumeros() {
        this.listaInteiros = new ArrayList<Integer>();
    }

    public void adicionarNumero(int numero){
        listaInteiros.add(numero);
    }

    public int calcularSoma() {
        if (!listaInteiros.isEmpty()) {
            int somaDosNumeros = 0;
            for (Integer i : listaInteiros) {
                somaDosNumeros += i;
            }
            return somaDosNumeros;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public int encontrarMaiorNumero(){
        if(!listaInteiros.isEmpty()){
            int maiorNumero = Integer.MIN_VALUE;
            for (Integer i : listaInteiros){
                if(i >= maiorNumero){
                    maiorNumero = i;
                }
            } return maiorNumero;
        }else {throw new RuntimeException("A lista está vazia");}
    }

    public int encontrarMenorNumero(){
        if(!listaInteiros.isEmpty()){
            int menorNumero = Integer.MAX_VALUE;
            for (Integer i : listaInteiros){
                if(i <= menorNumero){
                    menorNumero = i;
                }
            } return menorNumero;
        }else {throw new RuntimeException("A lista está vazia");}
    }

    public List<Integer> exibirNumeros(){
        if(!listaInteiros.isEmpty()){
            return listaInteiros;
        }else throw new RuntimeException("A lista está vazia");
    }


}
