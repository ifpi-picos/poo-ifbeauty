import java.util.ArrayList;
import java.util.List;

public class Servico {
    private String nomeServico;
    private String DescricaoServico;
    private double ValorServico;
    public List<Servico> servicos = new ArrayList<>();

    public Servico(String nomeServico, String descricaoServico, double valorServico) {
        this.nomeServico = nomeServico;
        this.DescricaoServico = descricaoServico;
        this.ValorServico = valorServico;
    }

    public void removerServico(Servico ServicoASerRemovido) {
        ServicoASerRemovido = null;
        servicos.remove(ServicoASerRemovido);
    }

    public void adicionarServico(Servico ServicoASerAdicionado) {
        servicos.add(ServicoASerAdicionado);
    }

    public void listarServico() {
        System.out.println(servicos);
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
