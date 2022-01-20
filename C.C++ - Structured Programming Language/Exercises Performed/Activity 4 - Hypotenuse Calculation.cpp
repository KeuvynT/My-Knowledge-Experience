
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
	    double catetoA, catetoB, hipotenusa;
    // Intructions/Instruções
        printf("> Digite o valor do Cateto A e do Catebo B: ");
            scanf("%lf %lf", &catetoA, &catetoB); // Needed to add "l" for double reading/Necessário a adicionar "l" para leitura de double.
	// Operation/Operação
	    hipotenusa = sqrt (catetoA*catetoA + catetoB*catetoB); // Sqrt refers to Square Root/Sqrt refere-se a Raiz quadrada.
	// Conclusion/Conclusão
        printf("O valor do Cateto A é => %.2f \n", catetoA);
        printf("O valor da Cateto B é => %.2f \n", catetoB);
        printf("O valor da HIPOTENUSA é => %.2f \n", hipotenusa);

    printf("\n"); // BreakLine
	system ("pause"); // Pause the system before ending/Pause o sistema antes de finalizar.
	return (0);
}
