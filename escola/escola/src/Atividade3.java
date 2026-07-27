interface Autenticavel {
    boolean autenticar(String senha);
}

abstract class UsuarioInstituicao implements Autenticavel {
    protected String nome;
    protected String matricula;
    protected String senhaPadrao;

    public UsuarioInstituicao(String nome, String matricula, String senhaPadrao) {
        this.nome = nome;
        this.matricula = matricula;
        this.senhaPadrao = senhaPadrao;
    }

    public abstract void exibirDados();

    @Override
    public boolean autenticar(String senha) {
        if (this.senhaPadrao.equals(senha)) {
            System.out.println(nome + " autenticado com sucesso!");
            return true;
        }
        System.out.println("Falha na autenticação para " + nome);
        return false;
    }
}

class ProfessorAcademico extends UsuarioInstituicao {
    public ProfessorAcademico(String nome, String matricula, String senhaPadrao) {
        super(nome, matricula, senhaPadrao);
    }

    public void ministrarDisciplina(String disciplina) {
        System.out.println("Professor " + nome + " está ministrando a disciplina: " + disciplina);
    }

    @Override
    public void exibirDados() {
        System.out.println("Professor: " + nome + ", Matrícula: " + matricula);
    }
}

class Aluno extends UsuarioInstituicao {
    public Aluno(String nome, String matricula, String senhaPadrao) {
        super(nome, matricula, senhaPadrao);
    }

    public void realizarMatricula(String disciplina) {
        System.out.println("Aluno " + nome + " realizou matrícula em: " + disciplina);
    }

    @Override
    public void exibirDados() {
        System.out.println("Aluno: " + nome + ", Matrícula: " + matricula);
    }
}
class CoordenadorAcademico extends UsuarioInstituicao {
    public CoordenadorAcademico(String nome, String matricula, String senhaPadrao) {
        super(nome, matricula, senhaPadrao);
    }

    public void aprovarPlanoEnsino(String disciplina) {
        System.out.println("Coordenador " + nome + " aprovou o plano de ensino de: " + disciplina);
    }

    @Override
    public void exibirDados() {
        System.out.println("Coordenador: " + nome + ", Matrícula: " + matricula);
    }
}

// Classe Main para testes
public class Atividade3{
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Andrei", "2026BSI01", "senha123");
        ProfessorAcademico prof = new ProfessorAcademico("Cleber", "9999", "admin");
        CoordenadorAcademico coord = new CoordenadorAcademico("Camila", "8888", "coord123");

        aluno.exibirDados();
        prof.exibirDados();

        aluno.autenticar("senha123");
        aluno.realizarMatricula("Linguagem de Programação II");
        
        prof.autenticar("errada");
        prof.ministrarDisciplina("Linguagem de Programação II");
        
        coord.aprovarPlanoEnsino("Linguagem de Programação II");
    }
}