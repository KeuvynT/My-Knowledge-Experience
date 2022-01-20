
/* Autor: Keuvyn T. em 08/11/2019 às 10h.
 Synthesis [EU-US]
 Purpose: Calculate area and perimeter of a circle.
 Details:
  - It is known that the calculation of the AREA is given by the expression: AREA = PÍ*RAY^2.
  - It is known that the PERIMETER calculation is given by the expression: PERIMETER = 2*PI*RAY.
 Entry: Ray.
 Output: Area and Perimeter of the circle.

 Síntese [PT-BR]
 Objetivo: Ler dados e Imprimir a Hipotenusa de um Triângulo.
 Detalhes:
 - Sabe-se que a Hipotenusa é calculada pela RAIZ QUADRADA DO CATETO DE A^2 + CATETO B^2. 
 - É necessária a função (sqrt), aplicada pelo include (math.h) para raiz quadrada.
 Entrada: Raio.
 Saida: Área e Perímetro do círculo.
*/

#include <stdio.h> // C Basic Library/Biblioteca Básica C.
#include <locale> // Language Library/Biblioteca de Idioma
#include <math.h> // Mathematical Functions Library, included for square root use/Biblioteca de Funções Matemáticas, incluída para uso de raiz quadrada.

int main (){
		setlocale(LC_ALL,"ptbr"); // Change program language to locale/Altera idioma do programa para local.
		printf("\n");
    // Declarations/Declarações
        int numInt;
        double numDouble;
        float numFloat;
    // Intructions/Instruções
        printf("> Digite um número inteiro: ");
            scanf("%d", &numInt); // Requer "&" para números.
        printf("Número digitado: %d \n", numInt);
    // Double Variable
        printf("> Digite um número real (com vírgula): ");
            scanf("%lf", &numDouble); // Para scan de double é necessário ser "lf".
        printf("> Número digitado (sem formatação): %f \n", numDouble);
        printf("> Número digitado (com formatação): %.2f \n", numDouble);
    // Float Variable
        printf("> Digite um número real (com vírgula): ");
            scanf("%f", &numFloat);
        printf("> Número digitado (sem formatação): %f \n", numFloat);

    printf("\n"); // BreakLine
	system ("pause"); // Pause the system before ending/Pause o sistema antes de finalizar.
	return (0);
}
