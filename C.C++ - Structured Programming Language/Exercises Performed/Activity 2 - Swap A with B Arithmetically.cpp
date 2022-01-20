/* Autor: Keuvyn T. em 08/11/2019 às 10h.
 Synthesis [EU-US]
 Purpose: Swap values of Variables A and B arithmetically.
 Entry: Any value.
 Output: Values exchanged.

 Síntese [PT-BR]
 Objetivo: Trocar valores das Variáveis A e B aritméticamente.
 Entrada: Qualquer valor.
 Saida: Valores trocados.
*/

#include <stdio.h> // C Basic Library/Biblioteca Básica C.
#include <locale> // Language Library/Biblioteca de Idioma

int main (){
		setlocale(LC_ALL,"ptbr"); // Change program language to locale/Altera idioma do programa para local.
		printf("\n");
	// Declarations/Declarações
		int a=100, b=200;
	// Instructions/Instruções
		printf("> Atualmente, os valores atribuídos para A e B são respectivamente:\n");
		printf("A = %d \nB = %d \n", a, b);
	// Concluision/Conclusão
		a = a + b; // a, takes the value of 300
		b = a - b; // b, takes the value of 100
		a = a - b; // a, takes the value of 200.
		printf("> Agora, os valores atribuídos para A e B são respectivamente:\n");
		printf("A = %d \nB = %d \n", a, b);

    printf("\n"); // BreakLine
	system ("pause"); // Pause the system before ending/Pause o sistema antes de finalizar.
	return (0);
}