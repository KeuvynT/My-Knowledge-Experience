/* Autor: Keuvyn T. em 20/04/2020 às 10h.
 Synthesis [EU-US]
 Purpose: Calculate the interest on a debt contracted last month on a store's installment plan. The monthly interest rate and debt amount will be provided by the user.
 Observation: The debt must be calculated through a METHOD called: calculateDivida and must receive as a parameter the values necessary to calculate it and return that debt.
 Entry: Interest Rate and Debt Amount.
 Output: Updated debt amount.
  
 Síntese [PT-BR]
 Objetivo: Calcular o juro de uma divida contraida no mês passado no crediário de uma loja. A taxa de juros mensal e o valor da divida serão fornecidos pelo usuário.
 Detalhe: A divida deve ser calculada através de um MÉTODO chamado: calcularDivida e deve receber como parâmetro os valores necessários para o calcular e retornar a referida divida.
 Entrada: Taxa de Juros e Valor da Divida.
 Saida: Valor da divida atualizado.
 */

import java.util.Scanner; //Import needed to read user input/Import necessário para ler digitações do usuário.
@SuppressWarnings("all") //Disable signature errors (Used only when using Scanner)/Desativa os erros de assinatura (Usado apenas quando usado Scanner).

class Activity10 {
	public static void main (String arg []){
        System.out.println();
    // Declarations/Declarações
        double taxaDeJuros,valorDaDivida, valorDaDividaAtualizado, calcularDivida;
	// Instructions/Instruções
	    System.out.println("> INFORME OS DADOS NECESSÁRIOS PARA O CALCULO");
        System.out.println("Informe a Taxa de Juros (ex: 0.15): ");
            taxaDeJuros = new Scanner(System.in).nextDouble();
        System.out.println("Informe o Valor da divida: R$ ");
            valorDaDivida = new Scanner(System.in).nextDouble();
	// Conclusion/Conclusão
            calcularDivida = calcularDivida (taxaDeJuros, valorDaDivida); // Activates the method and adds the result to the variable calculateDivida./Ativa o método e adiciona o resultado a variável calcularDivida.
            valorDaDividaAtualizado = valorDaDivida + calcularDivida;
        System.out.println();
        System.out.println("> RESULTADO");
        System.out.println("Valor original: R$ " + valorDaDivida);
        System.out.println("Juros original: R$ " + calcularDivida);
        System.out.println("Valor atualizado: R$ " + valorDaDividaAtualizado);
        System.out.println();
    } // Main Closing/Fechamento main
	
    // MÉTHODS/MÉTODOS
	 /* [PT-BR]
     Objetivo do Método: Multiplicar dois valores. 
     Retorno: A multiplicação dos dois valores.
	 [EU-US]
	 Method Purpose: Multiply Two Values. 
	 Return: The multiplication. 
     */
        public static double calcularDivida(double paramTx, double paramVal){
            // The method takes two parameters and returns the first * the second./O método requer dois parâmetros e retorna o primeiro * o segundo.
            return paramTx * paramVal;
	    }
}