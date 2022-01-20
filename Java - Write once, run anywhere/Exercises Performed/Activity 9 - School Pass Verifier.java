/* Autor: Keuvyn T. em 20/03/2020 às 10h.
 Synthesis [EU-US]
 Purpose: Read two student grades in double values. Next, present all the values ​​informed, the average, and whether it is approved or disapproved.
 Observation: You must not allow values ​​reported as grades to be less than 0 or greater than 10. For validation, use do/while.
 Entry: Two grades.
 Output: All values ​​informed, the average, if it is approved or disapproved.

 Síntese [PT-BR]
 Objetivo: Leia duas notas de um estudante em valores double. Na sequência, apresente todos os valores informados, a média, e se ele está aprovado ou reprovado. 
 Detalhe: Você não deve permitir que os valores informados como notas sejam inferiores a 0 ou superiores a 10. Para validação, use do/while.
 Entrada: Duas notas.
 Saida: Todos os valores informados, a média, se está aprovado ou desaprovado.
 */

import java.util.Scanner; //Import needed to read user input/Import necessário para ler digitações do usuário.
@SuppressWarnings("all") //Disable signature errors (Used only when using Scanner)/Desativa os erros de assinatura (Usado apenas quando usado Scanner).

class Activity9 {
	public static void main (String args []){
		System.out.println();
	// Declarations/Declarações
		double [] nota = new double [2];
		double media = 0;
	// Instructions/Instruções
    for (int i=0; i<2; i++){
        do {
        nota[i] = 0;
			    System.out.println("(Os valores devem ser entre 0 e 10)");
				System.out.print("Informe a " + (i+1) + " nota: ");
                    nota[i] = new Scanner(System.in).nextDouble();
                    media = nota[i] + media;
			} while (nota[i] < 0 || nota[i] > 10);
    }
	// Conclusão\Conclusion
		System.out.print("\n");
		System.out.println("--- VALORES INFORMADOS ---");
			for (int i=0;i>2;i++){
				System.out.println( (i+1) + "Nota: " + nota[i]);
			}
			media = media/2;
		System.out.println("Média: " +media);
			if (media > 7)
				System.out.println("Situação: Aprovado.");
				else
					System.out.println("Situação: Não aprovado");
			}
}