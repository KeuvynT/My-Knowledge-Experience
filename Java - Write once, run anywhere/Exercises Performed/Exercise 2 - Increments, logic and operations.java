/* Autor: Keuvyn T. em 20/03/2020 às 10h.
 Synthesis [EU-US]
 Purpose: Practice Operators in JAVA.
 Entry: General Values.
 Output: Requered Operations.

 Síntese [PT-BR]
 Objetivo: Praticar Operadores em Java.
 Entrada: Valores Gerais.
 Saida: Operações requeridas.
 */

import java.util.Scanner; //Import needed to read user input/Import necessário para ler digitações do usuário.
@SuppressWarnings("all") //Disable signature errors (Used only when using Scanner)/Desativa os erros de assinatura (Usado apenas quando usado Scanner).

class Exercise2 {
	public static void main (String args []){
		// Declarations/Declarações
			int valorIncrementar, valorDiminuir;
			double doubleIncrementar, doubleIncrementar2, valorConcatenação;
		// Instructions/Instruções
		// Sufixais de Incrementação/Increment Suffixes
				valorIncrementar = 12;
				valorDiminuir = 12;
			System.out.println("> SUFIXAIS: Você pode incrementar ou diminuir um valor apenas utilizando (++ ou --).");
			System.out.println("Temos os seguintes valores: \n ValorIncrementar: " + valorIncrementar + "\n ValorDiminuir: " + valorDiminuir);
				valorIncrementar++; // Add +1 to the value/Acrescenta +1 ao valor.
				valorDiminuir--; // Decreases -1 to value/Diminui -1 ao valor.		
			System.out.println("> Aplicado o sufixo..ficamos assim:");		
			System.out.println("ValorIncrementar aumentado: " + valorIncrementar);		
			System.out.println("ValorDiminuir reduzido: " + valorDiminuir);
		// Prefixais de Incrementação/Increment Prefixes
				doubleIncrementar = 10;
				doubleIncrementar2 = 10;
			System.out.println("> PREFIXAIS");
			System.out.println("Temos os seguintes valoresd double: \n DoubleIncrementar: " + doubleIncrementar + "\n DoubleDiminuir: " + doubleIncrementar2);
				++doubleIncrementar2; // Add +1 to the value/Acrescenta +1 ao valor.	
				--doubleIncrementar; // Decreases -1 to value/Diminui -1 ao valor.	
			System.out.println("> Aplicado o sufixo..ficamos assim:");		
			System.out.println("DoubleIncrementar aumentado: " + doubleIncrementar);		
			System.out.println("DoubleDiminuir reduzido: " + doubleIncrementar2);
		// Operações Aritméticas / Arithmetic Operations
			System.out.println("> OPERAÇÕES ARITMÉTICAS");
			System.out.println("> Considere o valor 10 para as operações.");
                int valorArithmetic = 10;
			System.out.println(valorArithmetic + " + " + valorArithmetic + " = " + valorArithmetic + 10); // Add the variable with 10/Soma a variável com 10.	
			System.out.println(valorArithmetic + " - " + valorArithmetic + " = " + (valorArithmetic - 10)); // Subtratct the variable with 10/Subtrai a variável com 10.		
			System.out.println(valorArithmetic + " * " + valorArithmetic + " = " + valorArithmetic * 10); // Multiplies the variable with 10/Multiplica a variável com 10.	
			System.out.println(valorArithmetic + " / " + valorArithmetic + " = " + valorArithmetic / 10); // Divide the variable with 10/Divide a variável com 10.		
			System.out.println(valorArithmetic + " % " + " 2 " + " = " + valorArithmetic % 2); // Find Module 2/Encontra o Módulo de 2.	
		// Concatenation/Concatenação
			System.out.println("> CONCATENAÇÃO");
			System.out.println("> Considere o valor 10.5 para as operações.");
				valorConcatenação = 10.5; 
			System.out.print("Valor aparecerá com concatenação > "+ valorConcatenação);
		// Encapsulamento
			System.out.print("Também é possível Encapsular duas variáveis em uma, tal como abaixo.");
				String Login = "Nome ", Senha = "Password"; 
				String Usuario = Login + Senha; // Receive two different texts and put them in a variable/Recebe dois textos diversos e coloque em uma variável.
			System.out.print(Usuario); // Print the text with the sum variable/Imprima o texto com a variável somada.
		// Igualdade
			System.out.println("> IGUALDADE");
			System.out.println("> Os operadores possíveis são (== igual á) ou (!= diferente de).");
				boolean Interruptor = true;
					if (Interruptor == true){
						System.out.println("Interruptor ligado.");
					} else {
						System.out.println("Interruptor desligado.");
					}
		// COMPARATIVOS
			System.out.println("> COMPARATIVOS");
			System.out.println("> Vamos comparar o seu valor com o nosso, se for o mesmo, o retorno será positivo.");
			System.out.println("> Informe um valor entre 1 e 3: ");
				int numero = new Scanner (System.in).nextInt();
				if (numero == 3){
					System.out.println("Você acertou, nosso número é 3!");
				} else {
					System.out.println("Você errou, nosso número era 3.");
				}
		// ATRIBUIÇÃO
			System.out.println("> ATRIBUIÇÃO");
			System.out.println("> Serve para valores numéricos ou textos.");
				int valorA = 1;
					System.out.println("Valor A: " + valorA);
						String nome = "Marcos";
					System.out.println("Nome: " + nome);
	}
}
