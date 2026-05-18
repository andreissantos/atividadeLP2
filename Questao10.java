import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double v1, v2, soma;

        System.out.print("Digite o primeiro valor: ");
        v1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        v2 = scanner.nextDouble();

        soma = v1 + v2;

        if (soma > 10) {
            System.out.println("Resultado da soma: " + soma);
        }

        scanner.close();
    }
}