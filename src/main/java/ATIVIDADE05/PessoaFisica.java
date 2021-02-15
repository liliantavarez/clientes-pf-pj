package ATIVIDADE05;

import java.util.ArrayList;

public class PessoaFisica extends Pessoa {
    private String cpf;
    private ArrayList <Pessoa> cliente = new ArrayList <Pessoa>();

    public PessoaFisica(String cpf) {
        this.cpf = cpf;
    }

    public PessoaFisica() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ArrayList<Pessoa> getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa clientePF) {
        cliente.add(clientePF);
    }

    @Override
    public String toString() {
        return cliente.toString()+"\nCPF:"+cpf;
    }

}
