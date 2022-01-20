/* Autor: Keuvyn T. em 20/03/2020 às 10h.
 Synthesis [EU-US]
 Purpose: Practice reading data.
 Entry: 
 - Teacher salary
 - Child's age
 - Public servant has or does not have health insurance
 - Person is married (c) or single (s)
 - Name of a student.
 Output: Data reported.

 Síntese [PT-BR]
 Objetivo: Praticar leitura de dados.
 Entrada: 
 - Salário do professor
 - Idade da criança
 - Servidor público possui ou não plano de saúde
 - Pessoa é casada (c) ou solteira (s)
 - Nome de um aluno.
 Saida: Dados informados.
 */

import java.util.Scanner; //Import needed to read user input/Import necessário para ler digitações do usuário.
@SuppressWarnings("all") //Disable signature errors (Used only when using Scanner)/Desativa os erros de assinatura (Usado apenas quando usado Scanner).

class LeituraDeDados {
	public static void main (String args []){
		// Declarations/Declarações
			double salarioProfessor;
			int idadeCrianca;
			char planoSaude, estadoCivil;
			String nomeAluno;
		// Instructions/Instruções
			System.out.print("Informe o Salário do Professor: R$ ");
			salarioProfessor = new Scanner(System.in).nextDouble();
				System.out.print("Informe a Idade da Criança: ");
				idadeCrianca = new Scanner(System.in).nextInt();
					System.out.print("Informe se tem plano de saúde ou não. Digite (s) para sim e (n) para não: ");
					planoSaude = new Scanner(System.in).next().charAt(0);
						System.out.print("Informe seu estado cívil. Digite (c) para casado(a) e (s) para solteiro(a): ");
						estadoCivil = new Scanner(System.in).next().charAt(0);
							System.out.print("Informe o nome do aluno: ");
							nomeAluno = new Scanner(System.in).nextLine();
		// Conclusão\Conclusion
			System.out.print("\n"); // BreakLine/QuebraDeLinha
			System.out.println("> DADOS INFORMADOS");
			System.out.println("Salário do Professor: R$ " + salarioProfessor + " reais.");
			System.out.println("Idade da Criança: " + idadeCrianca + " anos.");
			System.out.println("Plano de Saúde: " + planoSaude);
			System.out.println("Estado Cívil: " + estadoCivil);
			System.out.println("Nome do Aluno: " + nomeAluno);
	}
}