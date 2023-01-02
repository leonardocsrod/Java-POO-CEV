package petshop;

public class Gato {
    //atributos
    private String nome;
    private String raça;
    private double peso;
    private int qtdeGato;
    
    public Gato(String nome, String raça, double peso){
        this.nome = nome;
        this.raça = raça;
        this.peso = peso;
    }
    
    public void alimentar(double qtde){
        
    }
    
    public void compararPeso(){
        
    }
    
    //getters and setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getQtdeGato() {
        return qtdeGato;
    }

    public void setQtdeGato(int qtdeGato) {
        this.qtdeGato = qtdeGato;
    }
    
    
}
