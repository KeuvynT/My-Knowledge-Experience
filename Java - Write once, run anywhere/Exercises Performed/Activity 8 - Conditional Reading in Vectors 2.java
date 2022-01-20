/* Autor: Keuvyn T. em 20/03/2020 às 10h.
 Synthesis [EU-US]
 Purpose: Read 5000 integer type user data. Negative values ​​are not accepted. After receiving these values, print to standard output:
 - The average of the values;
 - How many values ​​are odd;
 - All values ​​that were informed.
 Entry: 5000 whole numbers (cannot be negative).
 Output: Average of values, number of odd numbers, all values ​​reported.

 Síntese [PT-BR]
 Objetivo: Ler 5 mil dados do usuário do tipo inteiro. Valores negativos não são aceitos. Após receber esses valores, imprima na saída padrão:
 - A média dos valores;
 - Quantos valores são Ímpares;
 - Todos os valores que foram informados.
 Entrada: 5 mil números inteiros (não pode ser negativo).
 Saida: Média dos valores, quantidade de números impares, todos os valores informados.
 */

import java.util.Scanner; //Import needed to read user input/Import necessário para ler digitações do usuário.
@SuppressWarnings("all") //Disable signature errors (Used only when using Scanner)/Desativa os erros de assinatura (Usado apenas quando usado Scanner).

class Activity8 {
	public static void main (String args []){
        System.out.println();
	// Declarations/Declarações
		int [] nota = new int [5000];
		int resto, qtdImpares = 0;
		double media = 0;
	// Instructions/Instruções
		for (int i=0; i<5000; i++){
			do {
			System.out.print("\n(Não é permitido valores negativos) ");
			System.out.print("\nInforme a nota do " + (i+1) + "º aluno:  ");
				nota[i] = new Scanner(System.in).nextInt();	
					if (nota[i] < 0){
						System.out.println("Ops! O valor informado para nota é inválido!");
					} else {
							media = media + nota [i];
							resto = nota [i] % 2;
								if (resto != 0) {
									qtdImpares = qtdImpares++;
								}
						}
			} while (nota[i] < 0);
		}
	// Conclusão\Conclusion
		System.out.print("\n");
		System.out.println("--- NOTAS INFORMADAS ---");
			for (int i=0; i<5000; i++){
				System.out.println( (i+1) + "º Aluno: " + nota[i] );
				}
		System.out.print("\n");
		System.out.println("--- DEMAIS INFORMAÇÕES ---");
            media = media/2;
		System.out.println("MÉDIA DE NOTAS: " + media);
		System.out.println("QTD DE ÍMPARES: " + qtdImpares);
	}
}