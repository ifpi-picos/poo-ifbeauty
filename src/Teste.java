import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) throws Exception {
        while (true) {
            String opcao = JOptionPane.showInputDialog(
                    "O que você deseja?: \n1- Novo cliente \n2- Apagar cliente  \n3- Listar clientes \n4- Novo serviço \n5- Apagar serviço  \n6- Listar serviços \n7- Realizar serviço \n0- Encerrar");
            if (opcao.equals("0")) {
                break;
            }
            if (opcao.equals("1")) {
                String nomeCli = JOptionPane.showInputDialog(null, "Nome do cliente:");
                String emailCli = JOptionPane.showInputDialog(null, "Email do Cliente:");
                String sexoCli = JOptionPane.showInputDialog(null, "Sexo do Cliente:(M ou F)");
                String numeroEnd = JOptionPane.showInputDialog(null, "Número da casa:");
                Integer numeroconv = Integer.valueOf(numeroEnd);
                String logradoruroCli = JOptionPane.showInputDialog(null,"Logradouro: ");
                String cidadeCli = JOptionPane.showInputDialog(null,"Cidade:");
                String bairroCli = JOptionPane.showInputDialog(null,"Bairro:");
                String cepCli = JOptionPane.showInputDialog(null,"CEP:");
                Integer cepConv = Integer.valueOf(cepCli);
                String ufCli = JOptionPane.showInputDialog(null,"UF:");
                Cliente cliente = new Cliente(nomeCli, emailCli, sexoCli, new Endereco(numeroconv,logradoruroCli, cidadeCli,bairroCli, cepConv, ufCli));
                System.out.println(cliente.getNomeCliente());
            }
            if (opcao.equals("2")) {
                JOptionPane.showMessageDialog(null, "Cliente apagado!");
            }
            if (opcao.equals("3")) {
                JOptionPane.showMessageDialog(null, "Clientes listados!");
            }
            if (opcao.equals("4")) {
                String nomeServ = JOptionPane.showInputDialog(null, "Nome do serviço:");
                String descServ = JOptionPane.showInputDialog(null, "Descrição do serviço:");
                String valorServ = JOptionPane.showInputDialog(null, "Valor do serviço:");
                Integer servConv = Integer.valueOf(valorServ);
                Servico servico = new Servico(nomeServ,descServ,servConv);
                System.out.println(servico.getNomeServico());
            }
            if (opcao.equals("5")) {
                JOptionPane.showMessageDialog(null, "Serviço apagado!");
            }
            if (opcao.equals("6")) {
                JOptionPane.showMessageDialog(null, "Serviços listados!");
            }
            if (opcao.equals("7")) {
                JOptionPane.showMessageDialog(null, "Serviço realizado!");
            }
        }
    }
}