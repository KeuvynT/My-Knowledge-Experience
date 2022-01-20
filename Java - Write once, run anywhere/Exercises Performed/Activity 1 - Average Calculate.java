/* Autor: Keuvyn T. em 20/03/2020 às 10h. 
 Synthesis [EU-US]
 Purpose: Calculate the average of two double values.
 Entry: Double Values.
 Output: Arithmetic mean of two values ​​of type Double.

 Síntese [PT-BR]
 Objetivo: Calcular a média de dois valores do tipo Double.
 Entrada: Valores em double.
 Saida: Média aritimética de dois valores do tipo Double.
 */

class AverageCalculate {
    public static void main (String args[]){

        //Declarations/Declarações
		double n1 = 10, n2 = 25;
		double media = (n1+n2)/2;

        //Instructions/Instruções
		System.out.printf("> Considerando os valores " + n1 + " e " + n2 + ". \n> Média = " + media);
	}
}