/* Autor: Keuvyn T. em 20/04/2020 às 10h.
 Synthesis [EU-US]
 Purpose: Simplify data reading.
  
 Síntese [PT-BR].
 Objetivo: Simplificar leitura de dados.
 */

package FinalWork;// Refers to file location/Refere-se a localização do arquivo
import java.util.Scanner; //Import needed to read user input/Import necessário para ler digitações do usuário.
@SuppressWarnings("all") // Remove eclipse In Alerts / Remover os alertas de entradas do eclipse	

public class Reader {

	// METHOD SimplifyRead v1 - Read Data
		public static char lerCaracter() {
			return new Scanner(System.in).next().charAt(0);
		}
		public static double lerDouble() {
			return new Scanner(System.in).nextDouble();
		}
		public static int lerInt() {
			return new Scanner(System.in).nextInt();
		}
		public static String lerString() {
			return new Scanner(System.in).nextLine();
		}

	/* METHOD SimplifyRead v2 - Message Parameter Addition/Adição do Parâmetro Mensagem
	[PT-BR]
	Objetivo: Acrescenta mensagem como parâmetro.
	[EU-US]
	Method Purpose: Add message how parameter.
	*/
		public static char lerCaracter(String mensagem){
			System.out.print(mensagem);
			return lerCaracter();
		}
		public static double lerDouble(String mensagem){
			System.out.print(mensagem);
			return lerDouble();
		}
		public static int lerInt(String mensagem){
			System.out.print(mensagem);
			return lerInt();
		}
		public static String lerString(String mensagem){
			System.out.print(mensagem);
			return lerString();
		}
	
	/* METHOD SimplifyRead v3 - Message Error, Max Value and Min Value Parameter Addition/Adição do Parâmetro Mensagem de Erro, Valor Máximo e Valor Mínimo
     [PT-BR]
     Objetivo: Acrescenta mensagem de erro e permissão de restrião de valor maxíma e mínimo.
     Resultado: Parametro de mensagem de erro e permissão de restrião de valor maxíma e mínimo.
	 Configuração Necessária: Método de escape caso o usuário receba a mensagem de erro.
     [EU-US]
     Method Purpose: It adds error message and maximum and minimum value constraint permission.
     Return: Error message parameter and maximum and minimum value constraint permission.
	 Required Configuration: Escape method in case the user gets the error message.
    */
	public static int lerInt(String mensagem, String msgErro, double valMin, double valMax){
		int retorno;
		retorno = lerInt(mensagem);
			if (retorno < valMin || retorno > valMax){
				System.out.println(msgErro);
					FinalWork.Vision.endingMethod(); //Método de escape.
			} while (retorno < valMin || retorno > valMax);
		return retorno;
	}

	public static double lerDouble(String mensagem, String msgErro, double valMin, double valMax){
		double retorno;
		retorno = lerDouble(mensagem);
			if (retorno < valMin || retorno > valMax){
				System.out.println(msgErro);
			} while (retorno < valMin || retorno > valMax);
		return retorno;
	}
}