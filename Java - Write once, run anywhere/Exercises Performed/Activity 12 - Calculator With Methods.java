/* Autor: Keuvyn T. em 20/04/2020 às 10h.
 Synthesis [EU-US]
 Purpose: Implement a Java program that takes the temperature in degrees Celsius and displays it converted to degrees Fahrenheit.
 Observation: 
 - The conversion formula is FAR = (9 * CEL + 160) / 5, where FAR is the temperature in Fahrenheit and CEL is in Celsius.
 - This conversion must be done through a method named fahrenheit. The method must receive the temperature in Celsius and return in Fahrenheit.
 Entry: Temperature in Degrees Celsius.
 Output: Temperature in Fahrenheit.
  
 Síntese [PT-BR]
 Objetivo: Implementar uma calculadora. O usuário informará um valor, um operador e outro valor. Execute a operação e apresente o resultado. 
 Detalhes: 
 - Faça uso do menor número de métodos que conseguir visualizar.
 - As operadores disponpíveis para esta calculadora são: adicionar, subtrair, dividir, multiplicar e expoente. Para o cálculo do expoente, pesquise.
 Entrada: Valor, operador, outro valor.
 Saida: Resultado da operação.
 */
import Methods.Activity12Printer; // Allows Print on Panel/Permite impressão em Caixa de Mensagem.
import java.io.IOException; // Allows reading of values of type Char/Permite leitura de valores do tipo Char
import java.util.Scanner; //Import needed to read user input/Import necessário para ler digitações do usuário.
@SuppressWarnings("all") //Disable signature errors (Used only when using Scanner)/Desativa os erros de assinatura (Usado apenas quando usado Scanner).

class Activity12 {
	public static void main (String[] args) throws IOException{
        System.out.println(); // Space for the Console/Espaço para o Console
    // Declarations/Declarações
        double num1, num2, resultado = 0;
        char operator;
    // Instructions/Instruções
        System.out.println("--- CALCULADORA ---");
        System.out.print("Escolha a operação que deseja realizar (+, -, *, / e ^): ");
            operator = (char) System.in.read();
        System.out.print("1º Número: ");
            num1 = new Scanner(System.in).nextDouble();
        System.out.print("2º Número: ");
            num2 = new Scanner(System.in).nextDouble();
        resultado = calculator(num1, operator, num2);
    // Conclusion/Conclusão
        //System.out.println("Resultado: " +resultado); // Console Printing/Impressão no Console
        Activity12Printer.printPane(num1, operator, num2, resultado); // /Printing Panel/Impressão no Painel
	} // Main Closing/Fechamento main
    
    // MÉTHODS/MÉTODOS
    /* [PT-BR]
       Objetivo do Método: Calcular 
       Retorno: Valor em Fahrenheit.
       [EU-US]
       Method Purpose: Convert Celsius to Fahrenheit. 
       Return: Fahrenheit. */
   public static double calculator(double paramNum1, char paramOperator, double paramNum2){
        double operacao = 0;
        switch (paramOperator){
            case '+':
                operacao = paramNum1 + paramNum2; break;
            case '-':
                operacao = paramNum1 - paramNum2; break;
            case '*':
                operacao = paramNum1 * paramNum2; break;
            case '/':  
                        operacao = paramNum1 / paramNum2; break;
            case '^':
                for (int i=0;i<paramNum2;i++){
                    operacao = paramNum1 * paramNum2;
                }
        } return operacao;
    }
}