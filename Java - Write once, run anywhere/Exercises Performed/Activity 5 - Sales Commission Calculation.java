/* Autor: Keuvyn T. em 20/03/2020 às 10h.
 Synthesis [EU-US]
 Purpose: Read a salesperson's name, fixed salary and the total sales made by him in the month. Knowing that this salesperson earns 15% commission on his sales, the program should show his name and his salary at the end of the month as a result.
 Entry: Seller Name, Fixed Salary, Total Sales.
 Output: Name and final salary of the seller.

 Síntese [PT-BR]
 Objetivo: Ler o nome de um vendedor, salario fixo e o total de vendas efetuadas por ele no mês. Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, o programa deve mostrar como resultado o seu nome e o seu salário do final do mês.
 Entrada: Nome do Vendedor, Salario Fixo, Total de Vendas.
 Saida: Nome e Salario final do vendedor.
 */

import java.util.Scanner; //Import needed to read user input/Import necessário para ler digitações do usuário.
@SuppressWarnings("all") //Disable signature errors (Used only when using Scanner)/Desativa os erros de assinatura (Usado apenas quando usado Scanner).

class Activity5 {
	public static void main (String args []){
		// Declarations/Declarações
			String nomedoVendedor;
			double salarioFixo;
			double comissao;
			double SALARIO_TOTAL;
		// Instructions/Instruções
			System.out.print("Digite o nome do vendedor: ");
				nomedoVendedor = new Scanner(System.in).nextLine();
			System.out.print("Digite o sal�rio do vendedor: R$  ");
				salarioFixo = new Scanner(System.in).nextDouble();
				comissao = 0.15;
				SALARIO_TOTAL = (salarioFixo * comissao + salarioFixo);
		// Conclusão\Conclusion
			System.out.println("Salario original: R$ " + salarioFixo);
			System.out.println("Salario com comissão: R$ " + SALARIO_TOTAL + " para o vendedor " + nomedoVendedor);
	}
}