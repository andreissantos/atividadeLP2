interface Operacoes {
    void depositar(double valor);
    void sacar(double valor);
    void consultarSaldo();
}


abstract class Conta implements Operacoes {
    protected String numero;
    protected String titular;
    protected double saldo;

    public Conta(String numero, String titular, Double saldo){
        this.numero=numero;
        this.titular=titular;
        this.saldo=saldo;
    }
    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado na conta " + numero);
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado na conta " + numero);
        } else {
            System.out.println("Saldo insuficiente para saque na conta " + numero);
        }
    }

    @Override
    public void consultarSaldo() {
        System.out.printf("Conta: %s, Titular: %s, Saldo Atual: R$ %f", numero, titular, saldo);
    }
}

class ContaCorrente extends Conta {
    public ContaCorrente(String numero, String titular, Double saldo){
        super(numero, titular, saldo);
    }
}

class ContaPoupanca extends Conta {
    public ContaPoupanca(String numero, String titular, Double saldo) {
        super(numero, titular, saldo);
    }
}

class ContaInvestimento extends Conta {
    private double taxaRendimento;

    public ContaInvestimento(String numero, String titular, double saldo, double taxaRendimento) {
        super(numero, titular, saldo);
        this.taxaRendimento = taxaRendimento;
    }
    public void renderJuros() {
        double juros = saldo * taxaRendimento;
        saldo += juros;
        System.out.printf("Novo saldo da conta %s: R$ %f", numero, saldo);
    }
}
public class Atividade2 {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("1111", "Andrei", 1000.0);
        ContaPoupanca cp = new ContaPoupanca("2222", "Joao", 500.0);
        ContaInvestimento ci = new ContaInvestimento("3333", "Camila", 5000.0, 0.05);

        cc.sacar(200);
        cp.depositar(100);
        
        ci.renderJuros();

        cc.consultarSaldo();
        cp.consultarSaldo();
        ci.consultarSaldo();
    }
}
    
