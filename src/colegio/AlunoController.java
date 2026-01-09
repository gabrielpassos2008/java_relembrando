package colegio;
import java.util.ArrayList;
public class AlunoController {
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public void cadastrarAluno(Aluno aluno){
        alunos.add(aluno);//cadastrando o aluno no arreylist
    }

    public void listarAlunos(){
        for (Aluno aluno : alunos) {
            aluno.mostrarDadosCompletos();//mostrando todos o alunos no arreylist
        }
    }
    public boolean listarAluno(String nome){
        for (int i = 0; i < alunos.size(); i++) {
            if (nome.equals(alunos.get(i).getNome())) {
                alunos.get(i).mostrarDadosCompletos(); // mostrando somente um aluno
                return true;
            }
        }
        return false;
    }
    public float mediaAluno(String nome){
        for (int i = 0; i < alunos.size(); i++) {
            if (nome.equals(alunos.get(i).getNome())) {
                return alunos.get(i).getMedia();
            }
        }
        return -1;
    }

    public boolean testarNome(String nome){
        boolean verificacao = true;
        if(nome == null) {
            verificacao = false;
        }
        return verificacao;
    }

    public boolean testarNota(float nota){
        boolean verificacao = true;
        if(nota >= 0 && nota <= 10) {
            verificacao = false;
        }
        return verificacao;
    }

    public boolean testarIdade(int idade){
        boolean verificacao = true;
        if(idade >= 0 && idade <= 100) {
            verificacao = false;
        }
        return verificacao;
    }
}
