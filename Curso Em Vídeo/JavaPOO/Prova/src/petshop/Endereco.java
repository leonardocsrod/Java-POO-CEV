package petshop;

public class Endereco {
    private String logradouro;
    private int numero;
    private String CEP;
    
    public Endereco(String logradouro, int numero, String CEP){
        this.logradouro = logradouro;
        this.numero = numero;
        this.CEP = CEP;
    }
    
    //getters and setters

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }
    
    
    
}
