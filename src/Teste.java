import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) throws Exception {
     while (true){
             String opcao = JOptionPane.showInputDialog("O que você deseja?: \n1- Novo cliente \n2- Apagar cliente  \n3- Listar clientes \n4- Novo serviço \n5- Apagar serviço  \n6- Listar serviços \n7- Realizar serviço \n0- Encerrar");
             if (opcao.equals("0")){
                     break;
             }
            if (opcao.equals("1")){
                JOptionPane.showMessageDialog(null, "Novo cliente criado!");
            }
            if (opcao.equals("2")){
                JOptionPane.showMessageDialog(null, "Cliente apagado!");
            }
            if (opcao.equals("3")){
                JOptionPane.showMessageDialog(null, "Clientes listados!");
            }
            if (opcao.equals("4")){
                JOptionPane.showMessageDialog(null, "Serviço criado!");
            }
            if (opcao.equals("5")){
                JOptionPane.showMessageDialog(null, "Serviço apagado!");
            }
            if (opcao.equals("6")){
                JOptionPane.showMessageDialog(null, "Serviços listados!");
            }
            if (opcao.equals("7")){
                JOptionPane.showMessageDialog(null, "Serviço realizado!");
        //Servico servico1 = new Servico("Maquiagem",
        //        "aplicação de produtos com efeito cosmético,de embelezamento, ou disfarce.",
        //        300.00);
        //System.out.println(servico1.getNomeServico());
        //Servico servico2 = new Servico("Depilação completa",
        //        "extração de pelos temporária ou permanente.",
        //        55.00);
        //System.out.println(servico2.getNomeServico());
        //Servico servico3 = new Servico("Corte De cabelo",
        //        "Corte simples de cabelo.",
        //        20.00);
        //System.out.println(servico3.getNomeServico());
        // String nomeCli = JOptionPane.showInputDialog("Digite seu nome completo");
        // String emailCli = JOptionPane.showInputDialog("Digite seu e-mail");
        // String sexoCli = JOptionPane.showInputDialog("Digite seu sexo (M ou F)");
        // System.out.println("Building...");
        // Cliente cliente1 = new Cliente("Anthony", "marquesanthony62@gmail.com", "M",
        // new Endereco(12, "Rua projetata 00", "Picos", "Samambaia", 6460003, "PI"));
        // System.out.println(cliente1.getNomeCliente());
        // System.out.println(cliente1.getEmailCliente());
        // System.out.println(cliente1.getSexoCliente());
        // System.out.println(cliente1.getEnderecoCliente());

        // System.out.println(servico1.getDescricaoServico());
        // System.out.println(servico1.getValorServico());
    }
}
}
}