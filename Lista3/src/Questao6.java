/*6) Leia a idade de 20 pessoas e exiba a soma das idades.*/
import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        int soma = 0;
        
        try (Scanner user = new Scanner(System.in)) {
            for (int i=1; i<=20 ;i++) {
                System.out.println("Digite a idade " + i);
                int idade = user.nextInt();
                soma += idade;
            }
        }
        
        System.out.println("A soma das idades é de " + soma);
    }
}