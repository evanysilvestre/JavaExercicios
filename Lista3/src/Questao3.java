/*3) Leia o nome do usuário e escreva o nome dele na tela 10 vezes.*/
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        String nome;
        try (Scanner user = new Scanner(System.in)) {
            System.out.println("Informe seu nome: ");
            nome = user.nextLine();
        }
        
        for (int i=1; i<=10 ; i++) {
            System.out.println(i + ". " + nome);
        }

        
    }
}