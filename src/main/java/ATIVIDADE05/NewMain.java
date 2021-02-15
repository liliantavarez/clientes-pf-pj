package ATIVIDADE05;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showInputDialog;

public class NewMain {
    public static void main(String[] args) {
        
        int escolha;
        Clientes cadClientes = new Clientes();
           
        do {
            escolha = Integer.parseInt(JOptionPane.showInputDialog("1.CADASTRAR PESSOAS FISICA\n2.EXIBIR PESSOAS FISICAS CADASTRADAS\n3.CADASTRAR PESSOA JURIDICA\n4.EXIBIR PESSOAS JURIDICAS CADASTRADAS\n5.EXIBIR TODOS OS CLIENTES\n0.SAIR"));
            switch (escolha) {
                case 1:
                    PessoaFisica cadPessoaFisica = new PessoaFisica();
                    String nome = showInputDialog("NOME: ");
                    String endereco = showInputDialog("ENDEREÇO: ");
                    String telefone = showInputDialog("TELEFONE: ");
                    
                    Pessoa PF = new Pessoa(nome, endereco, telefone);
                    String cpf = showInputDialog("CPF: ");
                    cadPessoaFisica.setCpf(cpf);   
                    cadPessoaFisica.setCliente(PF);
                    cadClientes.setClientePF(cadPessoaFisica);
                    
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"PESSOA FISICA"+cadClientes.getClientePF().toString().replace("[", "").replace("]","").replace(",",""));
                    break;
                case 3:
                    PessoaJuridica cadPessoaJuridica = new PessoaJuridica();
                    String nomeJ = showInputDialog("NOME: ");
                    String enderecoJ = showInputDialog("ENDEREÇO: ");
                    String telefoneJ = showInputDialog("TELEFONE: ");
                    String cnpj = showInputDialog("CNPJ: ");
                    String nomeF = showInputDialog("NOME FANTASIA: ");
                    cadPessoaJuridica.setCnpj(cnpj);
                    cadPessoaJuridica.setNomeFantasia(nomeF);
                    Pessoa PJ = new Pessoa(nomeJ, enderecoJ, telefoneJ);
                    cadPessoaJuridica.setCliente(PJ);
                    cadClientes.setClientePJ(cadPessoaJuridica);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "PESSOAS JURIDICAS"+cadClientes.getClientePJ().toString().replace("[", "").replace("]","").replace(",",""));
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "CLIENTES CADASTRADOS\n"+"\nPESSOAS JURIDICAS"+cadClientes.getClientePJ().toString().replace("[", "").replace("]","").replace(",","")+"\n"+"\nPESSOAS FISICAS"+cadClientes.getClientePF().toString().replace("[", "").replace("]","").replace(",",""));
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "OPÇÃO INVALIDA");
            }
        } while (escolha!=0);
    }
    
}
