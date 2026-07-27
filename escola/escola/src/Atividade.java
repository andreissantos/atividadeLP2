abstract  class Funcionario {
    protected int matricula;
    protected String nome;
    protected double salario;
    
    public Funcionario(String nome, Integer matricula, Double salario){
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

    public abstract double calcularSalario();

    public void exibirInfo() {
        System.out.printf("Matrícula: %s, Nome: %s, Salário Final: R$ %f",  matricula, nome, calcularSalario());
    }
}
class Professor extends Funcionario {
    private int horasAula;
    private int valorHora;


    public Professor(String nome, Integer matricula, Double salario, Integer horasAula, Integer valorHora) {
        super(nome, matricula, salario);
        this.valorHora = valorHora;
        this.horasAula = horasAula;
    }

    @Override
    public double calcularSalario(){
        return salario = salario+(valorHora*horasAula);
    }
}
class Tecnico extends Funcionario {
    private double valorInsalubridade;

    public Tecnico(String nome, Integer matricula, Double salario, Double valorInsalubridade){
        super(nome, matricula, salario);
        this.valorInsalubridade = valorInsalubridade;
    }

    @Override
    public double calcularSalario(){
        return salario = salario+valorInsalubridade;
    }
}   
class Coordenador extends Funcionario {
    private double gratificacaoFixa;

    public Coordenador(String nome, Integer matricula, Double salario, Double gratificacaoFixa){
        super(nome, matricula, salario);
        this.gratificacaoFixa = gratificacaoFixa;
    }

    @Override
    public double calcularSalario(){
        return salario = salario+gratificacaoFixa;
    }
}  
public class Atividade {
    public static void main(String[] args) {
        Professor prof = new Professor("Andrei", 1001, 2500.0, 50, 10);
        Tecnico tec = new Tecnico("Ana", 1002, 2000.0, 400.0);
        Coordenador coord = new Coordenador("Camila", 1003, 4000.0, 1500.0);

        prof.exibirInfo();
        tec.exibirInfo();
        coord.exibirInfo();
    }
}
