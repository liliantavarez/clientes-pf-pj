package ATIVIDADE05;

import java.util.ArrayList;

public class PessoaJuridica extends Pessoa{
    private String cnpj;
    private String nomeFantasia;
    private ArrayList <Pessoa> cliente = new ArrayList <Pessoa>();

    public PessoaJuridica(String cnpj, String nomeFantasia) {
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }
    
    public PessoaJuridica() {
    }
    
    public String getCnpj() {
        return cnpj;
    }
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public String getNomeFantasia() {
        return nomeFantasia;
    }
    
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    
    public ArrayList<Pessoa> getCliente() {
        return cliente;
    }
    
    public void setCliente(Pessoa clientePJ) {
        cliente.add(clientePJ);
    }

    @Override
    public String toString() {
        return cliente.toString()+"\nCNPJ:"+this.cnpj+"\nNOME FANTASIA:"+this.nomeFantasia;
    }

}
