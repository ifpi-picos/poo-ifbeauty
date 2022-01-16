import java.time.LocalDate;

public class RegistroDeServico {
    private LocalDate dataRealizacao;
    private Servico servicoRealizado;
    private Cliente clienteAtendido;
    private String nomeFuncionario;

    public LocalDate getDataRealizacao() {
        return dataRealizacao;
    }

    public Servico getServicoRealizado() {
        return servicoRealizado;
    }

    public Cliente getClienteAtendido() {
        return clienteAtendido;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

}