/* Autor: Keuvyn T. em 20/04/2020 às 10h.
 Synthesis [EU-US]
 Purpose: Do the operations required in Activity 15 using methods.
  
 Síntese [PT-BR].
 Objetivo: Fazer as operações requeridas na Atividade 15 utilizando métodos.
 */
package Methods; // Refers to file location/Refere-se a localização do arquivo
import java.util.Scanner; //Import needed to read user input/Import necessário para ler digitações do usuário.
@SuppressWarnings("all") //Disable signature errors (Used only when using Scanner)/Desativa os erros de assinatura (Usado apenas quando usado Scanner).

public class Activity15MyMath {

    /* METHOD - Factorial Calculator/Calculadora de Fatorial
        Synthesis [EU-US]
        Purpose: Calculate the Factorial of a Number.
            
        Síntese [PT-BR].
        Objetivo: Calcular o Fatorial de um Número.
    */
        public static int calcFactorial(int valor) {
            int resultado = 0;
            int soma = 0;
                for (int i=valor;i>1;i--) {
                    System.out.println(valor + " * " + (i-1));
                        resultado = valor * (i-1);
                        soma = soma + resultado;
                }
            return soma;
        }
    /* METHOD - What's the biggest?/Qual o maior?
        Synthesis [EU-US]
        Purpose: Take two values ​​as an argument and return whichever number is greater.
            
        Síntese [PT-BR].
        Objetivo: Receber dois valores como argumento e retornar o número que for maior.
    */
        public static double qualOMaior(double valor1, double valor2) {
            double resultado = 0;
                if (valor1 > valor2){
                    resultado = valor1;
                } else
                    resultado = valor2;
            return resultado;
        }
    /* METHOD - EVEN or ODD/Par ou Impar?
        Synthesis [EU-US]
        Purpose: Take an integer value as an argument and return if it is an even number. (return true or false).
            
        Síntese [PT-BR].
        Objetivo: Receber um valor inteiro como argumento e retornar se ele é um número par. (retorne true ou false).
    */
        public static Boolean parOuImpar(int valor) {
            Boolean resultado;
                if (valor % 2 == 0){
                    resultado = true;
                } else
                    resultado = false;
            return resultado;
        }
    /* METHOD - Is Prime Number?/É Número Primo?
        Synthesis [EU-US]
        Purpose: Receive an integer and return if it is a mathematical prime (challenge).
            
        Síntese [PT-BR].
        Objetivo: Receber um número inteiro e retornar se ele é um número primo matemático (desafio).
    */
        public static Boolean primeNumberChecker (int valor){
            Boolean resultado;
            int contadorDeTestes = 0;
            int [ ] teste = new int [9];
                teste[0] = (valor/2) % 2;
                teste[1] = (valor/3) % 2;
                teste[2] = (valor/5) % 2;
                teste[3] = (valor/7) % 2;
                teste[4] = (valor/11) % 2;
                teste[5] = (valor/13) % 2;
                teste[6] = (valor/17) % 2;
                teste[7] = (valor/19) % 2;
                teste[8] = (valor/23) % 2;
            for (int i=0;i<9;i++) {
                if (teste[i] != 0){
                    resultado = true;
                    contadorDeTestes = contadorDeTestes++;
                    System.out.println((i+1) + "º Teste: " + resultado + ".");
                } else if (teste[i] == 0) {
                    resultado = false;
                    System.out.println((i+1) + "º Teste: " + resultado + ".");
                    }
            } if (contadorDeTestes == 9) {
                resultado = true;
            } else {
                resultado = false;
                } return resultado;
        }
}