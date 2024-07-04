package set.pesquisa;

public class Main {
    public static void main(String[] args) {
        ListaTarefas setTarefas = new ListaTarefas();
        setTarefas.adicionarTarefa("trabalho");
        System.out.println(setTarefas);
        setTarefas.removerTarefa("trabalho");
        System.out.println(setTarefas);
        setTarefas.adicionarTarefa("estudando");
        setTarefas.adicionarTarefa("treinar");
        System.out.println("Lista de tarefas pendentes: " + setTarefas.obterTarefasPendentes());
        System.out.println("Lista de tarefas concluidas: " + setTarefas.obterTarefasConcluidas());
        setTarefas.marcarTarefaConcluida("treinar");
        System.out.println("Lista de tarefas concluidas: " + setTarefas.obterTarefasConcluidas());
        setTarefas.marcarTarefaPendente("treinar");
        System.out.println("Lista de tarefas pendentes: " + setTarefas.obterTarefasPendentes());
        setTarefas.limparListaTarefas();
        setTarefas.exibirTarefas();

    }
}
