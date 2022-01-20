/* Autor: Keuvyn T. em 08/11/2019 às 10h.
 Synthesis [EU-US]
 Purpose: Simulate a tournament of 10 races of 4 horses where one will win at random.
 Details:
  - It will be necessary to use the functions srand(time(0));
  - It will be necessary to use the _sleep() function;
 Entry: None.
 Output: Winning horse.

 Síntese [PT-BR]
 Objetivo: Simular um torneio de 10 corridas de 4 cavalos onde um sairá vencedor de forma aleatória.
 Detalhes:
 - Será necessário utilizar as funções srand(time(0));
 - Será necessário utilizar a função _sleep() ;
 Entrada: Nenhuma.
 Saida: Cavalo vencedor.
*/

#include <stdio.h> // C Basic Library/Biblioteca Básica C.
#include <locale> // Language Library/Biblioteca de Idioma
//#include <stdlib.h>
//#include <time.h>

int main() {
         setlocale(LC_ALL,"ptbr"); // Change program language to locale/Altera idioma do programa para local.
         printf("\n");
      // Declarations/Declarações
            int distanciaGarrucha = 0;
            int distanciaSoberano = 0;
            int distanciaValente = 0;
            int distanciaChampanhe = 0;
            const char* campeao;
      // Initialize random number generator
            srand(time(0));
      // Capture 10 moments of the race/Captura 10 momentos da corrida
      for (int i=1; i < 10; i++) {
         printf("---------------------------------\n") ;
         printf("Momento %i\n", i) ;

         // Updates distance traveled by each horse/Atualiza distancia percorrida de cada cavalo
         distanciaGarrucha += (rand() % 50) + 1 ;
         distanciaSoberano += (rand() % 50) + 1 ;
         distanciaValente += (rand() % 50) + 1 ;
         distanciaChampanhe += (rand() % 50) + 1 ;

         // Shows distance traveled by each horse/Mostra distancia percorrida por cada cavalo
         printf("- Garrucha percorreu %d metros\n", distanciaGarrucha) ;
         printf("- Soberano percorreu %d metros\n", distanciaSoberano) ;
         printf("- Valente percorreu %d metros\n", distanciaValente) ;
         printf("- Champanhe percorreu %d metros\n", distanciaChampanhe) ;
            _sleep(3000) ;
      } 
      
      printf("---------------------------------\n") ;
      printf("Fim da corrida!\n") ;

      // Check who was the winner of the race/Verifica quem foi o vencedor da corrida
      campeao = (distanciaGarrucha > distanciaSoberano && distanciaGarrucha > distanciaValente && distanciaGarrucha > distanciaChampanhe) ? "Garrucha" :
      ( distanciaSoberano > distanciaValente && distanciaSoberano > distanciaChampanhe ) ? "Soberano" :
      ( distanciaValente > distanciaChampanhe ) ? "Valente" : "Champanhe" ;
      printf("%s venceu a corrida!", campeao) ;

   printf("\n"); // BreakLine
	system ("pause"); // Pause the system before ending/Pause o sistema antes de finalizar.
	return (0);
}