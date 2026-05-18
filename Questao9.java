import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double valorHora, horas, inss;
        double salarioBruto, desconto, salarioLiquido;

        System.out.print("Digite o valor da hora aula: ");
        valorHora = scanner.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        horas = scanner.nextDouble();

        System.out.print("Digite o percentual do INSS: ");
        inss = scanner.nextDouble();

        salarioBruto = valorHora * horas;
        desconto = salarioBruto * (inss / 100);
        salarioLiquido = salarioBruto - desconto;

        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);

        scanner.close();
    }
}