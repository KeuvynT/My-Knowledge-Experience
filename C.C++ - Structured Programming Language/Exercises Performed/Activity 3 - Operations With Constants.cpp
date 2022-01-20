/* Autor: Keuvyn T. em 08/11/2019 às 10h.
 Synthesis [EU-US]
 Purpose: Calculate area and perimeter of a circle.
 Details:
  - It is known that the calculation of the AREA is given by the expression: AREA = PÍ*RAY^2.
  - It is known that the PERIMETER calculation is given by the expression: PERIMETER = 2*PI*RAY.
 Entry: Ray.
 Output: Area and Perimeter of the circle.

 Síntese [PT-BR]
 Objetivo: Calcular área e perímetro de uma circunferência.
 Detalhes:
 - Sabe-se que o calculo da ÁREA é dada pela expressão: ÁREA = PÍ*RAIO^2.
 - Sabe-se que o calculo do PERÍMETRO é dado pela expressão: PERÍMETRO = 2*PÍ*RAIO.
 Entrada: Raio.
 Saida: Área e Perímetro do círculo.
*/

#include <stdio.h> // C Basic Library/Biblioteca Básica C.
#include <locale> // Language Library/Biblioteca de Idioma

int main (){
		setlocale(LC_ALL,"ptbr"); // Change program language to locale/Altera idioma do programa para local.
		printf("\n");
    // Declarations/Declarações
        const float PI = 3.1415;
        int raio;
    // Intructions/Instruções
        printf("> Tendo que PI = 3,1415.\n");
        printf("> Informe um valor de raio para o cálculo de PERÍMETRO e ÁREA.\n");
        printf("> Raio: ");
            scanf("%d", &raio);
        printf("Informado %d.\n", raio);
    // Operation/Operação
        double areaCirc = PI * raio * raio;
        double perimCirc = 2 * PI * raio;
    // IMPRESSÃO DOS RESULTADOS
        printf("Área => %.2f\n", areaCirc);
        printf("Perímetro => %.2f\n", perimCirc);
        printf("Circunferência do Raio => %d\n", raio);
    
    printf("\n"); // BreakLine
	system ("pause"); // Pause the system before ending/Pause o sistema antes de finalizar.
	return (0);
}
