import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double temperatura;

        System.out.print("Digite a temperatura corporal: ");
        temperatura = scanner.nextDouble();

        if (temperatura > 37) {
            System.out.println("Paciente com febre.");
        } else {
            System.out.println("Temperatura normal.");
        }

        scanner.close();
    }
}