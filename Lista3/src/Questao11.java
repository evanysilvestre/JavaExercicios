/*11) Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são maiores do que 8.*/
import java.util.Scanner;
public class Questao11 {
    public static void main(String[] args) {
        int soma = 0;

        try (Scanner user = new Scanner(System.in)) {
            for (int i=1; i<=10 ; i++) {
                System.out.println("Informe o número " + i);
                int num = user.nextInt();
                
                if (num < 8) {
                    soma += 1;
                }
            }
        }

        System.out.println(soma + " são maiores que 8");
    }
}