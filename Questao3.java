import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int idade;

        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Pode tirar carteira de motorista.");
        } else {
            System.out.println("Não pode tirar carteira de motorista.");
        }

        scanner.close();
    }
}