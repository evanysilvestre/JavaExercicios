/*5) Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números.*/
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
    int soma = 0;

    try (Scanner user = new Scanner(System.in)) {
        for (int i=1; i<=10 ;i++) {
            System.out.println("Digite o número " + i + ": ");
            int numeros = user.nextInt();
            soma += numeros;
        } 
    }
       System.out.println("A soma de todos os números é: " + soma);
    }
}