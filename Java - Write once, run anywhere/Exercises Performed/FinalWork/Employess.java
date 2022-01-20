/* Autor: Keuvyn T. em 20/05/2020 às 10h.
 Synthesis [EU-US]
 Purpose: Define the properties of the employee class. It must contain (name, registration, CPF, salary, position and year of admission).
 
 Síntese [PT-BR].
 Objetivo: Definir as propriedades da classe funcionário. Deverá conter (nome, matrícula, cpf, salario, cargo e ano de admissão).
 */

package FinalWork;

public class Employess {
	private String nome, matricula, cpf;
	private double salario;
	private char cargo;
	private int anoDeAdmissao;
	
	@Override //Checks if the functionary already exists/Verifica se o funcionário já existe
	public boolean equals(Object obj) {
		if(obj instanceof Employess) {
			Employess temp = (Employess) obj;
			if(this.getCPF().equalsIgnoreCase(temp.getCPF()));
		}
		return super.equals(obj);
	}
	
	@Override //Use toString for print functionary data/Usa o toString para imprimir os dados do funcion�rio
	public String toString() {
		return "\nNome: " + getNome() + "\tMatrícula: " + getMatricula() + "\tCPF: " + getCPF() + "\tSalário: R$ " + getSalario() + "\tCargo: " + getCargo() + "\tAno de Admissão: " + getAnoDeAdmissao();
	}
	
	public Employess() {
	}

	public Employess(String nome, String matricula, String CPF, double salario, char cargo) {
		setNome(nome);
		setMatricula(matricula);
		setCPF(CPF);
		setSalario(salario);
		setCargo(cargo);
	}

	public double getImpostoRenda() {
		return 0.0;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCPF() {
		return cpf;
	}
	public void setCPF(String CPF) {
		this.cpf = CPF;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public char getCargo() {
		return cargo;
	}
	public void setCargo(char Cargo) {
		this.cargo = Cargo;
	}
	public void setAnoDeAdmissao(int anoAdmissao) {
		anoDeAdmissao = anoAdmissao;
	}
	public double getAnoDeAdmissao() {
		return anoDeAdmissao;
	}
}
