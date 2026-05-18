import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double v1, v2, soma, resultado;

        System.out.print("Digite o primeiro valor: ");
        v1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        v2 = scanner.nextDouble();

        soma = v1 + v2;

        if (soma >= 10) {
            resultado = soma + 5;
        } else {
            resultado = soma - 7;
        }

        System.out.println("Resultado final: " + resultado);

        scanner.close();
    }
}