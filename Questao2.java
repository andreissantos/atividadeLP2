import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double distancia, precoGasolina, litros, custo;

        System.out.print("Digite a distância da viagem: ");
        distancia = scanner.nextDouble();

        System.out.print("Digite o preço da gasolina: ");
        precoGasolina = scanner.nextDouble();

        litros = distancia / 12;
        custo = litros * precoGasolina;

        System.out.println("Quantidade de litros: " + litros);
        System.out.println("Custo da viagem: R$ " + custo);

        scanner.close();
    }
}