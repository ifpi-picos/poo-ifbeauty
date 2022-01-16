public class Cliente {
    private String nomeCliente;
    private String emailCliente;
    private String sexoCliente;
    private Endereco enderecoCliente;

    public Cliente(String nomeCliente, String emailCliente, String sexoCliente, Endereco enderecoCliente) {
        this.nomeCliente = nomeCliente;
        this.emailCliente = emailCliente;
        this.sexoCliente = sexoCliente;
        this.enderecoCliente = enderecoCliente;
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
