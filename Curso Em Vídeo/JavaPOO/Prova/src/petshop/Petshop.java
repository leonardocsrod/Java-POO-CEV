package petshop;

public class Petshop {
    //atributos
    private String CNPJ;
    private Endereco end;
    
    public Petshop(String CNPJ){
        this.CNPJ = CNPJ;
    }
    
    //getters and setters

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }
    
    
    
}
