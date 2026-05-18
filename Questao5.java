import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double n1, n2;

        System.out.print("Digite o primeiro número: ");
        n1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        n2 = scanner.nextDouble();

        if (n1 > n2) {
            System.out.println("Maior número: " + n1);
        } else {
            System.out.println("Maior número: " + n2);
        }

        scanner.close();
    }
}