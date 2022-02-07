public class Endereco {
    private int numero;
    private String logradouro;
    private String cidade;
    private String bairro;
    private int cep;
    private String uf;

    public Endereco(int numero, String logradouro, String cidade, String bairro, int cep, String uf) {
        this.numero = numero;
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.bairro = bairro;
        this.cep = cep;
        this.uf = uf;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
