package petshop;

public class Cao {
    //atributos
    private String nome;
    private String raça;
    private double peso;
    private int qtdeCao;
    
    public Cao(String nome, String raça, double peso){
        this.nome = nome;
        this.raça = raça;
        this.peso = peso;
    }
    
    public void alimentar(double qtde){
       
    }
    //getter and setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getRaça(){
        return raça;
    } 
    
    public void setRaça(String raça){
        this.raça = raça;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public int getQtdeCao(){
        return qtdeCao;
    }
    
    public void setQtdeCao(int qtdeCao){
        this.qtdeCao = qtdeCao;
    }
    
}
