import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double raio, area;

        System.out.print("Digite o raio: ");
        raio = scanner.nextDouble();

        area = 3.14 * Math.pow(raio, 2);

        System.out.println("Área da circunferência: " + area);

        scanner.close();
    }
}