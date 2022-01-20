/* Autor: Keuvyn T. em 20/05/2020 às 10h.
 Synthesis [EU-US]
 Purpose: Build the main interface. Here, the user can choose what he wants to do.
 
 Síntese [PT-BR].
 Objetivo: Construir a interface principal. Nela o usuário poderá escolher o que deseja fazer.
*/

package FinalWork;

public class SelectionMenu {
	public static void  Menu () {
	int operacao = 0;
	int tipoExtrato = 0;
	
		do {
			System.out.println("[1]: Cadastrar novo funcionário;");
			System.out.println("[2]: Verificar funcionários cadastrados;");
			System.out.println("[3]: Extrato de Imposto de Renda;");
			System.out.print("Escolha o que deseja fazer no programa:");
				operacao = FinalWork.Reader.lerInt();
			switch( operacao ) {
				case 1:
					Vision.cadastrarFuncionarios();
					break;
				case 2:
					Vision.imprimirFuncionarios();
					break;
				case 3:
				System.out.println("[1] Extrato de Imposto de Renda para um funcionário específico;");
				System.out.println("[2] Extrato de Imposto de Renda para vários funcionários;");
				System.out.print("Qual tipo de extrato deseja executar? ");
						tipoExtrato = Reader.lerInt();
							if (tipoExtrato == 1) {
								Vision.getImpostoRenda();
							}
								else if (tipoExtrato == 2) {
									Vision.getVariosImpostosRenda();
								}
					break;
				default:
					System.out.println("Você não selecionou uma opção válida.");
				}
			System.out.println("");
		} while (operacao == 0);
	}
}