package app;

public class App {
    public static void main(String[] args)  {
        System.out.println("******************************************");
        System.out.println("Nome:Mona-Lee Braga   Matricula:0050015709");
        System.out.println("******************************************");

        System.out.println("\n************Criando Funcionário***********");
        Funcionario NovoFuncionario = new Funcionario();
        NovoFuncionario.setNome("Ariana Grande");
        NovoFuncionario.setCpf("111.111.111-11");
        NovoFuncionario.setSalario(1000);

        System.out.println("Nome: "+NovoFuncionario.getNome());
        System.out.println("Cpf: "+NovoFuncionario.getCpf());
        System.out.println("Salario: "+NovoFuncionario.getSalario());
        System.out.println("Bonificação: "+NovoFuncionario.getBonificacao());
        
        System.out.println("\n************Criando Gerente***********");
        Gerente NovoGerente = new Gerente();
        NovoGerente.setNome("Mona Lee Braga");
        NovoGerente.setCpf("222.222.222-22");
        NovoGerente.setSalario(2500);
        NovoGerente.setNumeroDeFuncionariosGerenciados(1);

        System.out.println("Nome: "+NovoGerente.getNome());
        System.out.println("Cpf: "+NovoGerente.getCpf());
        System.out.println("Salario: "+NovoGerente.getSalario());
        System.out.println("Funcionarios gerenciados: "+NovoGerente.getNumeroDeFuncionariosGerenciados());
        System.out.println("Bonificação: "+NovoGerente.getBonificacaoGerente());
        NovoGerente.autentica(345);
                    


    }
}