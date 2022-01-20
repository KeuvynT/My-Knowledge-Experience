/* Autor: Keuvyn T. em 20/04/2020 às 10h.
 Synthesis [EU-US]
 Purpose: Register two students, and print the registered data.
 Observations:
 - The class must be Student;
 - The student must have name, registration and status (Scholarship holders/No).
 Entry: Name, registration and status (Scholarship holders/No).
 Output: Data printing.
  
 Síntese [PT-BR].
 Objetivo: Fazer o cadastro de dois alunos, e imprimir os dados cadastrados.
 Detalhes:
- A classe precisa ser Aluno;
- O aluno deverá ter nome, matrícula e situação (Bolsistas/Não).
 Entrada: Nome, matrícula e situação (Bolsistas/Não).
 Retorno: Impressão dos dados.
 */

import Classes.Student; // Import Students from Class/Importa Alunos da Classe.
import Methods.Activity16RegisterStudent; // Import Register Student Method.
@SuppressWarnings("all") //Disable signature errors (Used only when using Scanner)/Desativa os erros de assinatura (Usado apenas quando usado Scanner).

class Activity16 {
	public static void main (String [] args){
        System.out.println(); //BreakLine/Quebra de Linha
    // Declarations/Declarações 
        Student [] alunos = new Student [2]; 
    // Instructions/Instruções
        System.out.println("--- CADASTRO DE ALUNOS--");
        for (int i=0;i<2;i++){
            alunos [i] = Activity16RegisterStudent.cadastrar(); // Chama o método de cadastro de Aluno.
        }
    // Conclusion/Conclusão
        System.out.println("--- IMPRESSÃO--");
            for (int i=0;i<alunos.length;i++) {
                System.out.println("> ALUNO Nº: " + (i+1));
                System.out.println("Nome: " + alunos[i].nome);
                System.out.println("Matrícula: " + alunos[i].matricula);
                System.out.println("Situação: " + alunos[i].situacao);
            }
	}
}

