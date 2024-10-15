/*9) Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova.*/
import java.util.Scanner;
public class Questao9 {
    public static void main(String[] args) {
        int maisNova = Integer.MAX_VALUE;
        String nomeMaisNova = "";
        
        try (Scanner user = new Scanner(System.in)) {
            for (int i=1; i<=10; i++) {
                System.out.println("Digite o nome da pessoa " + i + ": ");
                String nome = user.next();
                System.out.println("Digite a idade " + i + ": ");
                int idade = user.nextInt();
                
                if (idade < maisNova) {
                    maisNova = idade;
                    nomeMaisNova = nome;
                }
            } 
        }
        
        System.out.println("A pessoa mais nova se chama " + nomeMaisNova + " e tem " + maisNova + " de idade");
    }
}