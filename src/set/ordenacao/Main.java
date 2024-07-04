package set.ordenacao;

public class Main {
    public static void main(String[] args) {
        GerenciadorAlunos listaAlunos = new GerenciadorAlunos();
        listaAlunos.adicionarAluno("Paulo", 1L, 10);
        listaAlunos.adicionarAluno("Saulo", 2L, 9);
        listaAlunos.adicionarAluno("Amigo", 3L, 8);
        listaAlunos.adicionarAluno("Benencio", 4L, 7);

        listaAlunos.exibirAlunos();
        listaAlunos.exibirAlunosPorNome();
        listaAlunos.exibirAlunorPorNota();
        listaAlunos.exibirAlunosPorMatricula();
    }
}
