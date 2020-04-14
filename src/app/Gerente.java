package app;

public class Gerente extends Funcionario {
    private int senhaEspecial;
    private int numeroDeFuncionariosGerenciados;


    public Gerente() {
        this.senhaEspecial = 123;
    }

    public int getSenhaEspecial() {
        return senhaEspecial;
    }

    public void setSenhaEspecial(int senhaEspecial) {
        this.senhaEspecial = senhaEspecial;
    }

    public int getNumeroDeFuncionariosGerenciados() {
        return numeroDeFuncionariosGerenciados;
    }

    public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }

    public double getBonificacaoGerente() {
        double bonificacaoGerente = this.getBonificacao() + 1000;
        return bonificacaoGerente;
    }


    public void autentica(int senha) {
        if(senha == this.senhaEspecial) {
            System.out.println("Acesso Liberado.");
        }else{
            System.out.println("Acesso Negado.");
        }
    }
}