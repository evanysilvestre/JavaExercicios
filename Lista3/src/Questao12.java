/*12) Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são pares*/
import java.util.Scanner;
public class Questao12 {
    public static void main(String[] args) {
        int soma = 0;
        
        try (Scanner user = new Scanner(System.in)) {
            for (int i=1; i<=20; i++){
                System.out.println("Informe o número " + i + ": ");
                int num = user.nextInt();
                
                if (num%2 == 0) {
                    soma += 1;
                }
            }
        }
        
        System.out.println(soma + " números são pares.");
    }
}