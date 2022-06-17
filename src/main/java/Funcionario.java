public class Funcionario {

    private String nome;
    private FuncionarioSituacao situacao;

    public Funcionario() {
        this.situacao = FuncionarioSituacaoContratado.getInstance();
    }

    public void setSituacao(FuncionarioSituacao situacao) {
        this.situacao = situacao;
    }

    public String contratar() {
        return situacao.contratar(this);
    }

    public String emprestar() {
        return situacao.emprestar(this);
    }

    public String demitir() {
        return situacao.demitir(this);
    }

    public String getNomeSituacao() {
        return situacao.getSituacao();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public FuncionarioSituacao getSituacao() {
        return situacao;
    }
}