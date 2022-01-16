public class Servico {
    private String nomeServico;
    private String DescricaoServico;
    private double ValorServico;

    public Servico(String nomeServico, String descricaoServico, double valorServico) {
        this.nomeServico = nomeServico;
        this.DescricaoServico = descricaoServico;
        this.ValorServico = valorServico;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public String getDescricaoServico() {
        return DescricaoServico;
    }

    public void setDescricaoServico(String descricaoServico) {
        DescricaoServico = descricaoServico;
    }

    public double getValorServico() {
        return ValorServico;
    }

    public void setValorServico(double valorServico) {
        ValorServico = valorServico;
    }
}
