/* Autor: Keuvyn T. em 20/04/2020 às 10h.
 Synthesis [EU-US]
 Purpose: Calculate the sum of a positive integer received by the user (perform the validation to ensure that it is valid data).
 Observation: 
 - By METHOD, the sum must receive a number, and the return must be the sum of all previous numbers up to zero.
 - Example: if 3 is passed to the method, it should return the sum of 0 + 1 + 2 + 3.
 Entry: Positive Integer.
 Output: Sum Result.
  
 Síntese [PT-BR]
 Objetivo: Calcule o somatório de um número inteiro positivo recebido pelo usuário (efetue a validação para garantir que é um dado valido). 
 Detalhes: 
 - Por MÉTODO, o somatório deverá receber um número, e o retorno deverá ser a soma de todos os números anteriores até o zero.
 - Exemplo: se for passado 3 para o método, deverá retornar a soma de 0 + 1 + 2 + 3.
 Entrada: Número inteiro positivo.
 Saida: Resultado do Somatório.
 */

import java.util.Scanner; //Import needed to read user input/Import necessário para ler digitações do usuário.
@SuppressWarnings("all") //Disable signature errors (Used only when using Scanner)/Desativa os erros de assinatura (Usado apenas quando usado Scanner).

class Activity13 {
	public static void main (String[] args){
        System.out.println(); // Space for the Console/Espaço para o Console
        // Declarations/Declarações
			int numPositivo, resultado = 0, somatorio = 0;
        // Instructions/Instruções
            do {
                System.out.print("Informe um índice para Somatório (O valor deve ser positivio): ");
			        numPositivo = lerInt(); // Simplified Reading Method/Método Simplificado de Leitura
                } while (numPositivo < 0);
        // Operation/Operação
            System.out.println("> SOMANDO.. ");
            for (int i = 0; i < numPositivo; i++){
                System.out.println(numPositivo + "(" + (i+1) + ") = " + (numPositivo* (i+1)));
                    somatorio =  numPositivo * (i+1) + somatorio;
            }
		// Conclusion/Conclusão
            System.out.println("> RESULTADO: " + somatorio);
    } // Main Closing/Fechamento main
	
    // MÉTHODS/MÉTODOS
    /* [PT-BR]
       Objetivo do Método: Simplificar leitura de inteiros. 
       Retorno: Requisição para usuário para introduzir um inteiro.
       [EU-US]
       Method Purpose: Simplify integer reading.
       Return: User request to input an integer. */
        public static int lerInt(){
            return new Scanner(System.in).nextInt();
         }
}