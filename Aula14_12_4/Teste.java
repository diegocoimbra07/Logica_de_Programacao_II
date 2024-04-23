package Aula14_12_4;

public class Teste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Diego");
        aluno1.setMatricula("1234567");
        aluno1.setIdade(28);

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Ana");
        aluno2.setMatricula("123456");
        aluno2.setIdade(27);

        System.out.println("Aluno 1: " + aluno1.getNome() + ", Matrícula: " + aluno1.getMatricula() + ", Idade: " + aluno1.getIdade());
        System.out.println("Aluno 2: " + aluno2.getNome() + ", Matrícula: " + aluno2.getMatricula() + ", Idade: " + aluno2.getIdade());
    }
}
