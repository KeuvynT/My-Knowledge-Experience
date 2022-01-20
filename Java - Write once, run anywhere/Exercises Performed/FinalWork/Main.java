/* Autor: Keuvyn T. em 20/05/2020 às 10h.
 Synthesis [EU-US]
 Purpose: Create a program that registers employees and allows the user to execute a method for calculating tax on one or several employees.
 Observation:
 - Employees must be of two types (Director and Professor);
 - The getImpostoRenda method should return the average and the total of the calculated tax;Entry: Desired operation.
 Entry: name, registration, CPF, salary, position, length of service and year of admission;
 Output: Employee data registered along with the income tax calculated by the system.
  
 Síntese [PT-BR].
 Objetivo: Crie um programa que cadastre funcionários e possibilite ao usuário executar um método para calculo de imposto um ou vários funcionários.
 Observações:
 - Os funcionários deverão ser de dois tipos (Diretor e Professor);
 - O método getImpostoRenda deverá retonar a média e o total do imposto calculado;
 - O imposto de renda para o professor é 20% do salário, e para o diretor 23%.
 Entrada: nome, matrícula, cpf, salário, cargo e ano de admissão;
 Retorno: Dados dos funcionários cadastrados juntamente  com o imposto de renda calculado pelo sistema.
 */

package FinalWork;
 //import ucb.project.poo.methods.Visao;

class Main {
	public static void main (String[] args) {
		// Instructions/Instruções
		Vision.initEntryData(); // Inicializa o sistema com 1 funcionário cadastrado.
		SelectionMenu.Menu(); // Interface do sistema.

	}
}
