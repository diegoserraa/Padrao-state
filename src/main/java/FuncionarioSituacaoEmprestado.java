public class FuncionarioSituacaoEmprestado implements FuncionarioSituacao {

    private FuncionarioSituacaoEmprestado() {};
    private static FuncionarioSituacaoEmprestado instance = new FuncionarioSituacaoEmprestado();

    public static FuncionarioSituacaoEmprestado getInstance() {
        return instance;
    }

    public String getSituacao() {
        return "Emprestado.";
    }

    public String contratar(Funcionario funcionario) {
        return "Funcionario emprestado, contratação não realizada.";
    }

    public String emprestar(Funcionario funcionario) {
        return "Funcionario já está emprestado.";
    }

    public String demitir(Funcionario funcionario) {
        return "Funcionario emprestado, demissão não realizada.";
    }
}
