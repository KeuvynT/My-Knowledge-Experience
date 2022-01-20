/* Autor: Keuvyn T. em 20/05/2020 às 10h.
 Synthesis [EU-US]
 Purpose: Create a program that registers employees and allows the user to execute a method for calculating tax on one or several employees.
  
 Síntese [PT-BR].
 Sobre: O arquivo Vision, é um agrupamento de métodos para o funcionamento do programa.
 Objetivo: Implementar métodos diversos.
*/

package FinalWork;

public class Vision {
	
	//Start and Ending return
	public static void initEntryData() {
		Employess funcionario = new Teacher ("Andre de Souza Neto", "UC19121343", "02225714851", 2200, 'P', 1994);
		Employess funcionario2 = new Director ("Keuvyn Teixeira de Jesus", "UC19121344", "02225714852", 9000, 'P', 2022);
		EmployessList.funcionarios.add(funcionario);
		EmployessList.funcionarios.add(funcionario2);
	}

	// METHOD - Finalization of Methods/Finalização de Métodos
	public static void endingMethod() {
		int operacao;
		System.out.println("");
		System.out.println("[1] Retornar para seleção;") ;
		System.out.println("[2] Encerrar o programa;") ;
		System.out.print("Função executada com sucesso! O que deseja fazer agora? ") ;
			operacao = Reader.lerInt();
				if ( operacao == 1)
					SelectionMenu.Menu();
					else
						System.out.println("Programa encerrado.");
						System.exit(0);	
	}

	// METHOD - Register Employeer./Cadastrar funcinoário
		public static void cadastrarFuncionarios() {
		System.out.print("Insira a quantidade de funcionários que deseja cadastrar: ");
			for (int quantidade = Reader.lerInt();quantidade > 0; quantidade--) {
				for (int i=0;i==quantidade;i++){
					System.out.println("> CADASTRO DO " + (i+1) + " FUNCIONÁRIO." );
				}
				cadastrarFuncionario(); // Activates the method/Ativa o método.
			}
		}

		public static void cadastrarFuncionario() {
			// Declarations/Declarações
			char cargo;
			String nome, matricula, cpf;
			double salario;
			int anoAdmissao;
			Employess diretor, professor, funcionario;

			// Instructions/Instruções
				funcionario = new Employess(); // // Instantiates New Employee/Instancia novo funcionário.
				// CPF
					do {	
						cpf = Reader.lerString("Digite o CPF (somente números): ");
						funcionario.setCPF(cpf);
							if (EmployessList.funcionarios.contains(funcionario)) {
								System.out.println("O CPF informado já foi cadastrado!");
							}
					} while(EmployessList.funcionarios.contains(funcionario) == true);
				// Nome, matrícula, salário, ano de admissão
					nome = Reader.lerString("Digite o Nome: ");
					matricula = Reader.lerString("Digite a Matrícula: ");
					salario = Reader.lerDouble("Digite o Salário: " + nome + " : ");
					anoAdmissao = Reader.lerInt("Digite o ano de admissão: ");
				// Cargo
				do {
					System.out.println("Escolha o Cargo, [D] - Diretor, [P] - Professor.");
					System.out.print("Cargo: ");
						cargo = Reader.lerCaracter();
							if(cargo != 'D' && cargo != 'P')
								System.out.println("Você não inseriu um cargo válido, insira [D] ou [P]!");
							} while(cargo != 'D' && cargo != 'P');	
		
				// Incrementing to ArrayList/Incrementando a ArrayList
					switch (cargo) {
						case 'D':
							diretor = new Director (nome, matricula, cpf, salario, cargo, anoAdmissao);
								EmployessList.funcionarios.add(diretor); // Adiciona a lista como diretor.
							System.out.println("Funcionário do tipo Diretor foi inserido com sucesso.");
							break;
						case 'P':
							professor = new Teacher (nome, matricula, cpf, salario, cargo, anoAdmissao);
								EmployessList.funcionarios.add(professor); // Adiciona a lista como professor.
							System.out.println("Funcionário do tipo Diretor foi inserido com sucesso.");
							break;
					}
					endingMethod(); // End the program via method./Finaliza o programa através de método.
				}
	
	// METHOD - Print Employess/Imprimir Funcionários
		public static void imprimirFuncionarios() {
			System.out.print("- LISTA DE FUNCIONÁRIOS CADASTRADOS");
				for (Employess funcionarios:EmployessList.funcionarios)  {
					System.out.printf(funcionarios.toString());
				}
			endingMethod(); // End the program via method./Finaliza o programa através de método.
	}
	
	// METHOD - Extract Income Tax from 1 Employee/Extrair Imposto de Renda de 1 funcionário
		public static void getImpostoRenda() {
			System.out.println("Digite o CPF do funcionário que deseja extrair o imposto de renda.");
			System.out.print("CPF (somente números): ");
				String cpf = Reader.lerString();
					for (Employess funcionarios : EmployessList.funcionarios) {
						if (funcionarios.getCPF().contentEquals(cpf)) {
							System.out.println("O imposto de renda de " + funcionarios.getNome() + " é: R$ " + funcionarios.getImpostoRenda() + " reais.");
						} // ?? else System.out.println("Não existe funcionario com este CPF!");
					}
			endingMethod(); // End the program via method./Finaliza o programa através de método.
		}
	
	public static void getVariosImpostosRenda() {
		// Declarations/Declarações
			double impostoRenda = 0, media = 0;
			Boolean interruptor = false;
			char resposta;
			int cont = 0;
			System.out.println("Este tipo de extrato irá gerar a média e o total do imposto de renda dos funcionários informados;");
			do {
				System.out.println("Digite o CPF do funcionário que deseja extrair o imposto de renda.");
				System.out.print("CPF (somente números): ");	
				String cpf = Reader.lerString();
				for (Employess funcionarios : EmployessList.funcionarios) {
					if(funcionarios.getCPF().contentEquals(cpf)) {
						System.out.println("O imposto de renda de " + funcionarios.getNome() + " é: R$ " + funcionarios.getImpostoRenda() + " reais.");
						impostoRenda = impostoRenda + funcionarios.getImpostoRenda();
						cont = cont + 1;
					} // ?? else System.out.println("Não existe funcionario com este CPF!");
				}
				System.out.print("Operação realizada com Sucesso! Deseja continuar (S-Sim) ou (N-Não)? ");
				resposta = Reader.lerCaracter();
				if (resposta == 'N' || resposta == 'n') {
					interruptor=true;
				}
			} while (interruptor == false);
					 media = impostoRenda / cont;
			System.out.println("\nTotal de Impostos de Renda Calculado de " +cont+ " funcionários: R$ " + impostoRenda + "reais!" );
			System.out.println("Média de Impostos de Renda Calculado de " +cont+ " funcionários: R$ " + media + " reais!" );
		endingMethod(); // End the program via method./Finaliza o programa através de método.
	}
}