/* Autor: Keuvyn T. em 08/11/2019 às 10h.
 Synthesis [EU-US]
 Purpose: Register name, gender, phone and cpf.
 Entry: Name, gender, phone and cpf.
 Output: Registered information.

 Síntese [PT-BR]
 Objetivo: Cadastrar nome, sexo, telefone e cpf.
 Entrada: Nome, sexo, telefone e cpf.
 Saida: Informações cadastradas.
*/

#include <stdio.h> // C Basic Library/Biblioteca Básica C.
#include <locale> // Language Library/Biblioteca de Idioma

int main (){
		setlocale(LC_ALL,"ptbr"); // Change program language to locale/Altera idioma do programa para local.
		printf("\n");
	// Declarations/Declarações
		char nome[50], cpf[13], telefone [11], sexo;
	// Instructions/Instruções
		printf("-- CADASTRO DE INFORMAÇÕES -- \n");
		printf("Digite CPF (Somente nº): ");
			fgets(cpf, 13, stdin); //Limited to 11 characters, must be 13 for "enter and space"/Limitado a 11 caracteres, necessário ser 13 para o "enter e espaço".
		printf("Digite seu nome completo: ");
			fgets(nome, 50, stdin); // Reads entire text with a limit of 50/Lê texto inteiro com limite de 50.
			//scanf("%50[^/n]", nome); // Reads entire text with a limit of 50/Lê texto inteiro com limite de 50.
			//gets(nome); // Read method not recommended due to buffer overflow/Método de leitura não recomendado por conta de estouro de buffer.
		printf("Digite seu telefone (Somente nº) \n");
		printf("+5561: ");
			fgets(telefone, 11, stdin);
		printf("Informe seu sexo (m) para masculino, (f) para feminino: ");
			scanf ("%c", &sexo); // Limited to 1 character/Limitado a 1 caracter.
	// Conclusão\Conclusion
		printf("\n");
		printf("> IMPRIMINDO DADOS \n" );
		printf("CPF: %s", cpf);
		printf("Nome: %s", nome);
		printf("Telefone: +5561 %s", telefone);
		printf("Sexo: %c \n", sexo);

    printf("\n"); // BreakLine
	system ("pause"); // Pause the system before ending/Pause o sistema antes de finalizar.
	return (0);
}