package colegio;
import java.util.ArrayList;
public class AlunoController {
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public void cadastrarAluno(Aluno aluno){
        alunos.add(aluno);
    }
    public void listarAlunos(){
        for (Aluno aluno : alunos) {
            aluno.mostrarDadosCompletos();

        }
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
