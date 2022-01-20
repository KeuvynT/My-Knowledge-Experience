package Methods;
import Classes.Student;

public class Activity16RegisterStudent {
	public static Student cadastrar() { // Não pode ser void pois irá retornar dados.
		Student aluno = new Student ();
            aluno.nome = Activity15SimplifiedReader.lerString("Nome do Aluno: ");
            aluno.matricula = Activity15SimplifiedReader.lerString("Matricula do Aluno: ");
            aluno.situacao = Activity15SimplifiedReader.lerCaracter("Situação do Aluno (B para Bolsistas ou N para Normal): ");
		return aluno;
	}
}
