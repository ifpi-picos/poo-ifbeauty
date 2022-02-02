import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nomeCliente;
    private String emailCliente;
    private String sexoCliente;
    private Endereco enderecoCliente;
    public static List<Cliente> clientes = new ArrayList<Cliente>(0);

    public Cliente(String nomeCliente, String emailCliente, String sexoCliente, Endereco enderecoCliente) {
        this.nomeCliente = nomeCliente;
        this.emailCliente = emailCliente;
        this.sexoCliente = sexoCliente;
        this.enderecoCliente = enderecoCliente;
    }

    public static Cliente getClienteByEmail(String email) {
        email = email.replace(".", "").replace("-", "");
        for (Cliente cliente : clientes) {
            if (cliente.getEmailCliente().equals(email)) {
                return cliente;
            }
        }
        return null;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public String getSexoCliente() {
        return sexoCliente;
    }

    public void setSexoCliente(String sexoCliente) {
        this.sexoCliente = sexoCliente;
    }

    public Endereco getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(Endereco enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

}
