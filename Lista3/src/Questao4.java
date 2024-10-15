/*3) Leia o nome do usuário e escreva o nome dele na tela 10 vezes.*/
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        String nome;
        int n;
        try (Scanner user = new Scanner(System.in)) {
            System.out.println("Digite seu nome: ");
            nome = user.nextLine();
            System.out.println("Digite a quantidade de vezes que você quer repetir seu nome: ");
            n = user.nextInt();
        }
        
        for (int i=1; i<=n; i++) {
            System.out.println(i + ". " + nome);
        }
    }
}