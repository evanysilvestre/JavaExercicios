/*7) Leia a idade de 20 pessoas e exiba a média das idades.*/
import java.util.Scanner;
public class Questao7 {
    public static void main(String[] args) {
        int soma = 0;
        double media;

        try (Scanner user = new Scanner(System.in)) {
            for (int i=1; i<=20; i++) {
                System.out.println("Digite a idade " + i);
                int idade = user.nextInt();
                soma += idade;
            }
        }
        media = (double) soma/20; 
        System.out.printf("A média das idade é %.2f", media);
    }
}