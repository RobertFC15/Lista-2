/*Robert Franklin C. Coelho
 * Desenvolvimento de Aplicações
 * Turma C
 */


import java.util.Scanner;


public class Atividade2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor1;
        double valor2;
        double valor3;

        System.out.print("Digite o primeiro valor da multiplicação cruzada: ");
        valor1 = scanner.nextDouble();
        System.out.print("Digite o Segundo valor: ");
        valor2 = scanner.nextDouble();

        double valor4 = (valor1 * valor2);

        System.out.print("Digite o valor da divisão para achar o X: ");
        valor3 = scanner.nextDouble();

        double valor5 = (valor4 / valor3);

        System.out.println("Valor da multiplicação: " +valor4);
        System.out.println(+valor4+ "/" +valor3);
        System.out.println("X é igual á: " +valor5);





    }
    
}
