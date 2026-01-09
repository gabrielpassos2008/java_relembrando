package colegio;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        AlunoController controller = new AlunoController();
        Scanner sc = new Scanner(System.in);
        boolean sistemaAtivo = true;
        int informe;
        while (sistemaAtivo) {
            System.out.println(" 1 - Cadastrar aluno \n 2 - Listar alunos \n 3 - Sair" );
            informe = sc.nextInt();

            switch (informe){
                case 1:
                    cadastrarAlunos(controller, sc);
                    break;
                case 2:
                    controller.listarAlunos();
                    break;
                case 3:
                    sistemaAtivo = false;
                    break;
                default:
                    System.out.println("informe um numero da lista!!!");
            }
        }
    }
    public static void cadastrarAlunos(AlunoController controller, Scanner sc ){
        String nome;
        int idade;
        float nota1;
        float nota2;
        float nota3;

        System.out.println("informe o nome do aluno:");
        nome = sc.next();
        System.out.println("informe a idade do aluno:");
        idade = sc.nextInt();
        System.out.println("informe a nota do primeiro trimestre:");
        nota1 = sc.nextFloat();
        System.out.println("informe a nota do segundo trimestre:");
        nota2 = sc.nextFloat();
        System.out.println("informe a nota do terceiro trimestre:");
        nota3 = sc.nextFloat();
        Aluno aluno = new Aluno(nome,idade,nota1,nota2,nota3);
        controller.cadastrarAluno(aluno);
    }
}
