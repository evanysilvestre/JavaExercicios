/*14) Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100, quantos estão entre 101 e 200 e quantos são maiores de 200.*/
import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        int entre0e100 = 0;
        int entre101e200 = 0;
        int maior200 = 0;
        
        try (Scanner user = new Scanner(System.in)) {
            for (int i=1; i<=20; i++){
                System.out.println("Informe o número " + i + ": ");
                int num = user.nextInt();
                if (num >= 0 && num <= 100) {
                    entre0e100 += 1;
                } else if (num > 100 && num <=200) {
                    entre101e200 += 1;
                } else {
                    maior200 += 1;
                }
            }
        }
        System.out.println(entre0e100 + " estão entre 0 e 100 \n" + entre101e200 + " estão entre 101 e 200 \ne " + maior200 + " são maiores de 200");
    }
}