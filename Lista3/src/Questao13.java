/*Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100.*/
import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        int soma = 0;
        
        try (Scanner user = new Scanner(System.in)) {
            for (int i=1; i<=20 ; i++) {
                System.out.println("Digite o número " + i + ": ");
                int num = user.nextInt();
                if (num >= 0 && num <= 100) {
                    soma += 1;
                }
            }
        }
        
        System.out.println("O total de números entre 0 e 100 é: " + soma);
    }
}