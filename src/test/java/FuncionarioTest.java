import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    Funcionario funcionario;

    @BeforeEach
    public void setUp() {
        funcionario = new Funcionario();
    }

    @Test
    public void naoDeveContratarFuncionarioContratado() {
        funcionario.setSituacao(FuncionarioSituacaoContratado.getInstance());
        assertEquals("Funcionario já está contratado.", funcionario.contratar());
    }

    @Test
    public void deveEmprestarFuncionarioContratado() {
        funcionario.setSituacao(FuncionarioSituacaoContratado.getInstance());
        assertEquals("Funcionario emprestado.", funcionario.emprestar());
    }

    @Test
    public void deveDemitirFuncionarioContratado() {
        funcionario.setSituacao(FuncionarioSituacaoContratado.getInstance());
        assertEquals("Funcionario demitido.", funcionario.demitir());
    }

    @Test
    public void naoDeveContratarFuncionarioEmprestado() {
        funcionario.setSituacao(FuncionarioSituacaoEmprestado.getInstance());
        assertEquals("Funcionario emprestado, contratação não realizada.", funcionario.contratar());
    }

    @Test
    public void naoDeveEmprestarFuncionarioEmprestado() {
        funcionario.setSituacao(FuncionarioSituacaoEmprestado.getInstance());
        assertEquals("Funcionario já está emprestado.", funcionario.emprestar());
    }

    @Test
    public void naoDeveDemitirFuncionarioEmprestado() {
        funcionario.setSituacao(FuncionarioSituacaoEmprestado.getInstance());
        assertEquals("Funcionario emprestado, demissão não realizada.", funcionario.demitir());
    }

    @Test
    public void deveContratarFuncionarioDemitido() {
        funcionario.setSituacao(FuncionarioSituacaoDemitido.getInstance());
        assertEquals("Funcionario contratado.", funcionario.contratar());
    }

    @Test
    public void naoDeveEmprestarFuncionarioDemitido() {
        funcionario.setSituacao(FuncionarioSituacaoDemitido.getInstance());
        assertEquals("Funcionario demitido, empréstimo não realizado.", funcionario.emprestar());
    }

    @Test
    public void naoDeveDemitirFuncionarioDemitido() {
        funcionario.setSituacao(FuncionarioSituacaoDemitido.getInstance());
        assertEquals("Funcionario já foi demitido.", funcionario.demitir());
    }
}