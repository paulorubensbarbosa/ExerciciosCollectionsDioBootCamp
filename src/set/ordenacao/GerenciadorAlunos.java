package set.ordenacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> setAlunos;

    public GerenciadorAlunos() {
        this.setAlunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double nota){
        setAlunos.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(Long matricula){
        for (Aluno a : setAlunos){
            if(a.getMatricula().equals(matricula)){
                setAlunos.remove(a);
                break;
            }
        }
    }

    public void exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(setAlunos);
        System.out.println(alunosPorNome);
    }

    public void exibirAlunorPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(Comparator.comparingDouble(Aluno::getNota));
        alunosPorNota.addAll(setAlunos);
        System.out.println(alunosPorNota);
    }

    public void exibirAlunosPorMatricula() {
        Set<Aluno> alunosPorMatricula = new TreeSet<>(Comparator.comparingLong(Aluno::getMatricula));
        alunosPorMatricula.addAll(setAlunos);
        System.out.println(alunosPorMatricula);
    }

    public void exibirAlunos() {
        System.out.println(setAlunos);
    }



}
