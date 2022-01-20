/* Autor: Keuvyn T. em 20/04/2020 às 10h.
 Synthesis [EU-US]
 Purpose: Implement a class called MyMath.java, which should have four methods as shown in the following listing:
 Observation:
	- Receive an integer as an argument and calculate the factorial.
	- Take two values ​​as an argument and return whichever number is greater.
	- Take an integer value as an argument and return if it is an even number. (return true or false)
	- Receive an integer and return if it is a mathematical prime (challenge).
	- Make a main program to test your implemented class with assigned values ​​of your choice.
 Entry: Desired operation.
 Output: Operation response.
  
 Síntese [PT-BR].
 Objetivo: Fazer a implementação de uma classe chamada MyMath.java, que deverá ter quatro métodos conforme a listagem a seguir:
	- Receber um número inteiro como argumento e calcular o fatorial.
	- Receber dois valores como argumento e retornar o número que for maior.
	- Receber um valor inteiro como argumento e retornar se ele é um número par. (retorne true ou false).
	- Receber um número inteiro e retornar se ele é um número primo matemático (desafio).
	- Faça um programa principal para testar sua classe implementada com valores atribuídos a sua escolha.
 Entrada: Operação desejada.
 Retorno: Resposta da operação.
 */

import Methods.Activity15SimplifiedReader; // Enables Simplification of Reader.
import Methods.Activity15MyMath; // Enables My Math Calculator.
import java.util.Scanner; //Import needed to read user input/Import necessário para ler digitações do usuário.
@SuppressWarnings("all") //Disable signature errors (Used only when using Scanner)/Desativa os erros de assinatura (Usado apenas quando usado Scanner).

class Activity15 {
	public static void main (String[] args){
			System.out.println(); //BreakLine/Quebra de Linha
		// Declarations/Declarações
			int operacao, resultado = 0, numero;
            double numeroDouble, numeroDouble2, resultadoDouble;
            Boolean resultadoBoolean;
		// Instructions/Instruções
            System.out.println("[1] Calcular fatorial;");
            System.out.println("[2] Comparar dois valores e descobrir o maior;");
            System.out.println("[3] Saber se um número é par ou impar; ");
            // System.out.println("[4] Saber se um número é primo;");
            System.out.print("> Informe a operação que deseja realizar: ");
				operacao = Activity15SimplifiedReader.lerInt();
			
			switch (operacao){
				case 1:
                    System.out.print("> Você escolheu Fatorial. Digite um número para calcular: ");
                        numero = Activity15SimplifiedReader.lerInt();
                        resultado = Activity15MyMath.calcFactorial(numero);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    System.out.println("> Você escolheu Qual o Maior? Digite os números que deseja comparar.");
                    System.out.print("1º Número: "); 
                        numeroDouble = Activity15SimplifiedReader.lerDouble();
                    System.out.print("2º Número: ");
                        numeroDouble2 = Activity15SimplifiedReader.lerDouble();
                        resultadoDouble = Activity15MyMath.qualOMaior(numeroDouble, numeroDouble2);
                    System.out.println("Maior número: " + resultadoDouble);
                    break;
                case 3:
                    System.out.println("> Você escolheu Par ou Impar? Digite os números que deseja saber.");
                    System.out.print("Número (Considere True para PAR e False para Impar): "); 
                        numero = Activity15SimplifiedReader.lerInt();
                        resultadoBoolean = Activity15MyMath.parOuImpar(numero);
                    System.out.println(resultadoBoolean);
					break;
                case 4:
                    System.out.println("> Você escolheu É Número Primo? Digite o número que deseja saber.");
                    System.out.print("Número: "); 
                        numero = Activity15SimplifiedReader.lerInt();
                        resultadoBoolean = Activity15MyMath.primeNumberChecker(numero);
                    System.out.println("O número é: " + resultadoBoolean);
					break;
					default:
						System.out.println("Operação inválida.");
			} 
    }
}