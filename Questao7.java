import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double peso, altura, imc;

        System.out.print("Digite o peso: ");
        peso = scanner.nextDouble();

        System.out.print("Digite a altura: ");
        altura = scanner.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("IMC: " + imc);

        if (imc > 30) {
            System.out.println("Usuário obeso.");
        } else {
            System.out.println("Usuário não obeso.");
        }

        scanner.close();
    }
}