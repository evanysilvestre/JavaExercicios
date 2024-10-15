/*15) Escreva um algoritmo que leia uma sequência de números do usuário e realize a soma desses números. Encerre a execução quando um número negativo for digitado.*/
import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        int soma = 0;
        
        try (Scanner user = new Scanner(System.in)) {
            for (int i=1; i<=5; i++) {
                System.out.println("Digite o número " + i + ": ");
                int num = user.nextInt();
                if (num < 0) {
                    System.out.println("Execução encerrada!");
                    break;
                } else {
                    soma += num;
                }
            }
        }
        
        System.out.println("A soma dos números é de: " + soma);
    }
}