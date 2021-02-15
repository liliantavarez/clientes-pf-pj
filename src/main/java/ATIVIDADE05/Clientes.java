
package ATIVIDADE05;

import java.util.ArrayList;

/**
 *
 * @author Lilian Carvalho
 */
public class Clientes {
    
    private ArrayList <PessoaFisica> clientePF = new ArrayList <PessoaFisica>();
    private ArrayList <PessoaJuridica> clientePJ = new ArrayList <PessoaJuridica>();

    public Clientes() {
    }

    public ArrayList<PessoaFisica> getClientePF() {
        return clientePF;
    }

    public void setClientePF(PessoaFisica clientePF) {
        this.clientePF.add(clientePF);
    }

    public ArrayList<PessoaJuridica> getClientePJ() {
        return clientePJ;
    }

    public void setClientePJ(PessoaJuridica clientePJ) {
        this.clientePJ.add(clientePJ);
    }

}
