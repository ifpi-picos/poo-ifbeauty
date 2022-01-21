import java.time.LocalDate;

public class RegistroDeServico {
    private LocalDate dataRealizacao;
    private Servico servicoRealizado;
    private Cliente clienteAtendido;
    private String nomeFuncionario;

    public RegistroDeServico(LocalDate dataRealizacao, Servico servicoRealizado, Cliente clienteAtendido,
            String nomeFuncionario) {
        this.dataRealizacao = dataRealizacao;
        this.servicoRealizado = servicoRealizado;
        this.clienteAtendido = clienteAtendido;
        this.nomeFuncionario = nomeFuncionario;
    }

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