/* Autor: Keuvyn T. em 20/03/2020 às 10h.
 Synthesis [EU-US]
 Purpose: Practice Selection Structures in JAVA.
 Entry: General Values.
 Output: Requered Operations.

 Síntese [PT-BR]
 Objetivo: Praticar Estruturas de Seleção em Java
 Entrada: Valores Gerais.
 Saida: Operações requeridas.
 */

import java.util.Scanner; //Import needed to read user input/Import necessário para ler digitações do usuário.
@SuppressWarnings("all") //Disable signature errors (Used only when using Scanner)/Desativa os erros de assinatura (Usado apenas quando usado Scanner).

class Exercise {
	public static void main (String args []){
		// Declarations/Declarações
			int num1 =10, num2 = 20;
            char estadoCivil;
		// Instructions/Instruções
			System.out.println("> Este programa não tem a finalidade de ser executado, apenas serve para denotar as estrutras.");
		// If & Else/ Se & Diferente
			if (num1 == num2)
				System.out.println("Iguais");
			if (num1 != num2)
				System.out.println("Diferentes");
		// Switch - Also Works With String/Escolha Também Funciona com String
			System.out.print("Informe seu estado civil. (c) para casado, (d) para divorciado, (e) para enrolado, (f) para ficando ou (s) para solteiro: ");
				estadoCivil = new Scanner(System.in).next().charAt(0);
					switch(estadoCivil){
						case 'c':
							System.out.print("Casado(a)"); break;
						case 'd':
							System.out.print("Divorciado(a)"); break;
						case 'e':
							System.out.print("Enrolado(a)"); break;
						case 'f':
							System.out.print("Ficando"); break;
						case 's':
							System.out.print("Solteiro(a)"); break;
					}
		// For/Para
			for (int numInt = 0; numInt < 10; numInt++) {
				System.out.println(numInt);
			}
		// While/Enquanto
			int numInt2 = 1;
				while (numInt2 < 10){
					System.out.println(++numInt2);
				}
		// Do-While/Faça-Enquanto
			int numInt3 = 0;
				do {
					System.out.print(numInt3++);
				}
				while (numInt3 < 10);
	}
}