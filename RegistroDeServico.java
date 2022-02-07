import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class RegistroDeServico {
    private LocalDate dataRealizacao;
    private Servico servicoRealizado;
    private Cliente clienteAtendido;
    private String nomeFuncionario;
    public static List<RegistroDeServico> registros = new ArrayList<RegistroDeServico>(0);

    public RegistroDeServico(LocalDate dataRealizacao, Servico servicoRealizado, Cliente clienteAtendido,
            String nomeFuncionario) {
        this.dataRealizacao = dataRealizacao;
        this.servicoRealizado = servicoRealizado;
        this.clienteAtendido = clienteAtendido;
        this.nomeFuncionario = nomeFuncionario;
    }
    
    public class DateValidator {

        public boolean isValid(String date) {
           try {
              DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
              LocalDate d = LocalDate.parse(date, formatter);    
              return true;
           } catch (DateTimeParseException e) {
             return false;
           }   
        }
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