public class FuncionarioSituacaoContratado implements FuncionarioSituacao {

    private FuncionarioSituacaoContratado() {};
    private static FuncionarioSituacaoContratado instance = new FuncionarioSituacaoContratado();

    public static FuncionarioSituacaoContratado getInstance() {
        return instance;
    }

    public String getSituacao() {
        return "Contratado.";
    }

    public String contratar(Funcionario funcionario) {
        return "Funcionario já está contratado.";
    }


    public String emprestar(Funcionario funcionario) {
        funcionario.setSituacao(FuncionarioSituacaoEmprestado.getInstance());
        return "Funcionario emprestado.";
    }

    public String demitir(Funcionario funcionario) {
        funcionario.setSituacao(FuncionarioSituacaoDemitido.getInstance());
        return "Funcionario demitido.";
    }
}
