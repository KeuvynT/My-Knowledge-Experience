/* Autor: Keuvyn T. em 20/04/2020 às 10h.
 Synthesis [EU-US]
 Purpose: Simplify data reading.
  
 Síntese [PT-BR].
 Objetivo: Simplificar leitura de dados.
 */
package Methods; // Refers to file location/Refere-se a localização do arquivo
import java.util.Scanner; //Import needed to read user input/Import necessário para ler digitações do usuário.
@SuppressWarnings("all") //Disable signature errors (Used only when using Scanner)/Desativa os erros de assinatura (Usado apenas quando usado Scanner).

public class Activity15SimplifiedReader {

    // METHOD SimplifyRead v1 - Read Data
        public static char lerCaracter() {
            return new Scanner(System.in).next().charAt(0);
        }
        public static double lerDouble() {
            return new Scanner(System.in).nextDouble();
        }
        public static int lerInt() {
            return new Scanner(System.in).nextInt();
        }
        public static String lerString() {
            return new Scanner(System.in).nextLine();
        }
    
    /* METHOD SimplifyRead v2 - Message Parameter Addition/Adição do Parâmetro Mensagem
    [PT-BR]
    Objetivo: Acrescenta mensagem como parâmetro.
    [EU-US]
    Method Purpose: Add message how parameter.
    */
        public static char lerCaracter(String mensagem){
            System.out.print(mensagem);
            return lerCaracter();
        }
        public static double lerDouble(String mensagem){
            System.out.print(mensagem);
            return lerDouble();
        }
        public static int lerInt(String mensagem){
            System.out.print(mensagem);
            return lerInt();
        }
        public static String lerString(String mensagem){
            System.out.print(mensagem);
            return lerString();
    }
}