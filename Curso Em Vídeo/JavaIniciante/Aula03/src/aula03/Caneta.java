package aula03;

public class Caneta {
    //atributes
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    //methods
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada: " + this.tampada);
    }
    
    public void escrever(){
        if (this.tampada == true){
            System.out.println("A caneta está tampada!");
        }
        else{
            System.out.println("Escrito!");
        }
    }
    
    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("A caneta está tampada!");
        }
        else{
            System.out.println("Rabiscado!");
        }
    }
    
    public void pintar(){
        if (this.tampada == true){
            System.out.println("A caneta está tampada!");
        }
        else{
            System.out.println("Pintado!");
        }
    }
    
    private void tampar(){
        this.tampada = true;
    }
    private void destampar(){
        this.tampada = false;
    }
}
