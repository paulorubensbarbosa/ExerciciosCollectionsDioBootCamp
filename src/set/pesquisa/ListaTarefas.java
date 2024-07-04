package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> setTarefas;

    public ListaTarefas() {
        this.setTarefas = new HashSet<>() {};
    }

    public void adicionarTarefa(String descricao){
        setTarefas.add(new Tarefa(descricao, false));
    }
    public void removerTarefa(String descricao){
        for(Tarefa t : setTarefas){
            if(t.getDescricao().equals(descricao)){
                setTarefas.remove(t);
                break;
            }
        }
    }
    public void exibirTarefas(){
        System.out.println(setTarefas);
    }
    public void contarTarefas(){
        System.out.println(setTarefas.size());
    }
    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : setTarefas){
            if (t.isStatus()){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : setTarefas){
            if (!(t.isStatus())){
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for (Tarefa t : setTarefas){
            if (t.getDescricao().equals(descricao)){
                t.setStatus(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        for (Tarefa t : setTarefas){
            if (t.getDescricao().equals(descricao)){
                t.setStatus(false);
                break;
            }
        }
    }

    public void limparListaTarefas(){
        setTarefas.clear();
    }

    @Override
    public String toString() {
        return "ListaTarefas{" +
                "setTarefas=" + setTarefas +
                '}';
    }
}
