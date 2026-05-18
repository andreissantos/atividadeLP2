import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double n1, n2, trabalho, media;

        System.out.print("Digite a nota da prova 1: ");
        n1 = scanner.nextDouble();

        System.out.print("Digite a nota da prova 2: ");
        n2 = scanner.nextDouble();

        System.out.print("Digite a nota do trabalho: ");
        trabalho = scanner.nextDouble();

        media = (n1 + n2 + trabalho) / 3;

        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        scanner.close();
    }
}