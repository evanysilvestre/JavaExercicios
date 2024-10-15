/*10) Crie um algoritmo leia um número do usuário e exiba a sua tabuada de multiplicação.*/
import java.util.Scanner;
public class Questao10 {
    public static void main(String[] args) {
        try (Scanner user = new Scanner(System.in)) {
            System.out.println("Digite um número para exibir a sua respectiva tabuada: ");
            int num = user.nextInt();
            for (int i=1; i<=10; i++) {
                System.out.println(num + " x " + i + " = " + (num*i));
            }
        }
        
    }
}