/*8) Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade.*/
import java.util.Scanner;
public class Questao8 {
    public static void main(String[] args) {
        int quantidade = 0;
        
        try (Scanner user = new Scanner(System.in)) {
            for (int i=1; i<=20; i++){
                System.out.println("Digite a idade " + i);
                int idade = user.nextInt();
                if (idade >= 18) {
                    quantidade += 1;
                }
        }
        
        }
        System.out.println("A quantidade de pessoas que são maiores de idade é: " + quantidade);
    }
}