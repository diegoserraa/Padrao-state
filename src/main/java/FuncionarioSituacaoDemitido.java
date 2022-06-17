public class FuncionarioSituacaoDemitido implements FuncionarioSituacao {

    private FuncionarioSituacaoDemitido() {};
    private static FuncionarioSituacaoDemitido instance = new FuncionarioSituacaoDemitido();

    public static FuncionarioSituacaoDemitido getInstance() {
        return instance;
    }

    public String getSituacao() {
        return "Demitido.";
    }

    public String contratar(Funcionario funcionario) {
        funcionario.setSituacao(FuncionarioSituacaoContratado.getInstance());
        return "Funcionario contratado.";
    }

    public String emprestar(Funcionario funcionario) {
        return "Funcionario demitido, empréstimo não realizado.";
    }

    public String demitir(Funcionario funcionario) {
        return "Funcionario já foi demitido.";
    }
}
