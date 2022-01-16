public class Cliente {
    private String nomeCliente;
    private String emailCliente;
    private String sexoCliente;
    private Endereco enderecoCliente;

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
