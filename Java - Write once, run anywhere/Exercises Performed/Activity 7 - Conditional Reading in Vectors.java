/* Autor: Keuvyn T. em 20/03/2020 às 10h.
 Synthesis [EU-US]
 Purpose: Read 500 integer and positive values ​​and:
 - Find the highest value;
 - Find the lowest value;
 - Calculate the average of the numbers read
 - Present the data to the user in an organized way.
 Entry: 500 integer and positive values.
 Output: Highest value, lowest value, average of reads and displays to the user.

 Síntese [PT-BR]
 Objetivo: Ler 500 valores inteiros e positivos e:
 - Encontre o maior valor;
 - Encontre o menor valor;
 - Calcule a média dos números lidos
 - Apresentar os dados para o usuário de forma organizada.
 Entrada: 500 valores inteiros e positivos.
 Saida: Maior valor, menor valor, média dos lidos e apresenta ao usuário.
 */

import java.util.Scanner; //Import needed to read user input/Import necessário para ler digitações do usuário.
@SuppressWarnings("all") //Disable signature errors (Used only when using Scanner)/Desativa os erros de assinatura (Usado apenas quando usado Scanner).

class Activity7 {
	public static void main (String args []){
		// Declarations/Declarações
			int 	[] num = new int [500];
			int 	maiorValor = 0;
			int 	menorValor = 999999999;
			double	media = 0;
		// Instructions/Instruções
			for (int i=0; i<500; i++){
				System.out.print("Digite o " + (i+1) + "º numero (maior do que zero):  ");
				num[i] = new Scanner(System.in).nextInt();
					while (num[i]<0){
						System.out.print("O número não pode ser negativo. Digite o " + (i+1) + "º numero (maior do que zero):  ");
						num[i] = new Scanner(System.in).nextInt();
					}
				if (num[i] > maiorValor)
					maiorValor = num[i];
				if (num[i] < menorValor)
					menorValor = num[i];
				media = media + num[i];
			}
		// Conclusão\Conclusion
			media = (media/2); // Calculates the Final Average/Calcula a Média Final
			System.out.println("Maior Valor: " + maiorValor);
			System.out.println("Menor Valor: " + menorValor);
			System.out.println("Média dos Valores lidos: " + media);
	}
}