/*Robert Franklin C. Coelho
 * Desenvolvimento de Aplicações
 * Turma C
 */


import java.util.Random;
import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numero_aleatorio = random.nextInt(10);
        int numero;


        do { 
            System.out.print("Digite um numero de 0 a 10: ");
             numero = scanner.nextInt();

            if (numero > numero_aleatorio ) {
                System.out.println("Numero Maior. Tente novamente "); 
            
            } else if (numero < numero_aleatorio) {
                System.out.println("Numero menor. Tente novamente ");
                
            }
            
                
                
        } while(numero != numero_aleatorio);
            System.out.println("Numero Sorteado: " +numero_aleatorio+ " - Você ACERTOU!");
        
            

    }        
               
}        

    
 
