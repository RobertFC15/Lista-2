/*Robert Franklin C. Coelho
 * Desenvolvimento de Aplicações
 * Turma C
 */


import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero a quantidade de termos: ");
        int quantidade_de_termos = scanner.nextInt();

        int num1 = 0, num2 = 1;
        System.out.println("Sequencia Fibonacci " + num1 + " " + num2);

        for(int i = 0; i < quantidade_de_termos; i++) {
        int num3 = num1 + num2;
        System.out.println(" " + num3);
        num1 = num2;
        num2 = num3;

       

        }

        
        


    }
    
}
