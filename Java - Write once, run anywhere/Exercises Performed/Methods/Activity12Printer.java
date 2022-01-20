/* Autor: Keuvyn T. em 20/04/2020 às 10h.
 Synthesis [EU-US]
 Purpose: Allow printing of the operation on the screen
 Entry: Two values, operator and the result.
 Output: Operation printout.
  
 Síntese [PT-BR]
 Objetivo: Permitir impressão da operação na tela.
 Parâmetros: Dois valores, operador e o resultado.
 Saida: Impressão da operação.
 */

package Methods; // Refers to file location/Refere-se a localização do arquivo
import javax.swing.JOptionPane; // Allows panel printing/Permite impressão em painel.
public class Activity12Printer {

    // Printer Panel/Painel de Impressão
	public static void printPane (double paramUm, char operador, double paramDois, double resultado){
		JOptionPane.showMessageDialog(null,"["+paramUm+"] "+operador+" ["+paramDois+"] = "+resultado);
	}
}