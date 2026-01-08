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
}
