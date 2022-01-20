/* Autor: Keuvyn T. em 20/04/2020 às 10h.
 Synthesis [EU-US]
 Purpose: Implement a Java program that takes the temperature in degrees Celsius and displays it converted to degrees Fahrenheit.
 Observation: 
 - The conversion formula is FAR = (9 * CEL + 160) / 5, where FAR is the temperature in Fahrenheit and CEL is in Celsius.
 - This conversion must be done through a method named fahrenheit. The method must receive the temperature in Celsius and return in Fahrenheit.
 Entry: Temperature in Degrees Celsius.
 Output: Temperature in Fahrenheit.
  
 Síntese [PT-BR]
 Objetivo: Implemente um programa em Java que receba a temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit.
 Detalhes: 
 - A fórmula de conversão é FAR = (9 * CEL + 160) / 5, sendo FAR a temperatura em Fahrenheit e CEL em Celsius.
 - Esta conversão deve ser feita por meio de um método com nome fahrenheit. O método deve receber a temperatura em Celsius e retornar em Fahrenheit.
 Entrada: Temperatura em Graus Celsius.
 Saida: Temperatura em Fahrenheit.
 */

import java.util.Scanner; //Import needed to read user input/Import necessário para ler digitações do usuário.
@SuppressWarnings("all") //Disable signature errors (Used only when using Scanner)/Desativa os erros de assinatura (Usado apenas quando usado Scanner).

class Activity11 {
	public static void main (String arg []){
        System.out.println(); // Space for the Console/Espaço para o Console
    // Declarations/Declarações
		double grausCelsius;
		System.out.println("> INFORME OS DADOS NECESS�RIOS PARA O CALCULO");
	// Instructions/Instruções
		System.out.println("Temperatura em Graus Celsius (ºC): ");
			grausCelsius = new Scanner(System.in).nextDouble();
	// Conclusion/Conclusão
		double fahrenheit = fahrenheit(grausCelsius); //Activates the method and adds the result to the variable grausCelsius/Ativa o método e adiciona e retorna o resultado para a variávels grausCelsius.
	System.out.println(); // Space for the Console/Espaço para o Console
	System.out.println("> RESULTADO");
	System.out.println("Fahrenheit: " + fahrenheit + " ºF.");
	} // Main Closing/Fechamento main
	
	// MÉTHODS/MÉTODOS
	 /* [PT-BR]
	    Objetivo do Método: Converter Graus Celsius em Fahrenheit. 
	    Retorno: Valor em Fahrenheit.
	    [EU-US]
	    Method Purpose: Convert Celsius to Fahrenheit. 
	    Return: Fahrenheit. */
	public static double fahrenheit(double paramCelsius){
		return (paramCelsius * 9/5) + 32;
	}
}