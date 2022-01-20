/* Autor: Keuvyn T. em 20/03/2020 às 10h.
 Synthesis [EU-US]
 Purpose: Convert any temperature in Celsius to Fahrenheit.
 Entry: Temperature in Celsius.
 Output: Temperature in Fahrenheit.

 Síntese [PT-BR]
 Objetivo: Transformar qualquer temperaturas em Celsius para Fahrenheit.
 Entrada: Temperatura em Celsius.
 Saida: Temperatura em Fahrenheit.
 */

import java.util.Scanner; //Import needed to read user input/Import necessário para ler digitações do usuário.
@SuppressWarnings("all") //Disable signature errors (Used only when using Scanner)/Desativa os erros de assinatura (Usado apenas quando usado Scanner).

class CelsiusToFahrenheit {
	public static void main (String args[ ]){
	// Declarations/Declarações
		double celsius;
		double fahrenheit;
	// Instructions/Instruções
		System.out.println("\nEste programa tem o Objetivo de Converter 20 Graus Celsius em Farenheit. \n");
		System.out.print("> Informe um valor em Graus Celsius: ");
			celsius = new Scanner(System.in).nextDouble(); //Reads user input/Lê a entrada do usuário.
			fahrenheit = (9 * celsius + 160) / 5; //Do the conversion/Faz a conversão.
	// Conclusão\Conclusion
		System.out.println("> A temperatura de " + celsius + "º Celsius equivale a " + fahrenheit + "º em Fahrenheit.");
		System.out.println("> FIM!\n");
	}
}