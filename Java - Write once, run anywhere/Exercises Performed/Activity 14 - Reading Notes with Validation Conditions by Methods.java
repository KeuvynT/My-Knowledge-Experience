/* Autor: Keuvyn T. em 20/04/2020 às 10h.
 Synthesis [EU-US]
 Purpose: Launch grades of 4 students with the double reading method (Simplified).
 Observation:
 - The method should receive the request message, error message, minimum value and maximum value.
 - The minimum value for grade will be 0 and maximum 10.
 - For error message inform: Invalid note.
 Entry: Request message, error message, minimum value, maximum value.
 Output: Validation (if necessary).
  
 Síntese [PT-BR].
 Objetivo: Lance nota de 4 alunos com o método de leitura double (Simplificada).
 Detalhes:
 - O método deverá receber a mensagem de solicitação, mensagem de erro, valor mínimo e valor máximo.
 - O valor mínimo para nota será 0 e máximo 10.
 - Para mensagem de erro informe: Nota inválida.
 Parâmetros: Mensagem de solicitação, mensagem de erro, valor mínimo, valor máximo.
 Retorno: Validação (se necessário).
 */
import Methods.Activity14DoubleReader; // Enables Simplification of Reader to Double Values type/Habilita a simplificação de leituras de Double.
import java.util.Scanner; //Import needed to read user input/Import necessário para ler digitações do usuário.
@SuppressWarnings("all") //Disable signature errors (Used only when using Scanner)/Desativa os erros de assinatura (Usado apenas quando usado Scanner).

class Activity14 {
	public static void main (String [] args){
        System.out.println(); // BreakLine/Quebra de Linha
    // Declarations/Declarações
        double [] nota = new double [4];
    // Instructions/Instruções
        for (int i=0;i<4;i++){
            Activity14DoubleReader.lerDouble("Nota " + (i+1) + ": ", "Valor inválido: A nota não pode ser negativa, programa encerrado.", 0, 10);
        }
    }
}