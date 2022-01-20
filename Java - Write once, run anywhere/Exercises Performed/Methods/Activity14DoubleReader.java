/* Autor: Keuvyn T. em 20/04/2020 às 10h.
 Synthesis [EU-US]
 Purpose: Simplify request for double values.
 Entry: Request message, error message, minimum value, maximum value.
 Output: Validation (if necessary).
  
 Síntese [PT-BR]
 Objetivo: Simplificar requisição de valores double.
 Parâmetros: Mensagem de solicitação, mensagem de erro, valor mínimo, valor máximo.
 Retorno: Validação (se necessário).
 */

package Methods; // Refers to file location/Refere-se a localização do arquivo
import java.util.Scanner; //Import needed to read user input/Import necessário para ler digitações do usuário.
@SuppressWarnings("all") //Disable signature errors (Used only when using Scanner)/Desativa os erros de assinatura (Usado apenas quando usado Scanner).

public class Activity14DoubleReader {

    /* METHOD DoubleReader v1 - Read Double/Ler Double
     [PT-BR]
     Objetivo: Simplificar leitura de Double.
     Resultado: Ler Double.
     [EU-US]
     Method Purpose: Simplify Double Reading.
     Return: User request to input an double.
    */
        public static double lerDouble(){
            return new Scanner(System.in).nextDouble();
        }
    /* METHOD DoubleReader v2 - Message Parameter Addition/Adição do Parâmetro Mensagem
     [PT-BR]
     Objetivo: Acrescenta mensagem para lerDouble.
     Resultado: Parametro de mensagem.
     [EU-US]
     Method Purpose: Add message to lerDouble.
     Return: Add paramater to Message.
    */
        public static double lerDouble(String mensagem){
            System.out.print(mensagem);
            return lerDouble();
        } 
    /* METHOD DoubleReader v3 - Message Error, Max Value and Min Value Parameter Addition/Adição do Parâmetro Mensagem de Erro, Valor Máximo e Valor Mínimo
     [PT-BR]
     Objetivo: Acrescenta mensagem de erro e permissão de restrião de valor maxíma e mínimo.
     Resultado: Parametro de mensagem de erro e permissão de restrião de valor maxíma e mínimo.
     [EU-US]
     Method Purpose: It adds error message and maximum and minimum value constraint permission.
     Return: Error message parameter and maximum and minimum value constraint permission.
    */
        public static double lerDouble(String mensagem, String msgErro, double valMin, double valMax){
            double retorno;
            retorno = lerDouble(mensagem);
                if (retorno < valMin || retorno > valMax){
                    System.out.println(msgErro);
                } while (retorno < valMin || retorno > valMax);
            return retorno;
        }
}
