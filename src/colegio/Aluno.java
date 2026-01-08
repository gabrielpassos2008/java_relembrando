package colegio;

public class Aluno {
    private String nome;
    private int idade;
    private float nota1;
    private float nota2;
    private float nota3;

    public Aluno(String nome, int idade,float nota1,float nota2,float nota3){
        this.nome = nome;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }


    public void mostrarDadosCompletos(){
        System.out.println("nome do aluno:" + this.nome);
        System.out.println("idade do aluno:" + this.idade );
        System.out.println("nota do primeiro trimestre" + this.nota1);
        System.out.println("nota do segundo trimestre" + this.nota2);
        System.out.println("nota do terceiro trimestre" + this.nota3);
    }
}
