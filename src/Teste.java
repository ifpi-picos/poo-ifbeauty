import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import java.time.format.DateTimeParseException;


public class Teste {
    public static void main(String[] args) throws Exception {
        // Criando objetos de teste
        Cliente teste = new Cliente("eu", "eu.com", "M", new Endereco(1, "io", "oi", "ds", 21, "po"));
        Servico teste2 = new Servico("oi", "lol", 21);
        Cliente.clientes.add(teste);
        Servico.servicos.add(teste2);
        while (true) {
            String opcao = JOptionPane.showInputDialog(
                    "O que você deseja?: \n1- Novo cliente \n2- Apagar cliente  \n3- Listar clientes \n4- Novo serviço \n5- Apagar serviço  \n6- Listar serviços \n7- Realizar serviço \n8-Exibir registros  \n0-Encerrar");
            if (opcao.equals("0")) {
                break;
            } else if (opcao.equals("1")) {
                String nomeCli = JOptionPane.showInputDialog(null, "Nome do cliente:");
                String emailCli = JOptionPane.showInputDialog(null, "Email do Cliente:");
                Cliente clienteRepeat = Cliente.getClienteByEmail(emailCli);
                if (clienteRepeat != null) {
                    JOptionPane.showMessageDialog(null, "Esse e-mail já está em uso por outro Cliente");
                }
                String sexoCli = JOptionPane.showInputDialog(null, "Sexo do Cliente:(M ou F)");
                String numeroEnd = JOptionPane.showInputDialog(null, "Número da casa:");
                Integer numeroconv = Integer.valueOf(numeroEnd);
                String logradoruroCli = JOptionPane.showInputDialog(null, "Logradouro: ");
                String cidadeCli = JOptionPane.showInputDialog(null, "Cidade:");
                String bairroCli = JOptionPane.showInputDialog(null, "Bairro:");
                String cepCli = JOptionPane.showInputDialog(null, "CEP:");
                Integer cepConv = Integer.valueOf(cepCli);
                String ufCli = JOptionPane.showInputDialog(null, "UF:");
                Cliente cliente = new Cliente(nomeCli, emailCli, sexoCli,
                        new Endereco(numeroconv, logradoruroCli, cidadeCli, bairroCli, cepConv, ufCli));
                Cliente.clientes.add(cliente);
            } else if (opcao.equals("2")) {
                String emailapagar = JOptionPane.showInputDialog(null,
                        "Informe o email do cliente que vai ser apagado:");
                Cliente cliente = Cliente.getClienteByEmail(emailapagar);
                if (cliente != null) {
                    Cliente.clientes.remove(cliente);
                    JOptionPane.showMessageDialog(null, "Cliente apagado!");
                } else {
                    JOptionPane.showMessageDialog(null, "Ops, parece que esse cliente não existe");
                }
            } else if (opcao.equals("3")) {
                String listaClientes = "";
                for (Cliente clientelistar : Cliente.clientes) {
                    listaClientes += clientelistar.getNomeCliente() + "\n";

                }
                JOptionPane.showMessageDialog(null, listaClientes);
            } else if (opcao.equals("4")) {
                String nomeServ = JOptionPane.showInputDialog(null, "Nome do serviço:");
                String descServ = JOptionPane.showInputDialog(null, "Descrição do serviço:");
                String valorServ = JOptionPane.showInputDialog(null, "Valor do serviço:");
                Integer servConv = Integer.valueOf(valorServ);
                Servico servico = new Servico(nomeServ, descServ, servConv);
                Servico.servicos.add(servico);
            } else if (opcao.equals("5")) {
                String nomeApagar = JOptionPane.showInputDialog(null, "Digite o serviço que vai ser apagado");
                Servico servico = Servico.getServicoByNome(nomeApagar);
                if (servico != null) {
                    Servico.servicos.remove(servico);
                    JOptionPane.showMessageDialog(null, "Serviço apagado!");
                } else {
                    JOptionPane.showMessageDialog(null, "Serviço não registrado");
                }
            } else if (opcao.equals("6")) {
                String listaServicos = "";
                for (Servico servicoListar : Servico.servicos) {
                    listaServicos += servicoListar.getNomeServico() + "\n";

                }
                JOptionPane.showMessageDialog(null, listaServicos);
            } else if (opcao.equals("7")) {
                String dataRealizacao = JOptionPane.showInputDialog(null,
                        "Quando o serviço foi realizado(dia/mês/ano)?");
                LocalDate dataFinal = LocalDate.parse(dataRealizacao, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                try {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate date = LocalDate.parse(dataRealizacao, formatter);
                    String dataValida = JOptionPane.showInputDialog(null, "Serviço adicionado na lista");
                } catch (DateTimeParseException e) {
                    String dataInvalida = JOptionPane.showInputDialog(null,"Data inválida");
                }
                String servicoRealizado = JOptionPane.showInputDialog(null, "Servico realizado:");
                String clienteAtendido = JOptionPane.showInputDialog(null, "Cliente que recebeu o serviço:");
                String nomeFuncionario = JOptionPane.showInputDialog(null, "Profissional que realizou o serviço:");
                Servico servicoPorNome = Servico.getServicoByNome(servicoRealizado);
                Cliente clientePorNome = Cliente.getClienteByNome(clienteAtendido);
                
                if (servicoPorNome != null && clientePorNome != null) {
                    RegistroDeServico registro = new RegistroDeServico(dataFinal, servicoPorNome, clientePorNome,
                            nomeFuncionario);
                    RegistroDeServico.registros.add(registro);
                    JOptionPane.showMessageDialog(null, "Serviço realizado e registrado!");
                } else {
                    JOptionPane.showMessageDialog(null, "Seu cliente ou seu serviço não foi encontrado");
                }
            } else if (opcao.equals("8")) {
                String listaRegistros = "";
                for (RegistroDeServico registroListar : RegistroDeServico.registros) {
                    listaRegistros += String.format("%s - %s - %s - %s",
                            registroListar.getDataRealizacao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                            registroListar.getServicoRealizado().getNomeServico(),
                            registroListar.getClienteAtendido().getNomeCliente(), registroListar.getNomeFuncionario())
                            + "\n";
                }
                JOptionPane.showMessageDialog(null, listaRegistros);
            }
        }
    }
}
