/*Robert Franklin C. Coelho
 * Desenvolvimento de Aplicações
 * Turma C
 */

import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero1;
        double numero2; 
        char operador;
        double resultado;

        System.out.print("Operador: ");
        operador = scanner.next().charAt(0);
        System.out.print("Digite o primeiro numero: ");
        numero1 = scanner.nextInt();
        System.out.print("Digite o segundo numero: ");
        numero2 = scanner.nextInt();

        if (operador == '+') {
            resultado = numero1 + numero2;
            System.out.println(resultado); 
            
        } else if(operador == '-') {
            resultado = numero1 - numero2;
            System.out.println(resultado);
        } else if (operador == '*') {
            resultado = numero1 * numero2;
            System.out.println(resultado);
            
        } else {
            resultado = numero1 / numero2;
            System.out.println(resultado);
        }






        

            
    }
        
}

