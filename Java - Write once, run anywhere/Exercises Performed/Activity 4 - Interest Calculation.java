/* Autor: Keuvyn T. em 20/03/2020 às 10h.
 Synthesis [EU-US]
 Purpose: Practice reading data.
 Entry: Monthly Interest Rate and Debt Amount.
 Output: Dividend calculated with interest.

 Síntese [PT-BR]
 Objetivo: Calcular o juro de uma divida que você contraiu no mês passado no crediário de uma loja. A taxa de juros mensal e o valor da dívida serão fornecidos pelo usuário.
 Entrada: Taxa de Juros Mensal e Valor da Divida.
 Saida: Divida calculada com o juros.
 */

import java.util.Scanner; //Import needed to read user input/Import necessário para ler digitações do usuário.
@SuppressWarnings("all") //Disable signature errors (Used only when using Scanner)/Desativa os erros de assinatura (Usado apenas quando usado Scanner).

class Activity4 {
	public static void main (String args []){
		// Declarations/Declarações
			double juros;
			double divida;
			double DIVIDA_TOTAL;
		// Instructions/Instruções
			System.out.print("Informe a taxa de juros (para 15% use 0.15): ");
				juros = new Scanner(System.in).nextDouble();
			System.out.print("Informe o valor da divida:R$  ");
				divida = new Scanner(System.in).nextDouble();
				DIVIDA_TOTAL = (divida * juros + divida);
		// Conclusão\Conclusion
			System.out.println("Valor original: R$ " + divida);
			System.out.print("Valor com Juros: R$ " + DIVIDA_TOTAL);
	}
}