/* Autor: Keuvyn T. em 08/11/2019 às 10h.
 Synthesis [EU-US]
 Purpose: Practice printing different types of data formatting.

 Síntese [PT-BR]
 Objetivo: Praticar impressão de diferentes tipos formatação de dados.
*/

#include <stdio.h> // C Basic Library/Biblioteca Básica C.
#include <locale> // Language Library/Biblioteca de Idioma

int main (void){
		setlocale(LC_ALL,"ptbr"); // Change program language to locale/Altera idioma do programa para local.
		printf("\n");
    // Declarations/Declarações
        int valorInt = 10;
        float valorReal = 3.145000;
        char nome[50] = "Keuvyn T.";
        char letra = 'K';
	// Instructions/Instruções
        printf("> Aprendizado de formatação de dados, tipo: Decimal, octal, hexadecimal, real e literal.\n");
    // Printing Decimal, Octal and Hexadecimal/Imprimindo Decimal, Octal e Hexadecimal/
        printf("O número DEZ em decimal é apresentado como: %d\n", valorInt); // decimal %d.
        printf("O número DEZ em octal é apresentado como: %o\n", valorInt); // octal %o.
        printf("O número DEZ em hexadecimal é apresentado como: %X\n", valorInt); // hexadecimal %x ou %X.
    // Printing Real Numbers/Imprimindo Números Reais
        printf("O número 3.145 é apresentado em real como: %f\n", valorReal); // real without limitation %f/real sem limitação %f.
        printf("O número 3.145 é apresentado em real (com limitação de 2 após virgula) como: %.2f\n",valorReal); // real with limitation (2 after the comma) %.2f/real com limitação (2 após a virgula) %.2f.
    // Text Data/Dados de Texto
        printf("O meu nome em string é apresentado como: %s\n", nome); // String.
        printf("A primeira letra do meu nome em caractere é apresentada como: %c\n", letra); // Char.
   // Quantidade de Bytes para principais Variáveis
        printf("Int permite até: 10 bytes \n");
        printf("Long int permite até: 10 bytes \n");
        printf("Float permite até: 4 bytes \n");
        printf("Double permite até: 8 bytes \n");
        printf("Long Double permite até: 10 bytes \n");

        printf("\n"); // BreakLine
        system ("pause"); // Pause the system before ending/Pause o sistema antes de finalizar.
    return 0;
}