/* Autor: Keuvyn T. em 20/03/2020 às 10h.
 Synthesis [EU-US]
 Purpose: Read the age and height of 10 people. Then calculate the average height of people over 50 years old. For this, use FOR.
 Entry: Age and Height of 10 people.
 Output: Average and height of people over 50 years old (using FOR).

 Síntese [PT-BR]
 Objetivo: Ler a idade e a altura de 10 pessoas. Em seguida calcular a média das alturas das pessoas com mais de 50 anos. Para isso, use FOR.
 Entrada: Idade e Altura de 10 pessoas.
 Saida: Calcular e dar a média de altura das pessoas com mais de 50 anos (usando FOR).
 */

import java.util.Scanner; //Import needed to read user input/Import necessário para ler digitações do usuário.
@SuppressWarnings("all") //Disable signature errors (Used only when using Scanner)/Desativa os erros de assinatura (Usado apenas quando usado Scanner).

class Activity6 {
	public static void main (String args []){
		// Declarations/Declarações
			int 	[ ] idade = new int [10];
			double	[ ] altura = new double [11];
			double	media = 0;
		// Instructions/Instruções
			for (int i=0; i<10; i++){
				System.out.print("Digite a idade da " + (i+1) + "º pessoa: ");
					idade[i] = new Scanner (System.in).nextInt();
				System.out.print("Digite a altura da " + (i+1) + "º pessoa (ex 1.75): ");
					altura[i] = new Scanner (System.in).nextDouble();
				if (idade[i] > 50) // Sum the heights where the age is greater than 50/Soma as alturas em que a idade for maior que 50
					media = media + altura[i]; 
			}
		// Conclusão\Conclusion
			media = (media/2);
			System.out.print("A média das alturas das pessoas com mais de 50 anos é: " + media);
	}
}