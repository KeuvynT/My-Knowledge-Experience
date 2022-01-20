/* Autor: Keuvyn T. em 20/05/2020 às 10h.
 Synthesis [EU-US]
 Purpose: Define the properties of the director class. It must contain (name, registration, CPF, salary, position and year of admission).
 Observation: The income tax for director is 23%.

 Síntese [PT-BR].
 Objetivo: Definir as propriedades da classe diretor. Deverá conter (nome, matrícula, cpf, salario, cargo e ano de admissão).
 Detalhe: O imposto de renda para diretor é 23%.
*/

package FinalWork;

public class Director extends Employess {
	public Director(String nome, String matricula, String cpf, double salario, char cargo, int anoAdmissao) {
		setNome(nome);
		setMatricula(matricula);
		setCPF(cpf);
		setSalario(salario);
		setCargo(cargo);
		setAnoDeAdmissao(anoAdmissao);
	}
	
	@Override
	public double getImpostoRenda() {
		return getSalario() * 0.23; //Flat rate of 23% of salary/taxa fixa de 23% do salário
	}
	
	@Override //Use toString for print director data/Usa o toString para imprimir os dados do diretor
	public String toString() {
		return "\nNome: " + getNome() + "\tMatrícula: " + getMatricula() + "\tCPF: " + getCPF() + "\tSalário: R$ " + getSalario() + "\tCargo: " + getCargo() + "\tAno de Admissão: " + getAnoDeAdmissao();
	}
}