package set.ordenacao;


import java.util.*;

public class GerenciadorAlunos {
    
    private Set<Aluno> alunosSet;


    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunosSet.add(new Aluno(nome, matricula, media));
    }

  public void removerAlunoPorMatricula(long matricula) {
    Aluno alunoParaRemover = null;
    if (!alunosSet.isEmpty()) {
      for (Aluno a : alunosSet) {
        if (a.getMatricula() == matricula) {
          alunoParaRemover = a;
          break;
        }
      }
      alunosSet.remove(alunoParaRemover);
    } else {
      throw new RuntimeException("O conjunto está vazio!");
    }

    if (alunoParaRemover == null) {
      System.out.println("Matricula não encontrada!");
    }
  }

    public Set<Aluno> obterAlunosOrdenadosPorNome() {
    
        Set<Aluno> alunosOrdenados = new TreeSet<>(alunosSet);
        return alunosOrdenados;
    } 

    public Set<Aluno> obterAlunosOrdenadosPorNota() {
        Set<Aluno> alunosOrdenados = new TreeSet<>(new ComparadorNota());
       alunosOrdenados.addAll(alunosSet);
        return alunosOrdenados;
    }


}
