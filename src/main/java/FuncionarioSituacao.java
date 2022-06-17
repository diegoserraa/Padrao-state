public interface FuncionarioSituacao {

    String getSituacao();

    String contratar(Funcionario funcionario);

    String emprestar(Funcionario funcionario);

    String demitir(Funcionario funcionario);

}
