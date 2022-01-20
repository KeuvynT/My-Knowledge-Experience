
/* Autor: Keuvyn T. em 08/11/2019 às 10h.
 Synthesis [EU-US]
 Purpose: Calculate area and perimeter of a circle.
 Details:
  - It is known that the calculation of the AREA is given by the expression: AREA = PÍ*RAY^2.
  - It is known that the PERIMETER calculation is given by the expression: PERIMETER = 2*PI*RAY.
 Entry: Ray.
 Output: Area and Perimeter of the circle.

 Síntese [PT-BR]
 Objetivo: Ler nome de 4 alunos e imprimir em forma de tabulação.
 Entrada: 4 nomes.
 Saida: 4 nomes em tabulação.
*/

#include <stdio.h> // C Basic Library/Biblioteca Básica C.
#include <locale> // Language Library/Biblioteca de Idioma

int main (){
		setlocale(LC_ALL,"ptbr"); // Change program language to locale/Altera idioma do programa para local.
		printf("\n");
    // Declarations/Declarações
	    char nome[50], nome2[50], nome3[50], nome4[50];
        int alunos = 0;
    // Intructions/Instruções
        printf("Digite o nome do 1º aluno: ");
            fgets(nome, 50, stdin);
        printf("\n");
        printf("Digite o nome do 2º aluno: ");
            fgets(nome2, 50, stdin);
        printf("\n");
        printf("Digite o nome do 3º aluno: ");
            fgets(nome3, 50, stdin);
        printf("\n");
        printf("Digite o nome do 4º aluno: ");
            fgets(nome4, 50, stdin);
        printf("\n");
	// Conclusion/Conclusão
        printf("--NOMES DOS ALUNOS-- \n");
        printf("%s\t%s\t%s\t%s\t", nome,nome2,nome3,nome4);

    printf("\n"); // BreakLine
	system ("pause"); // Pause the system before ending/Pause o sistema antes de finalizar.
	return (0);
}