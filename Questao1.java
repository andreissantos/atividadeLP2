import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double horas, salario;

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        horas = scanner.nextDouble();

        salario = horas * 20;

        System.out.println("Salário: R$ " + salario);

        scanner.close();
    }
}