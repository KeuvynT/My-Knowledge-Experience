/* Autor: Keuvyn T. em 08/11/2019 às 10h.
 Synthesis [EU-US]
 Purpose: Practice and print text and numbers.
 Entry: Name and number.
 Output: Name and number.

 Síntese [PT-BR]
 Objetivo: Praticar e impressão de texto e números.
 Entrada: Nome e número.
 Saida: Nome e número.
*/

#include <stdio.h> // C Basic Library/Biblioteca Básica C.
#include <locale> // Language Library/Biblioteca de Idioma

int main (void){
		setlocale(LC_ALL,"ptbr"); // Change program language to locale/Altera idioma do programa para local.
		printf("\n");
	// Declarations/Declarações
		char nome[15];
		char nomeInteiro[50], nomeInteiro2[50];
		int numero;
	// Instructions/Instruções
		printf("> Práticas de SCANF do tipo: Leia e imprima, nome e números. \n");
		printf("> Digite seu primeiro nome: " );
			scanf("%s",nome); // !Reads only one word/!Lê apenas uma palavra.
			fflush(stdin); // Buffer Cleanup (Must be used after text scanf to avoid buffer overflow)/Limpeza do Buffer (Obrigatório usar após scanf de textos para evitar estouro de buffer).
		printf("> O nome digitado foi: %s. \n", nome);
	//  Full Name Reading and Printing with Scanf/Leitura e Impressão de Nome Inteiro com Scanf
		printf("> Digite seu nome inteiro: " );
			scanf("%50[^\n]", nomeInteiro2); 
			fflush(stdin); // Limpeza do Buffer (Obrigatório usar após scanf de textos para evitar estouro de buffer).
		printf("> O nome digitado foi: %s. \n", nomeInteiro2);
	// Full Name Reading and Printing with Fgtes >> THIS IS THE MOST RECOMMENDED WAY TO READ TEXT/Leitura e Impressão de Nome Inteiro com Fgtes >> ESTA É A FORMA MAIS RECOMENDADA PARA LEITURA DE TEXTO
		printf("> Digite seu nome inteiro: " );
			fgets(nomeInteiro, 50, stdin); //fgets permite várias palavras porém dentro de um limite de caracteres. (Deve considere espaço e enter na contagem).
		printf("> O nome digitado foi: %s \n", nomeInteiro);
	// Leitura e Impressão de Número com Scanf
		printf("> Digite um número qualquer (sem vírgula): ");
			scanf("%d",&numero);
		printf("> O número digitado foi: %d. \n\n", numero);
	// Mostrar Endereço das Variáveis na Memória
		printf("Endereço de memória da variável NOME => %p \n", &nome);
		printf("Endereço de memória da variável NOMEINTER => %p \n", &nomeInteiro);
		printf("Endereço de memória da variável NUMERO => %p \n", &numero);

    printf("\n"); // BreakLine
	system ("pause"); // Pause the system before ending/Pause o sistema antes de finalizar.
	return (0);
}
